// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class RemoveClusterFromServiceMeshResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RemoveClusterFromServiceMeshResponseBody body;

    public static RemoveClusterFromServiceMeshResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveClusterFromServiceMeshResponse self = new RemoveClusterFromServiceMeshResponse();
        return TeaModel.build(map, self);
    }

    public RemoveClusterFromServiceMeshResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveClusterFromServiceMeshResponse setBody(RemoveClusterFromServiceMeshResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveClusterFromServiceMeshResponseBody getBody() {
        return this.body;
    }

}
