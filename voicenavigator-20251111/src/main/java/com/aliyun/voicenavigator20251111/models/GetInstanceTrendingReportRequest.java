// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20251111.models;

import com.aliyun.tea.*;

public class GetInstanceTrendingReportRequest extends TeaModel {
    /**
     * <p>The end time of the statistical period. The value is a millisecond-level UNIX timestamp that represents the number of milliseconds elapsed since 1970-01-01 00:00:00 UTC. The following constraints apply:</p>
     * <p>Time range constraint: The maximum time range is 7 days for hourly queries and 180 days for daily queries.
     * Time granularity alignment: For hourly queries, the minutes, seconds, and milliseconds must be 0. For daily queries, the hours, minutes, seconds, and milliseconds must be 0.
     * If the specified timestamp is not aligned with the corresponding granularity, the server automatically rounds it up.</p>
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
     * <p>82b2eaae-ce5c-45f8-8231-f15b6b27e55c</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The start time of the statistical period. The value is a millisecond-level UNIX timestamp that represents the number of milliseconds elapsed since 1970-01-01 00:00:00 UTC. The following constraints apply:</p>
     * <ol>
     * <li>Earliest boundary: The start time can trace back to 00:00:00 of the date 365 calendar days before the current date.</li>
     * <li>Time granularity alignment: For hourly queries, the minutes, seconds, and milliseconds must be 0. For daily queries, the hours, minutes, seconds, and milliseconds must be 0.</li>
     * <li>If the specified timestamp is not aligned with the corresponding granularity, the server automatically rounds it up.</li>
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

    public static GetInstanceTrendingReportRequest build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceTrendingReportRequest self = new GetInstanceTrendingReportRequest();
        return TeaModel.build(map, self);
    }

    public GetInstanceTrendingReportRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public GetInstanceTrendingReportRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetInstanceTrendingReportRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public GetInstanceTrendingReportRequest setTimeInterval(String timeInterval) {
        this.timeInterval = timeInterval;
        return this;
    }
    public String getTimeInterval() {
        return this.timeInterval;
    }

}
