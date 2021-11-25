// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class UnbindDevicesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UnbindDevicesResponseBody body;

    public static UnbindDevicesResponse build(java.util.Map<String, ?> map) throws Exception {
        UnbindDevicesResponse self = new UnbindDevicesResponse();
        return TeaModel.build(map, self);
    }

    public UnbindDevicesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UnbindDevicesResponse setBody(UnbindDevicesResponseBody body) {
        this.body = body;
        return this;
    }
    public UnbindDevicesResponseBody getBody() {
        return this.body;
    }

}
