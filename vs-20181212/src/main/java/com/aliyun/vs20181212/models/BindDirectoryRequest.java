// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class BindDirectoryRequest extends TeaModel {
    @NameInMap("DeviceId")
    public String deviceId;

    @NameInMap("DirectoryId")
    public String directoryId;

    @NameInMap("OwnerId")
    public Long ownerId;

    public static BindDirectoryRequest build(java.util.Map<String, ?> map) throws Exception {
        BindDirectoryRequest self = new BindDirectoryRequest();
        return TeaModel.build(map, self);
    }

    public BindDirectoryRequest setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

    public BindDirectoryRequest setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
        return this;
    }
    public String getDirectoryId() {
        return this.directoryId;
    }

    public BindDirectoryRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

}
