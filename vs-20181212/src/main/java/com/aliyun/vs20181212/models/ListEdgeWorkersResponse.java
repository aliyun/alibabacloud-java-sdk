// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class ListEdgeWorkersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListEdgeWorkersResponseBody body;

    public static ListEdgeWorkersResponse build(java.util.Map<String, ?> map) throws Exception {
        ListEdgeWorkersResponse self = new ListEdgeWorkersResponse();
        return TeaModel.build(map, self);
    }

    public ListEdgeWorkersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListEdgeWorkersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListEdgeWorkersResponse setBody(ListEdgeWorkersResponseBody body) {
        this.body = body;
        return this;
    }
    public ListEdgeWorkersResponseBody getBody() {
        return this.body;
    }

}
