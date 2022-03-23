// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class EchoStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public EchoStatusResponseBody body;

    public static EchoStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        EchoStatusResponse self = new EchoStatusResponse();
        return TeaModel.build(map, self);
    }

    public EchoStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EchoStatusResponse setBody(EchoStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public EchoStatusResponseBody getBody() {
        return this.body;
    }

}
