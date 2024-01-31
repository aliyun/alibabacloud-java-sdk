// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class StartDBInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StartDBInstanceResponseBody body;

    public static StartDBInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        StartDBInstanceResponse self = new StartDBInstanceResponse();
        return TeaModel.build(map, self);
    }

    public StartDBInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartDBInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StartDBInstanceResponse setBody(StartDBInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public StartDBInstanceResponseBody getBody() {
        return this.body;
    }

}
