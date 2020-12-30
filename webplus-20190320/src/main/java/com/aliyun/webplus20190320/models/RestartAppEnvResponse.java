// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.webplus20190320.models;

import com.aliyun.tea.*;

public class RestartAppEnvResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RestartAppEnvResponseBody body;

    public static RestartAppEnvResponse build(java.util.Map<String, ?> map) throws Exception {
        RestartAppEnvResponse self = new RestartAppEnvResponse();
        return TeaModel.build(map, self);
    }

    public RestartAppEnvResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RestartAppEnvResponse setBody(RestartAppEnvResponseBody body) {
        this.body = body;
        return this;
    }
    public RestartAppEnvResponseBody getBody() {
        return this.body;
    }

}
