package com.ruoyi.knowledge.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.knowledge.mapper.KnowledgeCollectionsMapper;
import com.ruoyi.knowledge.domain.KnowledgeCollections;
import com.ruoyi.knowledge.service.IKnowledgeCollectionsService;

/**
 * 知识库-用户文章收藏Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-05-04
 */
@Service
public class KnowledgeCollectionsServiceImpl implements IKnowledgeCollectionsService 
{
    @Autowired
    private KnowledgeCollectionsMapper knowledgeCollectionsMapper;

    /**
     * 查询知识库-用户文章收藏
     * 
     * @param collectionId 知识库-用户文章收藏主键
     * @return 知识库-用户文章收藏
     */
    @Override
    public KnowledgeCollections selectKnowledgeCollectionsByCollectionId(Long collectionId)
    {
        return knowledgeCollectionsMapper.selectKnowledgeCollectionsByCollectionId(collectionId);
    }

    /**
     * 查询知识库-用户文章收藏列表
     * 
     * @param knowledgeCollections 知识库-用户文章收藏
     * @return 知识库-用户文章收藏
     */
    @Override
    public List<KnowledgeCollections> selectKnowledgeCollectionsList(KnowledgeCollections knowledgeCollections)
    {
        return knowledgeCollectionsMapper.selectKnowledgeCollectionsList(knowledgeCollections);
    }

    /**
     * 新增知识库-用户文章收藏
     * 
     * @param knowledgeCollections 知识库-用户文章收藏
     * @return 结果
     */
    @Override
    public int insertKnowledgeCollections(KnowledgeCollections knowledgeCollections)
    {
        knowledgeCollections.setCreateTime(DateUtils.getNowDate());
        return knowledgeCollectionsMapper.insertKnowledgeCollections(knowledgeCollections);
    }

    /**
     * 修改知识库-用户文章收藏
     * 
     * @param knowledgeCollections 知识库-用户文章收藏
     * @return 结果
     */
    @Override
    public int updateKnowledgeCollections(KnowledgeCollections knowledgeCollections)
    {
        knowledgeCollections.setUpdateTime(DateUtils.getNowDate());
        return knowledgeCollectionsMapper.updateKnowledgeCollections(knowledgeCollections);
    }

    /**
     * 批量删除知识库-用户文章收藏
     * 
     * @param collectionIds 需要删除的知识库-用户文章收藏主键
     * @return 结果
     */
    @Override
    public int deleteKnowledgeCollectionsByCollectionIds(Long[] collectionIds)
    {
        return knowledgeCollectionsMapper.deleteKnowledgeCollectionsByCollectionIds(collectionIds);
    }

    /**
     * 删除知识库-用户文章收藏信息
     * 
     * @param collectionId 知识库-用户文章收藏主键
     * @return 结果
     */
    @Override
    public int deleteKnowledgeCollectionsByCollectionId(Long collectionId)
    {
        return knowledgeCollectionsMapper.deleteKnowledgeCollectionsByCollectionId(collectionId);
    }
}
