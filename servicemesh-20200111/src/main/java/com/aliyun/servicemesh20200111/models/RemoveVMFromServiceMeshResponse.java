// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class RemoveVMFromServiceMeshResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RemoveVMFromServiceMeshResponseBody body;

    public static RemoveVMFromServiceMeshResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveVMFromServiceMeshResponse self = new RemoveVMFromServiceMeshResponse();
        return TeaModel.build(map, self);
    }

    public RemoveVMFromServiceMeshResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveVMFromServiceMeshResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RemoveVMFromServiceMeshResponse setBody(RemoveVMFromServiceMeshResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveVMFromServiceMeshResponseBody getBody() {
        return this.body;
    }

}
