// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class ModifySagPortRoleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifySagPortRoleResponseBody body;

    public static ModifySagPortRoleResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifySagPortRoleResponse self = new ModifySagPortRoleResponse();
        return TeaModel.build(map, self);
    }

    public ModifySagPortRoleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifySagPortRoleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifySagPortRoleResponse setBody(ModifySagPortRoleResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifySagPortRoleResponseBody getBody() {
        return this.body;
    }

}
