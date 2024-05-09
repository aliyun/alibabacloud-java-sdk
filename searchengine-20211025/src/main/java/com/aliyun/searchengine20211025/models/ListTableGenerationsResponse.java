// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class ListTableGenerationsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListTableGenerationsResponseBody body;

    public static ListTableGenerationsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListTableGenerationsResponse self = new ListTableGenerationsResponse();
        return TeaModel.build(map, self);
    }

    public ListTableGenerationsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListTableGenerationsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListTableGenerationsResponse setBody(ListTableGenerationsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListTableGenerationsResponseBody getBody() {
        return this.body;
    }

}
