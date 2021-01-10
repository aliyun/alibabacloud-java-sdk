// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class EnableAKSClusterMeshResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public EnableAKSClusterMeshResponseBody body;

    public static EnableAKSClusterMeshResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableAKSClusterMeshResponse self = new EnableAKSClusterMeshResponse();
        return TeaModel.build(map, self);
    }

    public EnableAKSClusterMeshResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableAKSClusterMeshResponse setBody(EnableAKSClusterMeshResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableAKSClusterMeshResponseBody getBody() {
        return this.body;
    }

}
