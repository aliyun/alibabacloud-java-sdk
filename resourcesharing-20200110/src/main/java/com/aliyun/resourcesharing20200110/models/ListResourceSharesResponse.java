// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcesharing20200110.models;

import com.aliyun.tea.*;

public class ListResourceSharesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListResourceSharesResponseBody body;

    public static ListResourceSharesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListResourceSharesResponse self = new ListResourceSharesResponse();
        return TeaModel.build(map, self);
    }

    public ListResourceSharesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListResourceSharesResponse setBody(ListResourceSharesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListResourceSharesResponseBody getBody() {
        return this.body;
    }

}
