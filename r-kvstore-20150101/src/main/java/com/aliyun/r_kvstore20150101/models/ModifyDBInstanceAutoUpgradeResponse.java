// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class ModifyDBInstanceAutoUpgradeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyDBInstanceAutoUpgradeResponseBody body;

    public static ModifyDBInstanceAutoUpgradeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBInstanceAutoUpgradeResponse self = new ModifyDBInstanceAutoUpgradeResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDBInstanceAutoUpgradeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyDBInstanceAutoUpgradeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyDBInstanceAutoUpgradeResponse setBody(ModifyDBInstanceAutoUpgradeResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDBInstanceAutoUpgradeResponseBody getBody() {
        return this.body;
    }

}
