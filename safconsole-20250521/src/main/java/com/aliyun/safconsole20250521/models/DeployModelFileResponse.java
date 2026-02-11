// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.safconsole20250521.models;

import com.aliyun.tea.*;

public class DeployModelFileResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeployModelFileResponseBody body;

    public static DeployModelFileResponse build(java.util.Map<String, ?> map) throws Exception {
        DeployModelFileResponse self = new DeployModelFileResponse();
        return TeaModel.build(map, self);
    }

    public DeployModelFileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeployModelFileResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeployModelFileResponse setBody(DeployModelFileResponseBody body) {
        this.body = body;
        return this;
    }
    public DeployModelFileResponseBody getBody() {
        return this.body;
    }

}
