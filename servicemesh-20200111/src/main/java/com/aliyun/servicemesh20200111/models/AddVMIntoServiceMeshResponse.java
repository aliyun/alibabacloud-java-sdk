// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class AddVMIntoServiceMeshResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public AddVMIntoServiceMeshResponseBody body;

    public static AddVMIntoServiceMeshResponse build(java.util.Map<String, ?> map) throws Exception {
        AddVMIntoServiceMeshResponse self = new AddVMIntoServiceMeshResponse();
        return TeaModel.build(map, self);
    }

    public AddVMIntoServiceMeshResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddVMIntoServiceMeshResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddVMIntoServiceMeshResponse setBody(AddVMIntoServiceMeshResponseBody body) {
        this.body = body;
        return this;
    }
    public AddVMIntoServiceMeshResponseBody getBody() {
        return this.body;
    }

}
