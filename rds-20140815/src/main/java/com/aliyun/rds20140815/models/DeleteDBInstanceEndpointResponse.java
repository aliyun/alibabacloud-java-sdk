// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DeleteDBInstanceEndpointResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteDBInstanceEndpointResponseBody body;

    public static DeleteDBInstanceEndpointResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDBInstanceEndpointResponse self = new DeleteDBInstanceEndpointResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDBInstanceEndpointResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDBInstanceEndpointResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteDBInstanceEndpointResponse setBody(DeleteDBInstanceEndpointResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDBInstanceEndpointResponseBody getBody() {
        return this.body;
    }

}
