// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paielasticdatasetaccelerator20220801.models;

import com.aliyun.tea.*;

public class ListEndpointsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListEndpointsResponseBody body;

    public static ListEndpointsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListEndpointsResponse self = new ListEndpointsResponse();
        return TeaModel.build(map, self);
    }

    public ListEndpointsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListEndpointsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListEndpointsResponse setBody(ListEndpointsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListEndpointsResponseBody getBody() {
        return this.body;
    }

}
