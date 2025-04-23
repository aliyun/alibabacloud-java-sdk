// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paillmtrace20240311.models;

import com.aliyun.tea.*;

public class ListOnlineEvalTasksResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListOnlineEvalTasksResponseBody body;

    public static ListOnlineEvalTasksResponse build(java.util.Map<String, ?> map) throws Exception {
        ListOnlineEvalTasksResponse self = new ListOnlineEvalTasksResponse();
        return TeaModel.build(map, self);
    }

    public ListOnlineEvalTasksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListOnlineEvalTasksResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListOnlineEvalTasksResponse setBody(ListOnlineEvalTasksResponseBody body) {
        this.body = body;
        return this;
    }
    public ListOnlineEvalTasksResponseBody getBody() {
        return this.body;
    }

}
