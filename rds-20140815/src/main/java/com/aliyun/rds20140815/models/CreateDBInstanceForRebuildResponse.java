// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CreateDBInstanceForRebuildResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateDBInstanceForRebuildResponseBody body;

    public static CreateDBInstanceForRebuildResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDBInstanceForRebuildResponse self = new CreateDBInstanceForRebuildResponse();
        return TeaModel.build(map, self);
    }

    public CreateDBInstanceForRebuildResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDBInstanceForRebuildResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateDBInstanceForRebuildResponse setBody(CreateDBInstanceForRebuildResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDBInstanceForRebuildResponseBody getBody() {
        return this.body;
    }

}
