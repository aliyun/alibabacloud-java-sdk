// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DeleteSQLRateLimitingRulesRequest extends TeaModel {
    /**
     * <p>The cluster ID. Invocation instructions: append DPI engine type restrictions to the DBClusterId parameter description, specifying that the SQL throttling feature is supported only for PostgreSQL and Oracle DPI engine clusters, and MySQL clusters do not support this feature. Invocation instructions: append cluster status prerequisites to the DBClusterId parameter description, specifying that the cluster must be in the Running state when you invoke this API, and that you can invoke the DescribeDBClusters API and perform a Field-specific search on the DBClusterStatus field to query the current state.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-**************</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The names of the SQL throttling rules to delete. You can specify multiple rule names to delete rules in batches. Separate multiple names with commas (,).</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/212573.html">DescribeSQLRateLimitingRules</a> operation to view the details of all SQL throttling rules in the specified cluster, including the rule names.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>testrule</p>
     */
    @NameInMap("RuleNameList")
    public String ruleNameList;

    public static DeleteSQLRateLimitingRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteSQLRateLimitingRulesRequest self = new DeleteSQLRateLimitingRulesRequest();
        return TeaModel.build(map, self);
    }

    public DeleteSQLRateLimitingRulesRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DeleteSQLRateLimitingRulesRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DeleteSQLRateLimitingRulesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DeleteSQLRateLimitingRulesRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DeleteSQLRateLimitingRulesRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DeleteSQLRateLimitingRulesRequest setRuleNameList(String ruleNameList) {
        this.ruleNameList = ruleNameList;
        return this;
    }
    public String getRuleNameList() {
        return this.ruleNameList;
    }

}
