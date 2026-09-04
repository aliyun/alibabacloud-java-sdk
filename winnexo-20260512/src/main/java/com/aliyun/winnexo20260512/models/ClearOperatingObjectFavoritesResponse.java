// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class ClearOperatingObjectFavoritesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ClearOperatingObjectFavoritesResponseBody body;

    public static ClearOperatingObjectFavoritesResponse build(java.util.Map<String, ?> map) throws Exception {
        ClearOperatingObjectFavoritesResponse self = new ClearOperatingObjectFavoritesResponse();
        return TeaModel.build(map, self);
    }

    public ClearOperatingObjectFavoritesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ClearOperatingObjectFavoritesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ClearOperatingObjectFavoritesResponse setBody(ClearOperatingObjectFavoritesResponseBody body) {
        this.body = body;
        return this;
    }
    public ClearOperatingObjectFavoritesResponseBody getBody() {
        return this.body;
    }

}
