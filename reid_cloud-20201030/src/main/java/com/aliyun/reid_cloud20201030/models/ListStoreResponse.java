// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.reid_cloud20201030.models;

import com.aliyun.tea.*;

public class ListStoreResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListStoreResponseBody body;

    public static ListStoreResponse build(java.util.Map<String, ?> map) throws Exception {
        ListStoreResponse self = new ListStoreResponse();
        return TeaModel.build(map, self);
    }

    public ListStoreResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListStoreResponse setBody(ListStoreResponseBody body) {
        this.body = body;
        return this;
    }
    public ListStoreResponseBody getBody() {
        return this.body;
    }

}
