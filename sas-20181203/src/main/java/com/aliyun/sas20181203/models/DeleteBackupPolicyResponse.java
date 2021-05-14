// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DeleteBackupPolicyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteBackupPolicyResponseBody body;

    public static DeleteBackupPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteBackupPolicyResponse self = new DeleteBackupPolicyResponse();
        return TeaModel.build(map, self);
    }

    public DeleteBackupPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteBackupPolicyResponse setBody(DeleteBackupPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteBackupPolicyResponseBody getBody() {
        return this.body;
    }

}
