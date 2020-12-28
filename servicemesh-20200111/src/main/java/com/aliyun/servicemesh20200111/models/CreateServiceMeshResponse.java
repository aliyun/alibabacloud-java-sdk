// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class CreateServiceMeshResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateServiceMeshResponseBody body;

    public static CreateServiceMeshResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateServiceMeshResponse self = new CreateServiceMeshResponse();
        return TeaModel.build(map, self);
    }

    public CreateServiceMeshResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateServiceMeshResponse setBody(CreateServiceMeshResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateServiceMeshResponseBody getBody() {
        return this.body;
    }

}
