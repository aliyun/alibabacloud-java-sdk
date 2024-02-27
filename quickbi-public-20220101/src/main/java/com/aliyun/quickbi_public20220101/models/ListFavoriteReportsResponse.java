// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class ListFavoriteReportsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListFavoriteReportsResponseBody body;

    public static ListFavoriteReportsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListFavoriteReportsResponse self = new ListFavoriteReportsResponse();
        return TeaModel.build(map, self);
    }

    public ListFavoriteReportsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListFavoriteReportsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListFavoriteReportsResponse setBody(ListFavoriteReportsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListFavoriteReportsResponseBody getBody() {
        return this.body;
    }

}
