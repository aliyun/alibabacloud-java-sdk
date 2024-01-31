// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyDBInstanceEndpointAddressResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyDBInstanceEndpointAddressResponseBody body;

    public static ModifyDBInstanceEndpointAddressResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBInstanceEndpointAddressResponse self = new ModifyDBInstanceEndpointAddressResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDBInstanceEndpointAddressResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyDBInstanceEndpointAddressResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyDBInstanceEndpointAddressResponse setBody(ModifyDBInstanceEndpointAddressResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDBInstanceEndpointAddressResponseBody getBody() {
        return this.body;
    }

}
