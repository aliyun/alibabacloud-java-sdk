// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.selectdb20230522.models;

import com.aliyun.tea.*;

public class DescribeAllDBInstanceClassResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAllDBInstanceClassResponseBody body;

    public static DescribeAllDBInstanceClassResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAllDBInstanceClassResponse self = new DescribeAllDBInstanceClassResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAllDBInstanceClassResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAllDBInstanceClassResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAllDBInstanceClassResponse setBody(DescribeAllDBInstanceClassResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAllDBInstanceClassResponseBody getBody() {
        return this.body;
    }

}
