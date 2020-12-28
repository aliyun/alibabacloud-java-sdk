// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class AddVmAppToMeshResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddVmAppToMeshResponseBody body;

    public static AddVmAppToMeshResponse build(java.util.Map<String, ?> map) throws Exception {
        AddVmAppToMeshResponse self = new AddVmAppToMeshResponse();
        return TeaModel.build(map, self);
    }

    public AddVmAppToMeshResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddVmAppToMeshResponse setBody(AddVmAppToMeshResponseBody body) {
        this.body = body;
        return this;
    }
    public AddVmAppToMeshResponseBody getBody() {
        return this.body;
    }

}
