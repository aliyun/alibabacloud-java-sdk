// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyDBInstanceNetworkExpireTimeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public ModifyDBInstanceNetworkExpireTimeResponse setBody(ModifyDBInstanceNetworkExpireTimeResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDBInstanceNetworkExpireTimeResponseBody getBody() {
        return this.body;
    }

}
