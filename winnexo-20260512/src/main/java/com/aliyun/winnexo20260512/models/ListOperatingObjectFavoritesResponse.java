// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class ListOperatingObjectFavoritesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListOperatingObjectFavoritesResponseBody body;

    public static ListOperatingObjectFavoritesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListOperatingObjectFavoritesResponse self = new ListOperatingObjectFavoritesResponse();
        return TeaModel.build(map, self);
    }

    public ListOperatingObjectFavoritesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListOperatingObjectFavoritesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListOperatingObjectFavoritesResponse setBody(ListOperatingObjectFavoritesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListOperatingObjectFavoritesResponseBody getBody() {
        return this.body;
    }

}
