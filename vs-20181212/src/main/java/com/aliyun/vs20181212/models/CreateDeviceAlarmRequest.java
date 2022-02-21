// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class CreateDeviceAlarmRequest extends TeaModel {
    @NameInMap("Alarm")
    public Integer alarm;

    @NameInMap("ChannelId")
    public Integer channelId;

    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("Expire")
    public Long expire;

    @NameInMap("Id")
    public String id;

    @NameInMap("ObjectType")
    public Integer objectType;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("StartTime")
    public Long startTime;

    @NameInMap("SubAlarm")
    public Integer subAlarm;

    public static CreateDeviceAlarmRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDeviceAlarmRequest self = new CreateDeviceAlarmRequest();
        return TeaModel.build(map, self);
    }

    public CreateDeviceAlarmRequest setAlarm(Integer alarm) {
        this.alarm = alarm;
        return this;
    }
    public Integer getAlarm() {
        return this.alarm;
    }

    public CreateDeviceAlarmRequest setChannelId(Integer channelId) {
        this.channelId = channelId;
        return this;
    }
    public Integer getChannelId() {
        return this.channelId;
    }

    public CreateDeviceAlarmRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public CreateDeviceAlarmRequest setExpire(Long expire) {
        this.expire = expire;
        return this;
    }
    public Long getExpire() {
        return this.expire;
    }

    public CreateDeviceAlarmRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public CreateDeviceAlarmRequest setObjectType(Integer objectType) {
        this.objectType = objectType;
        return this;
    }
    public Integer getObjectType() {
        return this.objectType;
    }

    public CreateDeviceAlarmRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateDeviceAlarmRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public CreateDeviceAlarmRequest setSubAlarm(Integer subAlarm) {
        this.subAlarm = subAlarm;
        return this;
    }
    public Integer getSubAlarm() {
        return this.subAlarm;
    }

}
