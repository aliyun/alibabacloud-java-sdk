// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetMsSgCircuitBreakerRuleResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("CurrentPage")
    public Long currentPage;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("StartIndex")
    public Long startIndex;

    @NameInMap("TotalSize")
    public Long totalSize;

    @NameInMap("RuleModels")
    public java.util.List<GetMsSgCircuitBreakerRuleResponseBodyRuleModels> ruleModels;

    public static GetMsSgCircuitBreakerRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMsSgCircuitBreakerRuleResponseBody self = new GetMsSgCircuitBreakerRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMsSgCircuitBreakerRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetMsSgCircuitBreakerRuleResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetMsSgCircuitBreakerRuleResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public GetMsSgCircuitBreakerRuleResponseBody setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public GetMsSgCircuitBreakerRuleResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public GetMsSgCircuitBreakerRuleResponseBody setStartIndex(Long startIndex) {
        this.startIndex = startIndex;
        return this;
    }
    public Long getStartIndex() {
        return this.startIndex;
    }

    public GetMsSgCircuitBreakerRuleResponseBody setTotalSize(Long totalSize) {
        this.totalSize = totalSize;
        return this;
    }
    public Long getTotalSize() {
        return this.totalSize;
    }

    public GetMsSgCircuitBreakerRuleResponseBody setRuleModels(java.util.List<GetMsSgCircuitBreakerRuleResponseBodyRuleModels> ruleModels) {
        this.ruleModels = ruleModels;
        return this;
    }
    public java.util.List<GetMsSgCircuitBreakerRuleResponseBodyRuleModels> getRuleModels() {
        return this.ruleModels;
    }

    public static class GetMsSgCircuitBreakerRuleResponseBodyRuleModelsCircuitBreakerRuleItemsTrafficConditions extends TeaModel {
        @NameInMap("Field")
        public String field;

        @NameInMap("Operation")
        public String operation;

        @NameInMap("Type")
        public String type;

        @NameInMap("Value")
        public java.util.List<String> value;

        public static GetMsSgCircuitBreakerRuleResponseBodyRuleModelsCircuitBreakerRuleItemsTrafficConditions build(java.util.Map<String, ?> map) throws Exception {
            GetMsSgCircuitBreakerRuleResponseBodyRuleModelsCircuitBreakerRuleItemsTrafficConditions self = new GetMsSgCircuitBreakerRuleResponseBodyRuleModelsCircuitBreakerRuleItemsTrafficConditions();
            return TeaModel.build(map, self);
        }

        public GetMsSgCircuitBreakerRuleResponseBodyRuleModelsCircuitBreakerRuleItemsTrafficConditions setField(String field) {
            this.field = field;
            return this;
        }
        public String getField() {
            return this.field;
        }

        public GetMsSgCircuitBreakerRuleResponseBodyRuleModelsCircuitBreakerRuleItemsTrafficConditions setOperation(String operation) {
            this.operation = operation;
            return this;
        }
        public String getOperation() {
            return this.operation;
        }

        public GetMsSgCircuitBreakerRuleResponseBodyRuleModelsCircuitBreakerRuleItemsTrafficConditions setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetMsSgCircuitBreakerRuleResponseBodyRuleModelsCircuitBreakerRuleItemsTrafficConditions setValue(java.util.List<String> value) {
            this.value = value;
            return this;
        }
        public java.util.List<String> getValue() {
            return this.value;
        }

    }

    public static class GetMsSgCircuitBreakerRuleResponseBodyRuleModelsCircuitBreakerRuleItemsAction extends TeaModel {
        @NameInMap("Enabled")
        public Boolean enabled;

        @NameInMap("Extension")
        public String extension;

        @NameInMap("Type")
        public String type;

        public static GetMsSgCircuitBreakerRuleResponseBodyRuleModelsCircuitBreakerRuleItemsAction build(java.util.Map<String, ?> map) throws Exception {
            GetMsSgCircuitBreakerRuleResponseBodyRuleModelsCircuitBreakerRuleItemsAction self = new GetMsSgCircuitBreakerRuleResponseBodyRuleModelsCircuitBreakerRuleItemsAction();
            return TeaModel.build(map, self);
        }

        public GetMsSgCircuitBreakerRuleResponseBodyRuleModelsCircuitBreakerRuleItemsAction setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public GetMsSgCircuitBreakerRuleResponseBodyRuleModelsCircuitBreakerRuleItemsAction setExtension(String extension) {
            this.extension = extension;
            return this;
        }
        public String getExtension() {
            return this.extension;
        }

        public GetMsSgCircuitBreakerRuleResponseBodyRuleModelsCircuitBreakerRuleItemsAction setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetMsSgCircuitBreakerRuleResponseBodyRuleModelsCircuitBreakerRuleItemsConfigs extends TeaModel {
        @NameInMap("AverageRtThreshold")
        public Long averageRtThreshold;

        @NameInMap("ErrorPercentThreshold")
        public Long errorPercentThreshold;

        @NameInMap("ProviderTimeout")
        public Long providerTimeout;

        @NameInMap("RequestVolumeThreshold")
        public Long requestVolumeThreshold;

        @NameInMap("RpcTimeout")
        public Long rpcTimeout;

        @NameInMap("SleepWindow")
        public Long sleepWindow;

        @NameInMap("TotalMetricWindow")
        public Long totalMetricWindow;

        public static GetMsSgCircuitBreakerRuleResponseBodyRuleModelsCircuitBreakerRuleItemsConfigs build(java.util.Map<String, ?> map) throws Exception {
            GetMsSgCircuitBreakerRuleResponseBodyRuleModelsCircuitBreakerRuleItemsConfigs self = new GetMsSgCircuitBreakerRuleResponseBodyRuleModelsCircuitBreakerRuleItemsConfigs();
            return TeaModel.build(map, self);
        }

        public GetMsSgCircuitBreakerRuleResponseBodyRuleModelsCircuitBreakerRuleItemsConfigs setAverageRtThreshold(Long averageRtThreshold) {
            this.averageRtThreshold = averageRtThreshold;
            return this;
        }
        public Long getAverageRtThreshold() {
            return this.averageRtThreshold;
        }

        public GetMsSgCircuitBreakerRuleResponseBodyRuleModelsCircuitBreakerRuleItemsConfigs setErrorPercentThreshold(Long errorPercentThreshold) {
            this.errorPercentThreshold = errorPercentThreshold;
            return this;
        }
        public Long getErrorPercentThreshold() {
            return this.errorPercentThreshold;
        }

        public GetMsSgCircuitBreakerRuleResponseBodyRuleModelsCircuitBreakerRuleItemsConfigs setProviderTimeout(Long providerTimeout) {
            this.providerTimeout = providerTimeout;
            return this;
        }
        public Long getProviderTimeout() {
            return this.providerTimeout;
        }

        public GetMsSgCircuitBreakerRuleResponseBodyRuleModelsCircuitBreakerRuleItemsConfigs setRequestVolumeThreshold(Long requestVolumeThreshold) {
            this.requestVolumeThreshold = requestVolumeThreshold;
            return this;
        }
        public Long getRequestVolumeThreshold() {
            return this.requestVolumeThreshold;
        }

        public GetMsSgCircuitBreakerRuleResponseBodyRuleModelsCircuitBreakerRuleItemsConfigs setRpcTimeout(Long rpcTimeout) {
            this.rpcTimeout = rpcTimeout;
            return this;
        }
        public Long getRpcTimeout() {
            return this.rpcTimeout;
        }

        public GetMsSgCircuitBreakerRuleResponseBodyRuleModelsCircuitBreakerRuleItemsConfigs setSleepWindow(Long sleepWindow) {
            this.sleepWindow = sleepWindow;
            return this;
        }
        public Long getSleepWindow() {
            return this.sleepWindow;
        }

        public GetMsSgCircuitBreakerRuleResponseBodyRuleModelsCircuitBreakerRuleItemsConfigs setTotalMetricWindow(Long totalMetricWindow) {
            this.totalMetricWindow = totalMetricWindow;
            return this;
        }
        public Long getTotalMetricWindow() {
            return this.totalMetricWindow;
        }

    }

    public static class GetMsSgCircuitBreakerRuleResponseBodyRuleModelsCircuitBreakerRuleItems extends TeaModel {
        @NameInMap("RuleType")
        public String ruleType;

        @NameInMap("TrafficConditions")
        public java.util.List<GetMsSgCircuitBreakerRuleResponseBodyRuleModelsCircuitBreakerRuleItemsTrafficConditions> trafficConditions;

        @NameInMap("Action")
        public GetMsSgCircuitBreakerRuleResponseBodyRuleModelsCircuitBreakerRuleItemsAction action;

        @NameInMap("Configs")
        public GetMsSgCircuitBreakerRuleResponseBodyRuleModelsCircuitBreakerRuleItemsConfigs configs;

        public static GetMsSgCircuitBreakerRuleResponseBodyRuleModelsCircuitBreakerRuleItems build(java.util.Map<String, ?> map) throws Exception {
            GetMsSgCircuitBreakerRuleResponseBodyRuleModelsCircuitBreakerRuleItems self = new GetMsSgCircuitBreakerRuleResponseBodyRuleModelsCircuitBreakerRuleItems();
            return TeaModel.build(map, self);
        }

        public GetMsSgCircuitBreakerRuleResponseBodyRuleModelsCircuitBreakerRuleItems setRuleType(String ruleType) {
            this.ruleType = ruleType;
            return this;
        }
        public String getRuleType() {
            return this.ruleType;
        }

        public GetMsSgCircuitBreakerRuleResponseBodyRuleModelsCircuitBreakerRuleItems setTrafficConditions(java.util.List<GetMsSgCircuitBreakerRuleResponseBodyRuleModelsCircuitBreakerRuleItemsTrafficConditions> trafficConditions) {
            this.trafficConditions = trafficConditions;
            return this;
        }
        public java.util.List<GetMsSgCircuitBreakerRuleResponseBodyRuleModelsCircuitBreakerRuleItemsTrafficConditions> getTrafficConditions() {
            return this.trafficConditions;
        }

        public GetMsSgCircuitBreakerRuleResponseBodyRuleModelsCircuitBreakerRuleItems setAction(GetMsSgCircuitBreakerRuleResponseBodyRuleModelsCircuitBreakerRuleItemsAction action) {
            this.action = action;
            return this;
        }
        public GetMsSgCircuitBreakerRuleResponseBodyRuleModelsCircuitBreakerRuleItemsAction getAction() {
            return this.action;
        }

        public GetMsSgCircuitBreakerRuleResponseBodyRuleModelsCircuitBreakerRuleItems setConfigs(GetMsSgCircuitBreakerRuleResponseBodyRuleModelsCircuitBreakerRuleItemsConfigs configs) {
            this.configs = configs;
            return this;
        }
        public GetMsSgCircuitBreakerRuleResponseBodyRuleModelsCircuitBreakerRuleItemsConfigs getConfigs() {
            return this.configs;
        }

    }

    public static class GetMsSgCircuitBreakerRuleResponseBodyRuleModelsConditions extends TeaModel {
        @NameInMap("Field")
        public String field;

        @NameInMap("Operation")
        public String operation;

        @NameInMap("Type")
        public String type;

        @NameInMap("Value")
        public java.util.List<String> value;

        public static GetMsSgCircuitBreakerRuleResponseBodyRuleModelsConditions build(java.util.Map<String, ?> map) throws Exception {
            GetMsSgCircuitBreakerRuleResponseBodyRuleModelsConditions self = new GetMsSgCircuitBreakerRuleResponseBodyRuleModelsConditions();
            return TeaModel.build(map, self);
        }

        public GetMsSgCircuitBreakerRuleResponseBodyRuleModelsConditions setField(String field) {
            this.field = field;
            return this;
        }
        public String getField() {
            return this.field;
        }

        public GetMsSgCircuitBreakerRuleResponseBodyRuleModelsConditions setOperation(String operation) {
            this.operation = operation;
            return this;
        }
        public String getOperation() {
            return this.operation;
        }

        public GetMsSgCircuitBreakerRuleResponseBodyRuleModelsConditions setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetMsSgCircuitBreakerRuleResponseBodyRuleModelsConditions setValue(java.util.List<String> value) {
            this.value = value;
            return this;
        }
        public java.util.List<String> getValue() {
            return this.value;
        }

    }

    public static class GetMsSgCircuitBreakerRuleResponseBodyRuleModelsConfig extends TeaModel {
        @NameInMap("AverageRtThreshold")
        public Long averageRtThreshold;

        @NameInMap("ErrorPercentThreshold")
        public Long errorPercentThreshold;

        @NameInMap("ProviderTimeout")
        public Long providerTimeout;

        @NameInMap("RequestVolumeThreshold")
        public Long requestVolumeThreshold;

        @NameInMap("RpcTimeout")
        public Long rpcTimeout;

        @NameInMap("SleepWindow")
        public Long sleepWindow;

        @NameInMap("TotalMetricWindow")
        public Long totalMetricWindow;

        public static GetMsSgCircuitBreakerRuleResponseBodyRuleModelsConfig build(java.util.Map<String, ?> map) throws Exception {
            GetMsSgCircuitBreakerRuleResponseBodyRuleModelsConfig self = new GetMsSgCircuitBreakerRuleResponseBodyRuleModelsConfig();
            return TeaModel.build(map, self);
        }

        public GetMsSgCircuitBreakerRuleResponseBodyRuleModelsConfig setAverageRtThreshold(Long averageRtThreshold) {
            this.averageRtThreshold = averageRtThreshold;
            return this;
        }
        public Long getAverageRtThreshold() {
            return this.averageRtThreshold;
        }

        public GetMsSgCircuitBreakerRuleResponseBodyRuleModelsConfig setErrorPercentThreshold(Long errorPercentThreshold) {
            this.errorPercentThreshold = errorPercentThreshold;
            return this;
        }
        public Long getErrorPercentThreshold() {
            return this.errorPercentThreshold;
        }

        public GetMsSgCircuitBreakerRuleResponseBodyRuleModelsConfig setProviderTimeout(Long providerTimeout) {
            this.providerTimeout = providerTimeout;
            return this;
        }
        public Long getProviderTimeout() {
            return this.providerTimeout;
        }

        public GetMsSgCircuitBreakerRuleResponseBodyRuleModelsConfig setRequestVolumeThreshold(Long requestVolumeThreshold) {
            this.requestVolumeThreshold = requestVolumeThreshold;
            return this;
        }
        public Long getRequestVolumeThreshold() {
            return this.requestVolumeThreshold;
        }

        public GetMsSgCircuitBreakerRuleResponseBodyRuleModelsConfig setRpcTimeout(Long rpcTimeout) {
            this.rpcTimeout = rpcTimeout;
            return this;
        }
        public Long getRpcTimeout() {
            return this.rpcTimeout;
        }

        public GetMsSgCircuitBreakerRuleResponseBodyRuleModelsConfig setSleepWindow(Long sleepWindow) {
            this.sleepWindow = sleepWindow;
            return this;
        }
        public Long getSleepWindow() {
            return this.sleepWindow;
        }

        public GetMsSgCircuitBreakerRuleResponseBodyRuleModelsConfig setTotalMetricWindow(Long totalMetricWindow) {
            this.totalMetricWindow = totalMetricWindow;
            return this;
        }
        public Long getTotalMetricWindow() {
            return this.totalMetricWindow;
        }

    }

    public static class GetMsSgCircuitBreakerRuleResponseBodyRuleModels extends TeaModel {
        @NameInMap("DataId")
        public String dataId;

        @NameInMap("GmtModified")
        public Long gmtModified;

        @NameInMap("HttpMethod")
        public String httpMethod;

        @NameInMap("HttpPath")
        public String httpPath;

        @NameInMap("Id")
        public String id;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("MethodName")
        public String methodName;

        @NameInMap("Mode")
        public String mode;

        @NameInMap("Name")
        public String name;

        @NameInMap("Operator")
        public String operator;

        @NameInMap("Resource")
        public String resource;

        @NameInMap("ResType")
        public String resType;

        @NameInMap("ServiceType")
        public String serviceType;

        @NameInMap("Status")
        public Long status;

        @NameInMap("TrafficType")
        public String trafficType;

        @NameInMap("AppNames")
        public java.util.List<String> appNames;

        @NameInMap("CircuitBreakerRuleItems")
        public java.util.List<GetMsSgCircuitBreakerRuleResponseBodyRuleModelsCircuitBreakerRuleItems> circuitBreakerRuleItems;

        @NameInMap("Conditions")
        public java.util.List<GetMsSgCircuitBreakerRuleResponseBodyRuleModelsConditions> conditions;

        @NameInMap("Config")
        public GetMsSgCircuitBreakerRuleResponseBodyRuleModelsConfig config;

        public static GetMsSgCircuitBreakerRuleResponseBodyRuleModels build(java.util.Map<String, ?> map) throws Exception {
            GetMsSgCircuitBreakerRuleResponseBodyRuleModels self = new GetMsSgCircuitBreakerRuleResponseBodyRuleModels();
            return TeaModel.build(map, self);
        }

        public GetMsSgCircuitBreakerRuleResponseBodyRuleModels setDataId(String dataId) {
            this.dataId = dataId;
            return this;
        }
        public String getDataId() {
            return this.dataId;
        }

        public GetMsSgCircuitBreakerRuleResponseBodyRuleModels setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public GetMsSgCircuitBreakerRuleResponseBodyRuleModels setHttpMethod(String httpMethod) {
            this.httpMethod = httpMethod;
            return this;
        }
        public String getHttpMethod() {
            return this.httpMethod;
        }

        public GetMsSgCircuitBreakerRuleResponseBodyRuleModels setHttpPath(String httpPath) {
            this.httpPath = httpPath;
            return this;
        }
        public String getHttpPath() {
            return this.httpPath;
        }

        public GetMsSgCircuitBreakerRuleResponseBodyRuleModels setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetMsSgCircuitBreakerRuleResponseBodyRuleModels setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetMsSgCircuitBreakerRuleResponseBodyRuleModels setMethodName(String methodName) {
            this.methodName = methodName;
            return this;
        }
        public String getMethodName() {
            return this.methodName;
        }

        public GetMsSgCircuitBreakerRuleResponseBodyRuleModels setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

        public GetMsSgCircuitBreakerRuleResponseBodyRuleModels setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetMsSgCircuitBreakerRuleResponseBodyRuleModels setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public GetMsSgCircuitBreakerRuleResponseBodyRuleModels setResource(String resource) {
            this.resource = resource;
            return this;
        }
        public String getResource() {
            return this.resource;
        }

        public GetMsSgCircuitBreakerRuleResponseBodyRuleModels setResType(String resType) {
            this.resType = resType;
            return this;
        }
        public String getResType() {
            return this.resType;
        }

        public GetMsSgCircuitBreakerRuleResponseBodyRuleModels setServiceType(String serviceType) {
            this.serviceType = serviceType;
            return this;
        }
        public String getServiceType() {
            return this.serviceType;
        }

        public GetMsSgCircuitBreakerRuleResponseBodyRuleModels setStatus(Long status) {
            this.status = status;
            return this;
        }
        public Long getStatus() {
            return this.status;
        }

        public GetMsSgCircuitBreakerRuleResponseBodyRuleModels setTrafficType(String trafficType) {
            this.trafficType = trafficType;
            return this;
        }
        public String getTrafficType() {
            return this.trafficType;
        }

        public GetMsSgCircuitBreakerRuleResponseBodyRuleModels setAppNames(java.util.List<String> appNames) {
            this.appNames = appNames;
            return this;
        }
        public java.util.List<String> getAppNames() {
            return this.appNames;
        }

        public GetMsSgCircuitBreakerRuleResponseBodyRuleModels setCircuitBreakerRuleItems(java.util.List<GetMsSgCircuitBreakerRuleResponseBodyRuleModelsCircuitBreakerRuleItems> circuitBreakerRuleItems) {
            this.circuitBreakerRuleItems = circuitBreakerRuleItems;
            return this;
        }
        public java.util.List<GetMsSgCircuitBreakerRuleResponseBodyRuleModelsCircuitBreakerRuleItems> getCircuitBreakerRuleItems() {
            return this.circuitBreakerRuleItems;
        }

        public GetMsSgCircuitBreakerRuleResponseBodyRuleModels setConditions(java.util.List<GetMsSgCircuitBreakerRuleResponseBodyRuleModelsConditions> conditions) {
            this.conditions = conditions;
            return this;
        }
        public java.util.List<GetMsSgCircuitBreakerRuleResponseBodyRuleModelsConditions> getConditions() {
            return this.conditions;
        }

        public GetMsSgCircuitBreakerRuleResponseBodyRuleModels setConfig(GetMsSgCircuitBreakerRuleResponseBodyRuleModelsConfig config) {
            this.config = config;
            return this;
        }
        public GetMsSgCircuitBreakerRuleResponseBodyRuleModelsConfig getConfig() {
            return this.config;
        }

    }

}
