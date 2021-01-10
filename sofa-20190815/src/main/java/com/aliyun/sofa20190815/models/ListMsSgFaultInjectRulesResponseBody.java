// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListMsSgFaultInjectRulesResponseBody extends TeaModel {
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
    public java.util.List<ListMsSgFaultInjectRulesResponseBodyRuleModels> ruleModels;

    public static ListMsSgFaultInjectRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMsSgFaultInjectRulesResponseBody self = new ListMsSgFaultInjectRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMsSgFaultInjectRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListMsSgFaultInjectRulesResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListMsSgFaultInjectRulesResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public ListMsSgFaultInjectRulesResponseBody setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public ListMsSgFaultInjectRulesResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListMsSgFaultInjectRulesResponseBody setStartIndex(Long startIndex) {
        this.startIndex = startIndex;
        return this;
    }
    public Long getStartIndex() {
        return this.startIndex;
    }

    public ListMsSgFaultInjectRulesResponseBody setTotalSize(Long totalSize) {
        this.totalSize = totalSize;
        return this;
    }
    public Long getTotalSize() {
        return this.totalSize;
    }

    public ListMsSgFaultInjectRulesResponseBody setRuleModels(java.util.List<ListMsSgFaultInjectRulesResponseBodyRuleModels> ruleModels) {
        this.ruleModels = ruleModels;
        return this;
    }
    public java.util.List<ListMsSgFaultInjectRulesResponseBodyRuleModels> getRuleModels() {
        return this.ruleModels;
    }

    public static class ListMsSgFaultInjectRulesResponseBodyRuleModelsRuleConfigFaultInjectRuleItemsTrafficConditions extends TeaModel {
        @NameInMap("Field")
        public String field;

        @NameInMap("Operation")
        public String operation;

        @NameInMap("Type")
        public String type;

        @NameInMap("Value")
        public java.util.List<String> value;

        public static ListMsSgFaultInjectRulesResponseBodyRuleModelsRuleConfigFaultInjectRuleItemsTrafficConditions build(java.util.Map<String, ?> map) throws Exception {
            ListMsSgFaultInjectRulesResponseBodyRuleModelsRuleConfigFaultInjectRuleItemsTrafficConditions self = new ListMsSgFaultInjectRulesResponseBodyRuleModelsRuleConfigFaultInjectRuleItemsTrafficConditions();
            return TeaModel.build(map, self);
        }

        public ListMsSgFaultInjectRulesResponseBodyRuleModelsRuleConfigFaultInjectRuleItemsTrafficConditions setField(String field) {
            this.field = field;
            return this;
        }
        public String getField() {
            return this.field;
        }

        public ListMsSgFaultInjectRulesResponseBodyRuleModelsRuleConfigFaultInjectRuleItemsTrafficConditions setOperation(String operation) {
            this.operation = operation;
            return this;
        }
        public String getOperation() {
            return this.operation;
        }

        public ListMsSgFaultInjectRulesResponseBodyRuleModelsRuleConfigFaultInjectRuleItemsTrafficConditions setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListMsSgFaultInjectRulesResponseBodyRuleModelsRuleConfigFaultInjectRuleItemsTrafficConditions setValue(java.util.List<String> value) {
            this.value = value;
            return this;
        }
        public java.util.List<String> getValue() {
            return this.value;
        }

    }

    public static class ListMsSgFaultInjectRulesResponseBodyRuleModelsRuleConfigFaultInjectRuleItemsAction extends TeaModel {
        @NameInMap("Extension")
        public String extension;

        @NameInMap("Type")
        public String type;

        public static ListMsSgFaultInjectRulesResponseBodyRuleModelsRuleConfigFaultInjectRuleItemsAction build(java.util.Map<String, ?> map) throws Exception {
            ListMsSgFaultInjectRulesResponseBodyRuleModelsRuleConfigFaultInjectRuleItemsAction self = new ListMsSgFaultInjectRulesResponseBodyRuleModelsRuleConfigFaultInjectRuleItemsAction();
            return TeaModel.build(map, self);
        }

        public ListMsSgFaultInjectRulesResponseBodyRuleModelsRuleConfigFaultInjectRuleItemsAction setExtension(String extension) {
            this.extension = extension;
            return this;
        }
        public String getExtension() {
            return this.extension;
        }

        public ListMsSgFaultInjectRulesResponseBodyRuleModelsRuleConfigFaultInjectRuleItemsAction setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListMsSgFaultInjectRulesResponseBodyRuleModelsRuleConfigFaultInjectRuleItemsConfigs extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("FaultPercent")
        public String faultPercent;

        @NameInMap("FixedDelay")
        public String fixedDelay;

        public static ListMsSgFaultInjectRulesResponseBodyRuleModelsRuleConfigFaultInjectRuleItemsConfigs build(java.util.Map<String, ?> map) throws Exception {
            ListMsSgFaultInjectRulesResponseBodyRuleModelsRuleConfigFaultInjectRuleItemsConfigs self = new ListMsSgFaultInjectRulesResponseBodyRuleModelsRuleConfigFaultInjectRuleItemsConfigs();
            return TeaModel.build(map, self);
        }

        public ListMsSgFaultInjectRulesResponseBodyRuleModelsRuleConfigFaultInjectRuleItemsConfigs setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public ListMsSgFaultInjectRulesResponseBodyRuleModelsRuleConfigFaultInjectRuleItemsConfigs setFaultPercent(String faultPercent) {
            this.faultPercent = faultPercent;
            return this;
        }
        public String getFaultPercent() {
            return this.faultPercent;
        }

        public ListMsSgFaultInjectRulesResponseBodyRuleModelsRuleConfigFaultInjectRuleItemsConfigs setFixedDelay(String fixedDelay) {
            this.fixedDelay = fixedDelay;
            return this;
        }
        public String getFixedDelay() {
            return this.fixedDelay;
        }

    }

    public static class ListMsSgFaultInjectRulesResponseBodyRuleModelsRuleConfigFaultInjectRuleItems extends TeaModel {
        @NameInMap("RuleType")
        public String ruleType;

        @NameInMap("TrafficConditions")
        public java.util.List<ListMsSgFaultInjectRulesResponseBodyRuleModelsRuleConfigFaultInjectRuleItemsTrafficConditions> trafficConditions;

        @NameInMap("Action")
        public ListMsSgFaultInjectRulesResponseBodyRuleModelsRuleConfigFaultInjectRuleItemsAction action;

        @NameInMap("Configs")
        public ListMsSgFaultInjectRulesResponseBodyRuleModelsRuleConfigFaultInjectRuleItemsConfigs configs;

        public static ListMsSgFaultInjectRulesResponseBodyRuleModelsRuleConfigFaultInjectRuleItems build(java.util.Map<String, ?> map) throws Exception {
            ListMsSgFaultInjectRulesResponseBodyRuleModelsRuleConfigFaultInjectRuleItems self = new ListMsSgFaultInjectRulesResponseBodyRuleModelsRuleConfigFaultInjectRuleItems();
            return TeaModel.build(map, self);
        }

        public ListMsSgFaultInjectRulesResponseBodyRuleModelsRuleConfigFaultInjectRuleItems setRuleType(String ruleType) {
            this.ruleType = ruleType;
            return this;
        }
        public String getRuleType() {
            return this.ruleType;
        }

        public ListMsSgFaultInjectRulesResponseBodyRuleModelsRuleConfigFaultInjectRuleItems setTrafficConditions(java.util.List<ListMsSgFaultInjectRulesResponseBodyRuleModelsRuleConfigFaultInjectRuleItemsTrafficConditions> trafficConditions) {
            this.trafficConditions = trafficConditions;
            return this;
        }
        public java.util.List<ListMsSgFaultInjectRulesResponseBodyRuleModelsRuleConfigFaultInjectRuleItemsTrafficConditions> getTrafficConditions() {
            return this.trafficConditions;
        }

        public ListMsSgFaultInjectRulesResponseBodyRuleModelsRuleConfigFaultInjectRuleItems setAction(ListMsSgFaultInjectRulesResponseBodyRuleModelsRuleConfigFaultInjectRuleItemsAction action) {
            this.action = action;
            return this;
        }
        public ListMsSgFaultInjectRulesResponseBodyRuleModelsRuleConfigFaultInjectRuleItemsAction getAction() {
            return this.action;
        }

        public ListMsSgFaultInjectRulesResponseBodyRuleModelsRuleConfigFaultInjectRuleItems setConfigs(ListMsSgFaultInjectRulesResponseBodyRuleModelsRuleConfigFaultInjectRuleItemsConfigs configs) {
            this.configs = configs;
            return this;
        }
        public ListMsSgFaultInjectRulesResponseBodyRuleModelsRuleConfigFaultInjectRuleItemsConfigs getConfigs() {
            return this.configs;
        }

    }

    public static class ListMsSgFaultInjectRulesResponseBodyRuleModelsRuleConfig extends TeaModel {
        @NameInMap("HttpMethod")
        public String httpMethod;

        @NameInMap("HttpPath")
        public String httpPath;

        @NameInMap("MethodName")
        public String methodName;

        @NameInMap("Resource")
        public String resource;

        @NameInMap("TrafficType")
        public String trafficType;

        @NameInMap("FaultInjectRuleItems")
        public java.util.List<ListMsSgFaultInjectRulesResponseBodyRuleModelsRuleConfigFaultInjectRuleItems> faultInjectRuleItems;

        public static ListMsSgFaultInjectRulesResponseBodyRuleModelsRuleConfig build(java.util.Map<String, ?> map) throws Exception {
            ListMsSgFaultInjectRulesResponseBodyRuleModelsRuleConfig self = new ListMsSgFaultInjectRulesResponseBodyRuleModelsRuleConfig();
            return TeaModel.build(map, self);
        }

        public ListMsSgFaultInjectRulesResponseBodyRuleModelsRuleConfig setHttpMethod(String httpMethod) {
            this.httpMethod = httpMethod;
            return this;
        }
        public String getHttpMethod() {
            return this.httpMethod;
        }

        public ListMsSgFaultInjectRulesResponseBodyRuleModelsRuleConfig setHttpPath(String httpPath) {
            this.httpPath = httpPath;
            return this;
        }
        public String getHttpPath() {
            return this.httpPath;
        }

        public ListMsSgFaultInjectRulesResponseBodyRuleModelsRuleConfig setMethodName(String methodName) {
            this.methodName = methodName;
            return this;
        }
        public String getMethodName() {
            return this.methodName;
        }

        public ListMsSgFaultInjectRulesResponseBodyRuleModelsRuleConfig setResource(String resource) {
            this.resource = resource;
            return this;
        }
        public String getResource() {
            return this.resource;
        }

        public ListMsSgFaultInjectRulesResponseBodyRuleModelsRuleConfig setTrafficType(String trafficType) {
            this.trafficType = trafficType;
            return this;
        }
        public String getTrafficType() {
            return this.trafficType;
        }

        public ListMsSgFaultInjectRulesResponseBodyRuleModelsRuleConfig setFaultInjectRuleItems(java.util.List<ListMsSgFaultInjectRulesResponseBodyRuleModelsRuleConfigFaultInjectRuleItems> faultInjectRuleItems) {
            this.faultInjectRuleItems = faultInjectRuleItems;
            return this;
        }
        public java.util.List<ListMsSgFaultInjectRulesResponseBodyRuleModelsRuleConfigFaultInjectRuleItems> getFaultInjectRuleItems() {
            return this.faultInjectRuleItems;
        }

    }

    public static class ListMsSgFaultInjectRulesResponseBodyRuleModels extends TeaModel {
        @NameInMap("AppName")
        public String appName;

        @NameInMap("DataId")
        public String dataId;

        @NameInMap("Enabled")
        public Boolean enabled;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("Id")
        public Long id;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("Operator")
        public String operator;

        @NameInMap("RuleName")
        public String ruleName;

        @NameInMap("ServiceType")
        public String serviceType;

        @NameInMap("RuleConfig")
        public ListMsSgFaultInjectRulesResponseBodyRuleModelsRuleConfig ruleConfig;

        public static ListMsSgFaultInjectRulesResponseBodyRuleModels build(java.util.Map<String, ?> map) throws Exception {
            ListMsSgFaultInjectRulesResponseBodyRuleModels self = new ListMsSgFaultInjectRulesResponseBodyRuleModels();
            return TeaModel.build(map, self);
        }

        public ListMsSgFaultInjectRulesResponseBodyRuleModels setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public ListMsSgFaultInjectRulesResponseBodyRuleModels setDataId(String dataId) {
            this.dataId = dataId;
            return this;
        }
        public String getDataId() {
            return this.dataId;
        }

        public ListMsSgFaultInjectRulesResponseBodyRuleModels setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public ListMsSgFaultInjectRulesResponseBodyRuleModels setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListMsSgFaultInjectRulesResponseBodyRuleModels setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListMsSgFaultInjectRulesResponseBodyRuleModels setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListMsSgFaultInjectRulesResponseBodyRuleModels setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListMsSgFaultInjectRulesResponseBodyRuleModels setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public ListMsSgFaultInjectRulesResponseBodyRuleModels setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public ListMsSgFaultInjectRulesResponseBodyRuleModels setServiceType(String serviceType) {
            this.serviceType = serviceType;
            return this;
        }
        public String getServiceType() {
            return this.serviceType;
        }

        public ListMsSgFaultInjectRulesResponseBodyRuleModels setRuleConfig(ListMsSgFaultInjectRulesResponseBodyRuleModelsRuleConfig ruleConfig) {
            this.ruleConfig = ruleConfig;
            return this;
        }
        public ListMsSgFaultInjectRulesResponseBodyRuleModelsRuleConfig getRuleConfig() {
            return this.ruleConfig;
        }

    }

}
