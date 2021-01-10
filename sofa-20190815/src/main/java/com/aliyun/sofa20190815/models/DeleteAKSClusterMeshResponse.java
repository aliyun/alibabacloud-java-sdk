// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteAKSClusterMeshResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteAKSClusterMeshResponseBody body;

    public static DeleteAKSClusterMeshResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAKSClusterMeshResponse self = new DeleteAKSClusterMeshResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAKSClusterMeshResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAKSClusterMeshResponse setBody(DeleteAKSClusterMeshResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAKSClusterMeshResponseBody getBody() {
        return this.body;
    }

}
