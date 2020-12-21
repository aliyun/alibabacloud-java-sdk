// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class ListAccessNumberResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListAccessNumberResponseBody body;

    public static ListAccessNumberResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAccessNumberResponse self = new ListAccessNumberResponse();
        return TeaModel.build(map, self);
    }

    public ListAccessNumberResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAccessNumberResponse setBody(ListAccessNumberResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAccessNumberResponseBody getBody() {
        return this.body;
    }

}
