// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class SaveFavoritesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SaveFavoritesResponseBody body;

    public static SaveFavoritesResponse build(java.util.Map<String, ?> map) throws Exception {
        SaveFavoritesResponse self = new SaveFavoritesResponse();
        return TeaModel.build(map, self);
    }

    public SaveFavoritesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SaveFavoritesResponse setBody(SaveFavoritesResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveFavoritesResponseBody getBody() {
        return this.body;
    }

}
