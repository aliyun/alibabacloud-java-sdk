// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paillmtrace20240311.models;

import com.aliyun.tea.*;

public class EvaluateTraceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EvaluateTraceResponseBody body;

    public static EvaluateTraceResponse build(java.util.Map<String, ?> map) throws Exception {
        EvaluateTraceResponse self = new EvaluateTraceResponse();
        return TeaModel.build(map, self);
    }

    public EvaluateTraceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EvaluateTraceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EvaluateTraceResponse setBody(EvaluateTraceResponseBody body) {
        this.body = body;
        return this;
    }
    public EvaluateTraceResponseBody getBody() {
        return this.body;
    }

}
