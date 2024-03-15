// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.selectdb20230522.models;

import com.aliyun.tea.*;

public class ModifyDBInstanceAttributeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyDBInstanceAttributeResponseBody body;

    public static ModifyDBInstanceAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBInstanceAttributeResponse self = new ModifyDBInstanceAttributeResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDBInstanceAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyDBInstanceAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyDBInstanceAttributeResponse setBody(ModifyDBInstanceAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDBInstanceAttributeResponseBody getBody() {
        return this.body;
    }

}
