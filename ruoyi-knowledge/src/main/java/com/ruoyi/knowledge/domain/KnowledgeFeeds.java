package com.ruoyi.knowledge.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 知识库-RSS Feed源信息对象 knowledge_feeds
 * 
 * @author ruoyi
 * @date 2025-05-04
 */
public class KnowledgeFeeds extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** Feed主键ID */
    private Long feedId;

    /** Feed的URL地址 */
    @Excel(name = "Feed的URL地址")
    private String feedUrl;

    /** Feed标题 (自动获取或用户输入) */
    @Excel(name = "Feed标题 (自动获取或用户输入)")
    private String title;

    /** Feed描述 (自动获取) */
    private String description;

    /** Feed关联的网站链接 */
    @Excel(name = "Feed关联的网站链接")
    private String siteLink;

    /** 最后成功抓取时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "最后成功抓取时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date lastFetchedAt;

    /** 建议抓取间隔(分钟) */
    @Excel(name = "建议抓取间隔(分钟)")
    private Long workspaceIntervalMinutes;

    /** 是否启用该源 (1=启用, 0=禁用) */
    @Excel(name = "是否启用该源 (1=启用, 0=禁用)")
    private Integer isEnabled;

    public void setFeedId(Long feedId) 
    {
        this.feedId = feedId;
    }

    public Long getFeedId() 
    {
        return feedId;
    }

    public void setFeedUrl(String feedUrl) 
    {
        this.feedUrl = feedUrl;
    }

    public String getFeedUrl() 
    {
        return feedUrl;
    }

    public void setTitle(String title) 
    {
        this.title = title;
    }

    public String getTitle() 
    {
        return title;
    }

    public void setDescription(String description) 
    {
        this.description = description;
    }

    public String getDescription() 
    {
        return description;
    }

    public void setSiteLink(String siteLink) 
    {
        this.siteLink = siteLink;
    }

    public String getSiteLink() 
    {
        return siteLink;
    }

    public void setLastFetchedAt(Date lastFetchedAt) 
    {
        this.lastFetchedAt = lastFetchedAt;
    }

    public Date getLastFetchedAt() 
    {
        return lastFetchedAt;
    }

    public void setWorkspaceIntervalMinutes(Long workspaceIntervalMinutes) 
    {
        this.workspaceIntervalMinutes = workspaceIntervalMinutes;
    }

    public Long getWorkspaceIntervalMinutes() 
    {
        return workspaceIntervalMinutes;
    }

    public void setIsEnabled(Integer isEnabled) 
    {
        this.isEnabled = isEnabled;
    }

    public Integer getIsEnabled() 
    {
        return isEnabled;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("feedId", getFeedId())
            .append("feedUrl", getFeedUrl())
            .append("title", getTitle())
            .append("description", getDescription())
            .append("siteLink", getSiteLink())
            .append("lastFetchedAt", getLastFetchedAt())
            .append("workspaceIntervalMinutes", getWorkspaceIntervalMinutes())
            .append("isEnabled", getIsEnabled())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("remark", getRemark())
            .toString();
    }
}
