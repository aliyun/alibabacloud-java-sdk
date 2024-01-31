// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeDBInstancesByExpireTimeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDBInstancesByExpireTimeResponseBody body;

    public static DescribeDBInstancesByExpireTimeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstancesByExpireTimeResponse self = new DescribeDBInstancesByExpireTimeResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDBInstancesByExpireTimeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDBInstancesByExpireTimeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDBInstancesByExpireTimeResponse setBody(DescribeDBInstancesByExpireTimeResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDBInstancesByExpireTimeResponseBody getBody() {
        return this.body;
    }

}
