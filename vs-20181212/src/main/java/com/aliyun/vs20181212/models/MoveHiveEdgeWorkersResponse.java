// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class MoveHiveEdgeWorkersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public MoveHiveEdgeWorkersResponseBody body;

    public static MoveHiveEdgeWorkersResponse build(java.util.Map<String, ?> map) throws Exception {
        MoveHiveEdgeWorkersResponse self = new MoveHiveEdgeWorkersResponse();
        return TeaModel.build(map, self);
    }

    public MoveHiveEdgeWorkersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public MoveHiveEdgeWorkersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public MoveHiveEdgeWorkersResponse setBody(MoveHiveEdgeWorkersResponseBody body) {
        this.body = body;
        return this;
    }
    public MoveHiveEdgeWorkersResponseBody getBody() {
        return this.body;
    }

}
