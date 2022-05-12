// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DeployApplicationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeployApplicationResponseBody body;

    public static DeployApplicationResponse build(java.util.Map<String, ?> map) throws Exception {
        DeployApplicationResponse self = new DeployApplicationResponse();
        return TeaModel.build(map, self);
    }

    public DeployApplicationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeployApplicationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeployApplicationResponse setBody(DeployApplicationResponseBody body) {
        this.body = body;
        return this;
    }
    public DeployApplicationResponseBody getBody() {
        return this.body;
    }

}
