// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class ListWorkItemsRequest extends TeaModel {
    /**
     * <p>业务状态筛选（七态）</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("businessStatuses")
    public java.util.List<String> businessStatuses;

    /**
     * <p>协作空间 ID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>group_example</p>
     */
    @NameInMap("collaborationGroupId")
    public String collaborationGroupId;

    /**
     * <p>工作项类型筛选</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("itemTypes")
    public java.util.List<String> itemTypes;

    /**
     * <p>标题/描述模糊搜索关键词</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("keyword")
    public String keyword;

    /**
     * <p>单页最大返回数量（1~100）；传入时优先于 pageSize</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("maxResults")
    public Long maxResults;

    /**
     * <p>翻页令牌，取上次响应返回的 nextToken；传入时优先于 page</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>页码；传入 nextToken 时忽略</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("page")
    public Long page;

    /**
     * <p>每页条数（1~100）</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public Long pageSize;

    /**
     * <p>优先级筛选</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("priorities")
    public java.util.List<String> priorities;

    /**
     * <p>个人范围筛选</p>
     * 
     * <strong>example:</strong>
     * <p>ASSIGNED_TO_ME</p>
     */
    @NameInMap("scope")
    public String scope;

    /**
     * <p>租户ID，公共参数；缺省时使用调用方默认租户</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    public static ListWorkItemsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListWorkItemsRequest self = new ListWorkItemsRequest();
        return TeaModel.build(map, self);
    }

    public ListWorkItemsRequest setBusinessStatuses(java.util.List<String> businessStatuses) {
        this.businessStatuses = businessStatuses;
        return this;
    }
    public java.util.List<String> getBusinessStatuses() {
        return this.businessStatuses;
    }

    public ListWorkItemsRequest setCollaborationGroupId(String collaborationGroupId) {
        this.collaborationGroupId = collaborationGroupId;
        return this;
    }
    public String getCollaborationGroupId() {
        return this.collaborationGroupId;
    }

    public ListWorkItemsRequest setItemTypes(java.util.List<String> itemTypes) {
        this.itemTypes = itemTypes;
        return this;
    }
    public java.util.List<String> getItemTypes() {
        return this.itemTypes;
    }

    public ListWorkItemsRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public ListWorkItemsRequest setMaxResults(Long maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Long getMaxResults() {
        return this.maxResults;
    }

    public ListWorkItemsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListWorkItemsRequest setPage(Long page) {
        this.page = page;
        return this;
    }
    public Long getPage() {
        return this.page;
    }

    public ListWorkItemsRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListWorkItemsRequest setPriorities(java.util.List<String> priorities) {
        this.priorities = priorities;
        return this;
    }
    public java.util.List<String> getPriorities() {
        return this.priorities;
    }

    public ListWorkItemsRequest setScope(String scope) {
        this.scope = scope;
        return this;
    }
    public String getScope() {
        return this.scope;
    }

    public ListWorkItemsRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
