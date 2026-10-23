// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class ListTodosShrinkRequest extends TeaModel {
    /**
     * <p>The collaboration workspace ID. This is an optional filter. If not specified, items from all workspaces are returned.</p>
     * 
     * <strong>example:</strong>
     * <p>cg_123</p>
     */
    @NameInMap("collaborationGroupId")
    public String collaborationGroupId;

    /**
     * <p>The keyword for fuzzy search in the title or summary.</p>
     * 
     * <strong>example:</strong>
     * <p>Approval</p>
     */
    @NameInMap("keyword")
    public String keyword;

    /**
     * <p>The maximum number of entries to return per page. Valid values: 1 to 100. This parameter takes precedence over pageSize if both are specified.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("maxResults")
    public Long maxResults;

    /**
     * <p>The pagination token. Use the nextToken value returned in the previous response. This parameter takes precedence over page if both are specified.</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>The page number. This parameter is ignored if nextToken is specified.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("page")
    public Long page;

    /**
     * <p>The number of entries per page. Valid values: 1 to 100.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("pageSize")
    public Long pageSize;

    /**
     * <p>The priority filter. Valid values: HIGH, MEDIUM, and LOW.</p>
     * 
     * <strong>example:</strong>
     * <p>HIGH</p>
     */
    @NameInMap("priorities")
    public String prioritiesShrink;

    /**
     * <p>The read status filter. Valid values: UNREAD and READ. The status is determined by the readAt field of the assignee.</p>
     * 
     * <strong>example:</strong>
     * <p>UNREAD</p>
     */
    @NameInMap("readStatus")
    public String readStatusShrink;

    /**
     * <p>The sorting method.</p>
     * 
     * <strong>example:</strong>
     * <p>DEFAULT</p>
     */
    @NameInMap("sortBy")
    public String sortBy;

    /**
     * <p>The to-do type filter. Valid values: WORKFLOW and OPEN_API.</p>
     * 
     * <strong>example:</strong>
     * <p>WORKFLOW</p>
     */
    @NameInMap("sourceTypes")
    public String sourceTypesShrink;

    /**
     * <p>The to-do status filter. Valid values: PENDING, COMPLETED, and CANCELLED.</p>
     * 
     * <strong>example:</strong>
     * <p>PENDING</p>
     */
    @NameInMap("statuses")
    public String statusesShrink;

    /**
     * <p>The tenant ID. This is a common parameter. If not specified, the default tenant of the caller is used.</p>
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
