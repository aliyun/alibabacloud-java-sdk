// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DisableMsSgAuthRulesRequest extends TeaModel {
    @NameInMap("AuthGroupId")
    public Long authGroupId;

    @NameInMap("DataId")
    public String dataId;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("RuleId")
    public Long ruleId;

    public static DisableMsSgAuthRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        DisableMsSgAuthRulesRequest self = new DisableMsSgAuthRulesRequest();
        return TeaModel.build(map, self);
    }

    public DisableMsSgAuthRulesRequest setAuthGroupId(Long authGroupId) {
        this.authGroupId = authGroupId;
        return this;
    }
    public Long getAuthGroupId() {
        return this.authGroupId;
    }

    public DisableMsSgAuthRulesRequest setDataId(String dataId) {
        this.dataId = dataId;
        return this;
    }
    public String getDataId() {
        return this.dataId;
    }

    public DisableMsSgAuthRulesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DisableMsSgAuthRulesRequest setRuleId(Long ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public Long getRuleId() {
        return this.ruleId;
    }

}
