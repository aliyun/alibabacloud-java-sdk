// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeDBInstanceIpHostnameResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDBInstanceIpHostnameResponseBody body;

    public static DescribeDBInstanceIpHostnameResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstanceIpHostnameResponse self = new DescribeDBInstanceIpHostnameResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDBInstanceIpHostnameResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDBInstanceIpHostnameResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDBInstanceIpHostnameResponse setBody(DescribeDBInstanceIpHostnameResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDBInstanceIpHostnameResponseBody getBody() {
        return this.body;
    }

}
