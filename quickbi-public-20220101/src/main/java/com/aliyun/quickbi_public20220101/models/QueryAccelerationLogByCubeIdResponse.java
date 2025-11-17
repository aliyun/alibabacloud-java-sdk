// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class QueryAccelerationLogByCubeIdResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryAccelerationLogByCubeIdResponseBody body;

    public static QueryAccelerationLogByCubeIdResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAccelerationLogByCubeIdResponse self = new QueryAccelerationLogByCubeIdResponse();
        return TeaModel.build(map, self);
    }

    public QueryAccelerationLogByCubeIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryAccelerationLogByCubeIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryAccelerationLogByCubeIdResponse setBody(QueryAccelerationLogByCubeIdResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryAccelerationLogByCubeIdResponseBody getBody() {
        return this.body;
    }

}
