// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class ListGraphsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListGraphsResponseBody body;

    public static ListGraphsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListGraphsResponse self = new ListGraphsResponse();
        return TeaModel.build(map, self);
    }

    public ListGraphsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListGraphsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListGraphsResponse setBody(ListGraphsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListGraphsResponseBody getBody() {
        return this.body;
    }

}
