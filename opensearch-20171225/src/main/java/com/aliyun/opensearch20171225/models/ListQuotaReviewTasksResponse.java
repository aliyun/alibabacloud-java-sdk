// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class ListQuotaReviewTasksResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListQuotaReviewTasksResponseBody body;

    public static ListQuotaReviewTasksResponse build(java.util.Map<String, ?> map) throws Exception {
        ListQuotaReviewTasksResponse self = new ListQuotaReviewTasksResponse();
        return TeaModel.build(map, self);
    }

    public ListQuotaReviewTasksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListQuotaReviewTasksResponse setBody(ListQuotaReviewTasksResponseBody body) {
        this.body = body;
        return this;
    }
    public ListQuotaReviewTasksResponseBody getBody() {
        return this.body;
    }

}
