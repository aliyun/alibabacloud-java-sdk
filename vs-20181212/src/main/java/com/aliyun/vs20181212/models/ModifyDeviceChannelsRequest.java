// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class ModifyDeviceChannelsRequest extends TeaModel {
    @NameInMap("Channels")
    public String channels;

    @NameInMap("DeviceStatus")
    public String deviceStatus;

    @NameInMap("Dsn")
    public String dsn;

    @NameInMap("Id")
    public String id;

    @NameInMap("OwnerId")
    public Long ownerId;

    public static ModifyDeviceChannelsRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDeviceChannelsRequest self = new ModifyDeviceChannelsRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDeviceChannelsRequest setChannels(String channels) {
        this.channels = channels;
        return this;
    }
    public String getChannels() {
        return this.channels;
    }

    public ModifyDeviceChannelsRequest setDeviceStatus(String deviceStatus) {
        this.deviceStatus = deviceStatus;
        return this;
    }
    public String getDeviceStatus() {
        return this.deviceStatus;
    }

    public ModifyDeviceChannelsRequest setDsn(String dsn) {
        this.dsn = dsn;
        return this;
    }
    public String getDsn() {
        return this.dsn;
    }

    public ModifyDeviceChannelsRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public ModifyDeviceChannelsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

}
