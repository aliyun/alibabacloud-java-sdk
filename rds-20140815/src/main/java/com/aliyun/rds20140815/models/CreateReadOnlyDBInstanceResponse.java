// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CreateReadOnlyDBInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateReadOnlyDBInstanceResponseBody body;

    public static CreateReadOnlyDBInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateReadOnlyDBInstanceResponse self = new CreateReadOnlyDBInstanceResponse();
        return TeaModel.build(map, self);
    }

    public CreateReadOnlyDBInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateReadOnlyDBInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateReadOnlyDBInstanceResponse setBody(CreateReadOnlyDBInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateReadOnlyDBInstanceResponseBody getBody() {
        return this.body;
    }

}
