// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateUniBackupPolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateUniBackupPolicyResponseBody body;

    public static CreateUniBackupPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateUniBackupPolicyResponse self = new CreateUniBackupPolicyResponse();
        return TeaModel.build(map, self);
    }

    public CreateUniBackupPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateUniBackupPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateUniBackupPolicyResponse setBody(CreateUniBackupPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateUniBackupPolicyResponseBody getBody() {
        return this.body;
    }

}
