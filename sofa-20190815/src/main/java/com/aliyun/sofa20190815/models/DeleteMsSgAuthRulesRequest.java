// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteMsSgAuthRulesRequest extends TeaModel {
    @NameInMap("AuthGroupId")
    public Long authGroupId;

    @NameInMap("DataId")
    public String dataId;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("RuleId")
    public Long ruleId;

    public static DeleteMsSgAuthRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteMsSgAuthRulesRequest self = new DeleteMsSgAuthRulesRequest();
        return TeaModel.build(map, self);
    }

    public DeleteMsSgAuthRulesRequest setAuthGroupId(Long authGroupId) {
        this.authGroupId = authGroupId;
        return this;
    }
    public Long getAuthGroupId() {
        return this.authGroupId;
    }

    public DeleteMsSgAuthRulesRequest setDataId(String dataId) {
        this.dataId = dataId;
        return this;
    }
    public String getDataId() {
        return this.dataId;
    }

    public DeleteMsSgAuthRulesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DeleteMsSgAuthRulesRequest setRuleId(Long ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public Long getRuleId() {
        return this.ruleId;
    }

}
