// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vdc20201214.models;

import com.aliyun.tea.*;

public class DescribeRtcChannelMetricListRequest extends TeaModel {
    // 应用id
    @NameInMap("AppId")
    public String appId;

    // ChannelId
    @NameInMap("ChannelId")
    public String channelId;

    // 发布端用户ID
    @NameInMap("PubUid")
    public String pubUid;

    // 接收端用户ID
    @NameInMap("SubUid")
    public String subUid;

    // 起始时间，UTC格式
    @NameInMap("StartTime")
    public String startTime;

    // 结束时间，UTC格式
    @NameInMap("EndTime")
    public String endTime;

    public static DescribeRtcChannelMetricListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeRtcChannelMetricListRequest self = new DescribeRtcChannelMetricListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeRtcChannelMetricListRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DescribeRtcChannelMetricListRequest setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }
    public String getChannelId() {
        return this.channelId;
    }

    public DescribeRtcChannelMetricListRequest setPubUid(String pubUid) {
        this.pubUid = pubUid;
        return this;
    }
    public String getPubUid() {
        return this.pubUid;
    }

    public DescribeRtcChannelMetricListRequest setSubUid(String subUid) {
        this.subUid = subUid;
        return this;
    }
    public String getSubUid() {
        return this.subUid;
    }

    public DescribeRtcChannelMetricListRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeRtcChannelMetricListRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

}
