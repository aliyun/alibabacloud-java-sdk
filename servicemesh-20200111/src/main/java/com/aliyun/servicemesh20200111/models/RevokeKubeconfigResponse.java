// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class RevokeKubeconfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public RevokeKubeconfigResponseBody body;

    public static RevokeKubeconfigResponse build(java.util.Map<String, ?> map) throws Exception {
        RevokeKubeconfigResponse self = new RevokeKubeconfigResponse();
        return TeaModel.build(map, self);
    }

    public RevokeKubeconfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RevokeKubeconfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RevokeKubeconfigResponse setBody(RevokeKubeconfigResponseBody body) {
        this.body = body;
        return this;
    }
    public RevokeKubeconfigResponseBody getBody() {
        return this.body;
    }

}
