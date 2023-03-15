// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class ListReviewersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ReviewerListResult body;

    public static ListReviewersResponse build(java.util.Map<String, ?> map) throws Exception {
        ListReviewersResponse self = new ListReviewersResponse();
        return TeaModel.build(map, self);
    }

    public ListReviewersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListReviewersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListReviewersResponse setBody(ReviewerListResult body) {
        this.body = body;
        return this;
    }
    public ReviewerListResult getBody() {
        return this.body;
    }

}
