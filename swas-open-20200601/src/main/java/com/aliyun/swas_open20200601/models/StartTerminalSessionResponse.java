// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class StartTerminalSessionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public StartTerminalSessionResponseBody body;

    public static StartTerminalSessionResponse build(java.util.Map<String, ?> map) throws Exception {
        StartTerminalSessionResponse self = new StartTerminalSessionResponse();
        return TeaModel.build(map, self);
    }

    public StartTerminalSessionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartTerminalSessionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StartTerminalSessionResponse setBody(StartTerminalSessionResponseBody body) {
        this.body = body;
        return this;
    }
    public StartTerminalSessionResponseBody getBody() {
        return this.body;
    }

}
