// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class DeleteNVRDeviceRequest extends TeaModel {
    @NameInMap("DeviceCodes")
    public String deviceCodes;

    public static DeleteNVRDeviceRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteNVRDeviceRequest self = new DeleteNVRDeviceRequest();
        return TeaModel.build(map, self);
    }

    public DeleteNVRDeviceRequest setDeviceCodes(String deviceCodes) {
        this.deviceCodes = deviceCodes;
        return this;
    }
    public String getDeviceCodes() {
        return this.deviceCodes;
    }

}
