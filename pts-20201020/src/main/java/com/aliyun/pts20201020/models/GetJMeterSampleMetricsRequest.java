// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20201020.models;

import com.aliyun.tea.*;

public class GetJMeterSampleMetricsRequest extends TeaModel {
    /**
     * <p>The beginning of the time range to query.</p>
     * 
     * <strong>example:</strong>
     * <p>1637157070000</p>
     */
    @NameInMap("BeginTime")
    public Long beginTime;

    /**
     * <p>The end of the time range to query.</p>
     * 
     * <strong>example:</strong>
     * <p>1637157073000</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The report ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>7R4RE352</p>
     */
    @NameInMap("ReportId")
    public String reportId;

    /**
     * <p>The sampler ID. This parameter value starts from 0. If this parameter value is -1, the data of the whole scenario is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
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
