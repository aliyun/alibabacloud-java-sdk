// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xixikf20200730.models;

import com.aliyun.tea.*;

public class GetCallsPerDayResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetCallsPerDayResponseBody body;

    public static GetCallsPerDayResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCallsPerDayResponse self = new GetCallsPerDayResponse();
        return TeaModel.build(map, self);
    }

    public GetCallsPerDayResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCallsPerDayResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetCallsPerDayResponse setBody(GetCallsPerDayResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCallsPerDayResponseBody getBody() {
        return this.body;
    }

}
