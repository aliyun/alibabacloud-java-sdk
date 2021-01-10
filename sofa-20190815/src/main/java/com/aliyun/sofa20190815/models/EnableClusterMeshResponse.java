// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class EnableClusterMeshResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public EnableClusterMeshResponseBody body;

    public static EnableClusterMeshResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableClusterMeshResponse self = new EnableClusterMeshResponse();
        return TeaModel.build(map, self);
    }

    public EnableClusterMeshResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableClusterMeshResponse setBody(EnableClusterMeshResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableClusterMeshResponseBody getBody() {
        return this.body;
    }

}
