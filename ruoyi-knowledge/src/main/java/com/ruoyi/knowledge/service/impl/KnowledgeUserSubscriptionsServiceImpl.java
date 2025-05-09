package com.ruoyi.knowledge.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.knowledge.mapper.KnowledgeUserSubscriptionsMapper;
import com.ruoyi.knowledge.domain.KnowledgeUserSubscriptions;
import com.ruoyi.knowledge.service.IKnowledgeUserSubscriptionsService;

/**
 * 知识库-用户Feed订阅关系Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-05-04
 */
@Service
public class KnowledgeUserSubscriptionsServiceImpl implements IKnowledgeUserSubscriptionsService 
{
    @Autowired
    private KnowledgeUserSubscriptionsMapper knowledgeUserSubscriptionsMapper;

    /**
     * 查询知识库-用户Feed订阅关系
     * 
     * @param subscriptionId 知识库-用户Feed订阅关系主键
     * @return 知识库-用户Feed订阅关系
     */
    @Override
    public KnowledgeUserSubscriptions selectKnowledgeUserSubscriptionsBySubscriptionId(Long subscriptionId)
    {
        return knowledgeUserSubscriptionsMapper.selectKnowledgeUserSubscriptionsBySubscriptionId(subscriptionId);
    }

    /**
     * 查询知识库-用户Feed订阅关系列表
     * 
     * @param knowledgeUserSubscriptions 知识库-用户Feed订阅关系
     * @return 知识库-用户Feed订阅关系
     */
    @Override
    public List<KnowledgeUserSubscriptions> selectKnowledgeUserSubscriptionsList(KnowledgeUserSubscriptions knowledgeUserSubscriptions)
    {
        return knowledgeUserSubscriptionsMapper.selectKnowledgeUserSubscriptionsList(knowledgeUserSubscriptions);
    }

    /**
     * 新增知识库-用户Feed订阅关系
     * 
     * @param knowledgeUserSubscriptions 知识库-用户Feed订阅关系
     * @return 结果
     */
    @Override
    public int insertKnowledgeUserSubscriptions(KnowledgeUserSubscriptions knowledgeUserSubscriptions)
    {
        knowledgeUserSubscriptions.setCreateTime(DateUtils.getNowDate());
        return knowledgeUserSubscriptionsMapper.insertKnowledgeUserSubscriptions(knowledgeUserSubscriptions);
    }

    /**
     * 修改知识库-用户Feed订阅关系
     * 
     * @param knowledgeUserSubscriptions 知识库-用户Feed订阅关系
     * @return 结果
     */
    @Override
    public int updateKnowledgeUserSubscriptions(KnowledgeUserSubscriptions knowledgeUserSubscriptions)
    {
        knowledgeUserSubscriptions.setUpdateTime(DateUtils.getNowDate());
        return knowledgeUserSubscriptionsMapper.updateKnowledgeUserSubscriptions(knowledgeUserSubscriptions);
    }

    /**
     * 批量删除知识库-用户Feed订阅关系
     * 
     * @param subscriptionIds 需要删除的知识库-用户Feed订阅关系主键
     * @return 结果
     */
    @Override
    public int deleteKnowledgeUserSubscriptionsBySubscriptionIds(Long[] subscriptionIds)
    {
        return knowledgeUserSubscriptionsMapper.deleteKnowledgeUserSubscriptionsBySubscriptionIds(subscriptionIds);
    }

    /**
     * 删除知识库-用户Feed订阅关系信息
     * 
     * @param subscriptionId 知识库-用户Feed订阅关系主键
     * @return 结果
     */
    @Override
    public int deleteKnowledgeUserSubscriptionsBySubscriptionId(Long subscriptionId)
    {
        return knowledgeUserSubscriptionsMapper.deleteKnowledgeUserSubscriptionsBySubscriptionId(subscriptionId);
    }
}
