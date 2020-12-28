// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class ModifyVServerGroupBackendServersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyVServerGroupBackendServersResponseBody body;

    public static ModifyVServerGroupBackendServersResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyVServerGroupBackendServersResponse self = new ModifyVServerGroupBackendServersResponse();
        return TeaModel.build(map, self);
    }

    public ModifyVServerGroupBackendServersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyVServerGroupBackendServersResponse setBody(ModifyVServerGroupBackendServersResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyVServerGroupBackendServersResponseBody getBody() {
        return this.body;
    }

}
