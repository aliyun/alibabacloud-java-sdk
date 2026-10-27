// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20251111.models;

import com.aliyun.tea.*;

public class GetScriptTrendingReportRequest extends TeaModel {
    /**
     * <p>The end time of the statistics. The parameter value must be a UNIX timestamp in milliseconds. It indicates the number of milliseconds that have elapsed since 00:00:00 UTC on January 1, 1970. The following limits apply:</p>
     * <ol>
     * <li><p>Time range: You can query data by hour for up to 7 days or by day for up to 180 days.</p>
     * </li>
     * <li><p>Alignment with time granularity: If you query data by hour, the minutes, seconds, and milliseconds must be 0. If you query data by day, the hours, minutes, seconds, and milliseconds must be 0. If the specified timestamp is not aligned with the time granularity, the system automatically rounds it up to the next valid time.</p>
     * </li>
     * </ol>
     * 
     * <strong>example:</strong>
     * <p>1582103299434</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>12f407b22cbe4890ac595f09985848d5</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The scenario ID.</p>
     * 
     * <strong>example:</strong>
     * <p>891264b9-5883-4068-94a6-241ceb8d51e4</p>
     */
    @NameInMap("ScriptId")
    public String scriptId;

    /**
     * <p>The start time of the statistics. The parameter value is a UNIX timestamp in milliseconds. It indicates the number of milliseconds that have elapsed since 00:00:00 UTC on January 1, 1970. The following limits apply:</p>
     * <ol>
     * <li><p>Valid start time: You can query data collected within the last 365 days from the current date.</p>
     * </li>
     * <li><p>Alignment with time granularity: If you query data by hour, the minutes, seconds, and milliseconds must be 0. If you query data by day, the hours, minutes, seconds, and milliseconds must be 0.</p>
     * </li>
     * <li><p>If the specified timestamp is not aligned with the time granularity, the system automatically rounds it up to the next valid time.</p>
     * </li>
     * </ol>
     * 
     * <strong>example:</strong>
     * <p>1582267398628</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    /**
     * <p>The time interval.</p>
     * 
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
