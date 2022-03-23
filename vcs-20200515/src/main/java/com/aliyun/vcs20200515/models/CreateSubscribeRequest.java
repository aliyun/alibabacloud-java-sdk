// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class CreateSubscribeRequest extends TeaModel {
    @NameInMap("DeviceId")
    public String deviceId;

    @NameInMap("PushConfig")
    public String pushConfig;

    public static CreateSubscribeRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSubscribeRequest self = new CreateSubscribeRequest();
        return TeaModel.build(map, self);
    }

    public CreateSubscribeRequest setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

    public CreateSubscribeRequest setPushConfig(String pushConfig) {
        this.pushConfig = pushConfig;
        return this;
    }
    public String getPushConfig() {
        return this.pushConfig;
    }

}
