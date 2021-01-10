// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class InsertSubScoreForApiResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public InsertSubScoreForApiResponse setBody(InsertSubScoreForApiResponseBody body) {
        this.body = body;
        return this;
    }
    public InsertSubScoreForApiResponseBody getBody() {
        return this.body;
    }

}
