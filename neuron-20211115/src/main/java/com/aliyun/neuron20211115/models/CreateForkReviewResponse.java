// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class CreateForkReviewResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ForkReviewCreateResult body;

    public static CreateForkReviewResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateForkReviewResponse self = new CreateForkReviewResponse();
        return TeaModel.build(map, self);
    }

    public CreateForkReviewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateForkReviewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateForkReviewResponse setBody(ForkReviewCreateResult body) {
        this.body = body;
        return this;
    }
    public ForkReviewCreateResult getBody() {
        return this.body;
    }

}
