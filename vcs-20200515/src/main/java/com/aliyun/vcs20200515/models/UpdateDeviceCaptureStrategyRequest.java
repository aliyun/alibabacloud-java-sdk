// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class UpdateDeviceCaptureStrategyRequest extends TeaModel {
    @NameInMap("DeviceCode")
    public String deviceCode;

    @NameInMap("DeviceType")
    public String deviceType;

    @NameInMap("MondayCaptureStrategy")
    public String mondayCaptureStrategy;

    public static UpdateDeviceCaptureStrategyRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDeviceCaptureStrategyRequest self = new UpdateDeviceCaptureStrategyRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDeviceCaptureStrategyRequest setDeviceCode(String deviceCode) {
        this.deviceCode = deviceCode;
        return this;
    }
    public String getDeviceCode() {
        return this.deviceCode;
    }

    public UpdateDeviceCaptureStrategyRequest setDeviceType(String deviceType) {
        this.deviceType = deviceType;
        return this;
    }
    public String getDeviceType() {
        return this.deviceType;
    }

    public UpdateDeviceCaptureStrategyRequest setMondayCaptureStrategy(String mondayCaptureStrategy) {
        this.mondayCaptureStrategy = mondayCaptureStrategy;
        return this;
    }
    public String getMondayCaptureStrategy() {
        return this.mondayCaptureStrategy;
    }

}
