// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class ListEventAlgorithmResultsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListEventAlgorithmResultsResponseBody body;

    public static ListEventAlgorithmResultsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListEventAlgorithmResultsResponse self = new ListEventAlgorithmResultsResponse();
        return TeaModel.build(map, self);
    }

    public ListEventAlgorithmResultsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListEventAlgorithmResultsResponse setBody(ListEventAlgorithmResultsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListEventAlgorithmResultsResponseBody getBody() {
        return this.body;
    }

}
