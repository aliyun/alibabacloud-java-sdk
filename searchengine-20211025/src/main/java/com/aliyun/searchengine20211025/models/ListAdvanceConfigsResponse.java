// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class ListAdvanceConfigsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAdvanceConfigsResponseBody body;

    public static ListAdvanceConfigsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAdvanceConfigsResponse self = new ListAdvanceConfigsResponse();
        return TeaModel.build(map, self);
    }

    public ListAdvanceConfigsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAdvanceConfigsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAdvanceConfigsResponse setBody(ListAdvanceConfigsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAdvanceConfigsResponseBody getBody() {
        return this.body;
    }

}
