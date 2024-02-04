// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyLogBackupPolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyLogBackupPolicyResponseBody body;

    public static ModifyLogBackupPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyLogBackupPolicyResponse self = new ModifyLogBackupPolicyResponse();
        return TeaModel.build(map, self);
    }

    public ModifyLogBackupPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyLogBackupPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyLogBackupPolicyResponse setBody(ModifyLogBackupPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyLogBackupPolicyResponseBody getBody() {
        return this.body;
    }

}
