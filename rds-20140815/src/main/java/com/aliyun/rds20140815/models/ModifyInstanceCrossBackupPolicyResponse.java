// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyInstanceCrossBackupPolicyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public ModifyInstanceCrossBackupPolicyResponse setBody(ModifyInstanceCrossBackupPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyInstanceCrossBackupPolicyResponseBody getBody() {
        return this.body;
    }

}
