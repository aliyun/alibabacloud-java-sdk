// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class PushBillsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public PushBillsResponseBody body;

    public static PushBillsResponse build(java.util.Map<String, ?> map) throws Exception {
        PushBillsResponse self = new PushBillsResponse();
        return TeaModel.build(map, self);
    }

    public PushBillsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PushBillsResponse setBody(PushBillsResponseBody body) {
        this.body = body;
        return this;
    }
    public PushBillsResponseBody getBody() {
        return this.body;
    }

}
