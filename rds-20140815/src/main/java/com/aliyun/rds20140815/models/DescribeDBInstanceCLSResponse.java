// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeDBInstanceCLSResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDBInstanceCLSResponseBody body;

    public static DescribeDBInstanceCLSResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstanceCLSResponse self = new DescribeDBInstanceCLSResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDBInstanceCLSResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDBInstanceCLSResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDBInstanceCLSResponse setBody(DescribeDBInstanceCLSResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDBInstanceCLSResponseBody getBody() {
        return this.body;
    }

}
