// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class StartJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StartJobResponseBody body;

    public static StartJobResponse build(java.util.Map<String, ?> map) throws Exception {
        StartJobResponse self = new StartJobResponse();
        return TeaModel.build(map, self);
    }

    public StartJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StartJobResponse setBody(StartJobResponseBody body) {
        this.body = body;
        return this;
    }
    public StartJobResponseBody getBody() {
        return this.body;
    }

}
