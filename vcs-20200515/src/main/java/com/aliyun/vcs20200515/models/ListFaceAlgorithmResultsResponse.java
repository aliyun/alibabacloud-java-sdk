// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class ListFaceAlgorithmResultsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListFaceAlgorithmResultsResponseBody body;

    public static ListFaceAlgorithmResultsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListFaceAlgorithmResultsResponse self = new ListFaceAlgorithmResultsResponse();
        return TeaModel.build(map, self);
    }

    public ListFaceAlgorithmResultsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListFaceAlgorithmResultsResponse setBody(ListFaceAlgorithmResultsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListFaceAlgorithmResultsResponseBody getBody() {
        return this.body;
    }

}
