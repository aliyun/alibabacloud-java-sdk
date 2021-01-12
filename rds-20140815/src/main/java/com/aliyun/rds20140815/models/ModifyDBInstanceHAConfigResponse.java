// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyDBInstanceHAConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyDBInstanceHAConfigResponseBody body;

    public static ModifyDBInstanceHAConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBInstanceHAConfigResponse self = new ModifyDBInstanceHAConfigResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDBInstanceHAConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyDBInstanceHAConfigResponse setBody(ModifyDBInstanceHAConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDBInstanceHAConfigResponseBody getBody() {
        return this.body;
    }

}
