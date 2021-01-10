// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetMsSgRouterRulesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("RouterRuleGroupModel")
    public GetMsSgRouterRulesResponseBodyRouterRuleGroupModel routerRuleGroupModel;

    public static GetMsSgRouterRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMsSgRouterRulesResponseBody self = new GetMsSgRouterRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMsSgRouterRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetMsSgRouterRulesResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetMsSgRouterRulesResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public GetMsSgRouterRulesResponseBody setRouterRuleGroupModel(GetMsSgRouterRulesResponseBodyRouterRuleGroupModel routerRuleGroupModel) {
        this.routerRuleGroupModel = routerRuleGroupModel;
        return this;
    }
    public GetMsSgRouterRulesResponseBodyRouterRuleGroupModel getRouterRuleGroupModel() {
        return this.routerRuleGroupModel;
    }

    public static class GetMsSgRouterRulesResponseBodyRouterRuleGroupModelRulesConditions extends TeaModel {
        @NameInMap("Field")
        public String field;

        @NameInMap("Operation")
        public String operation;

        @NameInMap("Type")
        public String type;

        @NameInMap("Value")
        public java.util.List<String> value;

        public static GetMsSgRouterRulesResponseBodyRouterRuleGroupModelRulesConditions build(java.util.Map<String, ?> map) throws Exception {
            GetMsSgRouterRulesResponseBodyRouterRuleGroupModelRulesConditions self = new GetMsSgRouterRulesResponseBodyRouterRuleGroupModelRulesConditions();
            return TeaModel.build(map, self);
        }

        public GetMsSgRouterRulesResponseBodyRouterRuleGroupModelRulesConditions setField(String field) {
            this.field = field;
            return this;
        }
        public String getField() {
            return this.field;
        }

        public GetMsSgRouterRulesResponseBodyRouterRuleGroupModelRulesConditions setOperation(String operation) {
            this.operation = operation;
            return this;
        }
        public String getOperation() {
            return this.operation;
        }

        public GetMsSgRouterRulesResponseBodyRouterRuleGroupModelRulesConditions setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetMsSgRouterRulesResponseBodyRouterRuleGroupModelRulesConditions setValue(java.util.List<String> value) {
            this.value = value;
            return this;
        }
        public java.util.List<String> getValue() {
            return this.value;
        }

    }

    public static class GetMsSgRouterRulesResponseBodyRouterRuleGroupModelRulesDestinationsDestination extends TeaModel {
        @NameInMap("Field")
        public String field;

        @NameInMap("Operation")
        public String operation;

        @NameInMap("Type")
        public String type;

        @NameInMap("Value")
        public java.util.List<String> value;

        public static GetMsSgRouterRulesResponseBodyRouterRuleGroupModelRulesDestinationsDestination build(java.util.Map<String, ?> map) throws Exception {
            GetMsSgRouterRulesResponseBodyRouterRuleGroupModelRulesDestinationsDestination self = new GetMsSgRouterRulesResponseBodyRouterRuleGroupModelRulesDestinationsDestination();
            return TeaModel.build(map, self);
        }

        public GetMsSgRouterRulesResponseBodyRouterRuleGroupModelRulesDestinationsDestination setField(String field) {
            this.field = field;
            return this;
        }
        public String getField() {
            return this.field;
        }

        public GetMsSgRouterRulesResponseBodyRouterRuleGroupModelRulesDestinationsDestination setOperation(String operation) {
            this.operation = operation;
            return this;
        }
        public String getOperation() {
            return this.operation;
        }

        public GetMsSgRouterRulesResponseBodyRouterRuleGroupModelRulesDestinationsDestination setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetMsSgRouterRulesResponseBodyRouterRuleGroupModelRulesDestinationsDestination setValue(java.util.List<String> value) {
            this.value = value;
            return this;
        }
        public java.util.List<String> getValue() {
            return this.value;
        }

    }

    public static class GetMsSgRouterRulesResponseBodyRouterRuleGroupModelRulesDestinations extends TeaModel {
        @NameInMap("Weight")
        public Long weight;

        @NameInMap("Destination")
        public java.util.List<GetMsSgRouterRulesResponseBodyRouterRuleGroupModelRulesDestinationsDestination> destination;

        public static GetMsSgRouterRulesResponseBodyRouterRuleGroupModelRulesDestinations build(java.util.Map<String, ?> map) throws Exception {
            GetMsSgRouterRulesResponseBodyRouterRuleGroupModelRulesDestinations self = new GetMsSgRouterRulesResponseBodyRouterRuleGroupModelRulesDestinations();
            return TeaModel.build(map, self);
        }

        public GetMsSgRouterRulesResponseBodyRouterRuleGroupModelRulesDestinations setWeight(Long weight) {
            this.weight = weight;
            return this;
        }
        public Long getWeight() {
            return this.weight;
        }

        public GetMsSgRouterRulesResponseBodyRouterRuleGroupModelRulesDestinations setDestination(java.util.List<GetMsSgRouterRulesResponseBodyRouterRuleGroupModelRulesDestinationsDestination> destination) {
            this.destination = destination;
            return this;
        }
        public java.util.List<GetMsSgRouterRulesResponseBodyRouterRuleGroupModelRulesDestinationsDestination> getDestination() {
            return this.destination;
        }

    }

    public static class GetMsSgRouterRulesResponseBodyRouterRuleGroupModelRulesGrays extends TeaModel {
        @NameInMap("Field")
        public String field;

        @NameInMap("Operation")
        public String operation;

        @NameInMap("Type")
        public String type;

        @NameInMap("Value")
        public java.util.List<String> value;

        public static GetMsSgRouterRulesResponseBodyRouterRuleGroupModelRulesGrays build(java.util.Map<String, ?> map) throws Exception {
            GetMsSgRouterRulesResponseBodyRouterRuleGroupModelRulesGrays self = new GetMsSgRouterRulesResponseBodyRouterRuleGroupModelRulesGrays();
            return TeaModel.build(map, self);
        }

        public GetMsSgRouterRulesResponseBodyRouterRuleGroupModelRulesGrays setField(String field) {
            this.field = field;
            return this;
        }
        public String getField() {
            return this.field;
        }

        public GetMsSgRouterRulesResponseBodyRouterRuleGroupModelRulesGrays setOperation(String operation) {
            this.operation = operation;
            return this;
        }
        public String getOperation() {
            return this.operation;
        }

        public GetMsSgRouterRulesResponseBodyRouterRuleGroupModelRulesGrays setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetMsSgRouterRulesResponseBodyRouterRuleGroupModelRulesGrays setValue(java.util.List<String> value) {
            this.value = value;
            return this;
        }
        public java.util.List<String> getValue() {
            return this.value;
        }

    }

    public static class GetMsSgRouterRulesResponseBodyRouterRuleGroupModelRules extends TeaModel {
        @NameInMap("Enabled")
        public Long enabled;

        @NameInMap("Fallback")
        public Long fallback;

        @NameInMap("FaultProtection")
        public Long faultProtection;

        @NameInMap("GmtModified")
        public Long gmtModified;

        @NameInMap("Name")
        public String name;

        @NameInMap("OrderNum")
        public Long orderNum;

        @NameInMap("Conditions")
        public java.util.List<GetMsSgRouterRulesResponseBodyRouterRuleGroupModelRulesConditions> conditions;

        @NameInMap("Destinations")
        public java.util.List<GetMsSgRouterRulesResponseBodyRouterRuleGroupModelRulesDestinations> destinations;

        @NameInMap("Grays")
        public java.util.List<GetMsSgRouterRulesResponseBodyRouterRuleGroupModelRulesGrays> grays;

        public static GetMsSgRouterRulesResponseBodyRouterRuleGroupModelRules build(java.util.Map<String, ?> map) throws Exception {
            GetMsSgRouterRulesResponseBodyRouterRuleGroupModelRules self = new GetMsSgRouterRulesResponseBodyRouterRuleGroupModelRules();
            return TeaModel.build(map, self);
        }

        public GetMsSgRouterRulesResponseBodyRouterRuleGroupModelRules setEnabled(Long enabled) {
            this.enabled = enabled;
            return this;
        }
        public Long getEnabled() {
            return this.enabled;
        }

        public GetMsSgRouterRulesResponseBodyRouterRuleGroupModelRules setFallback(Long fallback) {
            this.fallback = fallback;
            return this;
        }
        public Long getFallback() {
            return this.fallback;
        }

        public GetMsSgRouterRulesResponseBodyRouterRuleGroupModelRules setFaultProtection(Long faultProtection) {
            this.faultProtection = faultProtection;
            return this;
        }
        public Long getFaultProtection() {
            return this.faultProtection;
        }

        public GetMsSgRouterRulesResponseBodyRouterRuleGroupModelRules setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public GetMsSgRouterRulesResponseBodyRouterRuleGroupModelRules setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetMsSgRouterRulesResponseBodyRouterRuleGroupModelRules setOrderNum(Long orderNum) {
            this.orderNum = orderNum;
            return this;
        }
        public Long getOrderNum() {
            return this.orderNum;
        }

        public GetMsSgRouterRulesResponseBodyRouterRuleGroupModelRules setConditions(java.util.List<GetMsSgRouterRulesResponseBodyRouterRuleGroupModelRulesConditions> conditions) {
            this.conditions = conditions;
            return this;
        }
        public java.util.List<GetMsSgRouterRulesResponseBodyRouterRuleGroupModelRulesConditions> getConditions() {
            return this.conditions;
        }

        public GetMsSgRouterRulesResponseBodyRouterRuleGroupModelRules setDestinations(java.util.List<GetMsSgRouterRulesResponseBodyRouterRuleGroupModelRulesDestinations> destinations) {
            this.destinations = destinations;
            return this;
        }
        public java.util.List<GetMsSgRouterRulesResponseBodyRouterRuleGroupModelRulesDestinations> getDestinations() {
            return this.destinations;
        }

        public GetMsSgRouterRulesResponseBodyRouterRuleGroupModelRules setGrays(java.util.List<GetMsSgRouterRulesResponseBodyRouterRuleGroupModelRulesGrays> grays) {
            this.grays = grays;
            return this;
        }
        public java.util.List<GetMsSgRouterRulesResponseBodyRouterRuleGroupModelRulesGrays> getGrays() {
            return this.grays;
        }

    }

    public static class GetMsSgRouterRulesResponseBodyRouterRuleGroupModel extends TeaModel {
        @NameInMap("AppName")
        public String appName;

        @NameInMap("DataId")
        public String dataId;

        @NameInMap("DispatchVersion")
        public Long dispatchVersion;

        @NameInMap("Enabled")
        public Long enabled;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("Id")
        public Long id;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("Operator")
        public String operator;

        @NameInMap("Type")
        public String type;

        @NameInMap("Rules")
        public java.util.List<GetMsSgRouterRulesResponseBodyRouterRuleGroupModelRules> rules;

        public static GetMsSgRouterRulesResponseBodyRouterRuleGroupModel build(java.util.Map<String, ?> map) throws Exception {
            GetMsSgRouterRulesResponseBodyRouterRuleGroupModel self = new GetMsSgRouterRulesResponseBodyRouterRuleGroupModel();
            return TeaModel.build(map, self);
        }

        public GetMsSgRouterRulesResponseBodyRouterRuleGroupModel setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public GetMsSgRouterRulesResponseBodyRouterRuleGroupModel setDataId(String dataId) {
            this.dataId = dataId;
            return this;
        }
        public String getDataId() {
            return this.dataId;
        }

        public GetMsSgRouterRulesResponseBodyRouterRuleGroupModel setDispatchVersion(Long dispatchVersion) {
            this.dispatchVersion = dispatchVersion;
            return this;
        }
        public Long getDispatchVersion() {
            return this.dispatchVersion;
        }

        public GetMsSgRouterRulesResponseBodyRouterRuleGroupModel setEnabled(Long enabled) {
            this.enabled = enabled;
            return this;
        }
        public Long getEnabled() {
            return this.enabled;
        }

        public GetMsSgRouterRulesResponseBodyRouterRuleGroupModel setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public GetMsSgRouterRulesResponseBodyRouterRuleGroupModel setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetMsSgRouterRulesResponseBodyRouterRuleGroupModel setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetMsSgRouterRulesResponseBodyRouterRuleGroupModel setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public GetMsSgRouterRulesResponseBodyRouterRuleGroupModel setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetMsSgRouterRulesResponseBodyRouterRuleGroupModel setRules(java.util.List<GetMsSgRouterRulesResponseBodyRouterRuleGroupModelRules> rules) {
            this.rules = rules;
            return this;
        }
        public java.util.List<GetMsSgRouterRulesResponseBodyRouterRuleGroupModelRules> getRules() {
            return this.rules;
        }

    }

}
