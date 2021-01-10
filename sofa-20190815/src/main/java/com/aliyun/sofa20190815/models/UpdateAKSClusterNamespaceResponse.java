// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateAKSClusterNamespaceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateAKSClusterNamespaceResponseBody body;

    public static UpdateAKSClusterNamespaceResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAKSClusterNamespaceResponse self = new UpdateAKSClusterNamespaceResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAKSClusterNamespaceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateAKSClusterNamespaceResponse setBody(UpdateAKSClusterNamespaceResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAKSClusterNamespaceResponseBody getBody() {
        return this.body;
    }

}
