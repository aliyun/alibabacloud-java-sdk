// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class ModifyDBInstanceVipResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyDBInstanceVipResponseBody body;

    public static ModifyDBInstanceVipResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBInstanceVipResponse self = new ModifyDBInstanceVipResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDBInstanceVipResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyDBInstanceVipResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyDBInstanceVipResponse setBody(ModifyDBInstanceVipResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDBInstanceVipResponseBody getBody() {
        return this.body;
    }

}
