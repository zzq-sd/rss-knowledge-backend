package com.ruoyi.knowledge.service;

import java.util.List;
import com.ruoyi.knowledge.domain.KnowledgeFeeds;

/**
 * 知识库-RSS Feed源信息Service接口
 * 
 * @author ruoyi
 * @date 2025-05-04
 */
public interface IKnowledgeFeedsService 
{
    /**
     * 查询知识库-RSS Feed源信息
     * 
     * @param feedId 知识库-RSS Feed源信息主键
     * @return 知识库-RSS Feed源信息
     */
    public KnowledgeFeeds selectKnowledgeFeedsByFeedId(Long feedId);

    /**
     * 查询知识库-RSS Feed源信息列表
     * 
     * @param knowledgeFeeds 知识库-RSS Feed源信息
     * @return 知识库-RSS Feed源信息集合
     */
    public List<KnowledgeFeeds> selectKnowledgeFeedsList(KnowledgeFeeds knowledgeFeeds);

    /**
     * 新增知识库-RSS Feed源信息
     * 
     * @param knowledgeFeeds 知识库-RSS Feed源信息
     * @return 结果
     */
    public int insertKnowledgeFeeds(KnowledgeFeeds knowledgeFeeds);

    /**
     * 修改知识库-RSS Feed源信息
     * 
     * @param knowledgeFeeds 知识库-RSS Feed源信息
     * @return 结果
     */
    public int updateKnowledgeFeeds(KnowledgeFeeds knowledgeFeeds);

    /**
     * 批量删除知识库-RSS Feed源信息
     * 
     * @param feedIds 需要删除的知识库-RSS Feed源信息主键集合
     * @return 结果
     */
    public int deleteKnowledgeFeedsByFeedIds(Long[] feedIds);

    /**
     * 删除知识库-RSS Feed源信息信息
     * 
     * @param feedId 知识库-RSS Feed源信息主键
     * @return 结果
     */
    public int deleteKnowledgeFeedsByFeedId(Long feedId);
}
