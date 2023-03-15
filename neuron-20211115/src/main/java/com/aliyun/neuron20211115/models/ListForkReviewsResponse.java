// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class ListForkReviewsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ForkReviewListResult body;

    public static ListForkReviewsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListForkReviewsResponse self = new ListForkReviewsResponse();
        return TeaModel.build(map, self);
    }

    public ListForkReviewsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListForkReviewsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListForkReviewsResponse setBody(ForkReviewListResult body) {
        this.body = body;
        return this;
    }
    public ForkReviewListResult getBody() {
        return this.body;
    }

}
