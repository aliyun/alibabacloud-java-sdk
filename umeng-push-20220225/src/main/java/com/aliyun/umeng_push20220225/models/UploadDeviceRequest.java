// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_push20220225.models;

import com.aliyun.tea.*;

public class UploadDeviceRequest extends TeaModel {
    @NameInMap("DeviceTokens")
    public String deviceTokens;

    public static UploadDeviceRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadDeviceRequest self = new UploadDeviceRequest();
        return TeaModel.build(map, self);
    }

    public UploadDeviceRequest setDeviceTokens(String deviceTokens) {
        this.deviceTokens = deviceTokens;
        return this;
    }
    public String getDeviceTokens() {
        return this.deviceTokens;
    }

}
