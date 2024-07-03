// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DeleteDBInstanceSecurityGroupRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteDBInstanceSecurityGroupRuleResponseBody body;

    public static DeleteDBInstanceSecurityGroupRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDBInstanceSecurityGroupRuleResponse self = new DeleteDBInstanceSecurityGroupRuleResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDBInstanceSecurityGroupRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDBInstanceSecurityGroupRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteDBInstanceSecurityGroupRuleResponse setBody(DeleteDBInstanceSecurityGroupRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDBInstanceSecurityGroupRuleResponseBody getBody() {
        return this.body;
    }

}
