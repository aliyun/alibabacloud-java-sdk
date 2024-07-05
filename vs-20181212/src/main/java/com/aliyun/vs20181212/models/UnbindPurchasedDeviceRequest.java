// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class UnbindPurchasedDeviceRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3939*****6580539-cn-qingdao</p>
     */
    @NameInMap("DeviceId")
    public String deviceId;

    @NameInMap("OwnerId")
    public Long ownerId;

    public static UnbindPurchasedDeviceRequest build(java.util.Map<String, ?> map) throws Exception {
        UnbindPurchasedDeviceRequest self = new UnbindPurchasedDeviceRequest();
        return TeaModel.build(map, self);
    }

    public UnbindPurchasedDeviceRequest setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

    public UnbindPurchasedDeviceRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

}
