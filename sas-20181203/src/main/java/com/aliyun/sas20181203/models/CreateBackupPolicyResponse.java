// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateBackupPolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateBackupPolicyResponseBody body;

    public static CreateBackupPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateBackupPolicyResponse self = new CreateBackupPolicyResponse();
        return TeaModel.build(map, self);
    }

    public CreateBackupPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateBackupPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateBackupPolicyResponse setBody(CreateBackupPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateBackupPolicyResponseBody getBody() {
        return this.body;
    }

}
