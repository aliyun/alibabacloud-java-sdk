// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryHasRiskPreplanforaggregationitemResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultContent")
    public QueryHasRiskPreplanforaggregationitemResponseBodyResultContent resultContent;

    public static QueryHasRiskPreplanforaggregationitemResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryHasRiskPreplanforaggregationitemResponseBody self = new QueryHasRiskPreplanforaggregationitemResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryHasRiskPreplanforaggregationitemResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryHasRiskPreplanforaggregationitemResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryHasRiskPreplanforaggregationitemResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryHasRiskPreplanforaggregationitemResponseBody setResultContent(QueryHasRiskPreplanforaggregationitemResponseBodyResultContent resultContent) {
        this.resultContent = resultContent;
        return this;
    }
    public QueryHasRiskPreplanforaggregationitemResponseBodyResultContent getResultContent() {
        return this.resultContent;
    }

    public static class QueryHasRiskPreplanforaggregationitemResponseBodyResultContentDataEmergencyTargetDTO extends TeaModel {
        @NameInMap("TargetType")
        public String targetType;

        @NameInMap("TargetValues")
        public java.util.List<String> targetValues;

        public static QueryHasRiskPreplanforaggregationitemResponseBodyResultContentDataEmergencyTargetDTO build(java.util.Map<String, ?> map) throws Exception {
            QueryHasRiskPreplanforaggregationitemResponseBodyResultContentDataEmergencyTargetDTO self = new QueryHasRiskPreplanforaggregationitemResponseBodyResultContentDataEmergencyTargetDTO();
            return TeaModel.build(map, self);
        }

        public QueryHasRiskPreplanforaggregationitemResponseBodyResultContentDataEmergencyTargetDTO setTargetType(String targetType) {
            this.targetType = targetType;
            return this;
        }
        public String getTargetType() {
            return this.targetType;
        }

        public QueryHasRiskPreplanforaggregationitemResponseBodyResultContentDataEmergencyTargetDTO setTargetValues(java.util.List<String> targetValues) {
            this.targetValues = targetValues;
            return this;
        }
        public java.util.List<String> getTargetValues() {
            return this.targetValues;
        }

    }

    public static class QueryHasRiskPreplanforaggregationitemResponseBodyResultContentData extends TeaModel {
        @NameInMap("Id")
        public String id;

        @NameInMap("UtcCreate")
        public String utcCreate;

        @NameInMap("UtcModified")
        public String utcModified;

        @NameInMap("Name")
        public String name;

        @NameInMap("TenantId")
        public String tenantId;

        @NameInMap("Status")
        public String status;

        @NameInMap("RiskLevel")
        public String riskLevel;

        @NameInMap("Creator")
        public String creator;

        @NameInMap("Operator")
        public String operator;

        @NameInMap("Description")
        public String description;

        @NameInMap("Type")
        public String type;

        @NameInMap("EmergencyTargetDTO")
        public QueryHasRiskPreplanforaggregationitemResponseBodyResultContentDataEmergencyTargetDTO emergencyTargetDTO;

        public static QueryHasRiskPreplanforaggregationitemResponseBodyResultContentData build(java.util.Map<String, ?> map) throws Exception {
            QueryHasRiskPreplanforaggregationitemResponseBodyResultContentData self = new QueryHasRiskPreplanforaggregationitemResponseBodyResultContentData();
            return TeaModel.build(map, self);
        }

        public QueryHasRiskPreplanforaggregationitemResponseBodyResultContentData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryHasRiskPreplanforaggregationitemResponseBodyResultContentData setUtcCreate(String utcCreate) {
            this.utcCreate = utcCreate;
            return this;
        }
        public String getUtcCreate() {
            return this.utcCreate;
        }

        public QueryHasRiskPreplanforaggregationitemResponseBodyResultContentData setUtcModified(String utcModified) {
            this.utcModified = utcModified;
            return this;
        }
        public String getUtcModified() {
            return this.utcModified;
        }

        public QueryHasRiskPreplanforaggregationitemResponseBodyResultContentData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryHasRiskPreplanforaggregationitemResponseBodyResultContentData setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public QueryHasRiskPreplanforaggregationitemResponseBodyResultContentData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QueryHasRiskPreplanforaggregationitemResponseBodyResultContentData setRiskLevel(String riskLevel) {
            this.riskLevel = riskLevel;
            return this;
        }
        public String getRiskLevel() {
            return this.riskLevel;
        }

        public QueryHasRiskPreplanforaggregationitemResponseBodyResultContentData setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public QueryHasRiskPreplanforaggregationitemResponseBodyResultContentData setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public QueryHasRiskPreplanforaggregationitemResponseBodyResultContentData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public QueryHasRiskPreplanforaggregationitemResponseBodyResultContentData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public QueryHasRiskPreplanforaggregationitemResponseBodyResultContentData setEmergencyTargetDTO(QueryHasRiskPreplanforaggregationitemResponseBodyResultContentDataEmergencyTargetDTO emergencyTargetDTO) {
            this.emergencyTargetDTO = emergencyTargetDTO;
            return this;
        }
        public QueryHasRiskPreplanforaggregationitemResponseBodyResultContentDataEmergencyTargetDTO getEmergencyTargetDTO() {
            return this.emergencyTargetDTO;
        }

    }

    public static class QueryHasRiskPreplanforaggregationitemResponseBodyResultContentTopErrorCode extends TeaModel {
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

        public static QueryHasRiskPreplanforaggregationitemResponseBodyResultContentTopErrorCode build(java.util.Map<String, ?> map) throws Exception {
            QueryHasRiskPreplanforaggregationitemResponseBodyResultContentTopErrorCode self = new QueryHasRiskPreplanforaggregationitemResponseBodyResultContentTopErrorCode();
            return TeaModel.build(map, self);
        }

        public QueryHasRiskPreplanforaggregationitemResponseBodyResultContentTopErrorCode setExceptionCode(String exceptionCode) {
            this.exceptionCode = exceptionCode;
            return this;
        }
        public String getExceptionCode() {
            return this.exceptionCode;
        }

        public QueryHasRiskPreplanforaggregationitemResponseBodyResultContentTopErrorCode setExceptionCodeDescription(String exceptionCodeDescription) {
            this.exceptionCodeDescription = exceptionCodeDescription;
            return this;
        }
        public String getExceptionCodeDescription() {
            return this.exceptionCodeDescription;
        }

        public QueryHasRiskPreplanforaggregationitemResponseBodyResultContentTopErrorCode setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public QueryHasRiskPreplanforaggregationitemResponseBodyResultContentTopErrorCode setPrefix(String prefix) {
            this.prefix = prefix;
            return this;
        }
        public String getPrefix() {
            return this.prefix;
        }

        public QueryHasRiskPreplanforaggregationitemResponseBodyResultContentTopErrorCode setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public QueryHasRiskPreplanforaggregationitemResponseBodyResultContentTopErrorCode setSceneName(String sceneName) {
            this.sceneName = sceneName;
            return this;
        }
        public String getSceneName() {
            return this.sceneName;
        }

        public QueryHasRiskPreplanforaggregationitemResponseBodyResultContentTopErrorCode setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public QueryHasRiskPreplanforaggregationitemResponseBodyResultContentTopErrorCode setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class QueryHasRiskPreplanforaggregationitemResponseBodyResultContentTopErrorReason extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Content")
        public String content;

        public static QueryHasRiskPreplanforaggregationitemResponseBodyResultContentTopErrorReason build(java.util.Map<String, ?> map) throws Exception {
            QueryHasRiskPreplanforaggregationitemResponseBodyResultContentTopErrorReason self = new QueryHasRiskPreplanforaggregationitemResponseBodyResultContentTopErrorReason();
            return TeaModel.build(map, self);
        }

        public QueryHasRiskPreplanforaggregationitemResponseBodyResultContentTopErrorReason setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public QueryHasRiskPreplanforaggregationitemResponseBodyResultContentTopErrorReason setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

    public static class QueryHasRiskPreplanforaggregationitemResponseBodyResultContent extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Message")
        public String message;

        @NameInMap("Success")
        public Boolean success;

        @NameInMap("Data")
        public java.util.List<QueryHasRiskPreplanforaggregationitemResponseBodyResultContentData> data;

        @NameInMap("TopErrorCode")
        public QueryHasRiskPreplanforaggregationitemResponseBodyResultContentTopErrorCode topErrorCode;

        @NameInMap("TopErrorReason")
        public QueryHasRiskPreplanforaggregationitemResponseBodyResultContentTopErrorReason topErrorReason;

        public static QueryHasRiskPreplanforaggregationitemResponseBodyResultContent build(java.util.Map<String, ?> map) throws Exception {
            QueryHasRiskPreplanforaggregationitemResponseBodyResultContent self = new QueryHasRiskPreplanforaggregationitemResponseBodyResultContent();
            return TeaModel.build(map, self);
        }

        public QueryHasRiskPreplanforaggregationitemResponseBodyResultContent setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public QueryHasRiskPreplanforaggregationitemResponseBodyResultContent setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public QueryHasRiskPreplanforaggregationitemResponseBodyResultContent setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public QueryHasRiskPreplanforaggregationitemResponseBodyResultContent setData(java.util.List<QueryHasRiskPreplanforaggregationitemResponseBodyResultContentData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<QueryHasRiskPreplanforaggregationitemResponseBodyResultContentData> getData() {
            return this.data;
        }

        public QueryHasRiskPreplanforaggregationitemResponseBodyResultContent setTopErrorCode(QueryHasRiskPreplanforaggregationitemResponseBodyResultContentTopErrorCode topErrorCode) {
            this.topErrorCode = topErrorCode;
            return this;
        }
        public QueryHasRiskPreplanforaggregationitemResponseBodyResultContentTopErrorCode getTopErrorCode() {
            return this.topErrorCode;
        }

        public QueryHasRiskPreplanforaggregationitemResponseBodyResultContent setTopErrorReason(QueryHasRiskPreplanforaggregationitemResponseBodyResultContentTopErrorReason topErrorReason) {
            this.topErrorReason = topErrorReason;
            return this;
        }
        public QueryHasRiskPreplanforaggregationitemResponseBodyResultContentTopErrorReason getTopErrorReason() {
            return this.topErrorReason;
        }

    }

}
