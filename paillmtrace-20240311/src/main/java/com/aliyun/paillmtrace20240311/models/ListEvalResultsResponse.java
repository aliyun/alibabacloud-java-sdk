// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paillmtrace20240311.models;

import com.aliyun.tea.*;

public class ListEvalResultsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListEvalResultsResponseBody body;

    public static ListEvalResultsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListEvalResultsResponse self = new ListEvalResultsResponse();
        return TeaModel.build(map, self);
    }

    public ListEvalResultsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListEvalResultsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListEvalResultsResponse setBody(ListEvalResultsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListEvalResultsResponseBody getBody() {
        return this.body;
    }

}
