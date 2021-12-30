// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.workorder20210610.models;

import com.aliyun.tea.*;

public class ListTicketsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListTicketsResponseBody body;

    public static ListTicketsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListTicketsResponse self = new ListTicketsResponse();
        return TeaModel.build(map, self);
    }

    public ListTicketsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListTicketsResponse setBody(ListTicketsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListTicketsResponseBody getBody() {
        return this.body;
    }

}
