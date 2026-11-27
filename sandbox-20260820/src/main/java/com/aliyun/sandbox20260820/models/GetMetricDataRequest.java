// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sandbox20260820.models;

import com.aliyun.tea.*;

public class GetMetricDataRequest extends TeaModel {
    /**
     * <p>The end time for a time-series query, exclusive. Specify a UTC time in whole seconds, which must be later than startTime. You can query data for up to 7 days at a time. The time range must include at least one time point aligned with period, and these time points cannot be later than the current time.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-11-05T00:02:00Z</p>
     */
    @NameInMap("endTime")
    public String endTime;

    /**
     * <p>For example, grouping by teamID allows you to view the metrics of each team separately. You can combine up to four different grouping keys. The available keys vary by metric. If not specified, the overall results for the query scope are returned.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;teamID&quot;]</p>
     */
    @NameInMap("groupBy")
    public java.util.List<String> groupBy;

    /**
     * <p>Specifies 1 to 16 different metric names in each request. For available metrics and their applicable scopes, see the monitoring metrics folder.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;cpuUsedCores&quot;]</p>
     */
    @NameInMap("metricNames")
    public java.util.List<String> metricNames;

    /**
     * <p>Required for both single-point and time-series queries. In a time-series query, this parameter specifies the interval between adjacent data points in seconds. Valid values: 60, 300, 900, 1800, 3600, and 86400.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("period")
    public Integer period;

    /**
     * <p>The ID of the sandbox to query. You must also specify the teamID and templateID to which the sandbox belongs, and select a metric that supports querying by sandbox.</p>
     * 
     * <strong>example:</strong>
     * <p>sbx-62105527-699e-48df-ad3b-7425001ae4f2</p>
     */
    @NameInMap("sandboxID")
    public String sandboxID;

    /**
     * <p>Queries the number of sandboxes by sandbox edition. This parameter applies only to sandboxCount. Valid values: eco, std, pro, and ent.</p>
     * 
     * <strong>example:</strong>
     * <p>pro</p>
     */
    @NameInMap("sandboxPlan")
    public String sandboxPlan;

    /**
     * <p>The start time for a time-series query, inclusive. Specify a UTC time accurate to seconds as shown in the example, and also specify endTime.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-11-05T00:00:00Z</p>
     */
    @NameInMap("startTime")
    public String startTime;

    /**
     * <p>Required when you query by team. If omitted, the metrics of the current account are queried. Account quotas and team quotas must be queried separately.</p>
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
     * <p>The point in time for a single-point query. Specify the current or a past UTC time, accurate to seconds. If time, startTime, and endTime are omitted, the current time is queried.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-11-05T00:01:00Z</p>
     */
    @NameInMap("time")
    public String time;

    public static GetMetricDataRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMetricDataRequest self = new GetMetricDataRequest();
        return TeaModel.build(map, self);
    }

    public GetMetricDataRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public GetMetricDataRequest setGroupBy(java.util.List<String> groupBy) {
        this.groupBy = groupBy;
        return this;
    }
    public java.util.List<String> getGroupBy() {
        return this.groupBy;
    }

    public GetMetricDataRequest setMetricNames(java.util.List<String> metricNames) {
        this.metricNames = metricNames;
        return this;
    }
    public java.util.List<String> getMetricNames() {
        return this.metricNames;
    }

    public GetMetricDataRequest setPeriod(Integer period) {
        this.period = period;
        return this;
    }
    public Integer getPeriod() {
        return this.period;
    }

    public GetMetricDataRequest setSandboxID(String sandboxID) {
        this.sandboxID = sandboxID;
        return this;
    }
    public String getSandboxID() {
        return this.sandboxID;
    }

    public GetMetricDataRequest setSandboxPlan(String sandboxPlan) {
        this.sandboxPlan = sandboxPlan;
        return this;
    }
    public String getSandboxPlan() {
        return this.sandboxPlan;
    }

    public GetMetricDataRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public GetMetricDataRequest setTeamID(String teamID) {
        this.teamID = teamID;
        return this;
    }
    public String getTeamID() {
        return this.teamID;
    }

    public GetMetricDataRequest setTemplateID(String templateID) {
        this.templateID = templateID;
        return this;
    }
    public String getTemplateID() {
        return this.templateID;
    }

    public GetMetricDataRequest setTime(String time) {
        this.time = time;
        return this;
    }
    public String getTime() {
        return this.time;
    }

}
