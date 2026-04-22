// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20251111.models;

import com.aliyun.tea.*;

public class GetInstanceTrendingReportRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1582103299434</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <strong>example:</strong>
     * <p>82b2eaae-ce5c-45f8-8231-f15b6b27e55c</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

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
