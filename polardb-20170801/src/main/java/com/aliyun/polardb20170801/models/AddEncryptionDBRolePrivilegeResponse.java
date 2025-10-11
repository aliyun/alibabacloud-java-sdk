// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class AddEncryptionDBRolePrivilegeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddEncryptionDBRolePrivilegeResponseBody body;

    public static AddEncryptionDBRolePrivilegeResponse build(java.util.Map<String, ?> map) throws Exception {
        AddEncryptionDBRolePrivilegeResponse self = new AddEncryptionDBRolePrivilegeResponse();
        return TeaModel.build(map, self);
    }

    public AddEncryptionDBRolePrivilegeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddEncryptionDBRolePrivilegeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddEncryptionDBRolePrivilegeResponse setBody(AddEncryptionDBRolePrivilegeResponseBody body) {
        this.body = body;
        return this;
    }
    public AddEncryptionDBRolePrivilegeResponseBody getBody() {
        return this.body;
    }

}
