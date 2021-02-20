// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class SetChannelPropertyRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ShowLog")
    public String showLog;

    @NameInMap("AppId")
    public String appId;

    @NameInMap("ChannelId")
    public String channelId;

    @NameInMap("MaxUserNum")
    public Integer maxUserNum;

    @NameInMap("StartTime")
    public Integer startTime;

    @NameInMap("Duration")
    public Integer duration;

    @NameInMap("Priority")
    public String priority;

    @NameInMap("Topics")
    public String topics;

    public static SetChannelPropertyRequest build(java.util.Map<String, ?> map) throws Exception {
        SetChannelPropertyRequest self = new SetChannelPropertyRequest();
        return TeaModel.build(map, self);
    }

    public SetChannelPropertyRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public SetChannelPropertyRequest setShowLog(String showLog) {
        this.showLog = showLog;
        return this;
    }
    public String getShowLog() {
        return this.showLog;
    }

    public SetChannelPropertyRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public SetChannelPropertyRequest setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }
    public String getChannelId() {
        return this.channelId;
    }

    public SetChannelPropertyRequest setMaxUserNum(Integer maxUserNum) {
        this.maxUserNum = maxUserNum;
        return this;
    }
    public Integer getMaxUserNum() {
        return this.maxUserNum;
    }

    public SetChannelPropertyRequest setStartTime(Integer startTime) {
        this.startTime = startTime;
        return this;
    }
    public Integer getStartTime() {
        return this.startTime;
    }

    public SetChannelPropertyRequest setDuration(Integer duration) {
        this.duration = duration;
        return this;
    }
    public Integer getDuration() {
        return this.duration;
    }

    public SetChannelPropertyRequest setPriority(String priority) {
        this.priority = priority;
        return this;
    }
    public String getPriority() {
        return this.priority;
    }

    public SetChannelPropertyRequest setTopics(String topics) {
        this.topics = topics;
        return this;
    }
    public String getTopics() {
        return this.topics;
    }

}
