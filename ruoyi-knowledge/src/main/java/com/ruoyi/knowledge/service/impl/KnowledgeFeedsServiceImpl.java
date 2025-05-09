package com.ruoyi.knowledge.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.knowledge.mapper.KnowledgeFeedsMapper;
import com.ruoyi.knowledge.domain.KnowledgeFeeds;
import com.ruoyi.knowledge.service.IKnowledgeFeedsService;

/**
 * 知识库-RSS Feed源信息Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-05-04
 */
@Service
public class KnowledgeFeedsServiceImpl implements IKnowledgeFeedsService 
{
    @Autowired
    private KnowledgeFeedsMapper knowledgeFeedsMapper;

    /**
     * 查询知识库-RSS Feed源信息
     * 
     * @param feedId 知识库-RSS Feed源信息主键
     * @return 知识库-RSS Feed源信息
     */
    @Override
    public KnowledgeFeeds selectKnowledgeFeedsByFeedId(Long feedId)
    {
        return knowledgeFeedsMapper.selectKnowledgeFeedsByFeedId(feedId);
    }

    /**
     * 查询知识库-RSS Feed源信息列表
     * 
     * @param knowledgeFeeds 知识库-RSS Feed源信息
     * @return 知识库-RSS Feed源信息
     */
    @Override
    public List<KnowledgeFeeds> selectKnowledgeFeedsList(KnowledgeFeeds knowledgeFeeds)
    {
        return knowledgeFeedsMapper.selectKnowledgeFeedsList(knowledgeFeeds);
    }

    /**
     * 新增知识库-RSS Feed源信息
     * 
     * @param knowledgeFeeds 知识库-RSS Feed源信息
     * @return 结果
     */
    @Override
    public int insertKnowledgeFeeds(KnowledgeFeeds knowledgeFeeds)
    {
        knowledgeFeeds.setCreateTime(DateUtils.getNowDate());
        return knowledgeFeedsMapper.insertKnowledgeFeeds(knowledgeFeeds);
    }

    /**
     * 修改知识库-RSS Feed源信息
     * 
     * @param knowledgeFeeds 知识库-RSS Feed源信息
     * @return 结果
     */
    @Override
    public int updateKnowledgeFeeds(KnowledgeFeeds knowledgeFeeds)
    {
        knowledgeFeeds.setUpdateTime(DateUtils.getNowDate());
        return knowledgeFeedsMapper.updateKnowledgeFeeds(knowledgeFeeds);
    }

    /**
     * 批量删除知识库-RSS Feed源信息
     * 
     * @param feedIds 需要删除的知识库-RSS Feed源信息主键
     * @return 结果
     */
    @Override
    public int deleteKnowledgeFeedsByFeedIds(Long[] feedIds)
    {
        return knowledgeFeedsMapper.deleteKnowledgeFeedsByFeedIds(feedIds);
    }

    /**
     * 删除知识库-RSS Feed源信息信息
     * 
     * @param feedId 知识库-RSS Feed源信息主键
     * @return 结果
     */
    @Override
    public int deleteKnowledgeFeedsByFeedId(Long feedId)
    {
        return knowledgeFeedsMapper.deleteKnowledgeFeedsByFeedId(feedId);
    }
}
