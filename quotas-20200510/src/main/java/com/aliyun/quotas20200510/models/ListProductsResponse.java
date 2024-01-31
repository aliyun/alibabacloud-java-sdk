// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quotas20200510.models;

import com.aliyun.tea.*;

public class ListProductsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListProductsResponseBody body;

    public static ListProductsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListProductsResponse self = new ListProductsResponse();
        return TeaModel.build(map, self);
    }

    public ListProductsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListProductsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListProductsResponse setBody(ListProductsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListProductsResponseBody getBody() {
        return this.body;
    }

}
