// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vdc20201214.models;

import com.aliyun.tea.*;

public class DescribeRtcRecordMetricDataRequest extends TeaModel {
    // appId
    @NameInMap("AppId")
    public String appId;

    // 结束时间，UTC格式
    @NameInMap("EndTime")
    public String endTime;

    // 服务区域
    @NameInMap("ServiceArea")
    public String serviceArea;

    // 起始时间，UTC格式
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeRtcRecordMetricDataRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeRtcRecordMetricDataRequest self = new DescribeRtcRecordMetricDataRequest();
        return TeaModel.build(map, self);
    }

    public DescribeRtcRecordMetricDataRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
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

    public DescribeRtcRecordMetricDataRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
