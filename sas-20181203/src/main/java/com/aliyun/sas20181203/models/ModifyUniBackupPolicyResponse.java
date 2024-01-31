// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyUniBackupPolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyUniBackupPolicyResponseBody body;

    public static ModifyUniBackupPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyUniBackupPolicyResponse self = new ModifyUniBackupPolicyResponse();
        return TeaModel.build(map, self);
    }

    public ModifyUniBackupPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyUniBackupPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyUniBackupPolicyResponse setBody(ModifyUniBackupPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyUniBackupPolicyResponseBody getBody() {
        return this.body;
    }

}
