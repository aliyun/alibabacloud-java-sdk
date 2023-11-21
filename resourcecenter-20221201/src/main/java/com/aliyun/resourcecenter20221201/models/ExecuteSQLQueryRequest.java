// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcecenter20221201.models;

import com.aliyun.tea.*;

public class ExecuteSQLQueryRequest extends TeaModel {
    /**
     * <p>The SQL statement to be executed.</p>
     * <br>
     * <p>The number of characters in the SQL statement must be less than 2,000.</p>
     * <br>
     * <p>For more information about the SQL syntax, see [Basic SQL syntax](~~2539395~~).</p>
     */
    @NameInMap("Expression")
    public String expression;

    /**
     * <p>The search scope.</p>
     * <br>
     * <p>Set this parameter to the ID of a resource group.</p>
     * <br>
     * <p>For information about how to obtain the ID of a resource group, see [ListResourceGroups](~~158855~~).</p>
     */
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
