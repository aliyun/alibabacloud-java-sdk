// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListMsSgFaultToleranceRulesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("RuleModels")
    public java.util.List<ListMsSgFaultToleranceRulesResponseBodyRuleModels> ruleModels;

    public static ListMsSgFaultToleranceRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMsSgFaultToleranceRulesResponseBody self = new ListMsSgFaultToleranceRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMsSgFaultToleranceRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListMsSgFaultToleranceRulesResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListMsSgFaultToleranceRulesResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public ListMsSgFaultToleranceRulesResponseBody setRuleModels(java.util.List<ListMsSgFaultToleranceRulesResponseBodyRuleModels> ruleModels) {
        this.ruleModels = ruleModels;
        return this;
    }
    public java.util.List<ListMsSgFaultToleranceRulesResponseBodyRuleModels> getRuleModels() {
        return this.ruleModels;
    }

    public static class ListMsSgFaultToleranceRulesResponseBodyRuleModelsOrders extends TeaModel {
        @NameInMap("Dir")
        public String dir;

        @NameInMap("Key")
        public String key;

        public static ListMsSgFaultToleranceRulesResponseBodyRuleModelsOrders build(java.util.Map<String, ?> map) throws Exception {
            ListMsSgFaultToleranceRulesResponseBodyRuleModelsOrders self = new ListMsSgFaultToleranceRulesResponseBodyRuleModelsOrders();
            return TeaModel.build(map, self);
        }

        public ListMsSgFaultToleranceRulesResponseBodyRuleModelsOrders setDir(String dir) {
            this.dir = dir;
            return this;
        }
        public String getDir() {
            return this.dir;
        }

        public ListMsSgFaultToleranceRulesResponseBodyRuleModelsOrders setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

    }

    public static class ListMsSgFaultToleranceRulesResponseBodyRuleModelsRuleItemListActions extends TeaModel {
        @NameInMap("Enabled")
        public Boolean enabled;

        @NameInMap("Extension")
        public String extension;

        @NameInMap("Type")
        public String type;

        public static ListMsSgFaultToleranceRulesResponseBodyRuleModelsRuleItemListActions build(java.util.Map<String, ?> map) throws Exception {
            ListMsSgFaultToleranceRulesResponseBodyRuleModelsRuleItemListActions self = new ListMsSgFaultToleranceRulesResponseBodyRuleModelsRuleItemListActions();
            return TeaModel.build(map, self);
        }

        public ListMsSgFaultToleranceRulesResponseBodyRuleModelsRuleItemListActions setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public ListMsSgFaultToleranceRulesResponseBodyRuleModelsRuleItemListActions setExtension(String extension) {
            this.extension = extension;
            return this;
        }
        public String getExtension() {
            return this.extension;
        }

        public ListMsSgFaultToleranceRulesResponseBodyRuleModelsRuleItemListActions setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListMsSgFaultToleranceRulesResponseBodyRuleModelsRuleItemListConditions extends TeaModel {
        @NameInMap("Field")
        public String field;

        @NameInMap("Operation")
        public String operation;

        @NameInMap("Type")
        public String type;

        @NameInMap("Value")
        public java.util.List<String> value;

        public static ListMsSgFaultToleranceRulesResponseBodyRuleModelsRuleItemListConditions build(java.util.Map<String, ?> map) throws Exception {
            ListMsSgFaultToleranceRulesResponseBodyRuleModelsRuleItemListConditions self = new ListMsSgFaultToleranceRulesResponseBodyRuleModelsRuleItemListConditions();
            return TeaModel.build(map, self);
        }

        public ListMsSgFaultToleranceRulesResponseBodyRuleModelsRuleItemListConditions setField(String field) {
            this.field = field;
            return this;
        }
        public String getField() {
            return this.field;
        }

        public ListMsSgFaultToleranceRulesResponseBodyRuleModelsRuleItemListConditions setOperation(String operation) {
            this.operation = operation;
            return this;
        }
        public String getOperation() {
            return this.operation;
        }

        public ListMsSgFaultToleranceRulesResponseBodyRuleModelsRuleItemListConditions setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListMsSgFaultToleranceRulesResponseBodyRuleModelsRuleItemListConditions setValue(java.util.List<String> value) {
            this.value = value;
            return this;
        }
        public java.util.List<String> getValue() {
            return this.value;
        }

    }

    public static class ListMsSgFaultToleranceRulesResponseBodyRuleModelsRuleItemListConfigs extends TeaModel {
        @NameInMap("ExceptionRateMultiple")
        public Long exceptionRateMultiple;

        @NameInMap("LeastExceptionRate")
        public Long leastExceptionRate;

        @NameInMap("LeastWindowCount")
        public Long leastWindowCount;

        @NameInMap("MaxIpCount")
        public Long maxIpCount;

        @NameInMap("TimeWindow")
        public Long timeWindow;

        @NameInMap("ExceptionTypes")
        public java.util.List<String> exceptionTypes;

        public static ListMsSgFaultToleranceRulesResponseBodyRuleModelsRuleItemListConfigs build(java.util.Map<String, ?> map) throws Exception {
            ListMsSgFaultToleranceRulesResponseBodyRuleModelsRuleItemListConfigs self = new ListMsSgFaultToleranceRulesResponseBodyRuleModelsRuleItemListConfigs();
            return TeaModel.build(map, self);
        }

        public ListMsSgFaultToleranceRulesResponseBodyRuleModelsRuleItemListConfigs setExceptionRateMultiple(Long exceptionRateMultiple) {
            this.exceptionRateMultiple = exceptionRateMultiple;
            return this;
        }
        public Long getExceptionRateMultiple() {
            return this.exceptionRateMultiple;
        }

        public ListMsSgFaultToleranceRulesResponseBodyRuleModelsRuleItemListConfigs setLeastExceptionRate(Long leastExceptionRate) {
            this.leastExceptionRate = leastExceptionRate;
            return this;
        }
        public Long getLeastExceptionRate() {
            return this.leastExceptionRate;
        }

        public ListMsSgFaultToleranceRulesResponseBodyRuleModelsRuleItemListConfigs setLeastWindowCount(Long leastWindowCount) {
            this.leastWindowCount = leastWindowCount;
            return this;
        }
        public Long getLeastWindowCount() {
            return this.leastWindowCount;
        }

        public ListMsSgFaultToleranceRulesResponseBodyRuleModelsRuleItemListConfigs setMaxIpCount(Long maxIpCount) {
            this.maxIpCount = maxIpCount;
            return this;
        }
        public Long getMaxIpCount() {
            return this.maxIpCount;
        }

        public ListMsSgFaultToleranceRulesResponseBodyRuleModelsRuleItemListConfigs setTimeWindow(Long timeWindow) {
            this.timeWindow = timeWindow;
            return this;
        }
        public Long getTimeWindow() {
            return this.timeWindow;
        }

        public ListMsSgFaultToleranceRulesResponseBodyRuleModelsRuleItemListConfigs setExceptionTypes(java.util.List<String> exceptionTypes) {
            this.exceptionTypes = exceptionTypes;
            return this;
        }
        public java.util.List<String> getExceptionTypes() {
            return this.exceptionTypes;
        }

    }

    public static class ListMsSgFaultToleranceRulesResponseBodyRuleModelsRuleItemList extends TeaModel {
        @NameInMap("Enabled")
        public String enabled;

        @NameInMap("Scopes")
        public java.util.List<String> scopes;

        @NameInMap("Actions")
        public java.util.List<ListMsSgFaultToleranceRulesResponseBodyRuleModelsRuleItemListActions> actions;

        @NameInMap("Conditions")
        public java.util.List<ListMsSgFaultToleranceRulesResponseBodyRuleModelsRuleItemListConditions> conditions;

        @NameInMap("Configs")
        public ListMsSgFaultToleranceRulesResponseBodyRuleModelsRuleItemListConfigs configs;

        public static ListMsSgFaultToleranceRulesResponseBodyRuleModelsRuleItemList build(java.util.Map<String, ?> map) throws Exception {
            ListMsSgFaultToleranceRulesResponseBodyRuleModelsRuleItemList self = new ListMsSgFaultToleranceRulesResponseBodyRuleModelsRuleItemList();
            return TeaModel.build(map, self);
        }

        public ListMsSgFaultToleranceRulesResponseBodyRuleModelsRuleItemList setEnabled(String enabled) {
            this.enabled = enabled;
            return this;
        }
        public String getEnabled() {
            return this.enabled;
        }

        public ListMsSgFaultToleranceRulesResponseBodyRuleModelsRuleItemList setScopes(java.util.List<String> scopes) {
            this.scopes = scopes;
            return this;
        }
        public java.util.List<String> getScopes() {
            return this.scopes;
        }

        public ListMsSgFaultToleranceRulesResponseBodyRuleModelsRuleItemList setActions(java.util.List<ListMsSgFaultToleranceRulesResponseBodyRuleModelsRuleItemListActions> actions) {
            this.actions = actions;
            return this;
        }
        public java.util.List<ListMsSgFaultToleranceRulesResponseBodyRuleModelsRuleItemListActions> getActions() {
            return this.actions;
        }

        public ListMsSgFaultToleranceRulesResponseBodyRuleModelsRuleItemList setConditions(java.util.List<ListMsSgFaultToleranceRulesResponseBodyRuleModelsRuleItemListConditions> conditions) {
            this.conditions = conditions;
            return this;
        }
        public java.util.List<ListMsSgFaultToleranceRulesResponseBodyRuleModelsRuleItemListConditions> getConditions() {
            return this.conditions;
        }

        public ListMsSgFaultToleranceRulesResponseBodyRuleModelsRuleItemList setConfigs(ListMsSgFaultToleranceRulesResponseBodyRuleModelsRuleItemListConfigs configs) {
            this.configs = configs;
            return this;
        }
        public ListMsSgFaultToleranceRulesResponseBodyRuleModelsRuleItemListConfigs getConfigs() {
            return this.configs;
        }

    }

    public static class ListMsSgFaultToleranceRulesResponseBodyRuleModels extends TeaModel {
        @NameInMap("AppName")
        public String appName;

        @NameInMap("Enabled")
        public Long enabled;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("Id")
        public Long id;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("Name")
        public String name;

        @NameInMap("Operator")
        public String operator;

        @NameInMap("Orders")
        public java.util.List<ListMsSgFaultToleranceRulesResponseBodyRuleModelsOrders> orders;

        @NameInMap("RuleItemList")
        public java.util.List<ListMsSgFaultToleranceRulesResponseBodyRuleModelsRuleItemList> ruleItemList;

        public static ListMsSgFaultToleranceRulesResponseBodyRuleModels build(java.util.Map<String, ?> map) throws Exception {
            ListMsSgFaultToleranceRulesResponseBodyRuleModels self = new ListMsSgFaultToleranceRulesResponseBodyRuleModels();
            return TeaModel.build(map, self);
        }

        public ListMsSgFaultToleranceRulesResponseBodyRuleModels setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public ListMsSgFaultToleranceRulesResponseBodyRuleModels setEnabled(Long enabled) {
            this.enabled = enabled;
            return this;
        }
        public Long getEnabled() {
            return this.enabled;
        }

        public ListMsSgFaultToleranceRulesResponseBodyRuleModels setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListMsSgFaultToleranceRulesResponseBodyRuleModels setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListMsSgFaultToleranceRulesResponseBodyRuleModels setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListMsSgFaultToleranceRulesResponseBodyRuleModels setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListMsSgFaultToleranceRulesResponseBodyRuleModels setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public ListMsSgFaultToleranceRulesResponseBodyRuleModels setOrders(java.util.List<ListMsSgFaultToleranceRulesResponseBodyRuleModelsOrders> orders) {
            this.orders = orders;
            return this;
        }
        public java.util.List<ListMsSgFaultToleranceRulesResponseBodyRuleModelsOrders> getOrders() {
            return this.orders;
        }

        public ListMsSgFaultToleranceRulesResponseBodyRuleModels setRuleItemList(java.util.List<ListMsSgFaultToleranceRulesResponseBodyRuleModelsRuleItemList> ruleItemList) {
            this.ruleItemList = ruleItemList;
            return this;
        }
        public java.util.List<ListMsSgFaultToleranceRulesResponseBodyRuleModelsRuleItemList> getRuleItemList() {
            return this.ruleItemList;
        }

    }

}
