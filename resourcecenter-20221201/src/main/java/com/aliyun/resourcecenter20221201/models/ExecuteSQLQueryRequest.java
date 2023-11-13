// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcecenter20221201.models;

import com.aliyun.tea.*;

public class ExecuteSQLQueryRequest extends TeaModel {
    @NameInMap("Expression")
    public String expression;

    @NameInMap("Scope")
    public String scope;

    public static ExecuteSQLQueryRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecuteSQLQueryRequest self = new ExecuteSQLQueryRequest();
        return TeaModel.build(map, self);
    }

    public ExecuteSQLQueryRequest setExpression(String expression) {
        this.expression = expression;
        return this;
    }
    public String getExpression() {
        return this.expression;
    }

    public ExecuteSQLQueryRequest setScope(String scope) {
        this.scope = scope;
        return this;
    }
    public String getScope() {
        return this.scope;
    }

}
