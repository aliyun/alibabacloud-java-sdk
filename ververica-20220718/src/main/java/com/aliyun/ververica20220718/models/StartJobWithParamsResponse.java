// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class StartJobWithParamsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public StartJobWithParamsResponseBody body;

    public static StartJobWithParamsResponse build(java.util.Map<String, ?> map) throws Exception {
        StartJobWithParamsResponse self = new StartJobWithParamsResponse();
        return TeaModel.build(map, self);
    }

    public StartJobWithParamsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartJobWithParamsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StartJobWithParamsResponse setBody(StartJobWithParamsResponseBody body) {
        this.body = body;
        return this;
    }
    public StartJobWithParamsResponseBody getBody() {
        return this.body;
    }

}
