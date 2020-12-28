// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class RemoveVmAppFromMeshResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RemoveVmAppFromMeshResponseBody body;

    public static RemoveVmAppFromMeshResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveVmAppFromMeshResponse self = new RemoveVmAppFromMeshResponse();
        return TeaModel.build(map, self);
    }

    public RemoveVmAppFromMeshResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveVmAppFromMeshResponse setBody(RemoveVmAppFromMeshResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveVmAppFromMeshResponseBody getBody() {
        return this.body;
    }

}
