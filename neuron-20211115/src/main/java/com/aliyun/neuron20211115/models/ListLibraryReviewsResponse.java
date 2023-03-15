// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class ListLibraryReviewsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public LibraryReviewListResult body;

    public static ListLibraryReviewsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListLibraryReviewsResponse self = new ListLibraryReviewsResponse();
        return TeaModel.build(map, self);
    }

    public ListLibraryReviewsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListLibraryReviewsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListLibraryReviewsResponse setBody(LibraryReviewListResult body) {
        this.body = body;
        return this;
    }
    public LibraryReviewListResult getBody() {
        return this.body;
    }

}
