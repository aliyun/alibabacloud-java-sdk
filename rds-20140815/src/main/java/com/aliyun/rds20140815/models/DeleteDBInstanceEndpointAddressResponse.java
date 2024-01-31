// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DeleteDBInstanceEndpointAddressResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteDBInstanceEndpointAddressResponseBody body;

    public static DeleteDBInstanceEndpointAddressResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDBInstanceEndpointAddressResponse self = new DeleteDBInstanceEndpointAddressResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDBInstanceEndpointAddressResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDBInstanceEndpointAddressResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteDBInstanceEndpointAddressResponse setBody(DeleteDBInstanceEndpointAddressResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDBInstanceEndpointAddressResponseBody getBody() {
        return this.body;
    }

}
