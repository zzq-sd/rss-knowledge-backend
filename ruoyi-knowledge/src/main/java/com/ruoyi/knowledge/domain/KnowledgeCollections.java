package com.ruoyi.knowledge.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 知识库-用户文章收藏对象 knowledge_collections
 * 
 * @author ruoyi
 * @date 2025-05-04
 */
public class KnowledgeCollections extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 收藏记录ID */
    @Excel(name = "收藏记录ID")
    private Long collectionId;

    /** 用户ID (关联若依 sys_user.user_id) */
    @Excel(name = "用户ID (关联若依 sys_user.user_id)")
    private Long userId;

    /** 收藏的文章ID (关联 knowledge_articles.article_id) */
    @Excel(name = "收藏的文章ID (关联 knowledge_articles.article_id)")
    private Long articleId;

    public void setCollectionId(Long collectionId) 
    {
        this.collectionId = collectionId;
    }

    public Long getCollectionId() 
    {
        return collectionId;
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

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("collectionId", getCollectionId())
            .append("userId", getUserId())
            .append("articleId", getArticleId())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("remark", getRemark())
            .toString();
    }
}
