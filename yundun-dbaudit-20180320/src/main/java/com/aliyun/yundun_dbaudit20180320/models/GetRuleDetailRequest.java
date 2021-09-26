// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class GetRuleDetailRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("RuleId")
    public Integer ruleId;

    @NameInMap("RuleKeyId")
    public Integer ruleKeyId;

    @NameInMap("DbId")
    public Integer dbId;

    public static GetRuleDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        GetRuleDetailRequest self = new GetRuleDetailRequest();
        return TeaModel.build(map, self);
    }

    public GetRuleDetailRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetRuleDetailRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetRuleDetailRequest setRuleId(Integer ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public Integer getRuleId() {
        return this.ruleId;
    }

    public GetRuleDetailRequest setRuleKeyId(Integer ruleKeyId) {
        this.ruleKeyId = ruleKeyId;
        return this;
    }
    public Integer getRuleKeyId() {
        return this.ruleKeyId;
    }

    public GetRuleDetailRequest setDbId(Integer dbId) {
        this.dbId = dbId;
        return this;
    }
    public Integer getDbId() {
        return this.dbId;
    }

}
