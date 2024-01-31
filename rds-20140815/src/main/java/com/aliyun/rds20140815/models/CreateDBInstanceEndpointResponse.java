// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CreateDBInstanceEndpointResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateDBInstanceEndpointResponseBody body;

    public static CreateDBInstanceEndpointResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDBInstanceEndpointResponse self = new CreateDBInstanceEndpointResponse();
        return TeaModel.build(map, self);
    }

    public CreateDBInstanceEndpointResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDBInstanceEndpointResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateDBInstanceEndpointResponse setBody(CreateDBInstanceEndpointResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDBInstanceEndpointResponseBody getBody() {
        return this.body;
    }

}
