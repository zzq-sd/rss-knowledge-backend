package com.ruoyi.knowledge.mapper;

import java.util.List;
import com.ruoyi.knowledge.domain.KnowledgeCollections;

/**
 * 知识库-用户文章收藏Mapper接口
 * 
 * @author ruoyi
 * @date 2025-05-04
 */
public interface KnowledgeCollectionsMapper 
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
     * 删除知识库-用户文章收藏
     * 
     * @param collectionId 知识库-用户文章收藏主键
     * @return 结果
     */
    public int deleteKnowledgeCollectionsByCollectionId(Long collectionId);

    /**
     * 批量删除知识库-用户文章收藏
     * 
     * @param collectionIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteKnowledgeCollectionsByCollectionIds(Long[] collectionIds);
}
