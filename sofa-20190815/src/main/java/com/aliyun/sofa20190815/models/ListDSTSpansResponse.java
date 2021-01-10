// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListDSTSpansResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListDSTSpansResponseBody body;

    public static ListDSTSpansResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDSTSpansResponse self = new ListDSTSpansResponse();
        return TeaModel.build(map, self);
    }

    public ListDSTSpansResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDSTSpansResponse setBody(ListDSTSpansResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDSTSpansResponseBody getBody() {
        return this.body;
    }

}
