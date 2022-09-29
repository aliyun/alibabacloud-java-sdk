// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class ListPbcReviewsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListPbcReviewsResponseBody body;

    public static ListPbcReviewsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPbcReviewsResponse self = new ListPbcReviewsResponse();
        return TeaModel.build(map, self);
    }

    public ListPbcReviewsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPbcReviewsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListPbcReviewsResponse setBody(ListPbcReviewsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListPbcReviewsResponseBody getBody() {
        return this.body;
    }

}
