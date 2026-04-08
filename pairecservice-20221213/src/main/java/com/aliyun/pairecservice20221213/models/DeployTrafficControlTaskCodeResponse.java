// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class DeployTrafficControlTaskCodeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeployTrafficControlTaskCodeResponseBody body;

    public static DeployTrafficControlTaskCodeResponse build(java.util.Map<String, ?> map) throws Exception {
        DeployTrafficControlTaskCodeResponse self = new DeployTrafficControlTaskCodeResponse();
        return TeaModel.build(map, self);
    }

    public DeployTrafficControlTaskCodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeployTrafficControlTaskCodeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeployTrafficControlTaskCodeResponse setBody(DeployTrafficControlTaskCodeResponseBody body) {
        this.body = body;
        return this;
    }
    public DeployTrafficControlTaskCodeResponseBody getBody() {
        return this.body;
    }

}
