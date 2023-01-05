// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class TerminateCallResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public TerminateCallResponseBody body;

    public static TerminateCallResponse build(java.util.Map<String, ?> map) throws Exception {
        TerminateCallResponse self = new TerminateCallResponse();
        return TeaModel.build(map, self);
    }

    public TerminateCallResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TerminateCallResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TerminateCallResponse setBody(TerminateCallResponseBody body) {
        this.body = body;
        return this;
    }
    public TerminateCallResponseBody getBody() {
        return this.body;
    }

}
