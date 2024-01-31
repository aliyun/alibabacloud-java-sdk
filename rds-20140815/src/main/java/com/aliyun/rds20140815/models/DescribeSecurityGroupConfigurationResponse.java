// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeSecurityGroupConfigurationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSecurityGroupConfigurationResponseBody body;

    public static DescribeSecurityGroupConfigurationResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSecurityGroupConfigurationResponse self = new DescribeSecurityGroupConfigurationResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSecurityGroupConfigurationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSecurityGroupConfigurationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSecurityGroupConfigurationResponse setBody(DescribeSecurityGroupConfigurationResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSecurityGroupConfigurationResponseBody getBody() {
        return this.body;
    }

}
