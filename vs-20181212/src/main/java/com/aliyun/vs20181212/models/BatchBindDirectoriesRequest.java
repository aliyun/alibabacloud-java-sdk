// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class BatchBindDirectoriesRequest extends TeaModel {
    @NameInMap("DeviceId")
    public String deviceId;

    @NameInMap("DirectoryId")
    public String directoryId;

    @NameInMap("OwnerId")
    public Long ownerId;

    public static BatchBindDirectoriesRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchBindDirectoriesRequest self = new BatchBindDirectoriesRequest();
        return TeaModel.build(map, self);
    }

    public BatchBindDirectoriesRequest setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

    public BatchBindDirectoriesRequest setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
        return this;
    }
    public String getDirectoryId() {
        return this.directoryId;
    }

    public BatchBindDirectoriesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

}
