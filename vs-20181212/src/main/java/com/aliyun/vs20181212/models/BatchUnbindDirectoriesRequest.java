// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class BatchUnbindDirectoriesRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("DirectoryId")
    public String directoryId;

    @NameInMap("DeviceId")
    public String deviceId;

    public static BatchUnbindDirectoriesRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchUnbindDirectoriesRequest self = new BatchUnbindDirectoriesRequest();
        return TeaModel.build(map, self);
    }

    public BatchUnbindDirectoriesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public BatchUnbindDirectoriesRequest setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
        return this;
    }
    public String getDirectoryId() {
        return this.directoryId;
    }

    public BatchUnbindDirectoriesRequest setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

}
