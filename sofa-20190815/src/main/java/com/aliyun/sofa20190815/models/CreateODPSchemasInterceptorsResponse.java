// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateODPSchemasInterceptorsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateODPSchemasInterceptorsResponseBody body;

    public static CreateODPSchemasInterceptorsResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateODPSchemasInterceptorsResponse self = new CreateODPSchemasInterceptorsResponse();
        return TeaModel.build(map, self);
    }

    public CreateODPSchemasInterceptorsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateODPSchemasInterceptorsResponse setBody(CreateODPSchemasInterceptorsResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateODPSchemasInterceptorsResponseBody getBody() {
        return this.body;
    }

}
