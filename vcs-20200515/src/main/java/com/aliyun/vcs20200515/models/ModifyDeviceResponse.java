// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class ModifyDeviceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyDeviceResponseBody body;

    public static ModifyDeviceResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDeviceResponse self = new ModifyDeviceResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDeviceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyDeviceResponse setBody(ModifyDeviceResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDeviceResponseBody getBody() {
        return this.body;
    }

}
