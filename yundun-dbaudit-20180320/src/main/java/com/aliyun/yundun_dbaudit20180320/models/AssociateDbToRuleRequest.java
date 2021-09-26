// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class AssociateDbToRuleRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("RuleIds")
    public String ruleIds;

    @NameInMap("RuleDbRelations")
    public String ruleDbRelations;

    @NameInMap("OperType")
    public String operType;

    public static AssociateDbToRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        AssociateDbToRuleRequest self = new AssociateDbToRuleRequest();
        return TeaModel.build(map, self);
    }

    public AssociateDbToRuleRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public AssociateDbToRuleRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public AssociateDbToRuleRequest setRuleIds(String ruleIds) {
        this.ruleIds = ruleIds;
        return this;
    }
    public String getRuleIds() {
        return this.ruleIds;
    }

    public AssociateDbToRuleRequest setRuleDbRelations(String ruleDbRelations) {
        this.ruleDbRelations = ruleDbRelations;
        return this;
    }
    public String getRuleDbRelations() {
        return this.ruleDbRelations;
    }

    public AssociateDbToRuleRequest setOperType(String operType) {
        this.operType = operType;
        return this;
    }
    public String getOperType() {
        return this.operType;
    }

}
