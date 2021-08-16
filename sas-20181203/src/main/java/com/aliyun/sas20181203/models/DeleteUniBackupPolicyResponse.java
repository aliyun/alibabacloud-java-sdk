// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DeleteUniBackupPolicyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteUniBackupPolicyResponseBody body;

    public static DeleteUniBackupPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteUniBackupPolicyResponse self = new DeleteUniBackupPolicyResponse();
        return TeaModel.build(map, self);
    }

    public DeleteUniBackupPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteUniBackupPolicyResponse setBody(DeleteUniBackupPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteUniBackupPolicyResponseBody getBody() {
        return this.body;
    }

}
