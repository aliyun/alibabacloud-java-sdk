// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcecenter20221201.models;

import com.aliyun.tea.*;

public class ExecuteMultiAccountSQLQueryRequest extends TeaModel {
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
     * <p>The search scope. The value of this parameter can be one of the following items:</p>
     * <br>
     * <p>*   ID of a resource directory: Resources within the management account and all members of the resource directory are searched.</p>
     * <p>*   ID of the Root folder: Resources within all members in the Root folder and the subfolders of the Root folder are searched.</p>
     * <p>*   ID of a folder: Resources within all members in the folder are searched.</p>
     * <p>*   ID of a member: Resources within the member are searched.</p>
     * <p>*   ID of a member/ID of a Resource group: Resources within the member in the resource group are searched.</p>
     * <br>
     * <p>For more information about how to obtain the ID of a resource directory, the Root folder, a folder, a member, or a resource group, see [GetResourceDirectory](~~159995~~), [ListFoldersForParent](~~159997~~), [ListFoldersForParent](~~159997~~), [ListAccounts](~~160016~~), or [ListResourceGroups](~~158855~~).</p>
     */
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
