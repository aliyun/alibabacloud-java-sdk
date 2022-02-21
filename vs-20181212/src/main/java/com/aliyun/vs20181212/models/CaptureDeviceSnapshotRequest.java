// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class CaptureDeviceSnapshotRequest extends TeaModel {
    @NameInMap("DeviceId")
    public String deviceId;

    @NameInMap("Mode")
    public String mode;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("SnapshotConfig")
    public String snapshotConfig;

    @NameInMap("StreamId")
    public String streamId;

    public static CaptureDeviceSnapshotRequest build(java.util.Map<String, ?> map) throws Exception {
        CaptureDeviceSnapshotRequest self = new CaptureDeviceSnapshotRequest();
        return TeaModel.build(map, self);
    }

    public CaptureDeviceSnapshotRequest setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

    public CaptureDeviceSnapshotRequest setMode(String mode) {
        this.mode = mode;
        return this;
    }
    public String getMode() {
        return this.mode;
    }

    public CaptureDeviceSnapshotRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CaptureDeviceSnapshotRequest setSnapshotConfig(String snapshotConfig) {
        this.snapshotConfig = snapshotConfig;
        return this;
    }
    public String getSnapshotConfig() {
        return this.snapshotConfig;
    }

    public CaptureDeviceSnapshotRequest setStreamId(String streamId) {
        this.streamId = streamId;
        return this;
    }
    public String getStreamId() {
        return this.streamId;
    }

}
