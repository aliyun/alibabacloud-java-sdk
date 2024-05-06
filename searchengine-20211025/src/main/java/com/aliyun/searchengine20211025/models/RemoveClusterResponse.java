// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class RemoveClusterResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RemoveClusterResponseBody body;

    public static RemoveClusterResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveClusterResponse self = new RemoveClusterResponse();
        return TeaModel.build(map, self);
    }

    public RemoveClusterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveClusterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RemoveClusterResponse setBody(RemoveClusterResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveClusterResponseBody getBody() {
        return this.body;
    }

}
