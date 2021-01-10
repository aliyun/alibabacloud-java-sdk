// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateMsSgCircuitBreakerRuleRequest extends TeaModel {
    @NameInMap("AppNames")
    public String appNames;

    @NameInMap("CircuitBreakerRuleItems")
    public String circuitBreakerRuleItems;

    @NameInMap("Conditions")
    public String conditions;

    @NameInMap("Config")
    public String config;

    @NameInMap("DataId")
    public String dataId;

    @NameInMap("HttpMethod")
    public String httpMethod;

    @NameInMap("HttpPath")
    public String httpPath;

    @NameInMap("Id")
    public Long id;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("MethodName")
    public String methodName;

    @NameInMap("Mode")
    public String mode;

    @NameInMap("Name")
    public String name;

    @NameInMap("Resource")
    public String resource;

    @NameInMap("ResType")
    public String resType;

    @NameInMap("TrafficType")
    public String trafficType;

    public static UpdateMsSgCircuitBreakerRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateMsSgCircuitBreakerRuleRequest self = new UpdateMsSgCircuitBreakerRuleRequest();
        return TeaModel.build(map, self);
    }

    public UpdateMsSgCircuitBreakerRuleRequest setAppNames(String appNames) {
        this.appNames = appNames;
        return this;
    }
    public String getAppNames() {
        return this.appNames;
    }

    public UpdateMsSgCircuitBreakerRuleRequest setCircuitBreakerRuleItems(String circuitBreakerRuleItems) {
        this.circuitBreakerRuleItems = circuitBreakerRuleItems;
        return this;
    }
    public String getCircuitBreakerRuleItems() {
        return this.circuitBreakerRuleItems;
    }

    public UpdateMsSgCircuitBreakerRuleRequest setConditions(String conditions) {
        this.conditions = conditions;
        return this;
    }
    public String getConditions() {
        return this.conditions;
    }

    public UpdateMsSgCircuitBreakerRuleRequest setConfig(String config) {
        this.config = config;
        return this;
    }
    public String getConfig() {
        return this.config;
    }

    public UpdateMsSgCircuitBreakerRuleRequest setDataId(String dataId) {
        this.dataId = dataId;
        return this;
    }
    public String getDataId() {
        return this.dataId;
    }

    public UpdateMsSgCircuitBreakerRuleRequest setHttpMethod(String httpMethod) {
        this.httpMethod = httpMethod;
        return this;
    }
    public String getHttpMethod() {
        return this.httpMethod;
    }

    public UpdateMsSgCircuitBreakerRuleRequest setHttpPath(String httpPath) {
        this.httpPath = httpPath;
        return this;
    }
    public String getHttpPath() {
        return this.httpPath;
    }

    public UpdateMsSgCircuitBreakerRuleRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public UpdateMsSgCircuitBreakerRuleRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateMsSgCircuitBreakerRuleRequest setMethodName(String methodName) {
        this.methodName = methodName;
        return this;
    }
    public String getMethodName() {
        return this.methodName;
    }

    public UpdateMsSgCircuitBreakerRuleRequest setMode(String mode) {
        this.mode = mode;
        return this;
    }
    public String getMode() {
        return this.mode;
    }

    public UpdateMsSgCircuitBreakerRuleRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateMsSgCircuitBreakerRuleRequest setResource(String resource) {
        this.resource = resource;
        return this;
    }
    public String getResource() {
        return this.resource;
    }

    public UpdateMsSgCircuitBreakerRuleRequest setResType(String resType) {
        this.resType = resType;
        return this;
    }
    public String getResType() {
        return this.resType;
    }

    public UpdateMsSgCircuitBreakerRuleRequest setTrafficType(String trafficType) {
        this.trafficType = trafficType;
        return this;
    }
    public String getTrafficType() {
        return this.trafficType;
    }

}
