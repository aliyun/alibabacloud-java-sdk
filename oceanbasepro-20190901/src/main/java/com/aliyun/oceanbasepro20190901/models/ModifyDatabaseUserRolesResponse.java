// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class ModifyDatabaseUserRolesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public ModifyDatabaseUserRolesResponse setBody(ModifyDatabaseUserRolesResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDatabaseUserRolesResponseBody getBody() {
        return this.body;
    }

}
