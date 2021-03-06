// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class SyncDeviceChannelsRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("DeviceId")
    public String deviceId;

    public static SyncDeviceChannelsRequest build(java.util.Map<String, ?> map) throws Exception {
        SyncDeviceChannelsRequest self = new SyncDeviceChannelsRequest();
        return TeaModel.build(map, self);
    }

    public SyncDeviceChannelsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public SyncDeviceChannelsRequest setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

}
