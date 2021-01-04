// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class CreateHealthCheckResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateHealthCheckResponseBody body;

    public static CreateHealthCheckResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateHealthCheckResponse self = new CreateHealthCheckResponse();
        return TeaModel.build(map, self);
    }

    public CreateHealthCheckResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateHealthCheckResponse setBody(CreateHealthCheckResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateHealthCheckResponseBody getBody() {
        return this.body;
    }

}
