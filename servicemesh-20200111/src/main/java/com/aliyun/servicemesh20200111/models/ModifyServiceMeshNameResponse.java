// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class ModifyServiceMeshNameResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyServiceMeshNameResponseBody body;

    public static ModifyServiceMeshNameResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyServiceMeshNameResponse self = new ModifyServiceMeshNameResponse();
        return TeaModel.build(map, self);
    }

    public ModifyServiceMeshNameResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyServiceMeshNameResponse setBody(ModifyServiceMeshNameResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyServiceMeshNameResponseBody getBody() {
        return this.body;
    }

}
