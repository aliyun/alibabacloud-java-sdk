// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class ListDateSourceGenerationsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDateSourceGenerationsResponseBody body;

    public static ListDateSourceGenerationsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDateSourceGenerationsResponse self = new ListDateSourceGenerationsResponse();
        return TeaModel.build(map, self);
    }

    public ListDateSourceGenerationsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDateSourceGenerationsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDateSourceGenerationsResponse setBody(ListDateSourceGenerationsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDateSourceGenerationsResponseBody getBody() {
        return this.body;
    }

}
