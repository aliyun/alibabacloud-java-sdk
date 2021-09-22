// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiflow20210202.models;

import com.aliyun.tea.*;

public class TerminateRunResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public TerminateRunResponseBody body;

    public static TerminateRunResponse build(java.util.Map<String, ?> map) throws Exception {
        TerminateRunResponse self = new TerminateRunResponse();
        return TeaModel.build(map, self);
    }

    public TerminateRunResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TerminateRunResponse setBody(TerminateRunResponseBody body) {
        this.body = body;
        return this;
    }
    public TerminateRunResponseBody getBody() {
        return this.body;
    }

}
