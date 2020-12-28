// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtrace20190808.models;

import com.aliyun.tea.*;

public class ListSpanNamesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListSpanNamesResponseBody body;

    public static ListSpanNamesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSpanNamesResponse self = new ListSpanNamesResponse();
        return TeaModel.build(map, self);
    }

    public ListSpanNamesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSpanNamesResponse setBody(ListSpanNamesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSpanNamesResponseBody getBody() {
        return this.body;
    }

}
