// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class QuerySourceUsageTrendShrinkRequest extends TeaModel {
    /**
     * <p>The ID of the collaboration group to which the resource belongs, such as cg_101. If this parameter is specified, a group workspace task is created, and the caller must be a valid group member. If this parameter is left empty, a personal task is created.</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
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
     * <p>MAIN</p>
     */
    @NameInMap("eventType")
    public String eventType;

    /**
     * <p>The aggregation granularity. Valid values: hourly and daily.</p>
     * 
     * <strong>example:</strong>
     * <p>daily</p>
     */
    @NameInMap("granularity")
    public String granularity;

    /**
     * <p>The IDs of the knowledge base folders.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;kb_9401&quot;]</p>
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
     * <p>Report perspective: TENANT for enterprise knowledge, GROUP for a single workspace, ALL_GROUPS for all workspaces of the current tenant (platform super administrator only). Valid values: TENANT, GROUP, and ALL_GROUPS</p>
     */
    @NameInMap("scopeType")
    public String scopeType;

    /**
     * <p>The IDs of the resource sources.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;src_9401&quot;]</p>
     */
    @NameInMap("sourceIds")
    public String sourceIdsShrink;

    /**
     * <p>The resume channel source.</p>
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
     * <p>2026-09-01T00:00:00+08:00</p>
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

    /**
     * <p>The time zone.</p>
     * 
     * <strong>example:</strong>
     * <p>Asia/Shanghai</p>
     */
    @NameInMap("timeZone")
    public String timeZone;

    public static QuerySourceUsageTrendShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        QuerySourceUsageTrendShrinkRequest self = new QuerySourceUsageTrendShrinkRequest();
        return TeaModel.build(map, self);
    }

    public QuerySourceUsageTrendShrinkRequest setCollaborationGroupId(String collaborationGroupId) {
        this.collaborationGroupId = collaborationGroupId;
        return this;
    }
    public String getCollaborationGroupId() {
        return this.collaborationGroupId;
    }

    public QuerySourceUsageTrendShrinkRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public QuerySourceUsageTrendShrinkRequest setEventType(String eventType) {
        this.eventType = eventType;
        return this;
    }
    public String getEventType() {
        return this.eventType;
    }

    public QuerySourceUsageTrendShrinkRequest setGranularity(String granularity) {
        this.granularity = granularity;
        return this;
    }
    public String getGranularity() {
        return this.granularity;
    }

    public QuerySourceUsageTrendShrinkRequest setKnowledgeBaseIdsShrink(String knowledgeBaseIdsShrink) {
        this.knowledgeBaseIdsShrink = knowledgeBaseIdsShrink;
        return this;
    }
    public String getKnowledgeBaseIdsShrink() {
        return this.knowledgeBaseIdsShrink;
    }

    public QuerySourceUsageTrendShrinkRequest setScopeType(String scopeType) {
        this.scopeType = scopeType;
        return this;
    }
    public String getScopeType() {
        return this.scopeType;
    }

    public QuerySourceUsageTrendShrinkRequest setSourceIdsShrink(String sourceIdsShrink) {
        this.sourceIdsShrink = sourceIdsShrink;
        return this;
    }
    public String getSourceIdsShrink() {
        return this.sourceIdsShrink;
    }

    public QuerySourceUsageTrendShrinkRequest setSourceName(String sourceName) {
        this.sourceName = sourceName;
        return this;
    }
    public String getSourceName() {
        return this.sourceName;
    }

    public QuerySourceUsageTrendShrinkRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public QuerySourceUsageTrendShrinkRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public QuerySourceUsageTrendShrinkRequest setTimeZone(String timeZone) {
        this.timeZone = timeZone;
        return this;
    }
    public String getTimeZone() {
        return this.timeZone;
    }

}
