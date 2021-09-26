// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class ListAssociatedRulesRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("RuleName")
    public String ruleName;

    @NameInMap("RuleType")
    public String ruleType;

    @NameInMap("RuleDefn")
    public String ruleDefn;

    @NameInMap("DbId")
    public Integer dbId;

    public static ListAssociatedRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAssociatedRulesRequest self = new ListAssociatedRulesRequest();
        return TeaModel.build(map, self);
    }

    public ListAssociatedRulesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListAssociatedRulesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListAssociatedRulesRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public ListAssociatedRulesRequest setRuleType(String ruleType) {
        this.ruleType = ruleType;
        return this;
    }
    public String getRuleType() {
        return this.ruleType;
    }

    public ListAssociatedRulesRequest setRuleDefn(String ruleDefn) {
        this.ruleDefn = ruleDefn;
        return this;
    }
    public String getRuleDefn() {
        return this.ruleDefn;
    }

    public ListAssociatedRulesRequest setDbId(Integer dbId) {
        this.dbId = dbId;
        return this;
    }
    public Integer getDbId() {
        return this.dbId;
    }

}
