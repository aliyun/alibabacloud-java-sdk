// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class OpenAKSClusterMeshResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public OpenAKSClusterMeshResponseBody body;

    public static OpenAKSClusterMeshResponse build(java.util.Map<String, ?> map) throws Exception {
        OpenAKSClusterMeshResponse self = new OpenAKSClusterMeshResponse();
        return TeaModel.build(map, self);
    }

    public OpenAKSClusterMeshResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OpenAKSClusterMeshResponse setBody(OpenAKSClusterMeshResponseBody body) {
        this.body = body;
        return this;
    }
    public OpenAKSClusterMeshResponseBody getBody() {
        return this.body;
    }

}
