// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class UpgradeBackupPolicyVersionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public UpgradeBackupPolicyVersionResponse setBody(UpgradeBackupPolicyVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public UpgradeBackupPolicyVersionResponseBody getBody() {
        return this.body;
    }

}
