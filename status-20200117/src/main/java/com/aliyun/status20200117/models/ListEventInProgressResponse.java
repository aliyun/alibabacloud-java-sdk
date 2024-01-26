// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.status20200117.models;

import com.aliyun.tea.*;

public class ListEventInProgressResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListEventInProgressResponseBody body;

    public static ListEventInProgressResponse build(java.util.Map<String, ?> map) throws Exception {
        ListEventInProgressResponse self = new ListEventInProgressResponse();
        return TeaModel.build(map, self);
    }

    public ListEventInProgressResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListEventInProgressResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListEventInProgressResponse setBody(ListEventInProgressResponseBody body) {
        this.body = body;
        return this;
    }
    public ListEventInProgressResponseBody getBody() {
        return this.body;
    }

}
