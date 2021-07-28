// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiplugin20210325.models;

import com.aliyun.tea.*;

public class ListSignaturesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListSignaturesResponseBody body;

    public static ListSignaturesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSignaturesResponse self = new ListSignaturesResponse();
        return TeaModel.build(map, self);
    }

    public ListSignaturesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSignaturesResponse setBody(ListSignaturesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSignaturesResponseBody getBody() {
        return this.body;
    }

}
