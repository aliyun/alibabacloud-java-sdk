// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ReInitAKSClusterKubeconfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ReInitAKSClusterKubeconfigResponseBody body;

    public static ReInitAKSClusterKubeconfigResponse build(java.util.Map<String, ?> map) throws Exception {
        ReInitAKSClusterKubeconfigResponse self = new ReInitAKSClusterKubeconfigResponse();
        return TeaModel.build(map, self);
    }

    public ReInitAKSClusterKubeconfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReInitAKSClusterKubeconfigResponse setBody(ReInitAKSClusterKubeconfigResponseBody body) {
        this.body = body;
        return this;
    }
    public ReInitAKSClusterKubeconfigResponseBody getBody() {
        return this.body;
    }

}
