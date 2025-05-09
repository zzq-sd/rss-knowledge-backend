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
import com.ruoyi.knowledge.domain.KnowledgeFeeds;
import com.ruoyi.knowledge.service.IKnowledgeFeedsService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 知识库-RSS Feed源信息Controller
 * 
 * @author ruoyi
 * @date 2025-05-04
 */
@RestController
@RequestMapping("/knowledge/feed")
public class KnowledgeFeedsController extends BaseController
{
    @Autowired
    private IKnowledgeFeedsService knowledgeFeedsService;

    /**
     * 查询知识库-RSS Feed源信息列表
     */
    @PreAuthorize("@ss.hasPermi('knowledge:feed:list')")
    @GetMapping("/list")
    public TableDataInfo list(KnowledgeFeeds knowledgeFeeds)
    {
        startPage();
        List<KnowledgeFeeds> list = knowledgeFeedsService.selectKnowledgeFeedsList(knowledgeFeeds);
        return getDataTable(list);
    }

    /**
     * 导出知识库-RSS Feed源信息列表
     */
    @PreAuthorize("@ss.hasPermi('knowledge:feed:export')")
    @Log(title = "知识库-RSS Feed源信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, KnowledgeFeeds knowledgeFeeds)
    {
        List<KnowledgeFeeds> list = knowledgeFeedsService.selectKnowledgeFeedsList(knowledgeFeeds);
        ExcelUtil<KnowledgeFeeds> util = new ExcelUtil<KnowledgeFeeds>(KnowledgeFeeds.class);
        util.exportExcel(response, list, "知识库-RSS Feed源信息数据");
    }

    /**
     * 获取知识库-RSS Feed源信息详细信息
     */
    @PreAuthorize("@ss.hasPermi('knowledge:feed:query')")
    @GetMapping(value = "/{feedId}")
    public AjaxResult getInfo(@PathVariable("feedId") Long feedId)
    {
        return success(knowledgeFeedsService.selectKnowledgeFeedsByFeedId(feedId));
    }

    /**
     * 新增知识库-RSS Feed源信息
     */
    @PreAuthorize("@ss.hasPermi('knowledge:feed:add')")
    @Log(title = "知识库-RSS Feed源信息", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody KnowledgeFeeds knowledgeFeeds)
    {
        return toAjax(knowledgeFeedsService.insertKnowledgeFeeds(knowledgeFeeds));
    }

    /**
     * 修改知识库-RSS Feed源信息
     */
    @PreAuthorize("@ss.hasPermi('knowledge:feed:edit')")
    @Log(title = "知识库-RSS Feed源信息", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody KnowledgeFeeds knowledgeFeeds)
    {
        return toAjax(knowledgeFeedsService.updateKnowledgeFeeds(knowledgeFeeds));
    }

    /**
     * 删除知识库-RSS Feed源信息
     */
    @PreAuthorize("@ss.hasPermi('knowledge:feed:remove')")
    @Log(title = "知识库-RSS Feed源信息", businessType = BusinessType.DELETE)
	@DeleteMapping("/{feedIds}")
    public AjaxResult remove(@PathVariable Long[] feedIds)
    {
        return toAjax(knowledgeFeedsService.deleteKnowledgeFeedsByFeedIds(feedIds));
    }
}
