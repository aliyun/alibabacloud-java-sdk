// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class UpdateContextDatabaseSyncJobScheduleRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>sync-connection-20260923-001</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <strong>example:</strong>
     * <p>[&quot;09:00&quot;, &quot;18:00&quot;]</p>
     */
    @NameInMap("DailyTimes")
    public java.util.List<String> dailyTimes;

    /**
     * <strong>example:</strong>
     * <p>12</p>
     */
    @NameInMap("IntervalMinutes")
    public Integer intervalMinutes;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>550e8400-e29b-41d4-a716-446655440000</p>
     */
    @NameInMap("JobId")
    public String jobId;

    /**
     * <strong>example:</strong>
     * <p>skip</p>
     */
    @NameInMap("MissedPolicy")
    public String missedPolicy;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>daily-times</p>
     */
    @NameInMap("Type")
    public String type;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ws-as1llqmkol****</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static UpdateContextDatabaseSyncJobScheduleRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateContextDatabaseSyncJobScheduleRequest self = new UpdateContextDatabaseSyncJobScheduleRequest();
        return TeaModel.build(map, self);
    }

    public UpdateContextDatabaseSyncJobScheduleRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateContextDatabaseSyncJobScheduleRequest setDailyTimes(java.util.List<String> dailyTimes) {
        this.dailyTimes = dailyTimes;
        return this;
    }
    public java.util.List<String> getDailyTimes() {
        return this.dailyTimes;
    }

    public UpdateContextDatabaseSyncJobScheduleRequest setIntervalMinutes(Integer intervalMinutes) {
        this.intervalMinutes = intervalMinutes;
        return this;
    }
    public Integer getIntervalMinutes() {
        return this.intervalMinutes;
    }

    public UpdateContextDatabaseSyncJobScheduleRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public UpdateContextDatabaseSyncJobScheduleRequest setMissedPolicy(String missedPolicy) {
        this.missedPolicy = missedPolicy;
        return this;
    }
    public String getMissedPolicy() {
        return this.missedPolicy;
    }

    public UpdateContextDatabaseSyncJobScheduleRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public UpdateContextDatabaseSyncJobScheduleRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
