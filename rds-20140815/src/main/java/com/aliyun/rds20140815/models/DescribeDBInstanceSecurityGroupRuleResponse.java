// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeDBInstanceSecurityGroupRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDBInstanceSecurityGroupRuleResponseBody body;

    public static DescribeDBInstanceSecurityGroupRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstanceSecurityGroupRuleResponse self = new DescribeDBInstanceSecurityGroupRuleResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDBInstanceSecurityGroupRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDBInstanceSecurityGroupRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDBInstanceSecurityGroupRuleResponse setBody(DescribeDBInstanceSecurityGroupRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDBInstanceSecurityGroupRuleResponseBody getBody() {
        return this.body;
    }

}
