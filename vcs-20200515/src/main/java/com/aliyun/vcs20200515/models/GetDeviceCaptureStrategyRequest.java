// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class GetDeviceCaptureStrategyRequest extends TeaModel {
    @NameInMap("DeviceCode")
    public String deviceCode;

    @NameInMap("DeviceType")
    public String deviceType;

    public static GetDeviceCaptureStrategyRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDeviceCaptureStrategyRequest self = new GetDeviceCaptureStrategyRequest();
        return TeaModel.build(map, self);
    }

    public GetDeviceCaptureStrategyRequest setDeviceCode(String deviceCode) {
        this.deviceCode = deviceCode;
        return this;
    }
    public String getDeviceCode() {
        return this.deviceCode;
    }

    public GetDeviceCaptureStrategyRequest setDeviceType(String deviceType) {
        this.deviceType = deviceType;
        return this;
    }
    public String getDeviceType() {
        return this.deviceType;
    }

}
