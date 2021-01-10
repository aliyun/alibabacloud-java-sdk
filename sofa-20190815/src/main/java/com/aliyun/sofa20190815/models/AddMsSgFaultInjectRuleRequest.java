// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class AddMsSgFaultInjectRuleRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("DataId")
    public String dataId;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("RuleConfig")
    public String ruleConfig;

    @NameInMap("RuleName")
    public String ruleName;

    @NameInMap("ServiceType")
    public String serviceType;

    public static AddMsSgFaultInjectRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        AddMsSgFaultInjectRuleRequest self = new AddMsSgFaultInjectRuleRequest();
        return TeaModel.build(map, self);
    }

    public AddMsSgFaultInjectRuleRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public AddMsSgFaultInjectRuleRequest setDataId(String dataId) {
        this.dataId = dataId;
        return this;
    }
    public String getDataId() {
        return this.dataId;
    }

    public AddMsSgFaultInjectRuleRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public AddMsSgFaultInjectRuleRequest setRuleConfig(String ruleConfig) {
        this.ruleConfig = ruleConfig;
        return this;
    }
    public String getRuleConfig() {
        return this.ruleConfig;
    }

    public AddMsSgFaultInjectRuleRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public AddMsSgFaultInjectRuleRequest setServiceType(String serviceType) {
        this.serviceType = serviceType;
        return this;
    }
    public String getServiceType() {
        return this.serviceType;
    }

}
