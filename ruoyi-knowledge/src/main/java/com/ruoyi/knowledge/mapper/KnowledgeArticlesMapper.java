package com.ruoyi.knowledge.mapper;

import java.util.List;
import com.ruoyi.knowledge.domain.KnowledgeArticles;

/**
 * 知识库-文章信息Mapper接口
 * 
 * @author ruoyi
 * @date 2025-05-04
 */
public interface KnowledgeArticlesMapper 
{
    /**
     * 查询知识库-文章信息
     * 
     * @param articleId 知识库-文章信息主键
     * @return 知识库-文章信息
     */
    public KnowledgeArticles selectKnowledgeArticlesByArticleId(Long articleId);

    /**
     * 查询知识库-文章信息列表
     * 
     * @param knowledgeArticles 知识库-文章信息
     * @return 知识库-文章信息集合
     */
    public List<KnowledgeArticles> selectKnowledgeArticlesList(KnowledgeArticles knowledgeArticles);

    /**
     * 新增知识库-文章信息
     * 
     * @param knowledgeArticles 知识库-文章信息
     * @return 结果
     */
    public int insertKnowledgeArticles(KnowledgeArticles knowledgeArticles);

    /**
     * 修改知识库-文章信息
     * 
     * @param knowledgeArticles 知识库-文章信息
     * @return 结果
     */
    public int updateKnowledgeArticles(KnowledgeArticles knowledgeArticles);

    /**
     * 删除知识库-文章信息
     * 
     * @param articleId 知识库-文章信息主键
     * @return 结果
     */
    public int deleteKnowledgeArticlesByArticleId(Long articleId);

    /**
     * 批量删除知识库-文章信息
     * 
     * @param articleIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteKnowledgeArticlesByArticleIds(Long[] articleIds);
}
