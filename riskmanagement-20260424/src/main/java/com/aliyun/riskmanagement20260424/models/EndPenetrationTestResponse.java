// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.riskmanagement20260424.models;

import com.aliyun.tea.*;

public class EndPenetrationTestResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EndPenetrationTestResponseBody body;

    public static EndPenetrationTestResponse build(java.util.Map<String, ?> map) throws Exception {
        EndPenetrationTestResponse self = new EndPenetrationTestResponse();
        return TeaModel.build(map, self);
    }

    public EndPenetrationTestResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EndPenetrationTestResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EndPenetrationTestResponse setBody(EndPenetrationTestResponseBody body) {
        this.body = body;
        return this;
    }
    public EndPenetrationTestResponseBody getBody() {
        return this.body;
    }

}
