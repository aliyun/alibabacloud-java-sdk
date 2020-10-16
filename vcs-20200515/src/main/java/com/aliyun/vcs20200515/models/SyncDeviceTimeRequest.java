// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class SyncDeviceTimeRequest extends TeaModel {
    @NameInMap("DeviceSn")
    @Validation(required = true)
    public String deviceSn;

    @NameInMap("DeviceTimeStamp")
    @Validation(required = true)
    public String deviceTimeStamp;

    public static SyncDeviceTimeRequest build(java.util.Map<String, ?> map) throws Exception {
        SyncDeviceTimeRequest self = new SyncDeviceTimeRequest();
        return TeaModel.build(map, self);
    }

    public SyncDeviceTimeRequest setDeviceSn(String deviceSn) {
        this.deviceSn = deviceSn;
        return this;
    }
    public String getDeviceSn() {
        return this.deviceSn;
    }

    public SyncDeviceTimeRequest setDeviceTimeStamp(String deviceTimeStamp) {
        this.deviceTimeStamp = deviceTimeStamp;
        return this;
    }
    public String getDeviceTimeStamp() {
        return this.deviceTimeStamp;
    }

}
