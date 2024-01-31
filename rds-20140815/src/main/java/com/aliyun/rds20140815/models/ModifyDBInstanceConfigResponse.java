// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyDBInstanceConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyDBInstanceConfigResponseBody body;

    public static ModifyDBInstanceConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBInstanceConfigResponse self = new ModifyDBInstanceConfigResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDBInstanceConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyDBInstanceConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyDBInstanceConfigResponse setBody(ModifyDBInstanceConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDBInstanceConfigResponseBody getBody() {
        return this.body;
    }

}
