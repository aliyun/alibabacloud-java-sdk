// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyDBInstancePayTypeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public ModifyDBInstancePayTypeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyDBInstancePayTypeResponse setBody(ModifyDBInstancePayTypeResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDBInstancePayTypeResponseBody getBody() {
        return this.body;
    }

}
