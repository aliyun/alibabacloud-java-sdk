// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class AuthorizeProductsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AuthorizeProductsResponseBody body;

    public static AuthorizeProductsResponse build(java.util.Map<String, ?> map) throws Exception {
        AuthorizeProductsResponse self = new AuthorizeProductsResponse();
        return TeaModel.build(map, self);
    }

    public AuthorizeProductsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AuthorizeProductsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AuthorizeProductsResponse setBody(AuthorizeProductsResponseBody body) {
        this.body = body;
        return this;
    }
    public AuthorizeProductsResponseBody getBody() {
        return this.body;
    }

}
