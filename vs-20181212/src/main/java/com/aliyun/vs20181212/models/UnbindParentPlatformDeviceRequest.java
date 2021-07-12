// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class UnbindParentPlatformDeviceRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ParentPlatformId")
    public String parentPlatformId;

    @NameInMap("DeviceId")
    public String deviceId;

    public static UnbindParentPlatformDeviceRequest build(java.util.Map<String, ?> map) throws Exception {
        UnbindParentPlatformDeviceRequest self = new UnbindParentPlatformDeviceRequest();
        return TeaModel.build(map, self);
    }

    public UnbindParentPlatformDeviceRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public UnbindParentPlatformDeviceRequest setParentPlatformId(String parentPlatformId) {
        this.parentPlatformId = parentPlatformId;
        return this;
    }
    public String getParentPlatformId() {
        return this.parentPlatformId;
    }

    public UnbindParentPlatformDeviceRequest setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

}
