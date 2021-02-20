// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DescribeRtcUserListRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ShowLog")
    public String showLog;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("AppId")
    public String appId;

    @NameInMap("ChannelId")
    public String channelId;

    @NameInMap("PubUser")
    public String pubUser;

    @NameInMap("SubUser")
    public String subUser;

    public static DescribeRtcUserListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeRtcUserListRequest self = new DescribeRtcUserListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeRtcUserListRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeRtcUserListRequest setShowLog(String showLog) {
        this.showLog = showLog;
        return this;
    }
    public String getShowLog() {
        return this.showLog;
    }

    public DescribeRtcUserListRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeRtcUserListRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeRtcUserListRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DescribeRtcUserListRequest setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }
    public String getChannelId() {
        return this.channelId;
    }

    public DescribeRtcUserListRequest setPubUser(String pubUser) {
        this.pubUser = pubUser;
        return this;
    }
    public String getPubUser() {
        return this.pubUser;
    }

    public DescribeRtcUserListRequest setSubUser(String subUser) {
        this.subUser = subUser;
        return this;
    }
    public String getSubUser() {
        return this.subUser;
    }

}
