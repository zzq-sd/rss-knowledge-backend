package com.ruoyi.knowledge.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.knowledge.domain.KnowledgeUserSubscriptions;
import com.ruoyi.knowledge.service.IKnowledgeUserSubscriptionsService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 知识库-用户Feed订阅关系Controller
 * 
 * @author ruoyi
 * @date 2023-05-24
 */
@RestController
@RequestMapping("/knowledge/subscription")
public class KnowledgeUserSubscriptionsController extends BaseController
{
    @Autowired
    private IKnowledgeUserSubscriptionsService knowledgeUserSubscriptionsService;

    /**
     * 查询知识库-用户Feed订阅关系列表
     */
    @PreAuthorize("@ss.hasPermi('knowledge:subscription:list')")
    @GetMapping("/list")
    public TableDataInfo list(KnowledgeUserSubscriptions knowledgeUserSubscriptions)
    {
        startPage();
        List<KnowledgeUserSubscriptions> list = knowledgeUserSubscriptionsService.selectKnowledgeUserSubscriptionsList(knowledgeUserSubscriptions);
        return getDataTable(list);
    }

    /**
     * 导出知识库-用户Feed订阅关系列表
     */
    @PreAuthorize("@ss.hasPermi('knowledge:subscription:export')")
    @Log(title = "知识库-用户Feed订阅关系", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, KnowledgeUserSubscriptions knowledgeUserSubscriptions)
    {
        List<KnowledgeUserSubscriptions> list = knowledgeUserSubscriptionsService.selectKnowledgeUserSubscriptionsList(knowledgeUserSubscriptions);
        ExcelUtil<KnowledgeUserSubscriptions> util = new ExcelUtil<KnowledgeUserSubscriptions>(KnowledgeUserSubscriptions.class);
        util.exportExcel(response, list, "知识库-用户Feed订阅关系数据");
    }

    /**
     * 获取知识库-用户Feed订阅关系详细信息
     */
    @PreAuthorize("@ss.hasPermi('knowledge:subscription:query')")
    @GetMapping(value = "/{subscriptionId}")
    public AjaxResult getInfo(@PathVariable("subscriptionId") Long subscriptionId)
    {
        return success(knowledgeUserSubscriptionsService.selectKnowledgeUserSubscriptionsBySubscriptionId(subscriptionId));
    }

    /**
     * 新增知识库-用户Feed订阅关系
     */
    @PreAuthorize("@ss.hasPermi('knowledge:subscription:add')")
    @Log(title = "知识库-用户Feed订阅关系", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody KnowledgeUserSubscriptions knowledgeUserSubscriptions)
    {
        return toAjax(knowledgeUserSubscriptionsService.insertKnowledgeUserSubscriptions(knowledgeUserSubscriptions));
    }

    /**
     * 修改知识库-用户Feed订阅关系
     */
    @PreAuthorize("@ss.hasPermi('knowledge:subscription:edit')")
    @Log(title = "知识库-用户Feed订阅关系", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody KnowledgeUserSubscriptions knowledgeUserSubscriptions)
    {
        return toAjax(knowledgeUserSubscriptionsService.updateKnowledgeUserSubscriptions(knowledgeUserSubscriptions));
    }

    /**
     * 删除知识库-用户Feed订阅关系
     */
    @PreAuthorize("@ss.hasPermi('knowledge:subscription:remove')")
    @Log(title = "知识库-用户Feed订阅关系", businessType = BusinessType.DELETE)
	@DeleteMapping("/{subscriptionIds}")
    public AjaxResult remove(@PathVariable Long[] subscriptionIds)
    {
        return toAjax(knowledgeUserSubscriptionsService.deleteKnowledgeUserSubscriptionsBySubscriptionIds(subscriptionIds));
    }
}
