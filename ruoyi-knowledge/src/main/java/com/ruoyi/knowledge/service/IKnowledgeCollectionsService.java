package com.ruoyi.knowledge.service;

import java.util.List;
import com.ruoyi.knowledge.domain.KnowledgeCollections;

/**
 * 知识库-用户文章收藏Service接口
 * 
 * @author ruoyi
 * @date 2025-05-04
 */
public interface IKnowledgeCollectionsService 
{
    /**
     * 查询知识库-用户文章收藏
     * 
     * @param collectionId 知识库-用户文章收藏主键
     * @return 知识库-用户文章收藏
     */
    public KnowledgeCollections selectKnowledgeCollectionsByCollectionId(Long collectionId);

    /**
     * 查询知识库-用户文章收藏列表
     * 
     * @param knowledgeCollections 知识库-用户文章收藏
     * @return 知识库-用户文章收藏集合
     */
    public List<KnowledgeCollections> selectKnowledgeCollectionsList(KnowledgeCollections knowledgeCollections);

    /**
     * 新增知识库-用户文章收藏
     * 
     * @param knowledgeCollections 知识库-用户文章收藏
     * @return 结果
     */
    public int insertKnowledgeCollections(KnowledgeCollections knowledgeCollections);

    /**
     * 修改知识库-用户文章收藏
     * 
     * @param knowledgeCollections 知识库-用户文章收藏
     * @return 结果
     */
    public int updateKnowledgeCollections(KnowledgeCollections knowledgeCollections);

    /**
     * 批量删除知识库-用户文章收藏
     * 
     * @param collectionIds 需要删除的知识库-用户文章收藏主键集合
     * @return 结果
     */
    public int deleteKnowledgeCollectionsByCollectionIds(Long[] collectionIds);

    /**
     * 删除知识库-用户文章收藏信息
     * 
     * @param collectionId 知识库-用户文章收藏主键
     * @return 结果
     */
    public int deleteKnowledgeCollectionsByCollectionId(Long collectionId);
}
