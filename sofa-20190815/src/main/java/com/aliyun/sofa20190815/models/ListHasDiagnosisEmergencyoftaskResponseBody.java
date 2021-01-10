// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListHasDiagnosisEmergencyoftaskResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultContent")
    public ListHasDiagnosisEmergencyoftaskResponseBodyResultContent resultContent;

    public static ListHasDiagnosisEmergencyoftaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListHasDiagnosisEmergencyoftaskResponseBody self = new ListHasDiagnosisEmergencyoftaskResponseBody();
        return TeaModel.build(map, self);
    }

    public ListHasDiagnosisEmergencyoftaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListHasDiagnosisEmergencyoftaskResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListHasDiagnosisEmergencyoftaskResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public ListHasDiagnosisEmergencyoftaskResponseBody setResultContent(ListHasDiagnosisEmergencyoftaskResponseBodyResultContent resultContent) {
        this.resultContent = resultContent;
        return this;
    }
    public ListHasDiagnosisEmergencyoftaskResponseBodyResultContent getResultContent() {
        return this.resultContent;
    }

    public static class ListHasDiagnosisEmergencyoftaskResponseBodyResultContentDataEmergencyTargetDTO extends TeaModel {
        @NameInMap("TargetType")
        public String targetType;

        @NameInMap("TargetValues")
        public java.util.List<String> targetValues;

        public static ListHasDiagnosisEmergencyoftaskResponseBodyResultContentDataEmergencyTargetDTO build(java.util.Map<String, ?> map) throws Exception {
            ListHasDiagnosisEmergencyoftaskResponseBodyResultContentDataEmergencyTargetDTO self = new ListHasDiagnosisEmergencyoftaskResponseBodyResultContentDataEmergencyTargetDTO();
            return TeaModel.build(map, self);
        }

        public ListHasDiagnosisEmergencyoftaskResponseBodyResultContentDataEmergencyTargetDTO setTargetType(String targetType) {
            this.targetType = targetType;
            return this;
        }
        public String getTargetType() {
            return this.targetType;
        }

        public ListHasDiagnosisEmergencyoftaskResponseBodyResultContentDataEmergencyTargetDTO setTargetValues(java.util.List<String> targetValues) {
            this.targetValues = targetValues;
            return this;
        }
        public java.util.List<String> getTargetValues() {
            return this.targetValues;
        }

    }

    public static class ListHasDiagnosisEmergencyoftaskResponseBodyResultContentData extends TeaModel {
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
        public ListHasDiagnosisEmergencyoftaskResponseBodyResultContentDataEmergencyTargetDTO emergencyTargetDTO;

        public static ListHasDiagnosisEmergencyoftaskResponseBodyResultContentData build(java.util.Map<String, ?> map) throws Exception {
            ListHasDiagnosisEmergencyoftaskResponseBodyResultContentData self = new ListHasDiagnosisEmergencyoftaskResponseBodyResultContentData();
            return TeaModel.build(map, self);
        }

        public ListHasDiagnosisEmergencyoftaskResponseBodyResultContentData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListHasDiagnosisEmergencyoftaskResponseBodyResultContentData setUtcCreate(String utcCreate) {
            this.utcCreate = utcCreate;
            return this;
        }
        public String getUtcCreate() {
            return this.utcCreate;
        }

        public ListHasDiagnosisEmergencyoftaskResponseBodyResultContentData setUtcModified(String utcModified) {
            this.utcModified = utcModified;
            return this;
        }
        public String getUtcModified() {
            return this.utcModified;
        }

        public ListHasDiagnosisEmergencyoftaskResponseBodyResultContentData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListHasDiagnosisEmergencyoftaskResponseBodyResultContentData setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public ListHasDiagnosisEmergencyoftaskResponseBodyResultContentData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListHasDiagnosisEmergencyoftaskResponseBodyResultContentData setRiskLevel(String riskLevel) {
            this.riskLevel = riskLevel;
            return this;
        }
        public String getRiskLevel() {
            return this.riskLevel;
        }

        public ListHasDiagnosisEmergencyoftaskResponseBodyResultContentData setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public ListHasDiagnosisEmergencyoftaskResponseBodyResultContentData setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public ListHasDiagnosisEmergencyoftaskResponseBodyResultContentData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListHasDiagnosisEmergencyoftaskResponseBodyResultContentData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListHasDiagnosisEmergencyoftaskResponseBodyResultContentData setEmergencyTargetDTO(ListHasDiagnosisEmergencyoftaskResponseBodyResultContentDataEmergencyTargetDTO emergencyTargetDTO) {
            this.emergencyTargetDTO = emergencyTargetDTO;
            return this;
        }
        public ListHasDiagnosisEmergencyoftaskResponseBodyResultContentDataEmergencyTargetDTO getEmergencyTargetDTO() {
            return this.emergencyTargetDTO;
        }

    }

    public static class ListHasDiagnosisEmergencyoftaskResponseBodyResultContentTopErrorCode extends TeaModel {
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

        public static ListHasDiagnosisEmergencyoftaskResponseBodyResultContentTopErrorCode build(java.util.Map<String, ?> map) throws Exception {
            ListHasDiagnosisEmergencyoftaskResponseBodyResultContentTopErrorCode self = new ListHasDiagnosisEmergencyoftaskResponseBodyResultContentTopErrorCode();
            return TeaModel.build(map, self);
        }

        public ListHasDiagnosisEmergencyoftaskResponseBodyResultContentTopErrorCode setExceptionCode(String exceptionCode) {
            this.exceptionCode = exceptionCode;
            return this;
        }
        public String getExceptionCode() {
            return this.exceptionCode;
        }

        public ListHasDiagnosisEmergencyoftaskResponseBodyResultContentTopErrorCode setExceptionCodeDescription(String exceptionCodeDescription) {
            this.exceptionCodeDescription = exceptionCodeDescription;
            return this;
        }
        public String getExceptionCodeDescription() {
            return this.exceptionCodeDescription;
        }

        public ListHasDiagnosisEmergencyoftaskResponseBodyResultContentTopErrorCode setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public ListHasDiagnosisEmergencyoftaskResponseBodyResultContentTopErrorCode setPrefix(String prefix) {
            this.prefix = prefix;
            return this;
        }
        public String getPrefix() {
            return this.prefix;
        }

        public ListHasDiagnosisEmergencyoftaskResponseBodyResultContentTopErrorCode setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public ListHasDiagnosisEmergencyoftaskResponseBodyResultContentTopErrorCode setSceneName(String sceneName) {
            this.sceneName = sceneName;
            return this;
        }
        public String getSceneName() {
            return this.sceneName;
        }

        public ListHasDiagnosisEmergencyoftaskResponseBodyResultContentTopErrorCode setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListHasDiagnosisEmergencyoftaskResponseBodyResultContentTopErrorCode setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class ListHasDiagnosisEmergencyoftaskResponseBodyResultContentTopErrorReason extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Content")
        public String content;

        public static ListHasDiagnosisEmergencyoftaskResponseBodyResultContentTopErrorReason build(java.util.Map<String, ?> map) throws Exception {
            ListHasDiagnosisEmergencyoftaskResponseBodyResultContentTopErrorReason self = new ListHasDiagnosisEmergencyoftaskResponseBodyResultContentTopErrorReason();
            return TeaModel.build(map, self);
        }

        public ListHasDiagnosisEmergencyoftaskResponseBodyResultContentTopErrorReason setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public ListHasDiagnosisEmergencyoftaskResponseBodyResultContentTopErrorReason setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

    public static class ListHasDiagnosisEmergencyoftaskResponseBodyResultContent extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Message")
        public String message;

        @NameInMap("Success")
        public Boolean success;

        @NameInMap("Data")
        public java.util.List<ListHasDiagnosisEmergencyoftaskResponseBodyResultContentData> data;

        @NameInMap("TopErrorCode")
        public ListHasDiagnosisEmergencyoftaskResponseBodyResultContentTopErrorCode topErrorCode;

        @NameInMap("TopErrorReason")
        public ListHasDiagnosisEmergencyoftaskResponseBodyResultContentTopErrorReason topErrorReason;

        public static ListHasDiagnosisEmergencyoftaskResponseBodyResultContent build(java.util.Map<String, ?> map) throws Exception {
            ListHasDiagnosisEmergencyoftaskResponseBodyResultContent self = new ListHasDiagnosisEmergencyoftaskResponseBodyResultContent();
            return TeaModel.build(map, self);
        }

        public ListHasDiagnosisEmergencyoftaskResponseBodyResultContent setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public ListHasDiagnosisEmergencyoftaskResponseBodyResultContent setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ListHasDiagnosisEmergencyoftaskResponseBodyResultContent setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public ListHasDiagnosisEmergencyoftaskResponseBodyResultContent setData(java.util.List<ListHasDiagnosisEmergencyoftaskResponseBodyResultContentData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<ListHasDiagnosisEmergencyoftaskResponseBodyResultContentData> getData() {
            return this.data;
        }

        public ListHasDiagnosisEmergencyoftaskResponseBodyResultContent setTopErrorCode(ListHasDiagnosisEmergencyoftaskResponseBodyResultContentTopErrorCode topErrorCode) {
            this.topErrorCode = topErrorCode;
            return this;
        }
        public ListHasDiagnosisEmergencyoftaskResponseBodyResultContentTopErrorCode getTopErrorCode() {
            return this.topErrorCode;
        }

        public ListHasDiagnosisEmergencyoftaskResponseBodyResultContent setTopErrorReason(ListHasDiagnosisEmergencyoftaskResponseBodyResultContentTopErrorReason topErrorReason) {
            this.topErrorReason = topErrorReason;
            return this;
        }
        public ListHasDiagnosisEmergencyoftaskResponseBodyResultContentTopErrorReason getTopErrorReason() {
            return this.topErrorReason;
        }

    }

}
