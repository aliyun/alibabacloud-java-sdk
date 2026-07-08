// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class BatchBindParentPlatformDevicesRequest extends TeaModel {
    /**
     * <p>The device IDs. Separate multiple values with commas.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>348*****380-cn-qingdao</p>
     */
    @NameInMap("DeviceId")
    public String deviceId;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The ID of the parent platform.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>361*****212-cn-qingdao</p>
     */
    @NameInMap("ParentPlatformId")
    public String parentPlatformId;

    public static BatchBindParentPlatformDevicesRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchBindParentPlatformDevicesRequest self = new BatchBindParentPlatformDevicesRequest();
        return TeaModel.build(map, self);
    }

    public BatchBindParentPlatformDevicesRequest setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

    public BatchBindParentPlatformDevicesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public BatchBindParentPlatformDevicesRequest setParentPlatformId(String parentPlatformId) {
        this.parentPlatformId = parentPlatformId;
        return this;
    }
    public String getParentPlatformId() {
        return this.parentPlatformId;
    }

}
