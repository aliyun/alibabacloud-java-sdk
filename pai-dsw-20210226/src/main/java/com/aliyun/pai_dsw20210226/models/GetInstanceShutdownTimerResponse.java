// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20210226.models;

import com.aliyun.tea.*;

public class GetInstanceShutdownTimerResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetInstanceShutdownTimerResponseBody body;

    public static GetInstanceShutdownTimerResponse build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceShutdownTimerResponse self = new GetInstanceShutdownTimerResponse();
        return TeaModel.build(map, self);
    }

    public GetInstanceShutdownTimerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetInstanceShutdownTimerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetInstanceShutdownTimerResponse setBody(GetInstanceShutdownTimerResponseBody body) {
        this.body = body;
        return this;
    }
    public GetInstanceShutdownTimerResponseBody getBody() {
        return this.body;
    }

}
