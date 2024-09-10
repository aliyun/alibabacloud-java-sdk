// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DeleteInterceptionRuleRequest extends TeaModel {
    /**
     * <p>The ID of the cluster that you want to query.</p>
     * <blockquote>
     * <p>You can call the <a href="~~DescribeGroupedContainerInstances~~">DescribeGroupedContainerInstances</a> operation to query the IDs of clusters.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cdf629147cc3747d292a3f587xxxxxxxx</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The IDs of the rules that you want to delete.</p>
     */
    @NameInMap("RuleIds")
    public java.util.List<Long> ruleIds;

    public static DeleteInterceptionRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteInterceptionRuleRequest self = new DeleteInterceptionRuleRequest();
        return TeaModel.build(map, self);
    }

    public DeleteInterceptionRuleRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public DeleteInterceptionRuleRequest setRuleIds(java.util.List<Long> ruleIds) {
        this.ruleIds = ruleIds;
        return this;
    }
    public java.util.List<Long> getRuleIds() {
        return this.ruleIds;
    }

}
