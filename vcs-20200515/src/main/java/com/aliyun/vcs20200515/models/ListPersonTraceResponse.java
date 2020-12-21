// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class ListPersonTraceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListPersonTraceResponseBody body;

    public static ListPersonTraceResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPersonTraceResponse self = new ListPersonTraceResponse();
        return TeaModel.build(map, self);
    }

    public ListPersonTraceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPersonTraceResponse setBody(ListPersonTraceResponseBody body) {
        this.body = body;
        return this;
    }
    public ListPersonTraceResponseBody getBody() {
        return this.body;
    }

}
