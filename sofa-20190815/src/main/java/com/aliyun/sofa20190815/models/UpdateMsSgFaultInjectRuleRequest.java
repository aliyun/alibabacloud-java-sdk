// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateMsSgFaultInjectRuleRequest extends TeaModel {
    @NameInMap("Id")
    public Long id;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("RuleConfig")
    public String ruleConfig;

    @NameInMap("RuleName")
    public String ruleName;

    @NameInMap("DataId")
    public String dataId;

    @NameInMap("AppName")
    public String appName;

    public static UpdateMsSgFaultInjectRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateMsSgFaultInjectRuleRequest self = new UpdateMsSgFaultInjectRuleRequest();
        return TeaModel.build(map, self);
    }

    public UpdateMsSgFaultInjectRuleRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public UpdateMsSgFaultInjectRuleRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateMsSgFaultInjectRuleRequest setRuleConfig(String ruleConfig) {
        this.ruleConfig = ruleConfig;
        return this;
    }
    public String getRuleConfig() {
        return this.ruleConfig;
    }

    public UpdateMsSgFaultInjectRuleRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public UpdateMsSgFaultInjectRuleRequest setDataId(String dataId) {
        this.dataId = dataId;
        return this;
    }
    public String getDataId() {
        return this.dataId;
    }

    public UpdateMsSgFaultInjectRuleRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

}
