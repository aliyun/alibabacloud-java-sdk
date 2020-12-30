// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.webplus20190320.models;

import com.aliyun.tea.*;

public class DeployAppEnvResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeployAppEnvResponseBody body;

    public static DeployAppEnvResponse build(java.util.Map<String, ?> map) throws Exception {
        DeployAppEnvResponse self = new DeployAppEnvResponse();
        return TeaModel.build(map, self);
    }

    public DeployAppEnvResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeployAppEnvResponse setBody(DeployAppEnvResponseBody body) {
        this.body = body;
        return this;
    }
    public DeployAppEnvResponseBody getBody() {
        return this.body;
    }

}
