// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class BatchUnbindParentPlatformDevicesRequest extends TeaModel {
    @NameInMap("DeviceId")
    public String deviceId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ParentPlatformId")
    public String parentPlatformId;

    public static BatchUnbindParentPlatformDevicesRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchUnbindParentPlatformDevicesRequest self = new BatchUnbindParentPlatformDevicesRequest();
        return TeaModel.build(map, self);
    }

    public BatchUnbindParentPlatformDevicesRequest setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

    public BatchUnbindParentPlatformDevicesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public BatchUnbindParentPlatformDevicesRequest setParentPlatformId(String parentPlatformId) {
        this.parentPlatformId = parentPlatformId;
        return this;
    }
    public String getParentPlatformId() {
        return this.parentPlatformId;
    }

}
