// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DeleteServiceMeshResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteServiceMeshResponseBody body;

    public static DeleteServiceMeshResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteServiceMeshResponse self = new DeleteServiceMeshResponse();
        return TeaModel.build(map, self);
    }

    public DeleteServiceMeshResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteServiceMeshResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteServiceMeshResponse setBody(DeleteServiceMeshResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteServiceMeshResponseBody getBody() {
        return this.body;
    }

}
