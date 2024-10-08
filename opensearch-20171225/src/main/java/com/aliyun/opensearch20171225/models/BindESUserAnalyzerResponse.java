// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class BindESUserAnalyzerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BindESUserAnalyzerResponseBody body;

    public static BindESUserAnalyzerResponse build(java.util.Map<String, ?> map) throws Exception {
        BindESUserAnalyzerResponse self = new BindESUserAnalyzerResponse();
        return TeaModel.build(map, self);
    }

    public BindESUserAnalyzerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BindESUserAnalyzerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BindESUserAnalyzerResponse setBody(BindESUserAnalyzerResponseBody body) {
        this.body = body;
        return this;
    }
    public BindESUserAnalyzerResponseBody getBody() {
        return this.body;
    }

}
