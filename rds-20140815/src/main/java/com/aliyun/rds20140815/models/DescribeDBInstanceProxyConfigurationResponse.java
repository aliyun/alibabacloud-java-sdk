// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeDBInstanceProxyConfigurationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDBInstanceProxyConfigurationResponseBody body;

    public static DescribeDBInstanceProxyConfigurationResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstanceProxyConfigurationResponse self = new DescribeDBInstanceProxyConfigurationResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDBInstanceProxyConfigurationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDBInstanceProxyConfigurationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDBInstanceProxyConfigurationResponse setBody(DescribeDBInstanceProxyConfigurationResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDBInstanceProxyConfigurationResponseBody getBody() {
        return this.body;
    }

}
