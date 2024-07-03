// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CreateDBInstanceSecurityGroupRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateDBInstanceSecurityGroupRuleResponseBody body;

    public static CreateDBInstanceSecurityGroupRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDBInstanceSecurityGroupRuleResponse self = new CreateDBInstanceSecurityGroupRuleResponse();
        return TeaModel.build(map, self);
    }

    public CreateDBInstanceSecurityGroupRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDBInstanceSecurityGroupRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateDBInstanceSecurityGroupRuleResponse setBody(CreateDBInstanceSecurityGroupRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDBInstanceSecurityGroupRuleResponseBody getBody() {
        return this.body;
    }

}
