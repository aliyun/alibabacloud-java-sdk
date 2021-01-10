// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkedeploycoreDeploycoreActionqueryactionidResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Message")
    public String message;

    @NameInMap("ResponseStatusCode")
    public Long responseStatusCode;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Data")
    public QueryLinkedeploycoreDeploycoreActionqueryactionidResponseBodyData data;

    public static QueryLinkedeploycoreDeploycoreActionqueryactionidResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkedeploycoreDeploycoreActionqueryactionidResponseBody self = new QueryLinkedeploycoreDeploycoreActionqueryactionidResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryLinkedeploycoreDeploycoreActionqueryactionidResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryLinkedeploycoreDeploycoreActionqueryactionidResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryLinkedeploycoreDeploycoreActionqueryactionidResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryLinkedeploycoreDeploycoreActionqueryactionidResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryLinkedeploycoreDeploycoreActionqueryactionidResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public QueryLinkedeploycoreDeploycoreActionqueryactionidResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryLinkedeploycoreDeploycoreActionqueryactionidResponseBody setData(QueryLinkedeploycoreDeploycoreActionqueryactionidResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryLinkedeploycoreDeploycoreActionqueryactionidResponseBodyData getData() {
        return this.data;
    }

    public static class QueryLinkedeploycoreDeploycoreActionqueryactionidResponseBodyData extends TeaModel {
        @NameInMap("ActionLevel")
        public String actionLevel;

        @NameInMap("ActionStatus")
        public String actionStatus;

        @NameInMap("ActionType")
        public String actionType;

        @NameInMap("AppService")
        public String appService;

        @NameInMap("AppServiceId")
        public Long appServiceId;

        @NameInMap("ChildId")
        public Long childId;

        @NameInMap("ConfigurationId")
        public Long configurationId;

        @NameInMap("Detail")
        public String detail;

        @NameInMap("ExecutionResult")
        public String executionResult;

        @NameInMap("ExecutionResultId")
        public Long executionResultId;

        @NameInMap("GmtCreate")
        public Long gmtCreate;

        @NameInMap("GmtModified")
        public Long gmtModified;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Log")
        public String log;

        @NameInMap("Operator")
        public String operator;

        @NameInMap("OrderId")
        public Long orderId;

        @NameInMap("ParentId")
        public Long parentId;

        @NameInMap("Step")
        public Long step;

        @NameInMap("Timeout")
        public Long timeout;

        @NameInMap("SubActions")
        public java.util.List<String> subActions;

        public static QueryLinkedeploycoreDeploycoreActionqueryactionidResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryLinkedeploycoreDeploycoreActionqueryactionidResponseBodyData self = new QueryLinkedeploycoreDeploycoreActionqueryactionidResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryLinkedeploycoreDeploycoreActionqueryactionidResponseBodyData setActionLevel(String actionLevel) {
            this.actionLevel = actionLevel;
            return this;
        }
        public String getActionLevel() {
            return this.actionLevel;
        }

        public QueryLinkedeploycoreDeploycoreActionqueryactionidResponseBodyData setActionStatus(String actionStatus) {
            this.actionStatus = actionStatus;
            return this;
        }
        public String getActionStatus() {
            return this.actionStatus;
        }

        public QueryLinkedeploycoreDeploycoreActionqueryactionidResponseBodyData setActionType(String actionType) {
            this.actionType = actionType;
            return this;
        }
        public String getActionType() {
            return this.actionType;
        }

        public QueryLinkedeploycoreDeploycoreActionqueryactionidResponseBodyData setAppService(String appService) {
            this.appService = appService;
            return this;
        }
        public String getAppService() {
            return this.appService;
        }

        public QueryLinkedeploycoreDeploycoreActionqueryactionidResponseBodyData setAppServiceId(Long appServiceId) {
            this.appServiceId = appServiceId;
            return this;
        }
        public Long getAppServiceId() {
            return this.appServiceId;
        }

        public QueryLinkedeploycoreDeploycoreActionqueryactionidResponseBodyData setChildId(Long childId) {
            this.childId = childId;
            return this;
        }
        public Long getChildId() {
            return this.childId;
        }

        public QueryLinkedeploycoreDeploycoreActionqueryactionidResponseBodyData setConfigurationId(Long configurationId) {
            this.configurationId = configurationId;
            return this;
        }
        public Long getConfigurationId() {
            return this.configurationId;
        }

        public QueryLinkedeploycoreDeploycoreActionqueryactionidResponseBodyData setDetail(String detail) {
            this.detail = detail;
            return this;
        }
        public String getDetail() {
            return this.detail;
        }

        public QueryLinkedeploycoreDeploycoreActionqueryactionidResponseBodyData setExecutionResult(String executionResult) {
            this.executionResult = executionResult;
            return this;
        }
        public String getExecutionResult() {
            return this.executionResult;
        }

        public QueryLinkedeploycoreDeploycoreActionqueryactionidResponseBodyData setExecutionResultId(Long executionResultId) {
            this.executionResultId = executionResultId;
            return this;
        }
        public Long getExecutionResultId() {
            return this.executionResultId;
        }

        public QueryLinkedeploycoreDeploycoreActionqueryactionidResponseBodyData setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public QueryLinkedeploycoreDeploycoreActionqueryactionidResponseBodyData setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public QueryLinkedeploycoreDeploycoreActionqueryactionidResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public QueryLinkedeploycoreDeploycoreActionqueryactionidResponseBodyData setLog(String log) {
            this.log = log;
            return this;
        }
        public String getLog() {
            return this.log;
        }

        public QueryLinkedeploycoreDeploycoreActionqueryactionidResponseBodyData setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public QueryLinkedeploycoreDeploycoreActionqueryactionidResponseBodyData setOrderId(Long orderId) {
            this.orderId = orderId;
            return this;
        }
        public Long getOrderId() {
            return this.orderId;
        }

        public QueryLinkedeploycoreDeploycoreActionqueryactionidResponseBodyData setParentId(Long parentId) {
            this.parentId = parentId;
            return this;
        }
        public Long getParentId() {
            return this.parentId;
        }

        public QueryLinkedeploycoreDeploycoreActionqueryactionidResponseBodyData setStep(Long step) {
            this.step = step;
            return this;
        }
        public Long getStep() {
            return this.step;
        }

        public QueryLinkedeploycoreDeploycoreActionqueryactionidResponseBodyData setTimeout(Long timeout) {
            this.timeout = timeout;
            return this;
        }
        public Long getTimeout() {
            return this.timeout;
        }

        public QueryLinkedeploycoreDeploycoreActionqueryactionidResponseBodyData setSubActions(java.util.List<String> subActions) {
            this.subActions = subActions;
            return this;
        }
        public java.util.List<String> getSubActions() {
            return this.subActions;
        }

    }

}
