// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class DecodeDiagnosticMessageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DecodeDiagnosticMessageResponseBody body;

    public static DecodeDiagnosticMessageResponse build(java.util.Map<String, ?> map) throws Exception {
        DecodeDiagnosticMessageResponse self = new DecodeDiagnosticMessageResponse();
        return TeaModel.build(map, self);
    }

    public DecodeDiagnosticMessageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DecodeDiagnosticMessageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DecodeDiagnosticMessageResponse setBody(DecodeDiagnosticMessageResponseBody body) {
        this.body = body;
        return this;
    }
    public DecodeDiagnosticMessageResponseBody getBody() {
        return this.body;
    }

}
