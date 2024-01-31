// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyDBInstanceNetworkExpireTimeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyDBInstanceNetworkExpireTimeResponseBody body;

    public static ModifyDBInstanceNetworkExpireTimeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBInstanceNetworkExpireTimeResponse self = new ModifyDBInstanceNetworkExpireTimeResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDBInstanceNetworkExpireTimeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyDBInstanceNetworkExpireTimeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyDBInstanceNetworkExpireTimeResponse setBody(ModifyDBInstanceNetworkExpireTimeResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDBInstanceNetworkExpireTimeResponseBody getBody() {
        return this.body;
    }

}
