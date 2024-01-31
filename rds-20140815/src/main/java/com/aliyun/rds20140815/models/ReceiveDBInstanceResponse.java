// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ReceiveDBInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ReceiveDBInstanceResponseBody body;

    public static ReceiveDBInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        ReceiveDBInstanceResponse self = new ReceiveDBInstanceResponse();
        return TeaModel.build(map, self);
    }

    public ReceiveDBInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReceiveDBInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ReceiveDBInstanceResponse setBody(ReceiveDBInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public ReceiveDBInstanceResponseBody getBody() {
        return this.body;
    }

}
