// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class AnalyzeLabelResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AnalyzeLabelResponseBody body;

    public static AnalyzeLabelResponse build(java.util.Map<String, ?> map) throws Exception {
        AnalyzeLabelResponse self = new AnalyzeLabelResponse();
        return TeaModel.build(map, self);
    }

    public AnalyzeLabelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AnalyzeLabelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AnalyzeLabelResponse setBody(AnalyzeLabelResponseBody body) {
        this.body = body;
        return this;
    }
    public AnalyzeLabelResponseBody getBody() {
        return this.body;
    }

}
