// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteODPSchemasResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteODPSchemasResponseBody body;

    public static DeleteODPSchemasResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteODPSchemasResponse self = new DeleteODPSchemasResponse();
        return TeaModel.build(map, self);
    }

    public DeleteODPSchemasResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteODPSchemasResponse setBody(DeleteODPSchemasResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteODPSchemasResponseBody getBody() {
        return this.body;
    }

}
