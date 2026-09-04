// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class BatchRemoveOperatingObjectFavoritesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BatchRemoveOperatingObjectFavoritesResponseBody body;

    public static BatchRemoveOperatingObjectFavoritesResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchRemoveOperatingObjectFavoritesResponse self = new BatchRemoveOperatingObjectFavoritesResponse();
        return TeaModel.build(map, self);
    }

    public BatchRemoveOperatingObjectFavoritesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchRemoveOperatingObjectFavoritesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchRemoveOperatingObjectFavoritesResponse setBody(BatchRemoveOperatingObjectFavoritesResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchRemoveOperatingObjectFavoritesResponseBody getBody() {
        return this.body;
    }

}
