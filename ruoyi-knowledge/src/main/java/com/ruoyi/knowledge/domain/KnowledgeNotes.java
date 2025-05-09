package com.ruoyi.knowledge.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 知识库-用户笔记对象 knowledge_notes
 * 
 * @author ruoyi
 * @date 2025-05-04
 */
public class KnowledgeNotes extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 笔记主键ID */
    @Excel(name = "笔记主键ID")
    private Long noteId;

    /** 创建笔记的用户ID (关联若依 sys_user.user_id) */
    @Excel(name = "创建笔记的用户ID (关联若依 sys_user.user_id)")
    private Long userId;

    /** 关联的文章ID (关联 knowledge_articles.article_id) */
    @Excel(name = "关联的文章ID (关联 knowledge_articles.article_id)")
    private Long articleId;

    /** 笔记内容 */
    @Excel(name = "笔记内容")
    private String content;

    public void setNoteId(Long noteId) 
    {
        this.noteId = noteId;
    }

    public Long getNoteId() 
    {
        return noteId;
    }

    public void setUserId(Long userId) 
    {
        this.userId = userId;
    }

    public Long getUserId() 
    {
        return userId;
    }

    public void setArticleId(Long articleId) 
    {
        this.articleId = articleId;
    }

    public Long getArticleId() 
    {
        return articleId;
    }

    public void setContent(String content) 
    {
        this.content = content;
    }

    public String getContent() 
    {
        return content;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("noteId", getNoteId())
            .append("userId", getUserId())
            .append("articleId", getArticleId())
            .append("content", getContent())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("remark", getRemark())
            .toString();
    }
}
