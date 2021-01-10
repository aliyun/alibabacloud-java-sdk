// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class AddMsSgCircuitBreakerRuleRequest extends TeaModel {
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

    @NameInMap("ServiceType")
    public String serviceType;

    @NameInMap("TrafficType")
    public String trafficType;

    public static AddMsSgCircuitBreakerRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        AddMsSgCircuitBreakerRuleRequest self = new AddMsSgCircuitBreakerRuleRequest();
        return TeaModel.build(map, self);
    }

    public AddMsSgCircuitBreakerRuleRequest setAppNames(String appNames) {
        this.appNames = appNames;
        return this;
    }
    public String getAppNames() {
        return this.appNames;
    }

    public AddMsSgCircuitBreakerRuleRequest setCircuitBreakerRuleItems(String circuitBreakerRuleItems) {
        this.circuitBreakerRuleItems = circuitBreakerRuleItems;
        return this;
    }
    public String getCircuitBreakerRuleItems() {
        return this.circuitBreakerRuleItems;
    }

    public AddMsSgCircuitBreakerRuleRequest setConditions(String conditions) {
        this.conditions = conditions;
        return this;
    }
    public String getConditions() {
        return this.conditions;
    }

    public AddMsSgCircuitBreakerRuleRequest setConfig(String config) {
        this.config = config;
        return this;
    }
    public String getConfig() {
        return this.config;
    }

    public AddMsSgCircuitBreakerRuleRequest setDataId(String dataId) {
        this.dataId = dataId;
        return this;
    }
    public String getDataId() {
        return this.dataId;
    }

    public AddMsSgCircuitBreakerRuleRequest setHttpMethod(String httpMethod) {
        this.httpMethod = httpMethod;
        return this;
    }
    public String getHttpMethod() {
        return this.httpMethod;
    }

    public AddMsSgCircuitBreakerRuleRequest setHttpPath(String httpPath) {
        this.httpPath = httpPath;
        return this;
    }
    public String getHttpPath() {
        return this.httpPath;
    }

    public AddMsSgCircuitBreakerRuleRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public AddMsSgCircuitBreakerRuleRequest setMethodName(String methodName) {
        this.methodName = methodName;
        return this;
    }
    public String getMethodName() {
        return this.methodName;
    }

    public AddMsSgCircuitBreakerRuleRequest setMode(String mode) {
        this.mode = mode;
        return this;
    }
    public String getMode() {
        return this.mode;
    }

    public AddMsSgCircuitBreakerRuleRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public AddMsSgCircuitBreakerRuleRequest setResource(String resource) {
        this.resource = resource;
        return this;
    }
    public String getResource() {
        return this.resource;
    }

    public AddMsSgCircuitBreakerRuleRequest setResType(String resType) {
        this.resType = resType;
        return this;
    }
    public String getResType() {
        return this.resType;
    }

    public AddMsSgCircuitBreakerRuleRequest setServiceType(String serviceType) {
        this.serviceType = serviceType;
        return this;
    }
    public String getServiceType() {
        return this.serviceType;
    }

    public AddMsSgCircuitBreakerRuleRequest setTrafficType(String trafficType) {
        this.trafficType = trafficType;
        return this;
    }
    public String getTrafficType() {
        return this.trafficType;
    }

}
