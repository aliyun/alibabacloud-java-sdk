// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DeleteBackupPolicyMachineResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public DeleteBackupPolicyMachineResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteBackupPolicyMachineResponse setBody(DeleteBackupPolicyMachineResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteBackupPolicyMachineResponseBody getBody() {
        return this.body;
    }

}
