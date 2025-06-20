// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcecenter20221201.models;

import com.aliyun.tea.*;

public class ExecuteMultiAccountSQLQueryRequest extends TeaModel {
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
     * <p>The maximum number of entries to return on each page.</p>
     * <p>Valid values: 1 to 1000.</p>
     * <p>Default value: 1000.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results. You do not need to specify this parameter for the first request. You must specify the token that is obtained from the previous query as the value of NextToken.</p>
     * 
     * <strong>example:</strong>
     * <p>eyJzZWFyY2hBZnRlcnMiOlsiMTAwMTU2Nzk4MTU1OSJd****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The search scope. The value of this parameter can be one of the following items:</p>
     * <ul>
     * <li>ID of a resource directory: Resources within the management account and all members of the resource directory are searched.</li>
     * <li>ID of the Root folder: Resources within all members in the Root folder and the subfolders of the Root folder are searched.</li>
     * <li>ID of a folder: Resources within all members in the folder are searched.</li>
     * <li>ID of a member: Resources within the member are searched.</li>
     * <li>ID of a member/ID of a Resource group: Resources within the member in the resource group are searched.</li>
     * </ul>
     * <p>For more information about how to obtain the ID of a resource directory, the Root folder, a folder, a member, or a resource group, see <a href="https://help.aliyun.com/document_detail/159995.html">GetResourceDirectory</a>, <a href="https://help.aliyun.com/document_detail/159997.html">ListFoldersForParent</a>, <a href="https://help.aliyun.com/document_detail/159997.html">ListFoldersForParent</a>, <a href="https://help.aliyun.com/document_detail/160016.html">ListAccounts</a>, or <a href="https://help.aliyun.com/document_detail/158855.html">ListResourceGroups</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rd-r4****</p>
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

    public ExecuteMultiAccountSQLQueryRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ExecuteMultiAccountSQLQueryRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ExecuteMultiAccountSQLQueryRequest setScope(String scope) {
        this.scope = scope;
        return this;
    }
    public String getScope() {
        return this.scope;
    }

}
