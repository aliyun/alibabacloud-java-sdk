// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeDBInstanceReplicationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDBInstanceReplicationResponseBody body;

    public static DescribeDBInstanceReplicationResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstanceReplicationResponse self = new DescribeDBInstanceReplicationResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDBInstanceReplicationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDBInstanceReplicationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDBInstanceReplicationResponse setBody(DescribeDBInstanceReplicationResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDBInstanceReplicationResponseBody getBody() {
        return this.body;
    }

}
