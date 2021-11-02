// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.unimkt20181212.models;

import com.aliyun.tea.*;

public class RegistDeviceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RegistDeviceResponseBody body;

    public static RegistDeviceResponse build(java.util.Map<String, ?> map) throws Exception {
        RegistDeviceResponse self = new RegistDeviceResponse();
        return TeaModel.build(map, self);
    }

    public RegistDeviceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RegistDeviceResponse setBody(RegistDeviceResponseBody body) {
        this.body = body;
        return this;
    }
    public RegistDeviceResponseBody getBody() {
        return this.body;
    }

}
