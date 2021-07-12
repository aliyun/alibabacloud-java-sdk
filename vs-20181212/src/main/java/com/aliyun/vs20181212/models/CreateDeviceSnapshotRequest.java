// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class CreateDeviceSnapshotRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("DeviceId")
    public String deviceId;

    @NameInMap("StreamId")
    public String streamId;

    @NameInMap("Mode")
    public String mode;

    @NameInMap("SnapshotConfig")
    public String snapshotConfig;

    public static CreateDeviceSnapshotRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDeviceSnapshotRequest self = new CreateDeviceSnapshotRequest();
        return TeaModel.build(map, self);
    }

    public CreateDeviceSnapshotRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateDeviceSnapshotRequest setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

    public CreateDeviceSnapshotRequest setStreamId(String streamId) {
        this.streamId = streamId;
        return this;
    }
    public String getStreamId() {
        return this.streamId;
    }

    public CreateDeviceSnapshotRequest setMode(String mode) {
        this.mode = mode;
        return this;
    }
    public String getMode() {
        return this.mode;
    }

    public CreateDeviceSnapshotRequest setSnapshotConfig(String snapshotConfig) {
        this.snapshotConfig = snapshotConfig;
        return this;
    }
    public String getSnapshotConfig() {
        return this.snapshotConfig;
    }

}
