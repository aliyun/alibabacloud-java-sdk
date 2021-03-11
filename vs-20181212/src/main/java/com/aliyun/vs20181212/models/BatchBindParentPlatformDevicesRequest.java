// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class BatchBindParentPlatformDevicesRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ShowLog")
    public String showLog;

    @NameInMap("ParentPlatformId")
    public String parentPlatformId;

    @NameInMap("DeviceId")
    public String deviceId;

    public static BatchBindParentPlatformDevicesRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchBindParentPlatformDevicesRequest self = new BatchBindParentPlatformDevicesRequest();
        return TeaModel.build(map, self);
    }

    public BatchBindParentPlatformDevicesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public BatchBindParentPlatformDevicesRequest setShowLog(String showLog) {
        this.showLog = showLog;
        return this;
    }
    public String getShowLog() {
        return this.showLog;
    }

    public BatchBindParentPlatformDevicesRequest setParentPlatformId(String parentPlatformId) {
        this.parentPlatformId = parentPlatformId;
        return this;
    }
    public String getParentPlatformId() {
        return this.parentPlatformId;
    }

    public BatchBindParentPlatformDevicesRequest setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

}
