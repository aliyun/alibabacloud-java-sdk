// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class ChangeRulePriorityRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("DbId")
    public String dbId;

    @NameInMap("RuleInfos")
    public String ruleInfos;

    public static ChangeRulePriorityRequest build(java.util.Map<String, ?> map) throws Exception {
        ChangeRulePriorityRequest self = new ChangeRulePriorityRequest();
        return TeaModel.build(map, self);
    }

    public ChangeRulePriorityRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ChangeRulePriorityRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ChangeRulePriorityRequest setDbId(String dbId) {
        this.dbId = dbId;
        return this;
    }
    public String getDbId() {
        return this.dbId;
    }

    public ChangeRulePriorityRequest setRuleInfos(String ruleInfos) {
        this.ruleInfos = ruleInfos;
        return this;
    }
    public String getRuleInfos() {
        return this.ruleInfos;
    }

}
