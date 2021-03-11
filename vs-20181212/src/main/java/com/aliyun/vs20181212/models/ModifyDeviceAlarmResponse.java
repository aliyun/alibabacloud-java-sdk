// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class ModifyDeviceAlarmResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyDeviceAlarmResponseBody body;

    public static ModifyDeviceAlarmResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDeviceAlarmResponse self = new ModifyDeviceAlarmResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDeviceAlarmResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyDeviceAlarmResponse setBody(ModifyDeviceAlarmResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDeviceAlarmResponseBody getBody() {
        return this.body;
    }

}
