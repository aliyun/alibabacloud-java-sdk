// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.selectdb20230522.models;

import com.aliyun.tea.*;

public class CheckCreateDBInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CheckCreateDBInstanceResponseBody body;

    public static CheckCreateDBInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckCreateDBInstanceResponse self = new CheckCreateDBInstanceResponse();
        return TeaModel.build(map, self);
    }

    public CheckCreateDBInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckCreateDBInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CheckCreateDBInstanceResponse setBody(CheckCreateDBInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckCreateDBInstanceResponseBody getBody() {
        return this.body;
    }

}
