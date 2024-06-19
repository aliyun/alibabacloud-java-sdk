// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class UpdateBackupPolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateBackupPolicyResponseBody body;

    public static UpdateBackupPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateBackupPolicyResponse self = new UpdateBackupPolicyResponse();
        return TeaModel.build(map, self);
    }

    public UpdateBackupPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateBackupPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateBackupPolicyResponse setBody(UpdateBackupPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateBackupPolicyResponseBody getBody() {
        return this.body;
    }

}
