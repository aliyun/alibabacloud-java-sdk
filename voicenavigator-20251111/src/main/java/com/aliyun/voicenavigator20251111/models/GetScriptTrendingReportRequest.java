// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20251111.models;

import com.aliyun.tea.*;

public class GetScriptTrendingReportRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1582103299434</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <strong>example:</strong>
     * <p>12f407b22cbe4890ac595f09985848d5</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>891264b9-5883-4068-94a6-241ceb8d51e4</p>
     */
    @NameInMap("ScriptId")
    public String scriptId;

    /**
     * <strong>example:</strong>
     * <p>1582267398628</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    /**
     * <strong>example:</strong>
     * <p>1d</p>
     */
    @NameInMap("TimeInterval")
    public String timeInterval;

    public static GetScriptTrendingReportRequest build(java.util.Map<String, ?> map) throws Exception {
        GetScriptTrendingReportRequest self = new GetScriptTrendingReportRequest();
        return TeaModel.build(map, self);
    }

    public GetScriptTrendingReportRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public GetScriptTrendingReportRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetScriptTrendingReportRequest setScriptId(String scriptId) {
        this.scriptId = scriptId;
        return this;
    }
    public String getScriptId() {
        return this.scriptId;
    }

    public GetScriptTrendingReportRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public GetScriptTrendingReportRequest setTimeInterval(String timeInterval) {
        this.timeInterval = timeInterval;
        return this;
    }
    public String getTimeInterval() {
        return this.timeInterval;
    }

}
