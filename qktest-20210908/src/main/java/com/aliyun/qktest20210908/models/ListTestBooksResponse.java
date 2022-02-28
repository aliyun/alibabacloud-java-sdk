// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qktest20210908.models;

import com.aliyun.tea.*;

public class ListTestBooksResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListTestBooksResponseBody body;

    public static ListTestBooksResponse build(java.util.Map<String, ?> map) throws Exception {
        ListTestBooksResponse self = new ListTestBooksResponse();
        return TeaModel.build(map, self);
    }

    public ListTestBooksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListTestBooksResponse setBody(ListTestBooksResponseBody body) {
        this.body = body;
        return this;
    }
    public ListTestBooksResponseBody getBody() {
        return this.body;
    }

}
