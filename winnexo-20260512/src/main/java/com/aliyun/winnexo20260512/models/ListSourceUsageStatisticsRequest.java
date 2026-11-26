// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class ListSourceUsageStatisticsRequest extends TeaModel {
    /**
     * <p>The platform application token issued by the console. If specified, the operation is executed as the user specified by opsUserId or opsUserCode.</p>
     * 
     * <strong>example:</strong>
     * <p>wn_app_xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx</p>
     */
    @NameInMap("appToken")
    public String appToken;

    /**
     * <p>The ID of the collaboration group to which the resource belongs, such as cg_101. If specified, a group workspace task is created, and the caller must be a valid group member. If left empty, a personal task is created.</p>
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
     * <p>ALL</p>
     */
    @NameInMap("eventType")
    public String eventType;

    /**
     * <p>The root IDs of enterprise knowledge bases, available only for TENANT. The IDs are filtered based on current directory bindings rather than historical ownership. A maximum of 100 items are supported.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;kb_9401&quot;]</p>
     */
    @NameInMap("knowledgeBaseIds")
    public java.util.List<String> knowledgeBaseIds;

    /**
     * <p>The proxy user code, which is unique within the tenant. This parameter is used only when the application credential is configured as source_uid.</p>
     * 
     * <strong>example:</strong>
     * <p>alice</p>
     */
    @NameInMap("opsUserCode")
    public String opsUserCode;

    /**
     * <p>The proxy user ID, which is the WINNEXO platform user ID. This parameter is used only when the application credential is configured as winnexo_uid.</p>
     * 
     * <strong>example:</strong>
     * <p>10001</p>
     */
    @NameInMap("opsUserId")
    public String opsUserId;

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
     * <p>The report perspective. Valid values: TENANT for enterprise knowledge, GROUP for a single workspace, and ALL_GROUPS for all workspaces of the current tenant (available only to platform super administrators).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>TENANT</p>
     */
    @NameInMap("scopeType")
    public String scopeType;

    /**
     * <p>The content of the sort clause.</p>
     * 
     * <strong>example:</strong>
     * <p>retrievalCount</p>
     */
    @NameInMap("sortBy")
    public String sortBy;

    /**
     * <p>Specifies the sort order. This parameter takes effect only when sortBy is specified. Valid values: ASC and DESC. The values are case-insensitive.</p>
     * 
     * <strong>example:</strong>
     * <p>ASC</p>
     */
    @NameInMap("sortOrder")
    public String sortOrder;

    /**
     * <p>The associated source IDs.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;src_9401&quot;]</p>
     */
    @NameInMap("sourceIds")
    public java.util.List<String> sourceIds;

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

    public static ListSourceUsageStatisticsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSourceUsageStatisticsRequest self = new ListSourceUsageStatisticsRequest();
        return TeaModel.build(map, self);
    }

    public ListSourceUsageStatisticsRequest setAppToken(String appToken) {
        this.appToken = appToken;
        return this;
    }
    public String getAppToken() {
        return this.appToken;
    }

    public ListSourceUsageStatisticsRequest setCollaborationGroupId(String collaborationGroupId) {
        this.collaborationGroupId = collaborationGroupId;
        return this;
    }
    public String getCollaborationGroupId() {
        return this.collaborationGroupId;
    }

    public ListSourceUsageStatisticsRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public ListSourceUsageStatisticsRequest setEventType(String eventType) {
        this.eventType = eventType;
        return this;
    }
    public String getEventType() {
        return this.eventType;
    }

    public ListSourceUsageStatisticsRequest setKnowledgeBaseIds(java.util.List<String> knowledgeBaseIds) {
        this.knowledgeBaseIds = knowledgeBaseIds;
        return this;
    }
    public java.util.List<String> getKnowledgeBaseIds() {
        return this.knowledgeBaseIds;
    }

    public ListSourceUsageStatisticsRequest setOpsUserCode(String opsUserCode) {
        this.opsUserCode = opsUserCode;
        return this;
    }
    public String getOpsUserCode() {
        return this.opsUserCode;
    }

    public ListSourceUsageStatisticsRequest setOpsUserId(String opsUserId) {
        this.opsUserId = opsUserId;
        return this;
    }
    public String getOpsUserId() {
        return this.opsUserId;
    }

    public ListSourceUsageStatisticsRequest setPage(Long page) {
        this.page = page;
        return this;
    }
    public Long getPage() {
        return this.page;
    }

    public ListSourceUsageStatisticsRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListSourceUsageStatisticsRequest setScopeType(String scopeType) {
        this.scopeType = scopeType;
        return this;
    }
    public String getScopeType() {
        return this.scopeType;
    }

    public ListSourceUsageStatisticsRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

    public ListSourceUsageStatisticsRequest setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
        return this;
    }
    public String getSortOrder() {
        return this.sortOrder;
    }

    public ListSourceUsageStatisticsRequest setSourceIds(java.util.List<String> sourceIds) {
        this.sourceIds = sourceIds;
        return this;
    }
    public java.util.List<String> getSourceIds() {
        return this.sourceIds;
    }

    public ListSourceUsageStatisticsRequest setSourceName(String sourceName) {
        this.sourceName = sourceName;
        return this;
    }
    public String getSourceName() {
        return this.sourceName;
    }

    public ListSourceUsageStatisticsRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public ListSourceUsageStatisticsRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
