// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListMsSgRouterRuleGroupsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("List")
    public java.util.List<ListMsSgRouterRuleGroupsResponseBodyList> list;

    public static ListMsSgRouterRuleGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMsSgRouterRuleGroupsResponseBody self = new ListMsSgRouterRuleGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMsSgRouterRuleGroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListMsSgRouterRuleGroupsResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListMsSgRouterRuleGroupsResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public ListMsSgRouterRuleGroupsResponseBody setList(java.util.List<ListMsSgRouterRuleGroupsResponseBodyList> list) {
        this.list = list;
        return this;
    }
    public java.util.List<ListMsSgRouterRuleGroupsResponseBodyList> getList() {
        return this.list;
    }

    public static class ListMsSgRouterRuleGroupsResponseBodyListRulesConditions extends TeaModel {
        @NameInMap("Field")
        public String field;

        @NameInMap("Operation")
        public String operation;

        @NameInMap("Type")
        public String type;

        @NameInMap("Value")
        public java.util.List<String> value;

        public static ListMsSgRouterRuleGroupsResponseBodyListRulesConditions build(java.util.Map<String, ?> map) throws Exception {
            ListMsSgRouterRuleGroupsResponseBodyListRulesConditions self = new ListMsSgRouterRuleGroupsResponseBodyListRulesConditions();
            return TeaModel.build(map, self);
        }

        public ListMsSgRouterRuleGroupsResponseBodyListRulesConditions setField(String field) {
            this.field = field;
            return this;
        }
        public String getField() {
            return this.field;
        }

        public ListMsSgRouterRuleGroupsResponseBodyListRulesConditions setOperation(String operation) {
            this.operation = operation;
            return this;
        }
        public String getOperation() {
            return this.operation;
        }

        public ListMsSgRouterRuleGroupsResponseBodyListRulesConditions setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListMsSgRouterRuleGroupsResponseBodyListRulesConditions setValue(java.util.List<String> value) {
            this.value = value;
            return this;
        }
        public java.util.List<String> getValue() {
            return this.value;
        }

    }

    public static class ListMsSgRouterRuleGroupsResponseBodyListRulesDestinationsDestination extends TeaModel {
        @NameInMap("Field")
        public String field;

        @NameInMap("Operation")
        public String operation;

        @NameInMap("Type")
        public String type;

        @NameInMap("Value")
        public java.util.List<String> value;

        public static ListMsSgRouterRuleGroupsResponseBodyListRulesDestinationsDestination build(java.util.Map<String, ?> map) throws Exception {
            ListMsSgRouterRuleGroupsResponseBodyListRulesDestinationsDestination self = new ListMsSgRouterRuleGroupsResponseBodyListRulesDestinationsDestination();
            return TeaModel.build(map, self);
        }

        public ListMsSgRouterRuleGroupsResponseBodyListRulesDestinationsDestination setField(String field) {
            this.field = field;
            return this;
        }
        public String getField() {
            return this.field;
        }

        public ListMsSgRouterRuleGroupsResponseBodyListRulesDestinationsDestination setOperation(String operation) {
            this.operation = operation;
            return this;
        }
        public String getOperation() {
            return this.operation;
        }

        public ListMsSgRouterRuleGroupsResponseBodyListRulesDestinationsDestination setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListMsSgRouterRuleGroupsResponseBodyListRulesDestinationsDestination setValue(java.util.List<String> value) {
            this.value = value;
            return this;
        }
        public java.util.List<String> getValue() {
            return this.value;
        }

    }

    public static class ListMsSgRouterRuleGroupsResponseBodyListRulesDestinations extends TeaModel {
        @NameInMap("Weight")
        public Long weight;

        @NameInMap("Destination")
        public java.util.List<ListMsSgRouterRuleGroupsResponseBodyListRulesDestinationsDestination> destination;

        public static ListMsSgRouterRuleGroupsResponseBodyListRulesDestinations build(java.util.Map<String, ?> map) throws Exception {
            ListMsSgRouterRuleGroupsResponseBodyListRulesDestinations self = new ListMsSgRouterRuleGroupsResponseBodyListRulesDestinations();
            return TeaModel.build(map, self);
        }

        public ListMsSgRouterRuleGroupsResponseBodyListRulesDestinations setWeight(Long weight) {
            this.weight = weight;
            return this;
        }
        public Long getWeight() {
            return this.weight;
        }

        public ListMsSgRouterRuleGroupsResponseBodyListRulesDestinations setDestination(java.util.List<ListMsSgRouterRuleGroupsResponseBodyListRulesDestinationsDestination> destination) {
            this.destination = destination;
            return this;
        }
        public java.util.List<ListMsSgRouterRuleGroupsResponseBodyListRulesDestinationsDestination> getDestination() {
            return this.destination;
        }

    }

    public static class ListMsSgRouterRuleGroupsResponseBodyListRulesGrays extends TeaModel {
        @NameInMap("Field")
        public String field;

        @NameInMap("Operation")
        public String operation;

        @NameInMap("Type")
        public String type;

        @NameInMap("Value")
        public java.util.List<String> value;

        public static ListMsSgRouterRuleGroupsResponseBodyListRulesGrays build(java.util.Map<String, ?> map) throws Exception {
            ListMsSgRouterRuleGroupsResponseBodyListRulesGrays self = new ListMsSgRouterRuleGroupsResponseBodyListRulesGrays();
            return TeaModel.build(map, self);
        }

        public ListMsSgRouterRuleGroupsResponseBodyListRulesGrays setField(String field) {
            this.field = field;
            return this;
        }
        public String getField() {
            return this.field;
        }

        public ListMsSgRouterRuleGroupsResponseBodyListRulesGrays setOperation(String operation) {
            this.operation = operation;
            return this;
        }
        public String getOperation() {
            return this.operation;
        }

        public ListMsSgRouterRuleGroupsResponseBodyListRulesGrays setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListMsSgRouterRuleGroupsResponseBodyListRulesGrays setValue(java.util.List<String> value) {
            this.value = value;
            return this;
        }
        public java.util.List<String> getValue() {
            return this.value;
        }

    }

    public static class ListMsSgRouterRuleGroupsResponseBodyListRules extends TeaModel {
        @NameInMap("Enabled")
        public Long enabled;

        @NameInMap("Fallback")
        public Long fallback;

        @NameInMap("FaultProtection")
        public Long faultProtection;

        @NameInMap("GmtModified")
        public Long gmtModified;

        @NameInMap("Id")
        public String id;

        @NameInMap("Name")
        public String name;

        @NameInMap("OrderNum")
        public Long orderNum;

        @NameInMap("Conditions")
        public java.util.List<ListMsSgRouterRuleGroupsResponseBodyListRulesConditions> conditions;

        @NameInMap("Destinations")
        public java.util.List<ListMsSgRouterRuleGroupsResponseBodyListRulesDestinations> destinations;

        @NameInMap("Grays")
        public java.util.List<ListMsSgRouterRuleGroupsResponseBodyListRulesGrays> grays;

        public static ListMsSgRouterRuleGroupsResponseBodyListRules build(java.util.Map<String, ?> map) throws Exception {
            ListMsSgRouterRuleGroupsResponseBodyListRules self = new ListMsSgRouterRuleGroupsResponseBodyListRules();
            return TeaModel.build(map, self);
        }

        public ListMsSgRouterRuleGroupsResponseBodyListRules setEnabled(Long enabled) {
            this.enabled = enabled;
            return this;
        }
        public Long getEnabled() {
            return this.enabled;
        }

        public ListMsSgRouterRuleGroupsResponseBodyListRules setFallback(Long fallback) {
            this.fallback = fallback;
            return this;
        }
        public Long getFallback() {
            return this.fallback;
        }

        public ListMsSgRouterRuleGroupsResponseBodyListRules setFaultProtection(Long faultProtection) {
            this.faultProtection = faultProtection;
            return this;
        }
        public Long getFaultProtection() {
            return this.faultProtection;
        }

        public ListMsSgRouterRuleGroupsResponseBodyListRules setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public ListMsSgRouterRuleGroupsResponseBodyListRules setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListMsSgRouterRuleGroupsResponseBodyListRules setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListMsSgRouterRuleGroupsResponseBodyListRules setOrderNum(Long orderNum) {
            this.orderNum = orderNum;
            return this;
        }
        public Long getOrderNum() {
            return this.orderNum;
        }

        public ListMsSgRouterRuleGroupsResponseBodyListRules setConditions(java.util.List<ListMsSgRouterRuleGroupsResponseBodyListRulesConditions> conditions) {
            this.conditions = conditions;
            return this;
        }
        public java.util.List<ListMsSgRouterRuleGroupsResponseBodyListRulesConditions> getConditions() {
            return this.conditions;
        }

        public ListMsSgRouterRuleGroupsResponseBodyListRules setDestinations(java.util.List<ListMsSgRouterRuleGroupsResponseBodyListRulesDestinations> destinations) {
            this.destinations = destinations;
            return this;
        }
        public java.util.List<ListMsSgRouterRuleGroupsResponseBodyListRulesDestinations> getDestinations() {
            return this.destinations;
        }

        public ListMsSgRouterRuleGroupsResponseBodyListRules setGrays(java.util.List<ListMsSgRouterRuleGroupsResponseBodyListRulesGrays> grays) {
            this.grays = grays;
            return this;
        }
        public java.util.List<ListMsSgRouterRuleGroupsResponseBodyListRulesGrays> getGrays() {
            return this.grays;
        }

    }

    public static class ListMsSgRouterRuleGroupsResponseBodyList extends TeaModel {
        @NameInMap("AppName")
        public String appName;

        @NameInMap("DataId")
        public String dataId;

        @NameInMap("Enabled")
        public Long enabled;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("GrayCondition")
        public String grayCondition;

        @NameInMap("Id")
        public Long id;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("Operator")
        public String operator;

        @NameInMap("Priority")
        public Long priority;

        @NameInMap("RuleName")
        public String ruleName;

        @NameInMap("Version")
        public Long version;

        @NameInMap("Rules")
        public java.util.List<ListMsSgRouterRuleGroupsResponseBodyListRules> rules;

        public static ListMsSgRouterRuleGroupsResponseBodyList build(java.util.Map<String, ?> map) throws Exception {
            ListMsSgRouterRuleGroupsResponseBodyList self = new ListMsSgRouterRuleGroupsResponseBodyList();
            return TeaModel.build(map, self);
        }

        public ListMsSgRouterRuleGroupsResponseBodyList setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public ListMsSgRouterRuleGroupsResponseBodyList setDataId(String dataId) {
            this.dataId = dataId;
            return this;
        }
        public String getDataId() {
            return this.dataId;
        }

        public ListMsSgRouterRuleGroupsResponseBodyList setEnabled(Long enabled) {
            this.enabled = enabled;
            return this;
        }
        public Long getEnabled() {
            return this.enabled;
        }

        public ListMsSgRouterRuleGroupsResponseBodyList setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListMsSgRouterRuleGroupsResponseBodyList setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListMsSgRouterRuleGroupsResponseBodyList setGrayCondition(String grayCondition) {
            this.grayCondition = grayCondition;
            return this;
        }
        public String getGrayCondition() {
            return this.grayCondition;
        }

        public ListMsSgRouterRuleGroupsResponseBodyList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListMsSgRouterRuleGroupsResponseBodyList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListMsSgRouterRuleGroupsResponseBodyList setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public ListMsSgRouterRuleGroupsResponseBodyList setPriority(Long priority) {
            this.priority = priority;
            return this;
        }
        public Long getPriority() {
            return this.priority;
        }

        public ListMsSgRouterRuleGroupsResponseBodyList setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public ListMsSgRouterRuleGroupsResponseBodyList setVersion(Long version) {
            this.version = version;
            return this;
        }
        public Long getVersion() {
            return this.version;
        }

        public ListMsSgRouterRuleGroupsResponseBodyList setRules(java.util.List<ListMsSgRouterRuleGroupsResponseBodyListRules> rules) {
            this.rules = rules;
            return this;
        }
        public java.util.List<ListMsSgRouterRuleGroupsResponseBodyListRules> getRules() {
            return this.rules;
        }

    }

}
