// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class ListRestQueryResultResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListRestQueryResultResponseBody body;

    public static ListRestQueryResultResponse build(java.util.Map<String, ?> map) throws Exception {
        ListRestQueryResultResponse self = new ListRestQueryResultResponse();
        return TeaModel.build(map, self);
    }

    public ListRestQueryResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListRestQueryResultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListRestQueryResultResponse setBody(ListRestQueryResultResponseBody body) {
        this.body = body;
        return this;
    }
    public ListRestQueryResultResponseBody getBody() {
        return this.body;
    }

}
