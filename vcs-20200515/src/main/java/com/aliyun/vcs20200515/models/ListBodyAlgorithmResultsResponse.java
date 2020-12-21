// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class ListBodyAlgorithmResultsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListBodyAlgorithmResultsResponseBody body;

    public static ListBodyAlgorithmResultsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListBodyAlgorithmResultsResponse self = new ListBodyAlgorithmResultsResponse();
        return TeaModel.build(map, self);
    }

    public ListBodyAlgorithmResultsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListBodyAlgorithmResultsResponse setBody(ListBodyAlgorithmResultsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListBodyAlgorithmResultsResponseBody getBody() {
        return this.body;
    }

}
