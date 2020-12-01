// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class ListChangeOrdersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListChangeOrdersResponseBody body;

    public static ListChangeOrdersResponse build(java.util.Map<String, ?> map) throws Exception {
        ListChangeOrdersResponse self = new ListChangeOrdersResponse();
        return TeaModel.build(map, self);
    }

    public ListChangeOrdersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListChangeOrdersResponse setBody(ListChangeOrdersResponseBody body) {
        this.body = body;
        return this;
    }
    public ListChangeOrdersResponseBody getBody() {
        return this.body;
    }

}
