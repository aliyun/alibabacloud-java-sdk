// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class ListVectorQueryResultResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListVectorQueryResultResponseBody body;

    public static ListVectorQueryResultResponse build(java.util.Map<String, ?> map) throws Exception {
        ListVectorQueryResultResponse self = new ListVectorQueryResultResponse();
        return TeaModel.build(map, self);
    }

    public ListVectorQueryResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListVectorQueryResultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListVectorQueryResultResponse setBody(ListVectorQueryResultResponseBody body) {
        this.body = body;
        return this;
    }
    public ListVectorQueryResultResponseBody getBody() {
        return this.body;
    }

}
