// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vdc20201214.models;

import com.aliyun.tea.*;

public class DescribeUsageOverallDataRequest extends TeaModel {
    // 开始时间，秒级时间戳：1609344000
    @NameInMap("StartDate")
    public Long startDate;

    // 结束时间，秒级时间戳：1609344000
    @NameInMap("EndDate")
    public Long endDate;

    // 类型，半角逗号分隔    总时长：TOTAL_CALL_DURATION  视频通信时长：VIDEO_CALL_DURATION  音频通信时长：AUDIO_CALL_DURATION    通信频道数：CALL_CHANNEL_COUNT  高并发通信频道数：  HIGHLY_CONCURRENT_CHANNEL_COUNT  并发频道数峰值：  CHANNEL_CONCURRENT_PEAK    在线人数峰值：ONLINE_USER_PEAK  累计通话人数：  TOTAL_CALL_USER  累计进出人次：  TOTAL_INOUT_NUM
    @NameInMap("Types")
    public String types;

    // APP ID
    @NameInMap("AppId")
    public String appId;

    public static DescribeUsageOverallDataRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeUsageOverallDataRequest self = new DescribeUsageOverallDataRequest();
        return TeaModel.build(map, self);
    }

    public DescribeUsageOverallDataRequest setStartDate(Long startDate) {
        this.startDate = startDate;
        return this;
    }
    public Long getStartDate() {
        return this.startDate;
    }

    public DescribeUsageOverallDataRequest setEndDate(Long endDate) {
        this.endDate = endDate;
        return this;
    }
    public Long getEndDate() {
        return this.endDate;
    }

    public DescribeUsageOverallDataRequest setTypes(String types) {
        this.types = types;
        return this;
    }
    public String getTypes() {
        return this.types;
    }

    public DescribeUsageOverallDataRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

}
