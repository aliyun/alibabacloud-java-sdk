// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateAKSClusterNamespaceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateAKSClusterNamespaceResponseBody body;

    public static CreateAKSClusterNamespaceResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAKSClusterNamespaceResponse self = new CreateAKSClusterNamespaceResponse();
        return TeaModel.build(map, self);
    }

    public CreateAKSClusterNamespaceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAKSClusterNamespaceResponse setBody(CreateAKSClusterNamespaceResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAKSClusterNamespaceResponseBody getBody() {
        return this.body;
    }

}
