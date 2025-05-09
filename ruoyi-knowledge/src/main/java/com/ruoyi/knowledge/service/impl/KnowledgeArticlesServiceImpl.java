package com.ruoyi.knowledge.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.knowledge.mapper.KnowledgeArticlesMapper;
import com.ruoyi.knowledge.domain.KnowledgeArticles;
import com.ruoyi.knowledge.service.IKnowledgeArticlesService;

/**
 * 知识库-文章信息Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-05-04
 */
@Service
public class KnowledgeArticlesServiceImpl implements IKnowledgeArticlesService 
{
    @Autowired
    private KnowledgeArticlesMapper knowledgeArticlesMapper;

    /**
     * 查询知识库-文章信息
     * 
     * @param articleId 知识库-文章信息主键
     * @return 知识库-文章信息
     */
    @Override
    public KnowledgeArticles selectKnowledgeArticlesByArticleId(Long articleId)
    {
        return knowledgeArticlesMapper.selectKnowledgeArticlesByArticleId(articleId);
    }

    /**
     * 查询知识库-文章信息列表
     * 
     * @param knowledgeArticles 知识库-文章信息
     * @return 知识库-文章信息
     */
    @Override
    public List<KnowledgeArticles> selectKnowledgeArticlesList(KnowledgeArticles knowledgeArticles)
    {
        return knowledgeArticlesMapper.selectKnowledgeArticlesList(knowledgeArticles);
    }

    /**
     * 新增知识库-文章信息
     * 
     * @param knowledgeArticles 知识库-文章信息
     * @return 结果
     */
    @Override
    public int insertKnowledgeArticles(KnowledgeArticles knowledgeArticles)
    {
        knowledgeArticles.setCreateTime(DateUtils.getNowDate());
        return knowledgeArticlesMapper.insertKnowledgeArticles(knowledgeArticles);
    }

    /**
     * 修改知识库-文章信息
     * 
     * @param knowledgeArticles 知识库-文章信息
     * @return 结果
     */
    @Override
    public int updateKnowledgeArticles(KnowledgeArticles knowledgeArticles)
    {
        knowledgeArticles.setUpdateTime(DateUtils.getNowDate());
        return knowledgeArticlesMapper.updateKnowledgeArticles(knowledgeArticles);
    }

    /**
     * 批量删除知识库-文章信息
     * 
     * @param articleIds 需要删除的知识库-文章信息主键
     * @return 结果
     */
    @Override
    public int deleteKnowledgeArticlesByArticleIds(Long[] articleIds)
    {
        return knowledgeArticlesMapper.deleteKnowledgeArticlesByArticleIds(articleIds);
    }

    /**
     * 删除知识库-文章信息信息
     * 
     * @param articleId 知识库-文章信息主键
     * @return 结果
     */
    @Override
    public int deleteKnowledgeArticlesByArticleId(Long articleId)
    {
        return knowledgeArticlesMapper.deleteKnowledgeArticlesByArticleId(articleId);
    }
}
