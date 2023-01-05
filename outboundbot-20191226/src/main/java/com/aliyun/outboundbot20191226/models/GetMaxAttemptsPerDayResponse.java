// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class GetMaxAttemptsPerDayResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetMaxAttemptsPerDayResponseBody body;

    public static GetMaxAttemptsPerDayResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMaxAttemptsPerDayResponse self = new GetMaxAttemptsPerDayResponse();
        return TeaModel.build(map, self);
    }

    public GetMaxAttemptsPerDayResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMaxAttemptsPerDayResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetMaxAttemptsPerDayResponse setBody(GetMaxAttemptsPerDayResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMaxAttemptsPerDayResponseBody getBody() {
        return this.body;
    }

}
