// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyDBInstanceVectorSupportStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyDBInstanceVectorSupportStatusResponseBody body;

    public static ModifyDBInstanceVectorSupportStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBInstanceVectorSupportStatusResponse self = new ModifyDBInstanceVectorSupportStatusResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDBInstanceVectorSupportStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyDBInstanceVectorSupportStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyDBInstanceVectorSupportStatusResponse setBody(ModifyDBInstanceVectorSupportStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDBInstanceVectorSupportStatusResponseBody getBody() {
        return this.body;
    }

}
