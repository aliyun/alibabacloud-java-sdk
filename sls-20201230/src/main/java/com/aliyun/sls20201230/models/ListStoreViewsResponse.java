// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class ListStoreViewsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListStoreViewsResponseBody body;

    public static ListStoreViewsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListStoreViewsResponse self = new ListStoreViewsResponse();
        return TeaModel.build(map, self);
    }

    public ListStoreViewsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListStoreViewsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListStoreViewsResponse setBody(ListStoreViewsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListStoreViewsResponseBody getBody() {
        return this.body;
    }

}
