// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateMsSgAuthRulesRequest extends TeaModel {
    @NameInMap("AuthGroupId")
    public Long authGroupId;

    @NameInMap("AuthRule")
    public String authRule;

    @NameInMap("DataId")
    public String dataId;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("RuleId")
    public Long ruleId;

    public static UpdateMsSgAuthRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateMsSgAuthRulesRequest self = new UpdateMsSgAuthRulesRequest();
        return TeaModel.build(map, self);
    }

    public UpdateMsSgAuthRulesRequest setAuthGroupId(Long authGroupId) {
        this.authGroupId = authGroupId;
        return this;
    }
    public Long getAuthGroupId() {
        return this.authGroupId;
    }

    public UpdateMsSgAuthRulesRequest setAuthRule(String authRule) {
        this.authRule = authRule;
        return this;
    }
    public String getAuthRule() {
        return this.authRule;
    }

    public UpdateMsSgAuthRulesRequest setDataId(String dataId) {
        this.dataId = dataId;
        return this;
    }
    public String getDataId() {
        return this.dataId;
    }

    public UpdateMsSgAuthRulesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateMsSgAuthRulesRequest setRuleId(Long ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public Long getRuleId() {
        return this.ruleId;
    }

}
