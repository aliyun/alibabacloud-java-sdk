// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyDBInstanceEndpointResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyDBInstanceEndpointResponseBody body;

    public static ModifyDBInstanceEndpointResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBInstanceEndpointResponse self = new ModifyDBInstanceEndpointResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDBInstanceEndpointResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyDBInstanceEndpointResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyDBInstanceEndpointResponse setBody(ModifyDBInstanceEndpointResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDBInstanceEndpointResponseBody getBody() {
        return this.body;
    }

}
