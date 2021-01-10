// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteODPSchemasInterceptorsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteODPSchemasInterceptorsResponseBody body;

    public static DeleteODPSchemasInterceptorsResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteODPSchemasInterceptorsResponse self = new DeleteODPSchemasInterceptorsResponse();
        return TeaModel.build(map, self);
    }

    public DeleteODPSchemasInterceptorsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteODPSchemasInterceptorsResponse setBody(DeleteODPSchemasInterceptorsResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteODPSchemasInterceptorsResponseBody getBody() {
        return this.body;
    }

}
