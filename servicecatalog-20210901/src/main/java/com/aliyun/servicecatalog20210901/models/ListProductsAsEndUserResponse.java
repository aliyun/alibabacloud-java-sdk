// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicecatalog20210901.models;

import com.aliyun.tea.*;

public class ListProductsAsEndUserResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListProductsAsEndUserResponseBody body;

    public static ListProductsAsEndUserResponse build(java.util.Map<String, ?> map) throws Exception {
        ListProductsAsEndUserResponse self = new ListProductsAsEndUserResponse();
        return TeaModel.build(map, self);
    }

    public ListProductsAsEndUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListProductsAsEndUserResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListProductsAsEndUserResponse setBody(ListProductsAsEndUserResponseBody body) {
        this.body = body;
        return this;
    }
    public ListProductsAsEndUserResponseBody getBody() {
        return this.body;
    }

}
