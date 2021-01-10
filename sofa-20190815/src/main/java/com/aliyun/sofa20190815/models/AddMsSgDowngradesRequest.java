// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class AddMsSgDowngradesRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("DowngradeMethod")
    public String downgradeMethod;

    @NameInMap("DowngradeService")
    public String downgradeService;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Mode")
    public String mode;

    @NameInMap("RuleName")
    public String ruleName;

    @NameInMap("Strategy")
    public String strategy;

    public static AddMsSgDowngradesRequest build(java.util.Map<String, ?> map) throws Exception {
        AddMsSgDowngradesRequest self = new AddMsSgDowngradesRequest();
        return TeaModel.build(map, self);
    }

    public AddMsSgDowngradesRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public AddMsSgDowngradesRequest setDowngradeMethod(String downgradeMethod) {
        this.downgradeMethod = downgradeMethod;
        return this;
    }
    public String getDowngradeMethod() {
        return this.downgradeMethod;
    }

    public AddMsSgDowngradesRequest setDowngradeService(String downgradeService) {
        this.downgradeService = downgradeService;
        return this;
    }
    public String getDowngradeService() {
        return this.downgradeService;
    }

    public AddMsSgDowngradesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public AddMsSgDowngradesRequest setMode(String mode) {
        this.mode = mode;
        return this;
    }
    public String getMode() {
        return this.mode;
    }

    public AddMsSgDowngradesRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public AddMsSgDowngradesRequest setStrategy(String strategy) {
        this.strategy = strategy;
        return this;
    }
    public String getStrategy() {
        return this.strategy;
    }

}
