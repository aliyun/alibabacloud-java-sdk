// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class ListSourceUsageStatisticsShrinkRequest extends TeaModel {
    /**
     * <p>The ID of the collaboration group to which the resource belongs, such as cg_101. If you specify this parameter, a group workspace task is created, and the caller must be a valid group member. If you leave this parameter empty, a personal task is created.</p>
     * 
     * <strong>example:</strong>
     * <p>1112</p>
     */
    @NameInMap("collaborationGroupId")
    public String collaborationGroupId;

    /**
     * <p>The actual end timestamp, in milliseconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-09-08T23:59:59+08:00</p>
     */
    @NameInMap("endTime")
    public String endTime;

    /**
     * <p>The event type.</p>
     * 
     * <strong>example:</strong>
     * <p>HealthCheck</p>
     */
    @NameInMap("eventType")
    public String eventType;

    /**
     * <p>The root IDs of the enterprise knowledge bases, which are available only for TENANT. The knowledge bases are filtered based on current directory bindings, not historical ownership. Maximum number of items: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;kb_9401&quot;]</p>
     */
    @NameInMap("knowledgeBaseIds")
    public String knowledgeBaseIdsShrink;

    /**
     * <p>The current page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("page")
    public Long page;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("pageSize")
    public Long pageSize;

    /**
     * <p>The report perspective. Valid values: TENANT (enterprise knowledge), GROUP (a single workspace), and ALL_GROUPS (all workspaces of the current tenant, only for platform super administrators).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Report perspective: TENANT for enterprise knowledge, GROUP for a single workspace, ALL_GROUPS for all workspaces of the current tenant (platform super administrator only). Valid values: TENANT, GROUP, ALL_GROUPS</p>
     */
    @NameInMap("scopeType")
    public String scopeType;

    /**
     * <p>The content of the sort clause.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("sortBy")
    public String sortBy;

    /**
     * <p>The sort order. This parameter takes effect only when sortBy is specified. Valid values: ASC and DESC. The values are case-insensitive.</p>
     * 
     * <strong>example:</strong>
     * <p>asc</p>
     */
    @NameInMap("sortOrder")
    public String sortOrder;

    /**
     * <p>The IDs of the associated sources.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;src_9401&quot;]</p>
     */
    @NameInMap("sourceIds")
    public String sourceIdsShrink;

    /**
     * <p>The name of the source.</p>
     * 
     * <strong>example:</strong>
     * <p>The naming content of the source</p>
     */
    @NameInMap("sourceName")
    public String sourceName;

    /**
     * <p>The start time of the query. The value is a UNIX timestamp in seconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-10-01T12:00:00Z</p>
     */
    @NameInMap("startTime")
    public String startTime;

    /**
     * <p>The effective tenant ID.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    public static ListSourceUsageStatisticsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSourceUsageStatisticsShrinkRequest self = new ListSourceUsageStatisticsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListSourceUsageStatisticsShrinkRequest setCollaborationGroupId(String collaborationGroupId) {
        this.collaborationGroupId = collaborationGroupId;
        return this;
    }
    public String getCollaborationGroupId() {
        return this.collaborationGroupId;
    }

    public ListSourceUsageStatisticsShrinkRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public ListSourceUsageStatisticsShrinkRequest setEventType(String eventType) {
        this.eventType = eventType;
        return this;
    }
    public String getEventType() {
        return this.eventType;
    }

    public ListSourceUsageStatisticsShrinkRequest setKnowledgeBaseIdsShrink(String knowledgeBaseIdsShrink) {
        this.knowledgeBaseIdsShrink = knowledgeBaseIdsShrink;
        return this;
    }
    public String getKnowledgeBaseIdsShrink() {
        return this.knowledgeBaseIdsShrink;
    }

    public ListSourceUsageStatisticsShrinkRequest setPage(Long page) {
        this.page = page;
        return this;
    }
    public Long getPage() {
        return this.page;
    }

    public ListSourceUsageStatisticsShrinkRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListSourceUsageStatisticsShrinkRequest setScopeType(String scopeType) {
        this.scopeType = scopeType;
        return this;
    }
    public String getScopeType() {
        return this.scopeType;
    }

    public ListSourceUsageStatisticsShrinkRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

    public ListSourceUsageStatisticsShrinkRequest setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
        return this;
    }
    public String getSortOrder() {
        return this.sortOrder;
    }

    public ListSourceUsageStatisticsShrinkRequest setSourceIdsShrink(String sourceIdsShrink) {
        this.sourceIdsShrink = sourceIdsShrink;
        return this;
    }
    public String getSourceIdsShrink() {
        return this.sourceIdsShrink;
    }

    public ListSourceUsageStatisticsShrinkRequest setSourceName(String sourceName) {
        this.sourceName = sourceName;
        return this;
    }
    public String getSourceName() {
        return this.sourceName;
    }

    public ListSourceUsageStatisticsShrinkRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public ListSourceUsageStatisticsShrinkRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
