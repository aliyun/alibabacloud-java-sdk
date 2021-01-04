// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quotas20200510.models;

import com.aliyun.tea.*;

public class ListProductsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListProductsResponseBody body;

    public static ListProductsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListProductsResponse self = new ListProductsResponse();
        return TeaModel.build(map, self);
    }

    public ListProductsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListProductsResponse setBody(ListProductsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListProductsResponseBody getBody() {
        return this.body;
    }

}
