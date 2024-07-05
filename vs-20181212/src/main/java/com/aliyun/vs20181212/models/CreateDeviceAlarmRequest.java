// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class CreateDeviceAlarmRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Alarm")
    public Integer alarm;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>12</p>
     */
    @NameInMap("ChannelId")
    public Integer channelId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1632314789000</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <strong>example:</strong>
     * <p>3600</p>
     */
    @NameInMap("Expire")
    public Long expire;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>348*****380-cn-qingdao</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("ObjectType")
    public Integer objectType;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1632121707000</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    /**
     * <p>This parameter is required.</p>
     */
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
