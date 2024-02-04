// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyBackupPolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyBackupPolicyResponseBody body;

    public static ModifyBackupPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyBackupPolicyResponse self = new ModifyBackupPolicyResponse();
        return TeaModel.build(map, self);
    }

    public ModifyBackupPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyBackupPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyBackupPolicyResponse setBody(ModifyBackupPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyBackupPolicyResponseBody getBody() {
        return this.body;
    }

}
