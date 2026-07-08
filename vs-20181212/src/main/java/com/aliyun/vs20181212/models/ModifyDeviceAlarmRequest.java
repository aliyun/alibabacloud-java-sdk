// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class ModifyDeviceAlarmRequest extends TeaModel {
    /**
     * <p>The alarm ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0dGo7jLwwf1000296232</p>
     */
    @NameInMap("AlarmId")
    public String alarmId;

    /**
     * <p>The channel ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("ChannelId")
    public Integer channelId;

    /**
     * <p>The device ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>348*****380-cn-qingdao</p>
     */
    @NameInMap("Id")
    public String id;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The alarm status. Valid values:</p>
     * <ul>
     * <li>1 (upload completed)</li>
     * <li>2 (upload failed)</li>
     * <li>3 (general error)</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Status")
    public Integer status;

    public static ModifyDeviceAlarmRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDeviceAlarmRequest self = new ModifyDeviceAlarmRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDeviceAlarmRequest setAlarmId(String alarmId) {
        this.alarmId = alarmId;
        return this;
    }
    public String getAlarmId() {
        return this.alarmId;
    }

    public ModifyDeviceAlarmRequest setChannelId(Integer channelId) {
        this.channelId = channelId;
        return this;
    }
    public Integer getChannelId() {
        return this.channelId;
    }

    public ModifyDeviceAlarmRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public ModifyDeviceAlarmRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyDeviceAlarmRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

}
