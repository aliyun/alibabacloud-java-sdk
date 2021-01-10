// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class ListSortExpressionsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListSortExpressionsResponseBody body;

    public static ListSortExpressionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSortExpressionsResponse self = new ListSortExpressionsResponse();
        return TeaModel.build(map, self);
    }

    public ListSortExpressionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSortExpressionsResponse setBody(ListSortExpressionsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSortExpressionsResponseBody getBody() {
        return this.body;
    }

}
