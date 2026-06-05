// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DelHiveEdgeWorkersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DelHiveEdgeWorkersResponseBody body;

    public static DelHiveEdgeWorkersResponse build(java.util.Map<String, ?> map) throws Exception {
        DelHiveEdgeWorkersResponse self = new DelHiveEdgeWorkersResponse();
        return TeaModel.build(map, self);
    }

    public DelHiveEdgeWorkersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DelHiveEdgeWorkersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DelHiveEdgeWorkersResponse setBody(DelHiveEdgeWorkersResponseBody body) {
        this.body = body;
        return this;
    }
    public DelHiveEdgeWorkersResponseBody getBody() {
        return this.body;
    }

}
