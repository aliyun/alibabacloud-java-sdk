// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vdc20201214.models;

import com.aliyun.tea.*;

public class DescribeRtcUserEventListRequest extends TeaModel {
    // 应用id
    @NameInMap("AppId")
    public String appId;

    // ChannelID
    @NameInMap("ChannelId")
    public String channelId;

    // 结束时间，UTC格式
    @NameInMap("EndTime")
    public String endTime;

    // 起始时间，UTC格式
    @NameInMap("StartTime")
    public String startTime;

    // 用户ID
    @NameInMap("Uid")
    public String uid;

    public static DescribeRtcUserEventListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeRtcUserEventListRequest self = new DescribeRtcUserEventListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeRtcUserEventListRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DescribeRtcUserEventListRequest setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }
    public String getChannelId() {
        return this.channelId;
    }

    public DescribeRtcUserEventListRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeRtcUserEventListRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeRtcUserEventListRequest setUid(String uid) {
        this.uid = uid;
        return this;
    }
    public String getUid() {
        return this.uid;
    }

}
