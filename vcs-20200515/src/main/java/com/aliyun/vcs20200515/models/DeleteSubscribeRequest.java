// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class DeleteSubscribeRequest extends TeaModel {
    @NameInMap("DeviceId")
    public String deviceId;

    public static DeleteSubscribeRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteSubscribeRequest self = new DeleteSubscribeRequest();
        return TeaModel.build(map, self);
    }

    public DeleteSubscribeRequest setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

}
