// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class SubscribeDeviceEventRequest extends TeaModel {
    @NameInMap("DeviceId")
    @Validation(required = true)
    public String deviceId;

    @NameInMap("PushConfig")
    @Validation(required = true)
    public String pushConfig;

    public static SubscribeDeviceEventRequest build(java.util.Map<String, ?> map) throws Exception {
        SubscribeDeviceEventRequest self = new SubscribeDeviceEventRequest();
        return TeaModel.build(map, self);
    }

    public SubscribeDeviceEventRequest setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

    public SubscribeDeviceEventRequest setPushConfig(String pushConfig) {
        this.pushConfig = pushConfig;
        return this;
    }
    public String getPushConfig() {
        return this.pushConfig;
    }

}
