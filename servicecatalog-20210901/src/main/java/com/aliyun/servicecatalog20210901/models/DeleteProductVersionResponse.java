// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicecatalog20210901.models;

import com.aliyun.tea.*;

public class DeleteProductVersionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteProductVersionResponseBody body;

    public static DeleteProductVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteProductVersionResponse self = new DeleteProductVersionResponse();
        return TeaModel.build(map, self);
    }

    public DeleteProductVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteProductVersionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteProductVersionResponse setBody(DeleteProductVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteProductVersionResponseBody getBody() {
        return this.body;
    }

}
