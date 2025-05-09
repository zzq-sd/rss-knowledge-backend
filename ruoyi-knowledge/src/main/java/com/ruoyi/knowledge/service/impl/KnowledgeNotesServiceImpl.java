package com.ruoyi.knowledge.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.knowledge.mapper.KnowledgeNotesMapper;
import com.ruoyi.knowledge.domain.KnowledgeNotes;
import com.ruoyi.knowledge.service.IKnowledgeNotesService;

/**
 * 知识库-用户笔记Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-05-04
 */
@Service
public class KnowledgeNotesServiceImpl implements IKnowledgeNotesService 
{
    @Autowired
    private KnowledgeNotesMapper knowledgeNotesMapper;

    /**
     * 查询知识库-用户笔记
     * 
     * @param noteId 知识库-用户笔记主键
     * @return 知识库-用户笔记
     */
    @Override
    public KnowledgeNotes selectKnowledgeNotesByNoteId(Long noteId)
    {
        return knowledgeNotesMapper.selectKnowledgeNotesByNoteId(noteId);
    }

    /**
     * 查询知识库-用户笔记列表
     * 
     * @param knowledgeNotes 知识库-用户笔记
     * @return 知识库-用户笔记
     */
    @Override
    public List<KnowledgeNotes> selectKnowledgeNotesList(KnowledgeNotes knowledgeNotes)
    {
        return knowledgeNotesMapper.selectKnowledgeNotesList(knowledgeNotes);
    }

    /**
     * 新增知识库-用户笔记
     * 
     * @param knowledgeNotes 知识库-用户笔记
     * @return 结果
     */
    @Override
    public int insertKnowledgeNotes(KnowledgeNotes knowledgeNotes)
    {
        knowledgeNotes.setCreateTime(DateUtils.getNowDate());
        return knowledgeNotesMapper.insertKnowledgeNotes(knowledgeNotes);
    }

    /**
     * 修改知识库-用户笔记
     * 
     * @param knowledgeNotes 知识库-用户笔记
     * @return 结果
     */
    @Override
    public int updateKnowledgeNotes(KnowledgeNotes knowledgeNotes)
    {
        knowledgeNotes.setUpdateTime(DateUtils.getNowDate());
        return knowledgeNotesMapper.updateKnowledgeNotes(knowledgeNotes);
    }

    /**
     * 批量删除知识库-用户笔记
     * 
     * @param noteIds 需要删除的知识库-用户笔记主键
     * @return 结果
     */
    @Override
    public int deleteKnowledgeNotesByNoteIds(Long[] noteIds)
    {
        return knowledgeNotesMapper.deleteKnowledgeNotesByNoteIds(noteIds);
    }

    /**
     * 删除知识库-用户笔记信息
     * 
     * @param noteId 知识库-用户笔记主键
     * @return 结果
     */
    @Override
    public int deleteKnowledgeNotesByNoteId(Long noteId)
    {
        return knowledgeNotesMapper.deleteKnowledgeNotesByNoteId(noteId);
    }
}
