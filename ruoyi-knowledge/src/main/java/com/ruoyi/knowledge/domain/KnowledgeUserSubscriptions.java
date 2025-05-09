package com.ruoyi.knowledge.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 知识库-用户Feed订阅关系对象 knowledge_user_subscriptions
 * 
 * @author ruoyi
 * @date 2025-05-04
 */
public class KnowledgeUserSubscriptions extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 订阅关系ID */
    @Excel(name = "订阅关系ID")
    private Long subscriptionId;

    /** 用户ID (关联若依 sys_user.user_id) */
    @Excel(name = "用户ID (关联若依 sys_user.user_id)")
    private Long userId;

    /** Feed ID (关联 knowledge_feeds.feed_id) */
    @Excel(name = "Feed ID (关联 knowledge_feeds.feed_id)")
    private Long feedId;

    /** 用户自定义的Feed标题 (可选) */
    @Excel(name = "用户自定义的Feed标题 (可选)")
    private String customTitle;

    public void setSubscriptionId(Long subscriptionId) 
    {
        this.subscriptionId = subscriptionId;
    }

    public Long getSubscriptionId() 
    {
        return subscriptionId;
    }

    public void setUserId(Long userId) 
    {
        this.userId = userId;
    }

    public Long getUserId() 
    {
        return userId;
    }

    public void setFeedId(Long feedId) 
    {
        this.feedId = feedId;
    }

    public Long getFeedId() 
    {
        return feedId;
    }

    public void setCustomTitle(String customTitle) 
    {
        this.customTitle = customTitle;
    }

    public String getCustomTitle() 
    {
        return customTitle;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("subscriptionId", getSubscriptionId())
            .append("userId", getUserId())
            .append("feedId", getFeedId())
            .append("customTitle", getCustomTitle())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("remark", getRemark())
            .toString();
    }
}
