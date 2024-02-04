// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class ModifyDatabaseUserRolesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyDatabaseUserRolesResponseBody body;

    public static ModifyDatabaseUserRolesResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDatabaseUserRolesResponse self = new ModifyDatabaseUserRolesResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDatabaseUserRolesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyDatabaseUserRolesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyDatabaseUserRolesResponse setBody(ModifyDatabaseUserRolesResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDatabaseUserRolesResponseBody getBody() {
        return this.body;
    }

}
