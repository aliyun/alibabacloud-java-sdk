// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class BindPurchasedDeviceRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ShowLog")
    public String showLog;

    @NameInMap("Region")
    public String region;

    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("DeviceId")
    public String deviceId;

    public static BindPurchasedDeviceRequest build(java.util.Map<String, ?> map) throws Exception {
        BindPurchasedDeviceRequest self = new BindPurchasedDeviceRequest();
        return TeaModel.build(map, self);
    }

    public BindPurchasedDeviceRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public BindPurchasedDeviceRequest setShowLog(String showLog) {
        this.showLog = showLog;
        return this;
    }
    public String getShowLog() {
        return this.showLog;
    }

    public BindPurchasedDeviceRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public BindPurchasedDeviceRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public BindPurchasedDeviceRequest setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

}
