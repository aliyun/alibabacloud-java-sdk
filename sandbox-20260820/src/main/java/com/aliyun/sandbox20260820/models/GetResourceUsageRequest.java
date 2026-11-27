// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sandbox20260820.models;

import com.aliyun.tea.*;

public class GetResourceUsageRequest extends TeaModel {
    /**
     * <p>The end time of the query. This time is exclusive. Specify a full hour in UTC. The latest allowed time is the start of the current hour. You can query a maximum of 7 days at a time. The end time must be later than the start time.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-11-05T02:00:00Z</p>
     */
    @NameInMap("endTime")
    public String endTime;

    /**
     * <p>The granularity for aggregating usage. Set to All to view the cumulative usage for the entire query interval. Set to Hour to view hourly usage. Set to Day to aggregate usage every 24 hours from the start time. The last interval can be less than 24 hours.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Hour</p>
     */
    @NameInMap("granularity")
    public String granularity;

    /**
     * <p>Specifies the keys by which to group the results. You can use any combination of teamID, templateID, snapshotID, and sandboxPlan. Each key can be specified only once. If this parameter is not specified, the results are aggregated for the entire query range. If you group by snapshotID, only the usage associated with snapshots is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;teamID&quot;]</p>
     */
    @NameInMap("groupBy")
    public java.util.List<String> groupBy;

    /**
     * <p>The sandbox plan to query. Valid values: eco, std, pro, and ent.</p>
     * 
     * <strong>example:</strong>
     * <p>pro</p>
     */
    @NameInMap("sandboxPlan")
    public String sandboxPlan;

    /**
     * <p>The ID of the snapshot for which you want to query historical usage.</p>
     * 
     * <strong>example:</strong>
     * <p>550e8400-e29b-41d4-a716-446655440000</p>
     */
    @NameInMap("snapshotID")
    public String snapshotID;

    /**
     * <p>The start time of the query. This time is inclusive. Specify a full hour in UTC, such as 00:00 UTC.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-11-05T00:00:00Z</p>
     */
    @NameInMap("startTime")
    public String startTime;

    /**
     * <p>Specifies the team ID. Required when querying by team. If this parameter is omitted, the usage of the current account is queried.</p>
     * 
     * <strong>example:</strong>
     * <p>70d1c834-0333-58d8-97ac-5336eb9179eb</p>
     */
    @NameInMap("teamID")
    public String teamID;

    /**
     * <p>The ID of the template to query. You must also specify the teamID to which the template belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>4hrtmghh2nzrsdh6yr65</p>
     */
    @NameInMap("templateID")
    public String templateID;

    /**
     * <p>Specifies 1 to 8 different usage item names for each request. For available usage items, refer to the resource usage metrics catalog.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;activeVCPU&quot;]</p>
     */
    @NameInMap("usageNames")
    public java.util.List<String> usageNames;

    public static GetResourceUsageRequest build(java.util.Map<String, ?> map) throws Exception {
        GetResourceUsageRequest self = new GetResourceUsageRequest();
        return TeaModel.build(map, self);
    }

    public GetResourceUsageRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public GetResourceUsageRequest setGranularity(String granularity) {
        this.granularity = granularity;
        return this;
    }
    public String getGranularity() {
        return this.granularity;
    }

    public GetResourceUsageRequest setGroupBy(java.util.List<String> groupBy) {
        this.groupBy = groupBy;
        return this;
    }
    public java.util.List<String> getGroupBy() {
        return this.groupBy;
    }

    public GetResourceUsageRequest setSandboxPlan(String sandboxPlan) {
        this.sandboxPlan = sandboxPlan;
        return this;
    }
    public String getSandboxPlan() {
        return this.sandboxPlan;
    }

    public GetResourceUsageRequest setSnapshotID(String snapshotID) {
        this.snapshotID = snapshotID;
        return this;
    }
    public String getSnapshotID() {
        return this.snapshotID;
    }

    public GetResourceUsageRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public GetResourceUsageRequest setTeamID(String teamID) {
        this.teamID = teamID;
        return this;
    }
    public String getTeamID() {
        return this.teamID;
    }

    public GetResourceUsageRequest setTemplateID(String templateID) {
        this.templateID = templateID;
        return this;
    }
    public String getTemplateID() {
        return this.templateID;
    }

    public GetResourceUsageRequest setUsageNames(java.util.List<String> usageNames) {
        this.usageNames = usageNames;
        return this;
    }
    public java.util.List<String> getUsageNames() {
        return this.usageNames;
    }

}
