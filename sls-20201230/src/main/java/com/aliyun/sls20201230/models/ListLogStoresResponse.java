// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class ListLogStoresResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListLogStoresResponseBody body;

    public static ListLogStoresResponse build(java.util.Map<String, ?> map) throws Exception {
        ListLogStoresResponse self = new ListLogStoresResponse();
        return TeaModel.build(map, self);
    }

    public ListLogStoresResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListLogStoresResponse setBody(ListLogStoresResponseBody body) {
        this.body = body;
        return this;
    }
    public ListLogStoresResponseBody getBody() {
        return this.body;
    }

}
