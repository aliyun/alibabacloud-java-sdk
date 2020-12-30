// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.webplus20190320.models;

import com.aliyun.tea.*;

public class StartAppEnvResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public StartAppEnvResponseBody body;

    public static StartAppEnvResponse build(java.util.Map<String, ?> map) throws Exception {
        StartAppEnvResponse self = new StartAppEnvResponse();
        return TeaModel.build(map, self);
    }

    public StartAppEnvResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartAppEnvResponse setBody(StartAppEnvResponseBody body) {
        this.body = body;
        return this;
    }
    public StartAppEnvResponseBody getBody() {
        return this.body;
    }

}
