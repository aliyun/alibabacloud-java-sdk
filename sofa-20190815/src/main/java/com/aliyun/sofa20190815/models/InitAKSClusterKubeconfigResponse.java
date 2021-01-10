// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class InitAKSClusterKubeconfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public InitAKSClusterKubeconfigResponseBody body;

    public static InitAKSClusterKubeconfigResponse build(java.util.Map<String, ?> map) throws Exception {
        InitAKSClusterKubeconfigResponse self = new InitAKSClusterKubeconfigResponse();
        return TeaModel.build(map, self);
    }

    public InitAKSClusterKubeconfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InitAKSClusterKubeconfigResponse setBody(InitAKSClusterKubeconfigResponseBody body) {
        this.body = body;
        return this;
    }
    public InitAKSClusterKubeconfigResponseBody getBody() {
        return this.body;
    }

}
