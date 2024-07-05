// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class BatchUnbindPurchasedDevicesRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>348*****380-cn-qingdao</p>
     */
    @NameInMap("DeviceId")
    public String deviceId;

    @NameInMap("OwnerId")
    public Long ownerId;

    public static BatchUnbindPurchasedDevicesRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchUnbindPurchasedDevicesRequest self = new BatchUnbindPurchasedDevicesRequest();
        return TeaModel.build(map, self);
    }

    public BatchUnbindPurchasedDevicesRequest setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

    public BatchUnbindPurchasedDevicesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

}
