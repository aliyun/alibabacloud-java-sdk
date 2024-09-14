// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class DeleteSessionClusterResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteSessionClusterResponseBody body;

    public static DeleteSessionClusterResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteSessionClusterResponse self = new DeleteSessionClusterResponse();
        return TeaModel.build(map, self);
    }

    public DeleteSessionClusterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteSessionClusterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteSessionClusterResponse setBody(DeleteSessionClusterResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteSessionClusterResponseBody getBody() {
        return this.body;
    }

}
