// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyDBInstancePayTypeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyDBInstancePayTypeResponseBody body;

    public static ModifyDBInstancePayTypeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBInstancePayTypeResponse self = new ModifyDBInstancePayTypeResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDBInstancePayTypeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyDBInstancePayTypeResponse setBody(ModifyDBInstancePayTypeResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDBInstancePayTypeResponseBody getBody() {
        return this.body;
    }

}
