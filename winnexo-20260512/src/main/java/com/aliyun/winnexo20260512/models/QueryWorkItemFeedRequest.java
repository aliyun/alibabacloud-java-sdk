// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class QueryWorkItemFeedRequest extends TeaModel {
    /**
     * <p>The business status filter (seven states).</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("businessStatuses")
    public java.util.List<String> businessStatuses;

    /**
     * <p>The ID of the collaboration workspace.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>group_example</p>
     */
    @NameInMap("collaborationGroupId")
    public String collaborationGroupId;

    /**
     * <p>The pagination cursor. Use the nextCursor value from the previous response.</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("cursor")
    public String cursor;

    /**
     * <p>The work item type filter.</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("itemTypes")
    public java.util.List<String> itemTypes;

    /**
     * <p>The keyword for fuzzy search in the title or description.</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("keyword")
    public String keyword;

    /**
     * <p>The number of entries per page. Valid values: 1 to 100.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public Long pageSize;

    /**
     * <p>The priority filter.</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("priorities")
    public java.util.List<String> priorities;

    /**
     * <p>The personal scope filter.</p>
     * 
     * <strong>example:</strong>
     * <p>ASSIGNED_TO_ME</p>
     */
    @NameInMap("scope")
    public String scope;

    /**
     * <p>The ID of the source task. If specified, the flat sub-items of the task are returned.</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("sourceTaskId")
    public String sourceTaskId;

    /**
     * <p>The tenant ID. This is a common parameter. If not specified, the default tenant of the caller is used.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    /**
     * <p>The view type. Valid values: FLAT (flat view) and TREE (task grouping).</p>
     * 
     * <strong>example:</strong>
     * <p>FLAT</p>
     */
    @NameInMap("view")
    public String view;

    public static QueryWorkItemFeedRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryWorkItemFeedRequest self = new QueryWorkItemFeedRequest();
        return TeaModel.build(map, self);
    }

    public QueryWorkItemFeedRequest setBusinessStatuses(java.util.List<String> businessStatuses) {
        this.businessStatuses = businessStatuses;
        return this;
    }
    public java.util.List<String> getBusinessStatuses() {
        return this.businessStatuses;
    }

    public QueryWorkItemFeedRequest setCollaborationGroupId(String collaborationGroupId) {
        this.collaborationGroupId = collaborationGroupId;
        return this;
    }
    public String getCollaborationGroupId() {
        return this.collaborationGroupId;
    }

    public QueryWorkItemFeedRequest setCursor(String cursor) {
        this.cursor = cursor;
        return this;
    }
    public String getCursor() {
        return this.cursor;
    }

    public QueryWorkItemFeedRequest setItemTypes(java.util.List<String> itemTypes) {
        this.itemTypes = itemTypes;
        return this;
    }
    public java.util.List<String> getItemTypes() {
        return this.itemTypes;
    }

    public QueryWorkItemFeedRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public QueryWorkItemFeedRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryWorkItemFeedRequest setPriorities(java.util.List<String> priorities) {
        this.priorities = priorities;
        return this;
    }
    public java.util.List<String> getPriorities() {
        return this.priorities;
    }

    public QueryWorkItemFeedRequest setScope(String scope) {
        this.scope = scope;
        return this;
    }
    public String getScope() {
        return this.scope;
    }

    public QueryWorkItemFeedRequest setSourceTaskId(String sourceTaskId) {
        this.sourceTaskId = sourceTaskId;
        return this;
    }
    public String getSourceTaskId() {
        return this.sourceTaskId;
    }

    public QueryWorkItemFeedRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public QueryWorkItemFeedRequest setView(String view) {
        this.view = view;
        return this;
    }
    public String getView() {
        return this.view;
    }

}
