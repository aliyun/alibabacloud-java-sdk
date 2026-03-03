// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class CreatePbcInvokeReviewResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreatePbcInvokeReviewResult body;

    public static CreatePbcInvokeReviewResponse build(java.util.Map<String, ?> map) throws Exception {
        CreatePbcInvokeReviewResponse self = new CreatePbcInvokeReviewResponse();
        return TeaModel.build(map, self);
    }

    public CreatePbcInvokeReviewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreatePbcInvokeReviewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreatePbcInvokeReviewResponse setBody(CreatePbcInvokeReviewResult body) {
        this.body = body;
        return this;
    }
    public CreatePbcInvokeReviewResult getBody() {
        return this.body;
    }

}
