// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class GetPbcInvokeReviewResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public PbcInvokeReview body;

    public static GetPbcInvokeReviewResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPbcInvokeReviewResponse self = new GetPbcInvokeReviewResponse();
        return TeaModel.build(map, self);
    }

    public GetPbcInvokeReviewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetPbcInvokeReviewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetPbcInvokeReviewResponse setBody(PbcInvokeReview body) {
        this.body = body;
        return this;
    }
    public PbcInvokeReview getBody() {
        return this.body;
    }

}
