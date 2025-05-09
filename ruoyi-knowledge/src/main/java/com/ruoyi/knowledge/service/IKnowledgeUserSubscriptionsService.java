package com.ruoyi.knowledge.service;

import java.util.List;
import com.ruoyi.knowledge.domain.KnowledgeUserSubscriptions;

/**
 * 知识库-用户Feed订阅关系Service接口
 * 
 * @author ruoyi
 * @date 2025-05-04
 */
public interface IKnowledgeUserSubscriptionsService 
{
    /**
     * 查询知识库-用户Feed订阅关系
     * 
     * @param subscriptionId 知识库-用户Feed订阅关系主键
     * @return 知识库-用户Feed订阅关系
     */
    public KnowledgeUserSubscriptions selectKnowledgeUserSubscriptionsBySubscriptionId(Long subscriptionId);

    /**
     * 查询知识库-用户Feed订阅关系列表
     * 
     * @param knowledgeUserSubscriptions 知识库-用户Feed订阅关系
     * @return 知识库-用户Feed订阅关系集合
     */
    public List<KnowledgeUserSubscriptions> selectKnowledgeUserSubscriptionsList(KnowledgeUserSubscriptions knowledgeUserSubscriptions);

    /**
     * 新增知识库-用户Feed订阅关系
     * 
     * @param knowledgeUserSubscriptions 知识库-用户Feed订阅关系
     * @return 结果
     */
    public int insertKnowledgeUserSubscriptions(KnowledgeUserSubscriptions knowledgeUserSubscriptions);

    /**
     * 修改知识库-用户Feed订阅关系
     * 
     * @param knowledgeUserSubscriptions 知识库-用户Feed订阅关系
     * @return 结果
     */
    public int updateKnowledgeUserSubscriptions(KnowledgeUserSubscriptions knowledgeUserSubscriptions);

    /**
     * 批量删除知识库-用户Feed订阅关系
     * 
     * @param subscriptionIds 需要删除的知识库-用户Feed订阅关系主键集合
     * @return 结果
     */
    public int deleteKnowledgeUserSubscriptionsBySubscriptionIds(Long[] subscriptionIds);

    /**
     * 删除知识库-用户Feed订阅关系信息
     * 
     * @param subscriptionId 知识库-用户Feed订阅关系主键
     * @return 结果
     */
    public int deleteKnowledgeUserSubscriptionsBySubscriptionId(Long subscriptionId);
}
