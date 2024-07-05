// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class ListRenderingInstancesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListRenderingInstancesResponseBody body;

    public static ListRenderingInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListRenderingInstancesResponse self = new ListRenderingInstancesResponse();
        return TeaModel.build(map, self);
    }

    public ListRenderingInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListRenderingInstancesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListRenderingInstancesResponse setBody(ListRenderingInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListRenderingInstancesResponseBody getBody() {
        return this.body;
    }

}
