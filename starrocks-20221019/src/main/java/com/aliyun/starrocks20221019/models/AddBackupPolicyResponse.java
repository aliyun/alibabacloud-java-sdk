// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starrocks20221019.models;

import com.aliyun.tea.*;

public class AddBackupPolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddBackupPolicyResponseBody body;

    public static AddBackupPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        AddBackupPolicyResponse self = new AddBackupPolicyResponse();
        return TeaModel.build(map, self);
    }

    public AddBackupPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddBackupPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddBackupPolicyResponse setBody(AddBackupPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public AddBackupPolicyResponseBody getBody() {
        return this.body;
    }

}
