// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class QuerySourceUsageSummaryShrinkRequest extends TeaModel {
    /**
     * <p>The ID of the collaboration group to which the resource belongs, such as cg_101. If you specify this parameter, a group workspace task is created, and the caller must be a valid group member. If you leave this parameter empty, a personal task is created.</p>
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
     * <p>UserOperator</p>
     */
    @NameInMap("eventType")
    public String eventType;

    /**
     * <p>The ID of the knowledge base folder.</p>
     */
    @NameInMap("knowledgeBaseIds")
    public String knowledgeBaseIdsShrink;

    /**
     * <p>The role scope type. Valid values:</p>
     * <ul>
     * <li><strong>ALL_VISIBLE</strong>: All members.</li>
     * <li><strong>PART_VISIBLE</strong>: Partial members.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Report perspective: TENANT for enterprise knowledge, GROUP for a single workspace, and ALL_GROUPS for all workspaces of the current tenant (platform super administrator only). Valid values: TENANT, GROUP, and ALL_GROUPS</p>
     */
    @NameInMap("scopeType")
    public String scopeType;

    /**
     * <p>The source ID.</p>
     */
    @NameInMap("sourceIds")
    public String sourceIdsShrink;

    /**
     * <p>The resume channel source.</p>
     * 
     * <strong>example:</strong>
     * <p>The name of the source</p>
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
     * <p>The tenant ID, which is a common parameter. If you use winnexo-cli, pass this parameter explicitly by using --tenant-id.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    public static QuerySourceUsageSummaryShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        QuerySourceUsageSummaryShrinkRequest self = new QuerySourceUsageSummaryShrinkRequest();
        return TeaModel.build(map, self);
    }

    public QuerySourceUsageSummaryShrinkRequest setCollaborationGroupId(String collaborationGroupId) {
        this.collaborationGroupId = collaborationGroupId;
        return this;
    }
    public String getCollaborationGroupId() {
        return this.collaborationGroupId;
    }

    public QuerySourceUsageSummaryShrinkRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public QuerySourceUsageSummaryShrinkRequest setEventType(String eventType) {
        this.eventType = eventType;
        return this;
    }
    public String getEventType() {
        return this.eventType;
    }

    public QuerySourceUsageSummaryShrinkRequest setKnowledgeBaseIdsShrink(String knowledgeBaseIdsShrink) {
        this.knowledgeBaseIdsShrink = knowledgeBaseIdsShrink;
        return this;
    }
    public String getKnowledgeBaseIdsShrink() {
        return this.knowledgeBaseIdsShrink;
    }

    public QuerySourceUsageSummaryShrinkRequest setScopeType(String scopeType) {
        this.scopeType = scopeType;
        return this;
    }
    public String getScopeType() {
        return this.scopeType;
    }

    public QuerySourceUsageSummaryShrinkRequest setSourceIdsShrink(String sourceIdsShrink) {
        this.sourceIdsShrink = sourceIdsShrink;
        return this;
    }
    public String getSourceIdsShrink() {
        return this.sourceIdsShrink;
    }

    public QuerySourceUsageSummaryShrinkRequest setSourceName(String sourceName) {
        this.sourceName = sourceName;
        return this;
    }
    public String getSourceName() {
        return this.sourceName;
    }

    public QuerySourceUsageSummaryShrinkRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public QuerySourceUsageSummaryShrinkRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
