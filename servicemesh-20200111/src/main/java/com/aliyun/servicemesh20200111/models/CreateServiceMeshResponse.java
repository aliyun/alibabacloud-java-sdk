// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class CreateServiceMeshResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public CreateServiceMeshResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateServiceMeshResponse setBody(CreateServiceMeshResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateServiceMeshResponseBody getBody() {
        return this.body;
    }

}
