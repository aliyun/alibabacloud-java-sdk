// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class DeleteIPCDeviceRequest extends TeaModel {
    @NameInMap("DeviceCodes")
    public String deviceCodes;

    public static DeleteIPCDeviceRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteIPCDeviceRequest self = new DeleteIPCDeviceRequest();
        return TeaModel.build(map, self);
    }

    public DeleteIPCDeviceRequest setDeviceCodes(String deviceCodes) {
        this.deviceCodes = deviceCodes;
        return this;
    }
    public String getDeviceCodes() {
        return this.deviceCodes;
    }

}
