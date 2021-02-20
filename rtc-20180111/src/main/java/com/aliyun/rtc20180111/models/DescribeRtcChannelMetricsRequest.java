// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DescribeRtcChannelMetricsRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ShowLog")
    public String showLog;

    @NameInMap("AppId")
    public String appId;

    @NameInMap("ChannelId")
    public String channelId;

    @NameInMap("PubUid")
    public String pubUid;

    @NameInMap("SubUid")
    public String subUid;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("EndTime")
    public String endTime;

    public static DescribeRtcChannelMetricsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeRtcChannelMetricsRequest self = new DescribeRtcChannelMetricsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeRtcChannelMetricsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeRtcChannelMetricsRequest setShowLog(String showLog) {
        this.showLog = showLog;
        return this;
    }
    public String getShowLog() {
        return this.showLog;
    }

    public DescribeRtcChannelMetricsRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DescribeRtcChannelMetricsRequest setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }
    public String getChannelId() {
        return this.channelId;
    }

    public DescribeRtcChannelMetricsRequest setPubUid(String pubUid) {
        this.pubUid = pubUid;
        return this;
    }
    public String getPubUid() {
        return this.pubUid;
    }

    public DescribeRtcChannelMetricsRequest setSubUid(String subUid) {
        this.subUid = subUid;
        return this;
    }
    public String getSubUid() {
        return this.subUid;
    }

    public DescribeRtcChannelMetricsRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeRtcChannelMetricsRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

}
