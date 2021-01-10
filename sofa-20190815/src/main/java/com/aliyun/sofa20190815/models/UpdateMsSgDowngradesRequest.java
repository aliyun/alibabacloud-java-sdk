// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateMsSgDowngradesRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("DowngradeMethod")
    public String downgradeMethod;

    @NameInMap("DowngradeService")
    public String downgradeService;

    @NameInMap("GroupId")
    public Long groupId;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Mode")
    public String mode;

    @NameInMap("RuleId")
    public Long ruleId;

    @NameInMap("RuleName")
    public String ruleName;

    @NameInMap("Strategy")
    public String strategy;

    public static UpdateMsSgDowngradesRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateMsSgDowngradesRequest self = new UpdateMsSgDowngradesRequest();
        return TeaModel.build(map, self);
    }

    public UpdateMsSgDowngradesRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public UpdateMsSgDowngradesRequest setDowngradeMethod(String downgradeMethod) {
        this.downgradeMethod = downgradeMethod;
        return this;
    }
    public String getDowngradeMethod() {
        return this.downgradeMethod;
    }

    public UpdateMsSgDowngradesRequest setDowngradeService(String downgradeService) {
        this.downgradeService = downgradeService;
        return this;
    }
    public String getDowngradeService() {
        return this.downgradeService;
    }

    public UpdateMsSgDowngradesRequest setGroupId(Long groupId) {
        this.groupId = groupId;
        return this;
    }
    public Long getGroupId() {
        return this.groupId;
    }

    public UpdateMsSgDowngradesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateMsSgDowngradesRequest setMode(String mode) {
        this.mode = mode;
        return this;
    }
    public String getMode() {
        return this.mode;
    }

    public UpdateMsSgDowngradesRequest setRuleId(Long ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public Long getRuleId() {
        return this.ruleId;
    }

    public UpdateMsSgDowngradesRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public UpdateMsSgDowngradesRequest setStrategy(String strategy) {
        this.strategy = strategy;
        return this;
    }
    public String getStrategy() {
        return this.strategy;
    }

}
