// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class InsertScoreForApiResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public InsertScoreForApiResponse setBody(InsertScoreForApiResponseBody body) {
        this.body = body;
        return this;
    }
    public InsertScoreForApiResponseBody getBody() {
        return this.body;
    }

}
