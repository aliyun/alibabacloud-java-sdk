// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paillmtrace20240311.models;

import com.aliyun.tea.*;

public class ListOnlineEvalTaskResultsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListOnlineEvalTaskResultsResponseBody body;

    public static ListOnlineEvalTaskResultsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListOnlineEvalTaskResultsResponse self = new ListOnlineEvalTaskResultsResponse();
        return TeaModel.build(map, self);
    }

    public ListOnlineEvalTaskResultsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListOnlineEvalTaskResultsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListOnlineEvalTaskResultsResponse setBody(ListOnlineEvalTaskResultsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListOnlineEvalTaskResultsResponseBody getBody() {
        return this.body;
    }

}
