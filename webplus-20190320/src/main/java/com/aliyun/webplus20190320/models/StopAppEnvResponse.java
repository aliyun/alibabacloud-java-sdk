// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.webplus20190320.models;

import com.aliyun.tea.*;

public class StopAppEnvResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public StopAppEnvResponseBody body;

    public static StopAppEnvResponse build(java.util.Map<String, ?> map) throws Exception {
        StopAppEnvResponse self = new StopAppEnvResponse();
        return TeaModel.build(map, self);
    }

    public StopAppEnvResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopAppEnvResponse setBody(StopAppEnvResponseBody body) {
        this.body = body;
        return this;
    }
    public StopAppEnvResponseBody getBody() {
        return this.body;
    }

}
