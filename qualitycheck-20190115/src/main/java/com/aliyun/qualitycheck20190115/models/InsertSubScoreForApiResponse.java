// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class InsertSubScoreForApiResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public InsertSubScoreForApiResponseBody body;

    public static InsertSubScoreForApiResponse build(java.util.Map<String, ?> map) throws Exception {
        InsertSubScoreForApiResponse self = new InsertSubScoreForApiResponse();
        return TeaModel.build(map, self);
    }

    public InsertSubScoreForApiResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InsertSubScoreForApiResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public InsertSubScoreForApiResponse setBody(InsertSubScoreForApiResponseBody body) {
        this.body = body;
        return this;
    }
    public InsertSubScoreForApiResponseBody getBody() {
        return this.body;
    }

}
