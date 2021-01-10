// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class EnableMeshVmResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public EnableMeshVmResponseBody body;

    public static EnableMeshVmResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableMeshVmResponse self = new EnableMeshVmResponse();
        return TeaModel.build(map, self);
    }

    public EnableMeshVmResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableMeshVmResponse setBody(EnableMeshVmResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableMeshVmResponseBody getBody() {
        return this.body;
    }

}
