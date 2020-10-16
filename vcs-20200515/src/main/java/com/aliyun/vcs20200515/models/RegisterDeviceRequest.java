// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class RegisterDeviceRequest extends TeaModel {
    @NameInMap("DeviceSn")
    @Validation(required = true)
    public String deviceSn;

    @NameInMap("DeviceId")
    public String deviceId;

    @NameInMap("ServerId")
    public String serverId;

    @NameInMap("DeviceTimeStamp")
    @Validation(required = true)
    public String deviceTimeStamp;

    public static RegisterDeviceRequest build(java.util.Map<String, ?> map) throws Exception {
        RegisterDeviceRequest self = new RegisterDeviceRequest();
        return TeaModel.build(map, self);
    }

    public RegisterDeviceRequest setDeviceSn(String deviceSn) {
        this.deviceSn = deviceSn;
        return this;
    }
    public String getDeviceSn() {
        return this.deviceSn;
    }

    public RegisterDeviceRequest setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

    public RegisterDeviceRequest setServerId(String serverId) {
        this.serverId = serverId;
        return this;
    }
    public String getServerId() {
        return this.serverId;
    }

    public RegisterDeviceRequest setDeviceTimeStamp(String deviceTimeStamp) {
        this.deviceTimeStamp = deviceTimeStamp;
        return this;
    }
    public String getDeviceTimeStamp() {
        return this.deviceTimeStamp;
    }

}
