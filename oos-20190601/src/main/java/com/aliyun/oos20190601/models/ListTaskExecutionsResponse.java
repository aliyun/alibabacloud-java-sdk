// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class ListTaskExecutionsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListTaskExecutionsResponseBody body;

    public static ListTaskExecutionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListTaskExecutionsResponse self = new ListTaskExecutionsResponse();
        return TeaModel.build(map, self);
    }

    public ListTaskExecutionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListTaskExecutionsResponse setBody(ListTaskExecutionsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListTaskExecutionsResponseBody getBody() {
        return this.body;
    }

}
