// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateHasRisksceneOrderResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultContent")
    public CreateHasRisksceneOrderResponseBodyResultContent resultContent;

    public static CreateHasRisksceneOrderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateHasRisksceneOrderResponseBody self = new CreateHasRisksceneOrderResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateHasRisksceneOrderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateHasRisksceneOrderResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public CreateHasRisksceneOrderResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateHasRisksceneOrderResponseBody setResultContent(CreateHasRisksceneOrderResponseBodyResultContent resultContent) {
        this.resultContent = resultContent;
        return this;
    }
    public CreateHasRisksceneOrderResponseBodyResultContent getResultContent() {
        return this.resultContent;
    }

    public static class CreateHasRisksceneOrderResponseBodyResultContentData extends TeaModel {
        @NameInMap("AggregationRiskItemId")
        public String aggregationRiskItemId;

        @NameInMap("RiskStatus")
        public String riskStatus;

        @NameInMap("UtcModified")
        public String utcModified;

        @NameInMap("UtcCreate")
        public String utcCreate;

        @NameInMap("RiskSceneId")
        public String riskSceneId;

        @NameInMap("Id")
        public String id;

        @NameInMap("Resolver")
        public String resolver;

        @NameInMap("Creator")
        public String creator;

        @NameInMap("TenantId")
        public String tenantId;

        public static CreateHasRisksceneOrderResponseBodyResultContentData build(java.util.Map<String, ?> map) throws Exception {
            CreateHasRisksceneOrderResponseBodyResultContentData self = new CreateHasRisksceneOrderResponseBodyResultContentData();
            return TeaModel.build(map, self);
        }

        public CreateHasRisksceneOrderResponseBodyResultContentData setAggregationRiskItemId(String aggregationRiskItemId) {
            this.aggregationRiskItemId = aggregationRiskItemId;
            return this;
        }
        public String getAggregationRiskItemId() {
            return this.aggregationRiskItemId;
        }

        public CreateHasRisksceneOrderResponseBodyResultContentData setRiskStatus(String riskStatus) {
            this.riskStatus = riskStatus;
            return this;
        }
        public String getRiskStatus() {
            return this.riskStatus;
        }

        public CreateHasRisksceneOrderResponseBodyResultContentData setUtcModified(String utcModified) {
            this.utcModified = utcModified;
            return this;
        }
        public String getUtcModified() {
            return this.utcModified;
        }

        public CreateHasRisksceneOrderResponseBodyResultContentData setUtcCreate(String utcCreate) {
            this.utcCreate = utcCreate;
            return this;
        }
        public String getUtcCreate() {
            return this.utcCreate;
        }

        public CreateHasRisksceneOrderResponseBodyResultContentData setRiskSceneId(String riskSceneId) {
            this.riskSceneId = riskSceneId;
            return this;
        }
        public String getRiskSceneId() {
            return this.riskSceneId;
        }

        public CreateHasRisksceneOrderResponseBodyResultContentData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public CreateHasRisksceneOrderResponseBodyResultContentData setResolver(String resolver) {
            this.resolver = resolver;
            return this;
        }
        public String getResolver() {
            return this.resolver;
        }

        public CreateHasRisksceneOrderResponseBodyResultContentData setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public CreateHasRisksceneOrderResponseBodyResultContentData setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

    public static class CreateHasRisksceneOrderResponseBodyResultContentTopErrorCode extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("ExceptionCode")
        public String exceptionCode;

        @NameInMap("Version")
        public String version;

        @NameInMap("ExceptionCodeDescription")
        public String exceptionCodeDescription;

        @NameInMap("Prefix")
        public String prefix;

        @NameInMap("SceneName")
        public String sceneName;

        @NameInMap("Level")
        public String level;

        @NameInMap("Scene")
        public String scene;

        public static CreateHasRisksceneOrderResponseBodyResultContentTopErrorCode build(java.util.Map<String, ?> map) throws Exception {
            CreateHasRisksceneOrderResponseBodyResultContentTopErrorCode self = new CreateHasRisksceneOrderResponseBodyResultContentTopErrorCode();
            return TeaModel.build(map, self);
        }

        public CreateHasRisksceneOrderResponseBodyResultContentTopErrorCode setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public CreateHasRisksceneOrderResponseBodyResultContentTopErrorCode setExceptionCode(String exceptionCode) {
            this.exceptionCode = exceptionCode;
            return this;
        }
        public String getExceptionCode() {
            return this.exceptionCode;
        }

        public CreateHasRisksceneOrderResponseBodyResultContentTopErrorCode setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public CreateHasRisksceneOrderResponseBodyResultContentTopErrorCode setExceptionCodeDescription(String exceptionCodeDescription) {
            this.exceptionCodeDescription = exceptionCodeDescription;
            return this;
        }
        public String getExceptionCodeDescription() {
            return this.exceptionCodeDescription;
        }

        public CreateHasRisksceneOrderResponseBodyResultContentTopErrorCode setPrefix(String prefix) {
            this.prefix = prefix;
            return this;
        }
        public String getPrefix() {
            return this.prefix;
        }

        public CreateHasRisksceneOrderResponseBodyResultContentTopErrorCode setSceneName(String sceneName) {
            this.sceneName = sceneName;
            return this;
        }
        public String getSceneName() {
            return this.sceneName;
        }

        public CreateHasRisksceneOrderResponseBodyResultContentTopErrorCode setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public CreateHasRisksceneOrderResponseBodyResultContentTopErrorCode setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

    }

    public static class CreateHasRisksceneOrderResponseBodyResultContentTopErrorReason extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Content")
        public String content;

        public static CreateHasRisksceneOrderResponseBodyResultContentTopErrorReason build(java.util.Map<String, ?> map) throws Exception {
            CreateHasRisksceneOrderResponseBodyResultContentTopErrorReason self = new CreateHasRisksceneOrderResponseBodyResultContentTopErrorReason();
            return TeaModel.build(map, self);
        }

        public CreateHasRisksceneOrderResponseBodyResultContentTopErrorReason setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public CreateHasRisksceneOrderResponseBodyResultContentTopErrorReason setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

    public static class CreateHasRisksceneOrderResponseBodyResultContent extends TeaModel {
        @NameInMap("Data")
        public CreateHasRisksceneOrderResponseBodyResultContentData data;

        @NameInMap("Success")
        public Boolean success;

        @NameInMap("TopErrorCode")
        public CreateHasRisksceneOrderResponseBodyResultContentTopErrorCode topErrorCode;

        @NameInMap("Code")
        public String code;

        @NameInMap("Message")
        public String message;

        @NameInMap("TopErrorReason")
        public CreateHasRisksceneOrderResponseBodyResultContentTopErrorReason topErrorReason;

        public static CreateHasRisksceneOrderResponseBodyResultContent build(java.util.Map<String, ?> map) throws Exception {
            CreateHasRisksceneOrderResponseBodyResultContent self = new CreateHasRisksceneOrderResponseBodyResultContent();
            return TeaModel.build(map, self);
        }

        public CreateHasRisksceneOrderResponseBodyResultContent setData(CreateHasRisksceneOrderResponseBodyResultContentData data) {
            this.data = data;
            return this;
        }
        public CreateHasRisksceneOrderResponseBodyResultContentData getData() {
            return this.data;
        }

        public CreateHasRisksceneOrderResponseBodyResultContent setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public CreateHasRisksceneOrderResponseBodyResultContent setTopErrorCode(CreateHasRisksceneOrderResponseBodyResultContentTopErrorCode topErrorCode) {
            this.topErrorCode = topErrorCode;
            return this;
        }
        public CreateHasRisksceneOrderResponseBodyResultContentTopErrorCode getTopErrorCode() {
            return this.topErrorCode;
        }

        public CreateHasRisksceneOrderResponseBodyResultContent setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public CreateHasRisksceneOrderResponseBodyResultContent setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public CreateHasRisksceneOrderResponseBodyResultContent setTopErrorReason(CreateHasRisksceneOrderResponseBodyResultContentTopErrorReason topErrorReason) {
            this.topErrorReason = topErrorReason;
            return this;
        }
        public CreateHasRisksceneOrderResponseBodyResultContentTopErrorReason getTopErrorReason() {
            return this.topErrorReason;
        }

    }

}
