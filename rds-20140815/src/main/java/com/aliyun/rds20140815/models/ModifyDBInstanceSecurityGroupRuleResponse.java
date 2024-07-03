// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyDBInstanceSecurityGroupRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyDBInstanceSecurityGroupRuleResponseBody body;

    public static ModifyDBInstanceSecurityGroupRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBInstanceSecurityGroupRuleResponse self = new ModifyDBInstanceSecurityGroupRuleResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDBInstanceSecurityGroupRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyDBInstanceSecurityGroupRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyDBInstanceSecurityGroupRuleResponse setBody(ModifyDBInstanceSecurityGroupRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDBInstanceSecurityGroupRuleResponseBody getBody() {
        return this.body;
    }

}
