// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class GenerateLabelResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GenerateLabelResponseBody body;

    public static GenerateLabelResponse build(java.util.Map<String, ?> map) throws Exception {
        GenerateLabelResponse self = new GenerateLabelResponse();
        return TeaModel.build(map, self);
    }

    public GenerateLabelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GenerateLabelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GenerateLabelResponse setBody(GenerateLabelResponseBody body) {
        this.body = body;
        return this;
    }
    public GenerateLabelResponseBody getBody() {
        return this.body;
    }

}
