// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class ControlAiotDeviceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ControlAiotDeviceResponseBody body;

    public static ControlAiotDeviceResponse build(java.util.Map<String, ?> map) throws Exception {
        ControlAiotDeviceResponse self = new ControlAiotDeviceResponse();
        return TeaModel.build(map, self);
    }

    public ControlAiotDeviceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ControlAiotDeviceResponse setBody(ControlAiotDeviceResponseBody body) {
        this.body = body;
        return this;
    }
    public ControlAiotDeviceResponseBody getBody() {
        return this.body;
    }

}
