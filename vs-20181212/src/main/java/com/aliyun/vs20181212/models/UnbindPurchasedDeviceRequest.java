// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class UnbindPurchasedDeviceRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("DeviceId")
    public String deviceId;

    public static UnbindPurchasedDeviceRequest build(java.util.Map<String, ?> map) throws Exception {
        UnbindPurchasedDeviceRequest self = new UnbindPurchasedDeviceRequest();
        return TeaModel.build(map, self);
    }

    public UnbindPurchasedDeviceRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public UnbindPurchasedDeviceRequest setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

}
