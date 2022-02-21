// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class CreateRenderingDeviceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateRenderingDeviceResponseBody body;

    public static CreateRenderingDeviceResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateRenderingDeviceResponse self = new CreateRenderingDeviceResponse();
        return TeaModel.build(map, self);
    }

    public CreateRenderingDeviceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateRenderingDeviceResponse setBody(CreateRenderingDeviceResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateRenderingDeviceResponseBody getBody() {
        return this.body;
    }

}
