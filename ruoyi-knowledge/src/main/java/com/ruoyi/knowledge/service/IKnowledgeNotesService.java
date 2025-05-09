package com.ruoyi.knowledge.service;

import java.util.List;
import com.ruoyi.knowledge.domain.KnowledgeNotes;

/**
 * 知识库-用户笔记Service接口
 * 
 * @author ruoyi
 * @date 2025-05-04
 */
public interface IKnowledgeNotesService 
{
    /**
     * 查询知识库-用户笔记
     * 
     * @param noteId 知识库-用户笔记主键
     * @return 知识库-用户笔记
     */
    public KnowledgeNotes selectKnowledgeNotesByNoteId(Long noteId);

    /**
     * 查询知识库-用户笔记列表
     * 
     * @param knowledgeNotes 知识库-用户笔记
     * @return 知识库-用户笔记集合
     */
    public List<KnowledgeNotes> selectKnowledgeNotesList(KnowledgeNotes knowledgeNotes);

    /**
     * 新增知识库-用户笔记
     * 
     * @param knowledgeNotes 知识库-用户笔记
     * @return 结果
     */
    public int insertKnowledgeNotes(KnowledgeNotes knowledgeNotes);

    /**
     * 修改知识库-用户笔记
     * 
     * @param knowledgeNotes 知识库-用户笔记
     * @return 结果
     */
    public int updateKnowledgeNotes(KnowledgeNotes knowledgeNotes);

    /**
     * 批量删除知识库-用户笔记
     * 
     * @param noteIds 需要删除的知识库-用户笔记主键集合
     * @return 结果
     */
    public int deleteKnowledgeNotesByNoteIds(Long[] noteIds);

    /**
     * 删除知识库-用户笔记信息
     * 
     * @param noteId 知识库-用户笔记主键
     * @return 结果
     */
    public int deleteKnowledgeNotesByNoteId(Long noteId);
}
