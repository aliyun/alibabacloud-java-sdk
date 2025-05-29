// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class ListRenderingProjectsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListRenderingProjectsResponseBody body;

    public static ListRenderingProjectsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListRenderingProjectsResponse self = new ListRenderingProjectsResponse();
        return TeaModel.build(map, self);
    }

    public ListRenderingProjectsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListRenderingProjectsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListRenderingProjectsResponse setBody(ListRenderingProjectsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListRenderingProjectsResponseBody getBody() {
        return this.body;
    }

}
