// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailcloud20180313.models;

import com.aliyun.tea.*;

public class DeployAppResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeployAppResponseBody body;

    public static DeployAppResponse build(java.util.Map<String, ?> map) throws Exception {
        DeployAppResponse self = new DeployAppResponse();
        return TeaModel.build(map, self);
    }

    public DeployAppResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeployAppResponse setBody(DeployAppResponseBody body) {
        this.body = body;
        return this;
    }
    public DeployAppResponseBody getBody() {
        return this.body;
    }

}
