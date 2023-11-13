// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcecenter20221201.models;

import com.aliyun.tea.*;

public class ExecuteMultiAccountSQLQueryRequest extends TeaModel {
    @NameInMap("Expression")
    public String expression;

    @NameInMap("Scope")
    public String scope;

    public static ExecuteMultiAccountSQLQueryRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecuteMultiAccountSQLQueryRequest self = new ExecuteMultiAccountSQLQueryRequest();
        return TeaModel.build(map, self);
    }

    public ExecuteMultiAccountSQLQueryRequest setExpression(String expression) {
        this.expression = expression;
        return this;
    }
    public String getExpression() {
        return this.expression;
    }

    public ExecuteMultiAccountSQLQueryRequest setScope(String scope) {
        this.scope = scope;
        return this;
    }
    public String getScope() {
        return this.scope;
    }

}
