// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class AddClusterIntoServiceMeshResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public AddClusterIntoServiceMeshResponseBody body;

    public static AddClusterIntoServiceMeshResponse build(java.util.Map<String, ?> map) throws Exception {
        AddClusterIntoServiceMeshResponse self = new AddClusterIntoServiceMeshResponse();
        return TeaModel.build(map, self);
    }

    public AddClusterIntoServiceMeshResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddClusterIntoServiceMeshResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddClusterIntoServiceMeshResponse setBody(AddClusterIntoServiceMeshResponseBody body) {
        this.body = body;
        return this;
    }
    public AddClusterIntoServiceMeshResponseBody getBody() {
        return this.body;
    }

}
