// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class ListRenderingProjectInstancesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListRenderingProjectInstancesResponseBody body;

    public static ListRenderingProjectInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListRenderingProjectInstancesResponse self = new ListRenderingProjectInstancesResponse();
        return TeaModel.build(map, self);
    }

    public ListRenderingProjectInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListRenderingProjectInstancesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListRenderingProjectInstancesResponse setBody(ListRenderingProjectInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListRenderingProjectInstancesResponseBody getBody() {
        return this.body;
    }

}
