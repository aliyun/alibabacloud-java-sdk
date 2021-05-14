// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DeleteBackupPolicyMachineResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteBackupPolicyMachineResponseBody body;

    public static DeleteBackupPolicyMachineResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteBackupPolicyMachineResponse self = new DeleteBackupPolicyMachineResponse();
        return TeaModel.build(map, self);
    }

    public DeleteBackupPolicyMachineResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteBackupPolicyMachineResponse setBody(DeleteBackupPolicyMachineResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteBackupPolicyMachineResponseBody getBody() {
        return this.body;
    }

}
