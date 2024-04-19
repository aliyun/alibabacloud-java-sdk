// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class InsertScoreForApiResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public InsertScoreForApiResponseBody body;

    public static InsertScoreForApiResponse build(java.util.Map<String, ?> map) throws Exception {
        InsertScoreForApiResponse self = new InsertScoreForApiResponse();
        return TeaModel.build(map, self);
    }

    public InsertScoreForApiResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InsertScoreForApiResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public InsertScoreForApiResponse setBody(InsertScoreForApiResponseBody body) {
        this.body = body;
        return this;
    }
    public InsertScoreForApiResponseBody getBody() {
        return this.body;
    }

}
