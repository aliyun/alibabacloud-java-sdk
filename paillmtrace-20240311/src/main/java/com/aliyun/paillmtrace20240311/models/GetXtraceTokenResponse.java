// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paillmtrace20240311.models;

import com.aliyun.tea.*;

public class GetXtraceTokenResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetXtraceTokenResponseBody body;

    public static GetXtraceTokenResponse build(java.util.Map<String, ?> map) throws Exception {
        GetXtraceTokenResponse self = new GetXtraceTokenResponse();
        return TeaModel.build(map, self);
    }

    public GetXtraceTokenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetXtraceTokenResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetXtraceTokenResponse setBody(GetXtraceTokenResponseBody body) {
        this.body = body;
        return this;
    }
    public GetXtraceTokenResponseBody getBody() {
        return this.body;
    }

}
