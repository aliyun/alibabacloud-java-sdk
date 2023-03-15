// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class GetPbcReviewResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public PbcReview body;

    public static GetPbcReviewResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPbcReviewResponse self = new GetPbcReviewResponse();
        return TeaModel.build(map, self);
    }

    public GetPbcReviewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetPbcReviewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetPbcReviewResponse setBody(PbcReview body) {
        this.body = body;
        return this;
    }
    public PbcReview getBody() {
        return this.body;
    }

}
