// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateAKSMeshWorkspaceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateAKSMeshWorkspaceResponseBody body;

    public static CreateAKSMeshWorkspaceResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAKSMeshWorkspaceResponse self = new CreateAKSMeshWorkspaceResponse();
        return TeaModel.build(map, self);
    }

    public CreateAKSMeshWorkspaceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAKSMeshWorkspaceResponse setBody(CreateAKSMeshWorkspaceResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAKSMeshWorkspaceResponseBody getBody() {
        return this.body;
    }

}
