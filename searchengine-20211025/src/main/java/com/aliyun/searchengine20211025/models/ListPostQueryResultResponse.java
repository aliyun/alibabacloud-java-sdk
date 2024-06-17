// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class ListPostQueryResultResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListPostQueryResultResponseBody body;

    public static ListPostQueryResultResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPostQueryResultResponse self = new ListPostQueryResultResponse();
        return TeaModel.build(map, self);
    }

    public ListPostQueryResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPostQueryResultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListPostQueryResultResponse setBody(ListPostQueryResultResponseBody body) {
        this.body = body;
        return this;
    }
    public ListPostQueryResultResponseBody getBody() {
        return this.body;
    }

}
