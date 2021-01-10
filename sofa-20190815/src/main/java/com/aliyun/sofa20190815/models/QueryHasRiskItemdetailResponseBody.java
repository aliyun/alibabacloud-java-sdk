// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryHasRiskItemdetailResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultContent")
    public QueryHasRiskItemdetailResponseBodyResultContent resultContent;

    public static QueryHasRiskItemdetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryHasRiskItemdetailResponseBody self = new QueryHasRiskItemdetailResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryHasRiskItemdetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryHasRiskItemdetailResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryHasRiskItemdetailResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryHasRiskItemdetailResponseBody setResultContent(QueryHasRiskItemdetailResponseBodyResultContent resultContent) {
        this.resultContent = resultContent;
        return this;
    }
    public QueryHasRiskItemdetailResponseBodyResultContent getResultContent() {
        return this.resultContent;
    }

    public static class QueryHasRiskItemdetailResponseBodyResultContentDataActionLogs extends TeaModel {
        @NameInMap("RiskItemId")
        public String riskItemId;

        @NameInMap("ActionTime")
        public String actionTime;

        @NameInMap("Action")
        public String action;

        @NameInMap("Operator")
        public String operator;

        public static QueryHasRiskItemdetailResponseBodyResultContentDataActionLogs build(java.util.Map<String, ?> map) throws Exception {
            QueryHasRiskItemdetailResponseBodyResultContentDataActionLogs self = new QueryHasRiskItemdetailResponseBodyResultContentDataActionLogs();
            return TeaModel.build(map, self);
        }

        public QueryHasRiskItemdetailResponseBodyResultContentDataActionLogs setRiskItemId(String riskItemId) {
            this.riskItemId = riskItemId;
            return this;
        }
        public String getRiskItemId() {
            return this.riskItemId;
        }

        public QueryHasRiskItemdetailResponseBodyResultContentDataActionLogs setActionTime(String actionTime) {
            this.actionTime = actionTime;
            return this;
        }
        public String getActionTime() {
            return this.actionTime;
        }

        public QueryHasRiskItemdetailResponseBodyResultContentDataActionLogs setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public QueryHasRiskItemdetailResponseBodyResultContentDataActionLogs setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

    }

    public static class QueryHasRiskItemdetailResponseBodyResultContentDataRiskOrders extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("TenantId")
        public String tenantId;

        @NameInMap("Creator")
        public String creator;

        @NameInMap("Operator")
        public String operator;

        @NameInMap("Description")
        public String description;

        @NameInMap("Status")
        public String status;

        @NameInMap("AggregateStatus")
        public String aggregateStatus;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Id")
        public String id;

        @NameInMap("OrderId")
        public String orderId;

        @NameInMap("OrderType")
        public String orderType;

        @NameInMap("NotExist")
        public Boolean notExist;

        public static QueryHasRiskItemdetailResponseBodyResultContentDataRiskOrders build(java.util.Map<String, ?> map) throws Exception {
            QueryHasRiskItemdetailResponseBodyResultContentDataRiskOrders self = new QueryHasRiskItemdetailResponseBodyResultContentDataRiskOrders();
            return TeaModel.build(map, self);
        }

        public QueryHasRiskItemdetailResponseBodyResultContentDataRiskOrders setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryHasRiskItemdetailResponseBodyResultContentDataRiskOrders setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public QueryHasRiskItemdetailResponseBodyResultContentDataRiskOrders setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public QueryHasRiskItemdetailResponseBodyResultContentDataRiskOrders setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public QueryHasRiskItemdetailResponseBodyResultContentDataRiskOrders setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public QueryHasRiskItemdetailResponseBodyResultContentDataRiskOrders setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QueryHasRiskItemdetailResponseBodyResultContentDataRiskOrders setAggregateStatus(String aggregateStatus) {
            this.aggregateStatus = aggregateStatus;
            return this;
        }
        public String getAggregateStatus() {
            return this.aggregateStatus;
        }

        public QueryHasRiskItemdetailResponseBodyResultContentDataRiskOrders setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public QueryHasRiskItemdetailResponseBodyResultContentDataRiskOrders setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public QueryHasRiskItemdetailResponseBodyResultContentDataRiskOrders setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public QueryHasRiskItemdetailResponseBodyResultContentDataRiskOrders setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryHasRiskItemdetailResponseBodyResultContentDataRiskOrders setOrderId(String orderId) {
            this.orderId = orderId;
            return this;
        }
        public String getOrderId() {
            return this.orderId;
        }

        public QueryHasRiskItemdetailResponseBodyResultContentDataRiskOrders setOrderType(String orderType) {
            this.orderType = orderType;
            return this;
        }
        public String getOrderType() {
            return this.orderType;
        }

        public QueryHasRiskItemdetailResponseBodyResultContentDataRiskOrders setNotExist(Boolean notExist) {
            this.notExist = notExist;
            return this;
        }
        public Boolean getNotExist() {
            return this.notExist;
        }

    }

    public static class QueryHasRiskItemdetailResponseBodyResultContentData extends TeaModel {
        @NameInMap("AdditionalInfo")
        public String additionalInfo;

        @NameInMap("AggregationRiskItemId")
        public String aggregationRiskItemId;

        @NameInMap("CellId")
        public String cellId;

        @NameInMap("CloseComment")
        public String closeComment;

        @NameInMap("Deadline")
        public String deadline;

        @NameInMap("Description")
        public String description;

        @NameInMap("Id")
        public String id;

        @NameInMap("Resolver")
        public String resolver;

        @NameInMap("RiskEvent")
        public String riskEvent;

        @NameInMap("RiskLevel")
        public String riskLevel;

        @NameInMap("RiskName")
        public String riskName;

        @NameInMap("RiskSource")
        public String riskSource;

        @NameInMap("RiskStatus")
        public String riskStatus;

        @NameInMap("RiskTarget")
        public String riskTarget;

        @NameInMap("RiskTargetName")
        public String riskTargetName;

        @NameInMap("RiskTargetType")
        public String riskTargetType;

        @NameInMap("RiskTime")
        public String riskTime;

        @NameInMap("ActionLogs")
        public java.util.List<QueryHasRiskItemdetailResponseBodyResultContentDataActionLogs> actionLogs;

        @NameInMap("RiskOrders")
        public java.util.List<QueryHasRiskItemdetailResponseBodyResultContentDataRiskOrders> riskOrders;

        public static QueryHasRiskItemdetailResponseBodyResultContentData build(java.util.Map<String, ?> map) throws Exception {
            QueryHasRiskItemdetailResponseBodyResultContentData self = new QueryHasRiskItemdetailResponseBodyResultContentData();
            return TeaModel.build(map, self);
        }

        public QueryHasRiskItemdetailResponseBodyResultContentData setAdditionalInfo(String additionalInfo) {
            this.additionalInfo = additionalInfo;
            return this;
        }
        public String getAdditionalInfo() {
            return this.additionalInfo;
        }

        public QueryHasRiskItemdetailResponseBodyResultContentData setAggregationRiskItemId(String aggregationRiskItemId) {
            this.aggregationRiskItemId = aggregationRiskItemId;
            return this;
        }
        public String getAggregationRiskItemId() {
            return this.aggregationRiskItemId;
        }

        public QueryHasRiskItemdetailResponseBodyResultContentData setCellId(String cellId) {
            this.cellId = cellId;
            return this;
        }
        public String getCellId() {
            return this.cellId;
        }

        public QueryHasRiskItemdetailResponseBodyResultContentData setCloseComment(String closeComment) {
            this.closeComment = closeComment;
            return this;
        }
        public String getCloseComment() {
            return this.closeComment;
        }

        public QueryHasRiskItemdetailResponseBodyResultContentData setDeadline(String deadline) {
            this.deadline = deadline;
            return this;
        }
        public String getDeadline() {
            return this.deadline;
        }

        public QueryHasRiskItemdetailResponseBodyResultContentData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public QueryHasRiskItemdetailResponseBodyResultContentData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryHasRiskItemdetailResponseBodyResultContentData setResolver(String resolver) {
            this.resolver = resolver;
            return this;
        }
        public String getResolver() {
            return this.resolver;
        }

        public QueryHasRiskItemdetailResponseBodyResultContentData setRiskEvent(String riskEvent) {
            this.riskEvent = riskEvent;
            return this;
        }
        public String getRiskEvent() {
            return this.riskEvent;
        }

        public QueryHasRiskItemdetailResponseBodyResultContentData setRiskLevel(String riskLevel) {
            this.riskLevel = riskLevel;
            return this;
        }
        public String getRiskLevel() {
            return this.riskLevel;
        }

        public QueryHasRiskItemdetailResponseBodyResultContentData setRiskName(String riskName) {
            this.riskName = riskName;
            return this;
        }
        public String getRiskName() {
            return this.riskName;
        }

        public QueryHasRiskItemdetailResponseBodyResultContentData setRiskSource(String riskSource) {
            this.riskSource = riskSource;
            return this;
        }
        public String getRiskSource() {
            return this.riskSource;
        }

        public QueryHasRiskItemdetailResponseBodyResultContentData setRiskStatus(String riskStatus) {
            this.riskStatus = riskStatus;
            return this;
        }
        public String getRiskStatus() {
            return this.riskStatus;
        }

        public QueryHasRiskItemdetailResponseBodyResultContentData setRiskTarget(String riskTarget) {
            this.riskTarget = riskTarget;
            return this;
        }
        public String getRiskTarget() {
            return this.riskTarget;
        }

        public QueryHasRiskItemdetailResponseBodyResultContentData setRiskTargetName(String riskTargetName) {
            this.riskTargetName = riskTargetName;
            return this;
        }
        public String getRiskTargetName() {
            return this.riskTargetName;
        }

        public QueryHasRiskItemdetailResponseBodyResultContentData setRiskTargetType(String riskTargetType) {
            this.riskTargetType = riskTargetType;
            return this;
        }
        public String getRiskTargetType() {
            return this.riskTargetType;
        }

        public QueryHasRiskItemdetailResponseBodyResultContentData setRiskTime(String riskTime) {
            this.riskTime = riskTime;
            return this;
        }
        public String getRiskTime() {
            return this.riskTime;
        }

        public QueryHasRiskItemdetailResponseBodyResultContentData setActionLogs(java.util.List<QueryHasRiskItemdetailResponseBodyResultContentDataActionLogs> actionLogs) {
            this.actionLogs = actionLogs;
            return this;
        }
        public java.util.List<QueryHasRiskItemdetailResponseBodyResultContentDataActionLogs> getActionLogs() {
            return this.actionLogs;
        }

        public QueryHasRiskItemdetailResponseBodyResultContentData setRiskOrders(java.util.List<QueryHasRiskItemdetailResponseBodyResultContentDataRiskOrders> riskOrders) {
            this.riskOrders = riskOrders;
            return this;
        }
        public java.util.List<QueryHasRiskItemdetailResponseBodyResultContentDataRiskOrders> getRiskOrders() {
            return this.riskOrders;
        }

    }

    public static class QueryHasRiskItemdetailResponseBodyResultContentTopErrorReason extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Content")
        public String content;

        public static QueryHasRiskItemdetailResponseBodyResultContentTopErrorReason build(java.util.Map<String, ?> map) throws Exception {
            QueryHasRiskItemdetailResponseBodyResultContentTopErrorReason self = new QueryHasRiskItemdetailResponseBodyResultContentTopErrorReason();
            return TeaModel.build(map, self);
        }

        public QueryHasRiskItemdetailResponseBodyResultContentTopErrorReason setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public QueryHasRiskItemdetailResponseBodyResultContentTopErrorReason setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

    public static class QueryHasRiskItemdetailResponseBodyResultContentTopErrorCode extends TeaModel {
        @NameInMap("ExceptionCode")
        public String exceptionCode;

        @NameInMap("ExceptionCodeDescription")
        public String exceptionCodeDescription;

        @NameInMap("Level")
        public String level;

        @NameInMap("Prefix")
        public String prefix;

        @NameInMap("Scene")
        public String scene;

        @NameInMap("SceneName")
        public String sceneName;

        @NameInMap("Type")
        public String type;

        @NameInMap("Version")
        public String version;

        public static QueryHasRiskItemdetailResponseBodyResultContentTopErrorCode build(java.util.Map<String, ?> map) throws Exception {
            QueryHasRiskItemdetailResponseBodyResultContentTopErrorCode self = new QueryHasRiskItemdetailResponseBodyResultContentTopErrorCode();
            return TeaModel.build(map, self);
        }

        public QueryHasRiskItemdetailResponseBodyResultContentTopErrorCode setExceptionCode(String exceptionCode) {
            this.exceptionCode = exceptionCode;
            return this;
        }
        public String getExceptionCode() {
            return this.exceptionCode;
        }

        public QueryHasRiskItemdetailResponseBodyResultContentTopErrorCode setExceptionCodeDescription(String exceptionCodeDescription) {
            this.exceptionCodeDescription = exceptionCodeDescription;
            return this;
        }
        public String getExceptionCodeDescription() {
            return this.exceptionCodeDescription;
        }

        public QueryHasRiskItemdetailResponseBodyResultContentTopErrorCode setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public QueryHasRiskItemdetailResponseBodyResultContentTopErrorCode setPrefix(String prefix) {
            this.prefix = prefix;
            return this;
        }
        public String getPrefix() {
            return this.prefix;
        }

        public QueryHasRiskItemdetailResponseBodyResultContentTopErrorCode setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public QueryHasRiskItemdetailResponseBodyResultContentTopErrorCode setSceneName(String sceneName) {
            this.sceneName = sceneName;
            return this;
        }
        public String getSceneName() {
            return this.sceneName;
        }

        public QueryHasRiskItemdetailResponseBodyResultContentTopErrorCode setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public QueryHasRiskItemdetailResponseBodyResultContentTopErrorCode setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class QueryHasRiskItemdetailResponseBodyResultContent extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Message")
        public String message;

        @NameInMap("Success")
        public Boolean success;

        @NameInMap("Data")
        public QueryHasRiskItemdetailResponseBodyResultContentData data;

        @NameInMap("TopErrorReason")
        public QueryHasRiskItemdetailResponseBodyResultContentTopErrorReason topErrorReason;

        @NameInMap("TopErrorCode")
        public QueryHasRiskItemdetailResponseBodyResultContentTopErrorCode topErrorCode;

        public static QueryHasRiskItemdetailResponseBodyResultContent build(java.util.Map<String, ?> map) throws Exception {
            QueryHasRiskItemdetailResponseBodyResultContent self = new QueryHasRiskItemdetailResponseBodyResultContent();
            return TeaModel.build(map, self);
        }

        public QueryHasRiskItemdetailResponseBodyResultContent setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public QueryHasRiskItemdetailResponseBodyResultContent setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public QueryHasRiskItemdetailResponseBodyResultContent setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public QueryHasRiskItemdetailResponseBodyResultContent setData(QueryHasRiskItemdetailResponseBodyResultContentData data) {
            this.data = data;
            return this;
        }
        public QueryHasRiskItemdetailResponseBodyResultContentData getData() {
            return this.data;
        }

        public QueryHasRiskItemdetailResponseBodyResultContent setTopErrorReason(QueryHasRiskItemdetailResponseBodyResultContentTopErrorReason topErrorReason) {
            this.topErrorReason = topErrorReason;
            return this;
        }
        public QueryHasRiskItemdetailResponseBodyResultContentTopErrorReason getTopErrorReason() {
            return this.topErrorReason;
        }

        public QueryHasRiskItemdetailResponseBodyResultContent setTopErrorCode(QueryHasRiskItemdetailResponseBodyResultContentTopErrorCode topErrorCode) {
            this.topErrorCode = topErrorCode;
            return this;
        }
        public QueryHasRiskItemdetailResponseBodyResultContentTopErrorCode getTopErrorCode() {
            return this.topErrorCode;
        }

    }

}
