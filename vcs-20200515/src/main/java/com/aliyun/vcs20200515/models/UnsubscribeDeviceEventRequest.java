// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class UnsubscribeDeviceEventRequest extends TeaModel {
    @NameInMap("DeviceId")
    public String deviceId;

    public static UnsubscribeDeviceEventRequest build(java.util.Map<String, ?> map) throws Exception {
        UnsubscribeDeviceEventRequest self = new UnsubscribeDeviceEventRequest();
        return TeaModel.build(map, self);
    }

    public UnsubscribeDeviceEventRequest setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

}
