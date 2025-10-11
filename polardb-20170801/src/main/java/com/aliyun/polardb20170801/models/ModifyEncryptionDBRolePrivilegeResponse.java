// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyEncryptionDBRolePrivilegeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyEncryptionDBRolePrivilegeResponseBody body;

    public static ModifyEncryptionDBRolePrivilegeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyEncryptionDBRolePrivilegeResponse self = new ModifyEncryptionDBRolePrivilegeResponse();
        return TeaModel.build(map, self);
    }

    public ModifyEncryptionDBRolePrivilegeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyEncryptionDBRolePrivilegeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyEncryptionDBRolePrivilegeResponse setBody(ModifyEncryptionDBRolePrivilegeResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyEncryptionDBRolePrivilegeResponseBody getBody() {
        return this.body;
    }

}
