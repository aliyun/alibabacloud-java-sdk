// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyInstanceCrossBackupPolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyInstanceCrossBackupPolicyResponseBody body;

    public static ModifyInstanceCrossBackupPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceCrossBackupPolicyResponse self = new ModifyInstanceCrossBackupPolicyResponse();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceCrossBackupPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyInstanceCrossBackupPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyInstanceCrossBackupPolicyResponse setBody(ModifyInstanceCrossBackupPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyInstanceCrossBackupPolicyResponseBody getBody() {
        return this.body;
    }

}
