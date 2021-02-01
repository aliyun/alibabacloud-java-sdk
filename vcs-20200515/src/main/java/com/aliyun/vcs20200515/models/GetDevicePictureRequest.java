// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class GetDevicePictureRequest extends TeaModel {
    @NameInMap("DeviceId")
    public String deviceId;

    public static GetDevicePictureRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDevicePictureRequest self = new GetDevicePictureRequest();
        return TeaModel.build(map, self);
    }

    public GetDevicePictureRequest setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

}
