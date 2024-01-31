// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyDBInstanceAutoUpgradeMinorVersionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyDBInstanceAutoUpgradeMinorVersionResponseBody body;

    public static ModifyDBInstanceAutoUpgradeMinorVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBInstanceAutoUpgradeMinorVersionResponse self = new ModifyDBInstanceAutoUpgradeMinorVersionResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDBInstanceAutoUpgradeMinorVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyDBInstanceAutoUpgradeMinorVersionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyDBInstanceAutoUpgradeMinorVersionResponse setBody(ModifyDBInstanceAutoUpgradeMinorVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDBInstanceAutoUpgradeMinorVersionResponseBody getBody() {
        return this.body;
    }

}
