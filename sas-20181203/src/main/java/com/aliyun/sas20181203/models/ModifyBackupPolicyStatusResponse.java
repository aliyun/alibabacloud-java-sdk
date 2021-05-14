// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyBackupPolicyStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public ModifyBackupPolicyStatusResponse setBody(ModifyBackupPolicyStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyBackupPolicyStatusResponseBody getBody() {
        return this.body;
    }

}
