// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class UnbindESUserAnalyzerResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UnbindESUserAnalyzerResponseBody body;

    public static UnbindESUserAnalyzerResponse build(java.util.Map<String, ?> map) throws Exception {
        UnbindESUserAnalyzerResponse self = new UnbindESUserAnalyzerResponse();
        return TeaModel.build(map, self);
    }

    public UnbindESUserAnalyzerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UnbindESUserAnalyzerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UnbindESUserAnalyzerResponse setBody(UnbindESUserAnalyzerResponseBody body) {
        this.body = body;
        return this;
    }
    public UnbindESUserAnalyzerResponseBody getBody() {
        return this.body;
    }

}
