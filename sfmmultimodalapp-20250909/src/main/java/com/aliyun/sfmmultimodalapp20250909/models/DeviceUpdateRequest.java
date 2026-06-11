// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sfmmultimodalapp20250909.models;

import com.aliyun.tea.*;

public class DeviceUpdateRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DeviceName")
    public String deviceName;

    @NameInMap("Remark")
    public String remark;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Status")
    public Integer status;

    public static DeviceUpdateRequest build(java.util.Map<String, ?> map) throws Exception {
        DeviceUpdateRequest self = new DeviceUpdateRequest();
        return TeaModel.build(map, self);
    }

    public DeviceUpdateRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DeviceUpdateRequest setDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }
    public String getDeviceName() {
        return this.deviceName;
    }

    public DeviceUpdateRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public DeviceUpdateRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

}
