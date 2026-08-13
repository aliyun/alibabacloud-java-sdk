// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class TogglePrimaryObjectFavoriteResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public TogglePrimaryObjectFavoriteResponseBody body;

    public static TogglePrimaryObjectFavoriteResponse build(java.util.Map<String, ?> map) throws Exception {
        TogglePrimaryObjectFavoriteResponse self = new TogglePrimaryObjectFavoriteResponse();
        return TeaModel.build(map, self);
    }

    public TogglePrimaryObjectFavoriteResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TogglePrimaryObjectFavoriteResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TogglePrimaryObjectFavoriteResponse setBody(TogglePrimaryObjectFavoriteResponseBody body) {
        this.body = body;
        return this;
    }
    public TogglePrimaryObjectFavoriteResponseBody getBody() {
        return this.body;
    }

}
