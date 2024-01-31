// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CreateTempDBInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateTempDBInstanceResponseBody body;

    public static CreateTempDBInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateTempDBInstanceResponse self = new CreateTempDBInstanceResponse();
        return TeaModel.build(map, self);
    }

    public CreateTempDBInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateTempDBInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateTempDBInstanceResponse setBody(CreateTempDBInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateTempDBInstanceResponseBody getBody() {
        return this.body;
    }

}
