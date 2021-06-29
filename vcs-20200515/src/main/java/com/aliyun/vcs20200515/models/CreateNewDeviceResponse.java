// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class CreateNewDeviceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateNewDeviceResponseBody body;

    public static CreateNewDeviceResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateNewDeviceResponse self = new CreateNewDeviceResponse();
        return TeaModel.build(map, self);
    }

    public CreateNewDeviceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateNewDeviceResponse setBody(CreateNewDeviceResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateNewDeviceResponseBody getBody() {
        return this.body;
    }

}
