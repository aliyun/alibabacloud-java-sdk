// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class GetPatrolConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetPatrolConfigResponseBody body;

    public static GetPatrolConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPatrolConfigResponse self = new GetPatrolConfigResponse();
        return TeaModel.build(map, self);
    }

    public GetPatrolConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetPatrolConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetPatrolConfigResponse setBody(GetPatrolConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public GetPatrolConfigResponseBody getBody() {
        return this.body;
    }

}
