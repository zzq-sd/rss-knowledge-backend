package com.ruoyi.knowledge.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.knowledge.domain.KnowledgeArticles;
import com.ruoyi.knowledge.service.IKnowledgeArticlesService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 知识库-文章信息Controller
 * 
 * @author ruoyi
 * @date 2023-05-24
 */
@RestController
@RequestMapping("/knowledge/articles")
public class KnowledgeArticlesController extends BaseController
{
    @Autowired
    private IKnowledgeArticlesService knowledgeArticlesService;

    /**
     * 查询知识库-文章信息列表
     */
    @PreAuthorize("@ss.hasPermi('knowledge:articles:list')")
    @GetMapping("/list")
    public TableDataInfo list(KnowledgeArticles knowledgeArticles)
    {
        startPage();
        List<KnowledgeArticles> list = knowledgeArticlesService.selectKnowledgeArticlesList(knowledgeArticles);
        return getDataTable(list);
    }

    /**
     * 导出知识库-文章信息列表
     */
    @PreAuthorize("@ss.hasPermi('knowledge:articles:export')")
    @Log(title = "知识库-文章信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, KnowledgeArticles knowledgeArticles)
    {
        List<KnowledgeArticles> list = knowledgeArticlesService.selectKnowledgeArticlesList(knowledgeArticles);
        ExcelUtil<KnowledgeArticles> util = new ExcelUtil<KnowledgeArticles>(KnowledgeArticles.class);
        util.exportExcel(response, list, "知识库-文章信息数据");
    }

    /**
     * 获取知识库-文章信息详细信息
     */
    @PreAuthorize("@ss.hasPermi('knowledge:articles:query')")
    @GetMapping(value = "/{articleId}")
    public AjaxResult getInfo(@PathVariable("articleId") Long articleId)
    {
        return success(knowledgeArticlesService.selectKnowledgeArticlesByArticleId(articleId));
    }

    /**
     * 新增知识库-文章信息
     */
    @PreAuthorize("@ss.hasPermi('knowledge:articles:add')")
    @Log(title = "知识库-文章信息", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody KnowledgeArticles knowledgeArticles)
    {
        return toAjax(knowledgeArticlesService.insertKnowledgeArticles(knowledgeArticles));
    }

    /**
     * 修改知识库-文章信息
     */
    @PreAuthorize("@ss.hasPermi('knowledge:articles:edit')")
    @Log(title = "知识库-文章信息", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody KnowledgeArticles knowledgeArticles)
    {
        return toAjax(knowledgeArticlesService.updateKnowledgeArticles(knowledgeArticles));
    }

    /**
     * 删除知识库-文章信息
     */
    @PreAuthorize("@ss.hasPermi('knowledge:articles:remove')")
    @Log(title = "知识库-文章信息", businessType = BusinessType.DELETE)
	@DeleteMapping("/{articleIds}")
    public AjaxResult remove(@PathVariable Long[] articleIds)
    {
        return toAjax(knowledgeArticlesService.deleteKnowledgeArticlesByArticleIds(articleIds));
    }
}
