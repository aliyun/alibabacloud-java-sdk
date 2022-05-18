// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicecatalog20210901.models;

import com.aliyun.tea.*;

public class GetProductVersionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetProductVersionResponseBody body;

    public static GetProductVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        GetProductVersionResponse self = new GetProductVersionResponse();
        return TeaModel.build(map, self);
    }

    public GetProductVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetProductVersionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetProductVersionResponse setBody(GetProductVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public GetProductVersionResponseBody getBody() {
        return this.body;
    }

}
