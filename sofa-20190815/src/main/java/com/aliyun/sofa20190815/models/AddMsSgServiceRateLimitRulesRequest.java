// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class AddMsSgServiceRateLimitRulesRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("DataId")
    public String dataId;

    @NameInMap("Enable")
    public Boolean enable;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Name")
    public String name;

    @NameInMap("Operator")
    public String operator;

    @NameInMap("ResourceType")
    public String resourceType;

    @NameInMap("RuleConfig")
    public String ruleConfig;

    @NameInMap("RunMode")
    public String runMode;

    @NameInMap("ServiceType")
    public String serviceType;

    public static AddMsSgServiceRateLimitRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        AddMsSgServiceRateLimitRulesRequest self = new AddMsSgServiceRateLimitRulesRequest();
        return TeaModel.build(map, self);
    }

    public AddMsSgServiceRateLimitRulesRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public AddMsSgServiceRateLimitRulesRequest setDataId(String dataId) {
        this.dataId = dataId;
        return this;
    }
    public String getDataId() {
        return this.dataId;
    }

    public AddMsSgServiceRateLimitRulesRequest setEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }
    public Boolean getEnable() {
        return this.enable;
    }

    public AddMsSgServiceRateLimitRulesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public AddMsSgServiceRateLimitRulesRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public AddMsSgServiceRateLimitRulesRequest setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public AddMsSgServiceRateLimitRulesRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public AddMsSgServiceRateLimitRulesRequest setRuleConfig(String ruleConfig) {
        this.ruleConfig = ruleConfig;
        return this;
    }
    public String getRuleConfig() {
        return this.ruleConfig;
    }

    public AddMsSgServiceRateLimitRulesRequest setRunMode(String runMode) {
        this.runMode = runMode;
        return this;
    }
    public String getRunMode() {
        return this.runMode;
    }

    public AddMsSgServiceRateLimitRulesRequest setServiceType(String serviceType) {
        this.serviceType = serviceType;
        return this;
    }
    public String getServiceType() {
        return this.serviceType;
    }

}
