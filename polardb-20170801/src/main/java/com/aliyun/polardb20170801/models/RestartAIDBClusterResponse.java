// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class RestartAIDBClusterResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RestartAIDBClusterResponseBody body;

    public static RestartAIDBClusterResponse build(java.util.Map<String, ?> map) throws Exception {
        RestartAIDBClusterResponse self = new RestartAIDBClusterResponse();
        return TeaModel.build(map, self);
    }

    public RestartAIDBClusterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RestartAIDBClusterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RestartAIDBClusterResponse setBody(RestartAIDBClusterResponseBody body) {
        this.body = body;
        return this;
    }
    public RestartAIDBClusterResponseBody getBody() {
        return this.body;
    }

}
