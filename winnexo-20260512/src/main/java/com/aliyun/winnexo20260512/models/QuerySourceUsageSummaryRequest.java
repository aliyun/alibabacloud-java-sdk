// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class QuerySourceUsageSummaryRequest extends TeaModel {
    /**
     * <p>The platform application token issued by the console. If specified, the request is executed as the user identified by opsUserId or opsUserCode.</p>
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
     * <p>exampleCollaborationGroupId</p>
     */
    @NameInMap("collaborationGroupId")
    public String collaborationGroupId;

    /**
     * <p>The actual end timestamp of the live stream, in milliseconds.</p>
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
     * <p>The IDs of the knowledge base folders.</p>
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
     * <p>The role scope type. Valid values:</p>
     * <ul>
     * <li><strong>ALL_VISIBLE</strong>: All members.</li>
     * <li><strong>PART_VISIBLE</strong>: Partial members.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>TENANT</p>
     */
    @NameInMap("scopeType")
    public String scopeType;

    /**
     * <p>The source IDs.</p>
     */
    @NameInMap("sourceIds")
    public java.util.List<String> sourceIds;

    /**
     * <p>The resume channel source.</p>
     * 
     * <strong>example:</strong>
     * <p>Source name content</p>
     */
    @NameInMap("sourceName")
    public String sourceName;

    /**
     * <p>The start time of the query. The value is a UNIX timestamp in seconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-09-01T00:00:00+08:00</p>
     */
    @NameInMap("startTime")
    public String startTime;

    /**
     * <p>The tenant ID. This is a common parameter. For winnexo-cli, this parameter is explicitly passed by using --tenant-id.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    public static QuerySourceUsageSummaryRequest build(java.util.Map<String, ?> map) throws Exception {
        QuerySourceUsageSummaryRequest self = new QuerySourceUsageSummaryRequest();
        return TeaModel.build(map, self);
    }

    public QuerySourceUsageSummaryRequest setAppToken(String appToken) {
        this.appToken = appToken;
        return this;
    }
    public String getAppToken() {
        return this.appToken;
    }

    public QuerySourceUsageSummaryRequest setCollaborationGroupId(String collaborationGroupId) {
        this.collaborationGroupId = collaborationGroupId;
        return this;
    }
    public String getCollaborationGroupId() {
        return this.collaborationGroupId;
    }

    public QuerySourceUsageSummaryRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public QuerySourceUsageSummaryRequest setEventType(String eventType) {
        this.eventType = eventType;
        return this;
    }
    public String getEventType() {
        return this.eventType;
    }

    public QuerySourceUsageSummaryRequest setKnowledgeBaseIds(java.util.List<String> knowledgeBaseIds) {
        this.knowledgeBaseIds = knowledgeBaseIds;
        return this;
    }
    public java.util.List<String> getKnowledgeBaseIds() {
        return this.knowledgeBaseIds;
    }

    public QuerySourceUsageSummaryRequest setOpsUserCode(String opsUserCode) {
        this.opsUserCode = opsUserCode;
        return this;
    }
    public String getOpsUserCode() {
        return this.opsUserCode;
    }

    public QuerySourceUsageSummaryRequest setOpsUserId(String opsUserId) {
        this.opsUserId = opsUserId;
        return this;
    }
    public String getOpsUserId() {
        return this.opsUserId;
    }

    public QuerySourceUsageSummaryRequest setScopeType(String scopeType) {
        this.scopeType = scopeType;
        return this;
    }
    public String getScopeType() {
        return this.scopeType;
    }

    public QuerySourceUsageSummaryRequest setSourceIds(java.util.List<String> sourceIds) {
        this.sourceIds = sourceIds;
        return this;
    }
    public java.util.List<String> getSourceIds() {
        return this.sourceIds;
    }

    public QuerySourceUsageSummaryRequest setSourceName(String sourceName) {
        this.sourceName = sourceName;
        return this;
    }
    public String getSourceName() {
        return this.sourceName;
    }

    public QuerySourceUsageSummaryRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public QuerySourceUsageSummaryRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
