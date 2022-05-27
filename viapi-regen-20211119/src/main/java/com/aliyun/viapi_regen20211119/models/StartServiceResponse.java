// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.viapi_regen20211119.models;

import com.aliyun.tea.*;

public class StartServiceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public StartServiceResponseBody body;

    public static StartServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        StartServiceResponse self = new StartServiceResponse();
        return TeaModel.build(map, self);
    }

    public StartServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartServiceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StartServiceResponse setBody(StartServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public StartServiceResponseBody getBody() {
        return this.body;
    }

}
