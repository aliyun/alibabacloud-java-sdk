// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CreateDBInstanceEndpointAddressResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateDBInstanceEndpointAddressResponseBody body;

    public static CreateDBInstanceEndpointAddressResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDBInstanceEndpointAddressResponse self = new CreateDBInstanceEndpointAddressResponse();
        return TeaModel.build(map, self);
    }

    public CreateDBInstanceEndpointAddressResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDBInstanceEndpointAddressResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateDBInstanceEndpointAddressResponse setBody(CreateDBInstanceEndpointAddressResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDBInstanceEndpointAddressResponseBody getBody() {
        return this.body;
    }

}
