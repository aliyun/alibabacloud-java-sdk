// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class BatchSubmitReviewInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BatchSubmitReviewInfoResponseBody body;

    public static BatchSubmitReviewInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchSubmitReviewInfoResponse self = new BatchSubmitReviewInfoResponse();
        return TeaModel.build(map, self);
    }

    public BatchSubmitReviewInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchSubmitReviewInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchSubmitReviewInfoResponse setBody(BatchSubmitReviewInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchSubmitReviewInfoResponseBody getBody() {
        return this.body;
    }

}
