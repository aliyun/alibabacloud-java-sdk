// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DeleteEncryptionDBRolePrivilegeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteEncryptionDBRolePrivilegeResponseBody body;

    public static DeleteEncryptionDBRolePrivilegeResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteEncryptionDBRolePrivilegeResponse self = new DeleteEncryptionDBRolePrivilegeResponse();
        return TeaModel.build(map, self);
    }

    public DeleteEncryptionDBRolePrivilegeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteEncryptionDBRolePrivilegeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteEncryptionDBRolePrivilegeResponse setBody(DeleteEncryptionDBRolePrivilegeResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteEncryptionDBRolePrivilegeResponseBody getBody() {
        return this.body;
    }

}
