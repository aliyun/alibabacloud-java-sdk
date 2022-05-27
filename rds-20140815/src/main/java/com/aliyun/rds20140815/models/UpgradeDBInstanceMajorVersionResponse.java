// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class UpgradeDBInstanceMajorVersionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpgradeDBInstanceMajorVersionResponseBody body;

    public static UpgradeDBInstanceMajorVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        UpgradeDBInstanceMajorVersionResponse self = new UpgradeDBInstanceMajorVersionResponse();
        return TeaModel.build(map, self);
    }

    public UpgradeDBInstanceMajorVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpgradeDBInstanceMajorVersionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpgradeDBInstanceMajorVersionResponse setBody(UpgradeDBInstanceMajorVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public UpgradeDBInstanceMajorVersionResponseBody getBody() {
        return this.body;
    }

}
