// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tunnel_service20210509.models;

import com.aliyun.tea.*;

public class ListSessionsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListSessionsResponseBody body;

    public static ListSessionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSessionsResponse self = new ListSessionsResponse();
        return TeaModel.build(map, self);
    }

    public ListSessionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSessionsResponse setBody(ListSessionsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSessionsResponseBody getBody() {
        return this.body;
    }

}
