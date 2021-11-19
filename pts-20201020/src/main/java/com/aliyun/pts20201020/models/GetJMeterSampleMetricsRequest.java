// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20201020.models;

import com.aliyun.tea.*;

public class GetJMeterSampleMetricsRequest extends TeaModel {
    // 开始时间
    @NameInMap("BeginTime")
    public Long beginTime;

    // 结束时间
    @NameInMap("EndTime")
    public Long endTime;

    // 报告ID
    @NameInMap("ReportId")
    public String reportId;

    // 采样器索引，从0开始。-1返回全场景
    @NameInMap("SamplerId")
    public Integer samplerId;

    public static GetJMeterSampleMetricsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetJMeterSampleMetricsRequest self = new GetJMeterSampleMetricsRequest();
        return TeaModel.build(map, self);
    }

    public GetJMeterSampleMetricsRequest setBeginTime(Long beginTime) {
        this.beginTime = beginTime;
        return this;
    }
    public Long getBeginTime() {
        return this.beginTime;
    }

    public GetJMeterSampleMetricsRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public GetJMeterSampleMetricsRequest setReportId(String reportId) {
        this.reportId = reportId;
        return this;
    }
    public String getReportId() {
        return this.reportId;
    }

    public GetJMeterSampleMetricsRequest setSamplerId(Integer samplerId) {
        this.samplerId = samplerId;
        return this;
    }
    public Integer getSamplerId() {
        return this.samplerId;
    }

}
