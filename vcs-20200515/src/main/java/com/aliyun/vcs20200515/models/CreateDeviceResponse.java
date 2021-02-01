// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class CreateDeviceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateDeviceResponseBody body;

    public static CreateDeviceResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDeviceResponse self = new CreateDeviceResponse();
        return TeaModel.build(map, self);
    }

    public CreateDeviceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDeviceResponse setBody(CreateDeviceResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDeviceResponseBody getBody() {
        return this.body;
    }

}
