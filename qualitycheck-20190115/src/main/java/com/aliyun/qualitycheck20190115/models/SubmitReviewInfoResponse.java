// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class SubmitReviewInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SubmitReviewInfoResponseBody body;

    public static SubmitReviewInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitReviewInfoResponse self = new SubmitReviewInfoResponse();
        return TeaModel.build(map, self);
    }

    public SubmitReviewInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitReviewInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitReviewInfoResponse setBody(SubmitReviewInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitReviewInfoResponseBody getBody() {
        return this.body;
    }

}
