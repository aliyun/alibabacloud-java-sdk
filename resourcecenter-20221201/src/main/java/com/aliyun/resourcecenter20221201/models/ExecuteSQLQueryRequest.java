// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcecenter20221201.models;

import com.aliyun.tea.*;

public class ExecuteSQLQueryRequest extends TeaModel {
    /**
     * <p>The SQL statement to be executed.</p>
     * <p>The number of characters in the SQL statement must be less than 2,000.</p>
     * <p>For more information about the SQL syntax, see <a href="https://help.aliyun.com/document_detail/2539395.html">Basic SQL syntax</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>SELECT * FROM resources LIMIT 100;</p>
     */
    @NameInMap("Expression")
    public String expression;

    /**
     * <p>The search scope.</p>
     * <p>Set this parameter to the ID of a resource group.</p>
     * <p>For information about how to obtain the ID of a resource group, see <a href="https://help.aliyun.com/document_detail/158855.html">ListResourceGroups</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmzawhxxc****</p>
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
