// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyDBClusterAutoUpgradeMinorVersionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyDBClusterAutoUpgradeMinorVersionResponseBody body;

    public static ModifyDBClusterAutoUpgradeMinorVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBClusterAutoUpgradeMinorVersionResponse self = new ModifyDBClusterAutoUpgradeMinorVersionResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDBClusterAutoUpgradeMinorVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyDBClusterAutoUpgradeMinorVersionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyDBClusterAutoUpgradeMinorVersionResponse setBody(ModifyDBClusterAutoUpgradeMinorVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDBClusterAutoUpgradeMinorVersionResponseBody getBody() {
        return this.body;
    }

}
