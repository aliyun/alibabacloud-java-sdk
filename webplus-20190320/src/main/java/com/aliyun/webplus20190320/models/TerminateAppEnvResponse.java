// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.webplus20190320.models;

import com.aliyun.tea.*;

public class TerminateAppEnvResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public TerminateAppEnvResponseBody body;

    public static TerminateAppEnvResponse build(java.util.Map<String, ?> map) throws Exception {
        TerminateAppEnvResponse self = new TerminateAppEnvResponse();
        return TeaModel.build(map, self);
    }

    public TerminateAppEnvResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TerminateAppEnvResponse setBody(TerminateAppEnvResponseBody body) {
        this.body = body;
        return this;
    }
    public TerminateAppEnvResponseBody getBody() {
        return this.body;
    }

}
