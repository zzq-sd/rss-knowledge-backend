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
import com.ruoyi.knowledge.domain.KnowledgeCollections;
import com.ruoyi.knowledge.service.IKnowledgeCollectionsService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 知识库-用户文章收藏Controller
 * 
 * @author ruoyi
 * @date 2023-05-24
 */
@RestController
@RequestMapping("/knowledge/collection")
public class KnowledgeCollectionsController extends BaseController
{
    @Autowired
    private IKnowledgeCollectionsService knowledgeCollectionsService;

    /**
     * 查询知识库-用户文章收藏列表
     */
    @PreAuthorize("@ss.hasPermi('knowledge:collection:list')")
    @GetMapping("/list")
    public TableDataInfo list(KnowledgeCollections knowledgeCollections)
    {
        startPage();
        List<KnowledgeCollections> list = knowledgeCollectionsService.selectKnowledgeCollectionsList(knowledgeCollections);
        return getDataTable(list);
    }

    /**
     * 导出知识库-用户文章收藏列表
     */
    @PreAuthorize("@ss.hasPermi('knowledge:collection:export')")
    @Log(title = "知识库-用户文章收藏", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, KnowledgeCollections knowledgeCollections)
    {
        List<KnowledgeCollections> list = knowledgeCollectionsService.selectKnowledgeCollectionsList(knowledgeCollections);
        ExcelUtil<KnowledgeCollections> util = new ExcelUtil<KnowledgeCollections>(KnowledgeCollections.class);
        util.exportExcel(response, list, "知识库-用户文章收藏数据");
    }

    /**
     * 获取知识库-用户文章收藏详细信息
     */
    @PreAuthorize("@ss.hasPermi('knowledge:collection:query')")
    @GetMapping(value = "/{collectionId}")
    public AjaxResult getInfo(@PathVariable("collectionId") Long collectionId)
    {
        return success(knowledgeCollectionsService.selectKnowledgeCollectionsByCollectionId(collectionId));
    }

    /**
     * 新增知识库-用户文章收藏
     */
    @PreAuthorize("@ss.hasPermi('knowledge:collection:add')")
    @Log(title = "知识库-用户文章收藏", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody KnowledgeCollections knowledgeCollections)
    {
        return toAjax(knowledgeCollectionsService.insertKnowledgeCollections(knowledgeCollections));
    }

    /**
     * 修改知识库-用户文章收藏
     */
    @PreAuthorize("@ss.hasPermi('knowledge:collection:edit')")
    @Log(title = "知识库-用户文章收藏", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody KnowledgeCollections knowledgeCollections)
    {
        return toAjax(knowledgeCollectionsService.updateKnowledgeCollections(knowledgeCollections));
    }

    /**
     * 删除知识库-用户文章收藏
     */
    @PreAuthorize("@ss.hasPermi('knowledge:collection:remove')")
    @Log(title = "知识库-用户文章收藏", businessType = BusinessType.DELETE)
	@DeleteMapping("/{collectionIds}")
    public AjaxResult remove(@PathVariable Long[] collectionIds)
    {
        return toAjax(knowledgeCollectionsService.deleteKnowledgeCollectionsByCollectionIds(collectionIds));
    }
}
