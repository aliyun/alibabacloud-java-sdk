// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateAKSClusterResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateAKSClusterResponseBody body;

    public static CreateAKSClusterResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAKSClusterResponse self = new CreateAKSClusterResponse();
        return TeaModel.build(map, self);
    }

    public CreateAKSClusterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAKSClusterResponse setBody(CreateAKSClusterResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAKSClusterResponseBody getBody() {
        return this.body;
    }

}
