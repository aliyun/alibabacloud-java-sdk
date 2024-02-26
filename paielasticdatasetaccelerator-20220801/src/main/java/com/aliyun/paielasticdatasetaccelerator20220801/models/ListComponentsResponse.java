// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paielasticdatasetaccelerator20220801.models;

import com.aliyun.tea.*;

public class ListComponentsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListComponentsResponseBody body;

    public static ListComponentsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListComponentsResponse self = new ListComponentsResponse();
        return TeaModel.build(map, self);
    }

    public ListComponentsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListComponentsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListComponentsResponse setBody(ListComponentsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListComponentsResponseBody getBody() {
        return this.body;
    }

}
