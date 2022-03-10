// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class ListFavoriteReportsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public ListFavoriteReportsResponse setBody(ListFavoriteReportsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListFavoriteReportsResponseBody getBody() {
        return this.body;
    }

}
