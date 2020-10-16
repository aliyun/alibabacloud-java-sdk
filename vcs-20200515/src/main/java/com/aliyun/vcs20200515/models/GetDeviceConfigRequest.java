// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class GetDeviceConfigRequest extends TeaModel {
    @NameInMap("DeviceSn")
    @Validation(required = true)
    public String deviceSn;

    @NameInMap("DeviceTimeStamp")
    @Validation(required = true)
    public String deviceTimeStamp;

    public static GetDeviceConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDeviceConfigRequest self = new GetDeviceConfigRequest();
        return TeaModel.build(map, self);
    }

    public GetDeviceConfigRequest setDeviceSn(String deviceSn) {
        this.deviceSn = deviceSn;
        return this;
    }
    public String getDeviceSn() {
        return this.deviceSn;
    }

    public GetDeviceConfigRequest setDeviceTimeStamp(String deviceTimeStamp) {
        this.deviceTimeStamp = deviceTimeStamp;
        return this;
    }
    public String getDeviceTimeStamp() {
        return this.deviceTimeStamp;
    }

}
