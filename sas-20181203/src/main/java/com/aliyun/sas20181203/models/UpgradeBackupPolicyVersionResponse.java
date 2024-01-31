// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class UpgradeBackupPolicyVersionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpgradeBackupPolicyVersionResponseBody body;

    public static UpgradeBackupPolicyVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        UpgradeBackupPolicyVersionResponse self = new UpgradeBackupPolicyVersionResponse();
        return TeaModel.build(map, self);
    }

    public UpgradeBackupPolicyVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpgradeBackupPolicyVersionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpgradeBackupPolicyVersionResponse setBody(UpgradeBackupPolicyVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public UpgradeBackupPolicyVersionResponseBody getBody() {
        return this.body;
    }

}
