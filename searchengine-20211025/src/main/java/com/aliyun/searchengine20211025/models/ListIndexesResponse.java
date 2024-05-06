// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class ListIndexesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListIndexesResponseBody body;

    public static ListIndexesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListIndexesResponse self = new ListIndexesResponse();
        return TeaModel.build(map, self);
    }

    public ListIndexesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListIndexesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListIndexesResponse setBody(ListIndexesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListIndexesResponseBody getBody() {
        return this.body;
    }

}
