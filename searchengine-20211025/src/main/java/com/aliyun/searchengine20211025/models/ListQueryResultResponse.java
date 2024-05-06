// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class ListQueryResultResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListQueryResultResponseBody body;

    public static ListQueryResultResponse build(java.util.Map<String, ?> map) throws Exception {
        ListQueryResultResponse self = new ListQueryResultResponse();
        return TeaModel.build(map, self);
    }

    public ListQueryResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListQueryResultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListQueryResultResponse setBody(ListQueryResultResponseBody body) {
        this.body = body;
        return this;
    }
    public ListQueryResultResponseBody getBody() {
        return this.body;
    }

}
