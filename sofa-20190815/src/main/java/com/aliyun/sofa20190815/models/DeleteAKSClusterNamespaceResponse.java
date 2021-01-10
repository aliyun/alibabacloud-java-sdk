// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteAKSClusterNamespaceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteAKSClusterNamespaceResponseBody body;

    public static DeleteAKSClusterNamespaceResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAKSClusterNamespaceResponse self = new DeleteAKSClusterNamespaceResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAKSClusterNamespaceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAKSClusterNamespaceResponse setBody(DeleteAKSClusterNamespaceResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAKSClusterNamespaceResponseBody getBody() {
        return this.body;
    }

}
