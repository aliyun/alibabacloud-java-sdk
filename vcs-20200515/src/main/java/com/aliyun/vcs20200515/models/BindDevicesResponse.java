// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class BindDevicesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public BindDevicesResponseBody body;

    public static BindDevicesResponse build(java.util.Map<String, ?> map) throws Exception {
        BindDevicesResponse self = new BindDevicesResponse();
        return TeaModel.build(map, self);
    }

    public BindDevicesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BindDevicesResponse setBody(BindDevicesResponseBody body) {
        this.body = body;
        return this;
    }
    public BindDevicesResponseBody getBody() {
        return this.body;
    }

}
