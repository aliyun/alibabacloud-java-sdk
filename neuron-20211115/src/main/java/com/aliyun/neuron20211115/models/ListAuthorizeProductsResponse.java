// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class ListAuthorizeProductsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AuthorizeProductListResult body;

    public static ListAuthorizeProductsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAuthorizeProductsResponse self = new ListAuthorizeProductsResponse();
        return TeaModel.build(map, self);
    }

    public ListAuthorizeProductsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAuthorizeProductsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAuthorizeProductsResponse setBody(AuthorizeProductListResult body) {
        this.body = body;
        return this;
    }
    public AuthorizeProductListResult getBody() {
        return this.body;
    }

}
