package com.ruoyi.knowledge.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 知识库-文章信息对象 knowledge_articles
 * 
 * @author ruoyi
 * @date 2025-05-04
 */
public class KnowledgeArticles extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 文章主键ID */
    @Excel(name = "文章主键ID")
    private Long articleId;

    /** 来源Feed ID (关联 knowledge_feeds.feed_id) */
    @Excel(name = "来源Feed ID (关联 knowledge_feeds.feed_id)")
    private Long feedId;

    /** 文章全局唯一标识符 (来自RSS/Atom) */
    private String guid;

    /** 文章标题 */
    @Excel(name = "文章标题")
    private String title;

    /** 文章原始链接 */
    private String link;

    /** 文章摘要/描述 */
    private String description;

    /** 文章完整内容 (解析后) */
    private String content;

    /** 文章作者 */
    @Excel(name = "文章作者")
    private String author;

    /** 发布时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "发布时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date publishedDate;

    /** 抓取入库时间 */
    private Date workspaceedAt;

    /** 知识图谱处理状态 (0=待处理, 1=处理中, 2=已完成, 3=失败) */
    @Excel(name = "知识图谱处理状态 (0=待处理, 1=处理中, 2=已完成, 3=失败)")
    private Long processingStatus;

    /** 上次处理错误信息 */
    private String lastProcessingError;

    public void setArticleId(Long articleId) 
    {
        this.articleId = articleId;
    }

    public Long getArticleId() 
    {
        return articleId;
    }

    public void setFeedId(Long feedId) 
    {
        this.feedId = feedId;
    }

    public Long getFeedId() 
    {
        return feedId;
    }

    public void setGuid(String guid) 
    {
        this.guid = guid;
    }

    public String getGuid() 
    {
        return guid;
    }

    public void setTitle(String title) 
    {
        this.title = title;
    }

    public String getTitle() 
    {
        return title;
    }

    public void setLink(String link) 
    {
        this.link = link;
    }

    public String getLink() 
    {
        return link;
    }

    public void setDescription(String description) 
    {
        this.description = description;
    }

    public String getDescription() 
    {
        return description;
    }

    public void setContent(String content) 
    {
        this.content = content;
    }

    public String getContent() 
    {
        return content;
    }

    public void setAuthor(String author) 
    {
        this.author = author;
    }

    public String getAuthor() 
    {
        return author;
    }

    public void setPublishedDate(Date publishedDate) 
    {
        this.publishedDate = publishedDate;
    }

    public Date getPublishedDate() 
    {
        return publishedDate;
    }

    public void setWorkspaceedAt(Date workspaceedAt) 
    {
        this.workspaceedAt = workspaceedAt;
    }

    public Date getWorkspaceedAt() 
    {
        return workspaceedAt;
    }

    public void setProcessingStatus(Long processingStatus) 
    {
        this.processingStatus = processingStatus;
    }

    public Long getProcessingStatus() 
    {
        return processingStatus;
    }

    public void setLastProcessingError(String lastProcessingError) 
    {
        this.lastProcessingError = lastProcessingError;
    }

    public String getLastProcessingError() 
    {
        return lastProcessingError;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("articleId", getArticleId())
            .append("feedId", getFeedId())
            .append("guid", getGuid())
            .append("title", getTitle())
            .append("link", getLink())
            .append("description", getDescription())
            .append("content", getContent())
            .append("author", getAuthor())
            .append("publishedDate", getPublishedDate())
            .append("workspaceedAt", getWorkspaceedAt())
            .append("processingStatus", getProcessingStatus())
            .append("lastProcessingError", getLastProcessingError())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("remark", getRemark())
            .toString();
    }
}
