// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetHasRiskInspectdetailResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultContent")
    public GetHasRiskInspectdetailResponseBodyResultContent resultContent;

    public static GetHasRiskInspectdetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetHasRiskInspectdetailResponseBody self = new GetHasRiskInspectdetailResponseBody();
        return TeaModel.build(map, self);
    }

    public GetHasRiskInspectdetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetHasRiskInspectdetailResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetHasRiskInspectdetailResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public GetHasRiskInspectdetailResponseBody setResultContent(GetHasRiskInspectdetailResponseBodyResultContent resultContent) {
        this.resultContent = resultContent;
        return this;
    }
    public GetHasRiskInspectdetailResponseBodyResultContent getResultContent() {
        return this.resultContent;
    }

    public static class GetHasRiskInspectdetailResponseBodyResultContentDataActionLogs extends TeaModel {
        @NameInMap("RiskItemId")
        public String riskItemId;

        @NameInMap("ActionTime")
        public String actionTime;

        @NameInMap("Action")
        public String action;

        @NameInMap("Operator")
        public String operator;

        public static GetHasRiskInspectdetailResponseBodyResultContentDataActionLogs build(java.util.Map<String, ?> map) throws Exception {
            GetHasRiskInspectdetailResponseBodyResultContentDataActionLogs self = new GetHasRiskInspectdetailResponseBodyResultContentDataActionLogs();
            return TeaModel.build(map, self);
        }

        public GetHasRiskInspectdetailResponseBodyResultContentDataActionLogs setRiskItemId(String riskItemId) {
            this.riskItemId = riskItemId;
            return this;
        }
        public String getRiskItemId() {
            return this.riskItemId;
        }

        public GetHasRiskInspectdetailResponseBodyResultContentDataActionLogs setActionTime(String actionTime) {
            this.actionTime = actionTime;
            return this;
        }
        public String getActionTime() {
            return this.actionTime;
        }

        public GetHasRiskInspectdetailResponseBodyResultContentDataActionLogs setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public GetHasRiskInspectdetailResponseBodyResultContentDataActionLogs setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

    }

    public static class GetHasRiskInspectdetailResponseBodyResultContentDataRiskOrders extends TeaModel {
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

        public static GetHasRiskInspectdetailResponseBodyResultContentDataRiskOrders build(java.util.Map<String, ?> map) throws Exception {
            GetHasRiskInspectdetailResponseBodyResultContentDataRiskOrders self = new GetHasRiskInspectdetailResponseBodyResultContentDataRiskOrders();
            return TeaModel.build(map, self);
        }

        public GetHasRiskInspectdetailResponseBodyResultContentDataRiskOrders setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetHasRiskInspectdetailResponseBodyResultContentDataRiskOrders setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public GetHasRiskInspectdetailResponseBodyResultContentDataRiskOrders setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public GetHasRiskInspectdetailResponseBodyResultContentDataRiskOrders setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public GetHasRiskInspectdetailResponseBodyResultContentDataRiskOrders setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetHasRiskInspectdetailResponseBodyResultContentDataRiskOrders setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetHasRiskInspectdetailResponseBodyResultContentDataRiskOrders setAggregateStatus(String aggregateStatus) {
            this.aggregateStatus = aggregateStatus;
            return this;
        }
        public String getAggregateStatus() {
            return this.aggregateStatus;
        }

        public GetHasRiskInspectdetailResponseBodyResultContentDataRiskOrders setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public GetHasRiskInspectdetailResponseBodyResultContentDataRiskOrders setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public GetHasRiskInspectdetailResponseBodyResultContentDataRiskOrders setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetHasRiskInspectdetailResponseBodyResultContentDataRiskOrders setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetHasRiskInspectdetailResponseBodyResultContentDataRiskOrders setOrderId(String orderId) {
            this.orderId = orderId;
            return this;
        }
        public String getOrderId() {
            return this.orderId;
        }

        public GetHasRiskInspectdetailResponseBodyResultContentDataRiskOrders setOrderType(String orderType) {
            this.orderType = orderType;
            return this;
        }
        public String getOrderType() {
            return this.orderType;
        }

        public GetHasRiskInspectdetailResponseBodyResultContentDataRiskOrders setNotExist(Boolean notExist) {
            this.notExist = notExist;
            return this;
        }
        public Boolean getNotExist() {
            return this.notExist;
        }

    }

    public static class GetHasRiskInspectdetailResponseBodyResultContentData extends TeaModel {
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
        public java.util.List<GetHasRiskInspectdetailResponseBodyResultContentDataActionLogs> actionLogs;

        @NameInMap("RiskOrders")
        public java.util.List<GetHasRiskInspectdetailResponseBodyResultContentDataRiskOrders> riskOrders;

        public static GetHasRiskInspectdetailResponseBodyResultContentData build(java.util.Map<String, ?> map) throws Exception {
            GetHasRiskInspectdetailResponseBodyResultContentData self = new GetHasRiskInspectdetailResponseBodyResultContentData();
            return TeaModel.build(map, self);
        }

        public GetHasRiskInspectdetailResponseBodyResultContentData setAdditionalInfo(String additionalInfo) {
            this.additionalInfo = additionalInfo;
            return this;
        }
        public String getAdditionalInfo() {
            return this.additionalInfo;
        }

        public GetHasRiskInspectdetailResponseBodyResultContentData setAggregationRiskItemId(String aggregationRiskItemId) {
            this.aggregationRiskItemId = aggregationRiskItemId;
            return this;
        }
        public String getAggregationRiskItemId() {
            return this.aggregationRiskItemId;
        }

        public GetHasRiskInspectdetailResponseBodyResultContentData setCellId(String cellId) {
            this.cellId = cellId;
            return this;
        }
        public String getCellId() {
            return this.cellId;
        }

        public GetHasRiskInspectdetailResponseBodyResultContentData setCloseComment(String closeComment) {
            this.closeComment = closeComment;
            return this;
        }
        public String getCloseComment() {
            return this.closeComment;
        }

        public GetHasRiskInspectdetailResponseBodyResultContentData setDeadline(String deadline) {
            this.deadline = deadline;
            return this;
        }
        public String getDeadline() {
            return this.deadline;
        }

        public GetHasRiskInspectdetailResponseBodyResultContentData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetHasRiskInspectdetailResponseBodyResultContentData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetHasRiskInspectdetailResponseBodyResultContentData setResolver(String resolver) {
            this.resolver = resolver;
            return this;
        }
        public String getResolver() {
            return this.resolver;
        }

        public GetHasRiskInspectdetailResponseBodyResultContentData setRiskEvent(String riskEvent) {
            this.riskEvent = riskEvent;
            return this;
        }
        public String getRiskEvent() {
            return this.riskEvent;
        }

        public GetHasRiskInspectdetailResponseBodyResultContentData setRiskLevel(String riskLevel) {
            this.riskLevel = riskLevel;
            return this;
        }
        public String getRiskLevel() {
            return this.riskLevel;
        }

        public GetHasRiskInspectdetailResponseBodyResultContentData setRiskName(String riskName) {
            this.riskName = riskName;
            return this;
        }
        public String getRiskName() {
            return this.riskName;
        }

        public GetHasRiskInspectdetailResponseBodyResultContentData setRiskSource(String riskSource) {
            this.riskSource = riskSource;
            return this;
        }
        public String getRiskSource() {
            return this.riskSource;
        }

        public GetHasRiskInspectdetailResponseBodyResultContentData setRiskStatus(String riskStatus) {
            this.riskStatus = riskStatus;
            return this;
        }
        public String getRiskStatus() {
            return this.riskStatus;
        }

        public GetHasRiskInspectdetailResponseBodyResultContentData setRiskTarget(String riskTarget) {
            this.riskTarget = riskTarget;
            return this;
        }
        public String getRiskTarget() {
            return this.riskTarget;
        }

        public GetHasRiskInspectdetailResponseBodyResultContentData setRiskTargetName(String riskTargetName) {
            this.riskTargetName = riskTargetName;
            return this;
        }
        public String getRiskTargetName() {
            return this.riskTargetName;
        }

        public GetHasRiskInspectdetailResponseBodyResultContentData setRiskTargetType(String riskTargetType) {
            this.riskTargetType = riskTargetType;
            return this;
        }
        public String getRiskTargetType() {
            return this.riskTargetType;
        }

        public GetHasRiskInspectdetailResponseBodyResultContentData setRiskTime(String riskTime) {
            this.riskTime = riskTime;
            return this;
        }
        public String getRiskTime() {
            return this.riskTime;
        }

        public GetHasRiskInspectdetailResponseBodyResultContentData setActionLogs(java.util.List<GetHasRiskInspectdetailResponseBodyResultContentDataActionLogs> actionLogs) {
            this.actionLogs = actionLogs;
            return this;
        }
        public java.util.List<GetHasRiskInspectdetailResponseBodyResultContentDataActionLogs> getActionLogs() {
            return this.actionLogs;
        }

        public GetHasRiskInspectdetailResponseBodyResultContentData setRiskOrders(java.util.List<GetHasRiskInspectdetailResponseBodyResultContentDataRiskOrders> riskOrders) {
            this.riskOrders = riskOrders;
            return this;
        }
        public java.util.List<GetHasRiskInspectdetailResponseBodyResultContentDataRiskOrders> getRiskOrders() {
            return this.riskOrders;
        }

    }

    public static class GetHasRiskInspectdetailResponseBodyResultContentTopErrorReason extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Content")
        public String content;

        public static GetHasRiskInspectdetailResponseBodyResultContentTopErrorReason build(java.util.Map<String, ?> map) throws Exception {
            GetHasRiskInspectdetailResponseBodyResultContentTopErrorReason self = new GetHasRiskInspectdetailResponseBodyResultContentTopErrorReason();
            return TeaModel.build(map, self);
        }

        public GetHasRiskInspectdetailResponseBodyResultContentTopErrorReason setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public GetHasRiskInspectdetailResponseBodyResultContentTopErrorReason setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

    public static class GetHasRiskInspectdetailResponseBodyResultContentTopErrorCode extends TeaModel {
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

        public static GetHasRiskInspectdetailResponseBodyResultContentTopErrorCode build(java.util.Map<String, ?> map) throws Exception {
            GetHasRiskInspectdetailResponseBodyResultContentTopErrorCode self = new GetHasRiskInspectdetailResponseBodyResultContentTopErrorCode();
            return TeaModel.build(map, self);
        }

        public GetHasRiskInspectdetailResponseBodyResultContentTopErrorCode setExceptionCode(String exceptionCode) {
            this.exceptionCode = exceptionCode;
            return this;
        }
        public String getExceptionCode() {
            return this.exceptionCode;
        }

        public GetHasRiskInspectdetailResponseBodyResultContentTopErrorCode setExceptionCodeDescription(String exceptionCodeDescription) {
            this.exceptionCodeDescription = exceptionCodeDescription;
            return this;
        }
        public String getExceptionCodeDescription() {
            return this.exceptionCodeDescription;
        }

        public GetHasRiskInspectdetailResponseBodyResultContentTopErrorCode setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public GetHasRiskInspectdetailResponseBodyResultContentTopErrorCode setPrefix(String prefix) {
            this.prefix = prefix;
            return this;
        }
        public String getPrefix() {
            return this.prefix;
        }

        public GetHasRiskInspectdetailResponseBodyResultContentTopErrorCode setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public GetHasRiskInspectdetailResponseBodyResultContentTopErrorCode setSceneName(String sceneName) {
            this.sceneName = sceneName;
            return this;
        }
        public String getSceneName() {
            return this.sceneName;
        }

        public GetHasRiskInspectdetailResponseBodyResultContentTopErrorCode setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetHasRiskInspectdetailResponseBodyResultContentTopErrorCode setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class GetHasRiskInspectdetailResponseBodyResultContent extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Message")
        public String message;

        @NameInMap("Success")
        public Boolean success;

        @NameInMap("Data")
        public GetHasRiskInspectdetailResponseBodyResultContentData data;

        @NameInMap("TopErrorReason")
        public GetHasRiskInspectdetailResponseBodyResultContentTopErrorReason topErrorReason;

        @NameInMap("TopErrorCode")
        public GetHasRiskInspectdetailResponseBodyResultContentTopErrorCode topErrorCode;

        public static GetHasRiskInspectdetailResponseBodyResultContent build(java.util.Map<String, ?> map) throws Exception {
            GetHasRiskInspectdetailResponseBodyResultContent self = new GetHasRiskInspectdetailResponseBodyResultContent();
            return TeaModel.build(map, self);
        }

        public GetHasRiskInspectdetailResponseBodyResultContent setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public GetHasRiskInspectdetailResponseBodyResultContent setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public GetHasRiskInspectdetailResponseBodyResultContent setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public GetHasRiskInspectdetailResponseBodyResultContent setData(GetHasRiskInspectdetailResponseBodyResultContentData data) {
            this.data = data;
            return this;
        }
        public GetHasRiskInspectdetailResponseBodyResultContentData getData() {
            return this.data;
        }

        public GetHasRiskInspectdetailResponseBodyResultContent setTopErrorReason(GetHasRiskInspectdetailResponseBodyResultContentTopErrorReason topErrorReason) {
            this.topErrorReason = topErrorReason;
            return this;
        }
        public GetHasRiskInspectdetailResponseBodyResultContentTopErrorReason getTopErrorReason() {
            return this.topErrorReason;
        }

        public GetHasRiskInspectdetailResponseBodyResultContent setTopErrorCode(GetHasRiskInspectdetailResponseBodyResultContentTopErrorCode topErrorCode) {
            this.topErrorCode = topErrorCode;
            return this;
        }
        public GetHasRiskInspectdetailResponseBodyResultContentTopErrorCode getTopErrorCode() {
            return this.topErrorCode;
        }

    }

}
