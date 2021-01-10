// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateMsSgServiceRateLimitRuleStatusRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("DataId")
    public String dataId;

    @NameInMap("Enable")
    public Boolean enable;

    @NameInMap("Id")
    public Long id;

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

    public static UpdateMsSgServiceRateLimitRuleStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateMsSgServiceRateLimitRuleStatusRequest self = new UpdateMsSgServiceRateLimitRuleStatusRequest();
        return TeaModel.build(map, self);
    }

    public UpdateMsSgServiceRateLimitRuleStatusRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public UpdateMsSgServiceRateLimitRuleStatusRequest setDataId(String dataId) {
        this.dataId = dataId;
        return this;
    }
    public String getDataId() {
        return this.dataId;
    }

    public UpdateMsSgServiceRateLimitRuleStatusRequest setEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }
    public Boolean getEnable() {
        return this.enable;
    }

    public UpdateMsSgServiceRateLimitRuleStatusRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public UpdateMsSgServiceRateLimitRuleStatusRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateMsSgServiceRateLimitRuleStatusRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateMsSgServiceRateLimitRuleStatusRequest setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public UpdateMsSgServiceRateLimitRuleStatusRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public UpdateMsSgServiceRateLimitRuleStatusRequest setRuleConfig(String ruleConfig) {
        this.ruleConfig = ruleConfig;
        return this;
    }
    public String getRuleConfig() {
        return this.ruleConfig;
    }

    public UpdateMsSgServiceRateLimitRuleStatusRequest setRunMode(String runMode) {
        this.runMode = runMode;
        return this;
    }
    public String getRunMode() {
        return this.runMode;
    }

    public UpdateMsSgServiceRateLimitRuleStatusRequest setServiceType(String serviceType) {
        this.serviceType = serviceType;
        return this;
    }
    public String getServiceType() {
        return this.serviceType;
    }

}
