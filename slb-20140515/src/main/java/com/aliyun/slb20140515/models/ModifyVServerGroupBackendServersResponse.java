// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class ModifyVServerGroupBackendServersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public ModifyVServerGroupBackendServersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyVServerGroupBackendServersResponse setBody(ModifyVServerGroupBackendServersResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyVServerGroupBackendServersResponseBody getBody() {
        return this.body;
    }

}
