// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class ListTodosShrinkRequest extends TeaModel {
    /**
     * <p>协作空间 ID（可选过滤；不传 = 全部空间）</p>
     * 
     * <strong>example:</strong>
     * <p>cg_123</p>
     */
    @NameInMap("collaborationGroupId")
    public String collaborationGroupId;

    /**
     * <p>标题/摘要模糊搜索关键词</p>
     * 
     * <strong>example:</strong>
     * <p>审批</p>
     */
    @NameInMap("keyword")
    public String keyword;

    /**
     * <p>单页最大返回数量（1~100）；传入时优先于 pageSize</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
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
     * <p>20</p>
     */
    @NameInMap("pageSize")
    public Long pageSize;

    /**
     * <p>优先级筛选（HIGH/MEDIUM/LOW）</p>
     * 
     * <strong>example:</strong>
     * <p>HIGH</p>
     */
    @NameInMap("priorities")
    public String prioritiesShrink;

    /**
     * <p>读取状态筛选（UNREAD/READ，按处理人 readAt 判定）</p>
     * 
     * <strong>example:</strong>
     * <p>UNREAD</p>
     */
    @NameInMap("readStatus")
    public String readStatusShrink;

    /**
     * <p>排序方式</p>
     * 
     * <strong>example:</strong>
     * <p>DEFAULT</p>
     */
    @NameInMap("sortBy")
    public String sortBy;

    /**
     * <p>待办类型筛选（WORKFLOW/OPEN_API）</p>
     * 
     * <strong>example:</strong>
     * <p>WORKFLOW</p>
     */
    @NameInMap("sourceTypes")
    public String sourceTypesShrink;

    /**
     * <p>待办状态筛选（PENDING/COMPLETED/CANCELLED）</p>
     * 
     * <strong>example:</strong>
     * <p>PENDING</p>
     */
    @NameInMap("statuses")
    public String statusesShrink;

    /**
     * <p>租户ID，公共参数；缺省时使用调用方默认租户</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    public static ListTodosShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTodosShrinkRequest self = new ListTodosShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListTodosShrinkRequest setCollaborationGroupId(String collaborationGroupId) {
        this.collaborationGroupId = collaborationGroupId;
        return this;
    }
    public String getCollaborationGroupId() {
        return this.collaborationGroupId;
    }

    public ListTodosShrinkRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public ListTodosShrinkRequest setMaxResults(Long maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Long getMaxResults() {
        return this.maxResults;
    }

    public ListTodosShrinkRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListTodosShrinkRequest setPage(Long page) {
        this.page = page;
        return this;
    }
    public Long getPage() {
        return this.page;
    }

    public ListTodosShrinkRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListTodosShrinkRequest setPrioritiesShrink(String prioritiesShrink) {
        this.prioritiesShrink = prioritiesShrink;
        return this;
    }
    public String getPrioritiesShrink() {
        return this.prioritiesShrink;
    }

    public ListTodosShrinkRequest setReadStatusShrink(String readStatusShrink) {
        this.readStatusShrink = readStatusShrink;
        return this;
    }
    public String getReadStatusShrink() {
        return this.readStatusShrink;
    }

    public ListTodosShrinkRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

    public ListTodosShrinkRequest setSourceTypesShrink(String sourceTypesShrink) {
        this.sourceTypesShrink = sourceTypesShrink;
        return this;
    }
    public String getSourceTypesShrink() {
        return this.sourceTypesShrink;
    }

    public ListTodosShrinkRequest setStatusesShrink(String statusesShrink) {
        this.statusesShrink = statusesShrink;
        return this;
    }
    public String getStatusesShrink() {
        return this.statusesShrink;
    }

    public ListTodosShrinkRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
