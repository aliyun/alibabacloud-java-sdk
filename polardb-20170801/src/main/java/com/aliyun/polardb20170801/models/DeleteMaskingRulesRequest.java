// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DeleteMaskingRulesRequest extends TeaModel {
    /**
     * <p>The ID of the cluster.</p>
     * <br>
     * <p>> You can call the [DescribeDBClusters](https://help.aliyun.com/document_detail/98094.html) operation to query the details of the clusters that belong to your Alibaba Cloud account, such as cluster IDs.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The name of the masking rule. You can specify multiple masking rules at a time. Separate the masking rules with commas (,).</p>
     * <br>
     * <p>> You can call the [DescribeMaskingRules](https://help.aliyun.com/document_detail/212573.html) operation to query details of all the masking rules for a specified cluster, such as the names of the masking rules.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RuleNameList")
    public String ruleNameList;

    public static DeleteMaskingRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteMaskingRulesRequest self = new DeleteMaskingRulesRequest();
        return TeaModel.build(map, self);
    }

    public DeleteMaskingRulesRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DeleteMaskingRulesRequest setRuleNameList(String ruleNameList) {
        this.ruleNameList = ruleNameList;
        return this;
    }
    public String getRuleNameList() {
        return this.ruleNameList;
    }

}
