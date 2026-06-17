// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DeleteMaskingRulesRequest extends TeaModel {
    /**
     * <p>The cluster ID.</p>
     * <blockquote>
     * <p>For more information, see <a href="https://help.aliyun.com/document_detail/98094.html">DescribeDBClusters</a>.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-*****************</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The type of rule to delete. Valid values:</p>
     * <p>v1: deletes data masking rules.
     * v2: deletes data encryption rules.</p>
     * 
     * <strong>example:</strong>
     * <p>v1</p>
     */
    @NameInMap("InterfaceVersion")
    public String interfaceVersion;

    /**
     * <p>The names of the data masking rules to delete. To delete multiple rules in a batch, separate the names with commas (,).</p>
     * <blockquote>
     * <p>For more information, see <a href="https://help.aliyun.com/document_detail/212573.html">DescribeMaskingRules</a>.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>testrule</p>
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

    public DeleteMaskingRulesRequest setInterfaceVersion(String interfaceVersion) {
        this.interfaceVersion = interfaceVersion;
        return this;
    }
    public String getInterfaceVersion() {
        return this.interfaceVersion;
    }

    public DeleteMaskingRulesRequest setRuleNameList(String ruleNameList) {
        this.ruleNameList = ruleNameList;
        return this;
    }
    public String getRuleNameList() {
        return this.ruleNameList;
    }

}
