// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vdc20201214.models;

import com.aliyun.tea.*;

public class DescribeRtcRecordMetricDataRequest extends TeaModel {
    // 起始时间，UTC格式
    @NameInMap("StartTime")
    public String startTime;

    // 结束时间，UTC格式
    @NameInMap("EndTime")
    public String endTime;

    // 服务区域
    @NameInMap("ServiceArea")
    public String serviceArea;

    // appId
    @NameInMap("AppId")
    public String appId;

    public static DescribeRtcRecordMetricDataRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeRtcRecordMetricDataRequest self = new DescribeRtcRecordMetricDataRequest();
        return TeaModel.build(map, self);
    }

    public DescribeRtcRecordMetricDataRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeRtcRecordMetricDataRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeRtcRecordMetricDataRequest setServiceArea(String serviceArea) {
        this.serviceArea = serviceArea;
        return this;
    }
    public String getServiceArea() {
        return this.serviceArea;
    }

    public DescribeRtcRecordMetricDataRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

}
