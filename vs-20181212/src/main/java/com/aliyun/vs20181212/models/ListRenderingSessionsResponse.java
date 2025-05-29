// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class ListRenderingSessionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListRenderingSessionsResponseBody body;

    public static ListRenderingSessionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListRenderingSessionsResponse self = new ListRenderingSessionsResponse();
        return TeaModel.build(map, self);
    }

    public ListRenderingSessionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListRenderingSessionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListRenderingSessionsResponse setBody(ListRenderingSessionsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListRenderingSessionsResponseBody getBody() {
        return this.body;
    }

}
