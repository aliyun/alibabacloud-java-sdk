// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20221111.models;

import com.aliyun.tea.*;

public class DeployLocationTreeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeployLocationTreeResponseBody body;

    public static DeployLocationTreeResponse build(java.util.Map<String, ?> map) throws Exception {
        DeployLocationTreeResponse self = new DeployLocationTreeResponse();
        return TeaModel.build(map, self);
    }

    public DeployLocationTreeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeployLocationTreeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeployLocationTreeResponse setBody(DeployLocationTreeResponseBody body) {
        this.body = body;
        return this;
    }
    public DeployLocationTreeResponseBody getBody() {
        return this.body;
    }

}
