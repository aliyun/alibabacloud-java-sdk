// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class UpgradeDBInstanceMajorVersionPrecheckResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpgradeDBInstanceMajorVersionPrecheckResponseBody body;

    public static UpgradeDBInstanceMajorVersionPrecheckResponse build(java.util.Map<String, ?> map) throws Exception {
        UpgradeDBInstanceMajorVersionPrecheckResponse self = new UpgradeDBInstanceMajorVersionPrecheckResponse();
        return TeaModel.build(map, self);
    }

    public UpgradeDBInstanceMajorVersionPrecheckResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpgradeDBInstanceMajorVersionPrecheckResponse setBody(UpgradeDBInstanceMajorVersionPrecheckResponseBody body) {
        this.body = body;
        return this;
    }
    public UpgradeDBInstanceMajorVersionPrecheckResponseBody getBody() {
        return this.body;
    }

}
