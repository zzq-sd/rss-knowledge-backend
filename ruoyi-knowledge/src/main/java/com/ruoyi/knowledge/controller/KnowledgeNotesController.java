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
import com.ruoyi.knowledge.domain.KnowledgeNotes;
import com.ruoyi.knowledge.service.IKnowledgeNotesService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 知识库-用户笔记Controller
 * 
 * @author ruoyi
 * @date 2023-05-24
 */
@RestController
@RequestMapping("/knowledge/note")
public class KnowledgeNotesController extends BaseController
{
    @Autowired
    private IKnowledgeNotesService knowledgeNotesService;

    /**
     * 查询知识库-用户笔记列表
     */
    @PreAuthorize("@ss.hasPermi('knowledge:note:list')")
    @GetMapping("/list")
    public TableDataInfo list(KnowledgeNotes knowledgeNotes)
    {
        startPage();
        List<KnowledgeNotes> list = knowledgeNotesService.selectKnowledgeNotesList(knowledgeNotes);
        return getDataTable(list);
    }

    /**
     * 导出知识库-用户笔记列表
     */
    @PreAuthorize("@ss.hasPermi('knowledge:note:export')")
    @Log(title = "知识库-用户笔记", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, KnowledgeNotes knowledgeNotes)
    {
        List<KnowledgeNotes> list = knowledgeNotesService.selectKnowledgeNotesList(knowledgeNotes);
        ExcelUtil<KnowledgeNotes> util = new ExcelUtil<KnowledgeNotes>(KnowledgeNotes.class);
        util.exportExcel(response, list, "知识库-用户笔记数据");
    }

    /**
     * 获取知识库-用户笔记详细信息
     */
    @PreAuthorize("@ss.hasPermi('knowledge:note:query')")
    @GetMapping(value = "/{noteId}")
    public AjaxResult getInfo(@PathVariable("noteId") Long noteId)
    {
        return success(knowledgeNotesService.selectKnowledgeNotesByNoteId(noteId));
    }

    /**
     * 新增知识库-用户笔记
     */
    @PreAuthorize("@ss.hasPermi('knowledge:note:add')")
    @Log(title = "知识库-用户笔记", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody KnowledgeNotes knowledgeNotes)
    {
        return toAjax(knowledgeNotesService.insertKnowledgeNotes(knowledgeNotes));
    }

    /**
     * 修改知识库-用户笔记
     */
    @PreAuthorize("@ss.hasPermi('knowledge:note:edit')")
    @Log(title = "知识库-用户笔记", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody KnowledgeNotes knowledgeNotes)
    {
        return toAjax(knowledgeNotesService.updateKnowledgeNotes(knowledgeNotes));
    }

    /**
     * 删除知识库-用户笔记
     */
    @PreAuthorize("@ss.hasPermi('knowledge:note:remove')")
    @Log(title = "知识库-用户笔记", businessType = BusinessType.DELETE)
	@DeleteMapping("/{noteIds}")
    public AjaxResult remove(@PathVariable Long[] noteIds)
    {
        return toAjax(knowledgeNotesService.deleteKnowledgeNotesByNoteIds(noteIds));
    }
}
