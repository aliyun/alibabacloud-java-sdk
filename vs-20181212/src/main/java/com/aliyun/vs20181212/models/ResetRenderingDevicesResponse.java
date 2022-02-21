// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class ResetRenderingDevicesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ResetRenderingDevicesResponseBody body;

    public static ResetRenderingDevicesResponse build(java.util.Map<String, ?> map) throws Exception {
        ResetRenderingDevicesResponse self = new ResetRenderingDevicesResponse();
        return TeaModel.build(map, self);
    }

    public ResetRenderingDevicesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ResetRenderingDevicesResponse setBody(ResetRenderingDevicesResponseBody body) {
        this.body = body;
        return this;
    }
    public ResetRenderingDevicesResponseBody getBody() {
        return this.body;
    }

}
