// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyApplicationBackupPolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyApplicationBackupPolicyResponseBody body;

    public static ModifyApplicationBackupPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyApplicationBackupPolicyResponse self = new ModifyApplicationBackupPolicyResponse();
        return TeaModel.build(map, self);
    }

    public ModifyApplicationBackupPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyApplicationBackupPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyApplicationBackupPolicyResponse setBody(ModifyApplicationBackupPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyApplicationBackupPolicyResponseBody getBody() {
        return this.body;
    }

}
