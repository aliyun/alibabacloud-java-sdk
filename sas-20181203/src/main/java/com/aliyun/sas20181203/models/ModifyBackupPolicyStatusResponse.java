// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyBackupPolicyStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyBackupPolicyStatusResponseBody body;

    public static ModifyBackupPolicyStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyBackupPolicyStatusResponse self = new ModifyBackupPolicyStatusResponse();
        return TeaModel.build(map, self);
    }

    public ModifyBackupPolicyStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyBackupPolicyStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyBackupPolicyStatusResponse setBody(ModifyBackupPolicyStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyBackupPolicyStatusResponseBody getBody() {
        return this.body;
    }

}
