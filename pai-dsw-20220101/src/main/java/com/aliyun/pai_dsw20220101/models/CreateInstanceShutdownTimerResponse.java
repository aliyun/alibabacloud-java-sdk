// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20220101.models;

import com.aliyun.tea.*;

public class CreateInstanceShutdownTimerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateInstanceShutdownTimerResponseBody body;

    public static CreateInstanceShutdownTimerResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateInstanceShutdownTimerResponse self = new CreateInstanceShutdownTimerResponse();
        return TeaModel.build(map, self);
    }

    public CreateInstanceShutdownTimerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateInstanceShutdownTimerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateInstanceShutdownTimerResponse setBody(CreateInstanceShutdownTimerResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateInstanceShutdownTimerResponseBody getBody() {
        return this.body;
    }

}
