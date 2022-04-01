// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class ListResourceHealthResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListResourceHealthResponseBody body;

    public static ListResourceHealthResponse build(java.util.Map<String, ?> map) throws Exception {
        ListResourceHealthResponse self = new ListResourceHealthResponse();
        return TeaModel.build(map, self);
    }

    public ListResourceHealthResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListResourceHealthResponse setBody(ListResourceHealthResponseBody body) {
        this.body = body;
        return this;
    }
    public ListResourceHealthResponseBody getBody() {
        return this.body;
    }

}
