// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetHasDiagnosisNodeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultContent")
    public GetHasDiagnosisNodeResponseBodyResultContent resultContent;

    public static GetHasDiagnosisNodeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetHasDiagnosisNodeResponseBody self = new GetHasDiagnosisNodeResponseBody();
        return TeaModel.build(map, self);
    }

    public GetHasDiagnosisNodeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetHasDiagnosisNodeResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetHasDiagnosisNodeResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public GetHasDiagnosisNodeResponseBody setResultContent(GetHasDiagnosisNodeResponseBodyResultContent resultContent) {
        this.resultContent = resultContent;
        return this;
    }
    public GetHasDiagnosisNodeResponseBodyResultContent getResultContent() {
        return this.resultContent;
    }

    public static class GetHasDiagnosisNodeResponseBodyResultContentDataTags extends TeaModel {
        @NameInMap("TagCode")
        public String tagCode;

        @NameInMap("Name")
        public String name;

        @NameInMap("Type")
        public String type;

        public static GetHasDiagnosisNodeResponseBodyResultContentDataTags build(java.util.Map<String, ?> map) throws Exception {
            GetHasDiagnosisNodeResponseBodyResultContentDataTags self = new GetHasDiagnosisNodeResponseBodyResultContentDataTags();
            return TeaModel.build(map, self);
        }

        public GetHasDiagnosisNodeResponseBodyResultContentDataTags setTagCode(String tagCode) {
            this.tagCode = tagCode;
            return this;
        }
        public String getTagCode() {
            return this.tagCode;
        }

        public GetHasDiagnosisNodeResponseBodyResultContentDataTags setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetHasDiagnosisNodeResponseBodyResultContentDataTags setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetHasDiagnosisNodeResponseBodyResultContentData extends TeaModel {
        @NameInMap("IsReference")
        public Boolean isReference;

        @NameInMap("ReferenceCount")
        public Long referenceCount;

        @NameInMap("Name")
        public String name;

        @NameInMap("Description")
        public String description;

        @NameInMap("NodeType")
        public String nodeType;

        @NameInMap("ExecutableStatus")
        public String executableStatus;

        @NameInMap("Timeout")
        public String timeout;

        @NameInMap("Operator")
        public String operator;

        @NameInMap("TenantId")
        public String tenantId;

        @NameInMap("Id")
        public String id;

        @NameInMap("UtcCreate")
        public String utcCreate;

        @NameInMap("UtcModified")
        public String utcModified;

        @NameInMap("Tags")
        public java.util.List<GetHasDiagnosisNodeResponseBodyResultContentDataTags> tags;

        public static GetHasDiagnosisNodeResponseBodyResultContentData build(java.util.Map<String, ?> map) throws Exception {
            GetHasDiagnosisNodeResponseBodyResultContentData self = new GetHasDiagnosisNodeResponseBodyResultContentData();
            return TeaModel.build(map, self);
        }

        public GetHasDiagnosisNodeResponseBodyResultContentData setIsReference(Boolean isReference) {
            this.isReference = isReference;
            return this;
        }
        public Boolean getIsReference() {
            return this.isReference;
        }

        public GetHasDiagnosisNodeResponseBodyResultContentData setReferenceCount(Long referenceCount) {
            this.referenceCount = referenceCount;
            return this;
        }
        public Long getReferenceCount() {
            return this.referenceCount;
        }

        public GetHasDiagnosisNodeResponseBodyResultContentData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetHasDiagnosisNodeResponseBodyResultContentData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetHasDiagnosisNodeResponseBodyResultContentData setNodeType(String nodeType) {
            this.nodeType = nodeType;
            return this;
        }
        public String getNodeType() {
            return this.nodeType;
        }

        public GetHasDiagnosisNodeResponseBodyResultContentData setExecutableStatus(String executableStatus) {
            this.executableStatus = executableStatus;
            return this;
        }
        public String getExecutableStatus() {
            return this.executableStatus;
        }

        public GetHasDiagnosisNodeResponseBodyResultContentData setTimeout(String timeout) {
            this.timeout = timeout;
            return this;
        }
        public String getTimeout() {
            return this.timeout;
        }

        public GetHasDiagnosisNodeResponseBodyResultContentData setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public GetHasDiagnosisNodeResponseBodyResultContentData setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public GetHasDiagnosisNodeResponseBodyResultContentData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetHasDiagnosisNodeResponseBodyResultContentData setUtcCreate(String utcCreate) {
            this.utcCreate = utcCreate;
            return this;
        }
        public String getUtcCreate() {
            return this.utcCreate;
        }

        public GetHasDiagnosisNodeResponseBodyResultContentData setUtcModified(String utcModified) {
            this.utcModified = utcModified;
            return this;
        }
        public String getUtcModified() {
            return this.utcModified;
        }

        public GetHasDiagnosisNodeResponseBodyResultContentData setTags(java.util.List<GetHasDiagnosisNodeResponseBodyResultContentDataTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<GetHasDiagnosisNodeResponseBodyResultContentDataTags> getTags() {
            return this.tags;
        }

    }

    public static class GetHasDiagnosisNodeResponseBodyResultContentTopErrorCode extends TeaModel {
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

        public static GetHasDiagnosisNodeResponseBodyResultContentTopErrorCode build(java.util.Map<String, ?> map) throws Exception {
            GetHasDiagnosisNodeResponseBodyResultContentTopErrorCode self = new GetHasDiagnosisNodeResponseBodyResultContentTopErrorCode();
            return TeaModel.build(map, self);
        }

        public GetHasDiagnosisNodeResponseBodyResultContentTopErrorCode setExceptionCode(String exceptionCode) {
            this.exceptionCode = exceptionCode;
            return this;
        }
        public String getExceptionCode() {
            return this.exceptionCode;
        }

        public GetHasDiagnosisNodeResponseBodyResultContentTopErrorCode setExceptionCodeDescription(String exceptionCodeDescription) {
            this.exceptionCodeDescription = exceptionCodeDescription;
            return this;
        }
        public String getExceptionCodeDescription() {
            return this.exceptionCodeDescription;
        }

        public GetHasDiagnosisNodeResponseBodyResultContentTopErrorCode setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public GetHasDiagnosisNodeResponseBodyResultContentTopErrorCode setPrefix(String prefix) {
            this.prefix = prefix;
            return this;
        }
        public String getPrefix() {
            return this.prefix;
        }

        public GetHasDiagnosisNodeResponseBodyResultContentTopErrorCode setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public GetHasDiagnosisNodeResponseBodyResultContentTopErrorCode setSceneName(String sceneName) {
            this.sceneName = sceneName;
            return this;
        }
        public String getSceneName() {
            return this.sceneName;
        }

        public GetHasDiagnosisNodeResponseBodyResultContentTopErrorCode setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetHasDiagnosisNodeResponseBodyResultContentTopErrorCode setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class GetHasDiagnosisNodeResponseBodyResultContentTopErrorReason extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Content")
        public String content;

        public static GetHasDiagnosisNodeResponseBodyResultContentTopErrorReason build(java.util.Map<String, ?> map) throws Exception {
            GetHasDiagnosisNodeResponseBodyResultContentTopErrorReason self = new GetHasDiagnosisNodeResponseBodyResultContentTopErrorReason();
            return TeaModel.build(map, self);
        }

        public GetHasDiagnosisNodeResponseBodyResultContentTopErrorReason setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public GetHasDiagnosisNodeResponseBodyResultContentTopErrorReason setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

    public static class GetHasDiagnosisNodeResponseBodyResultContent extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Message")
        public String message;

        @NameInMap("Success")
        public Boolean success;

        @NameInMap("Data")
        public GetHasDiagnosisNodeResponseBodyResultContentData data;

        @NameInMap("TopErrorCode")
        public GetHasDiagnosisNodeResponseBodyResultContentTopErrorCode topErrorCode;

        @NameInMap("TopErrorReason")
        public GetHasDiagnosisNodeResponseBodyResultContentTopErrorReason topErrorReason;

        public static GetHasDiagnosisNodeResponseBodyResultContent build(java.util.Map<String, ?> map) throws Exception {
            GetHasDiagnosisNodeResponseBodyResultContent self = new GetHasDiagnosisNodeResponseBodyResultContent();
            return TeaModel.build(map, self);
        }

        public GetHasDiagnosisNodeResponseBodyResultContent setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public GetHasDiagnosisNodeResponseBodyResultContent setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public GetHasDiagnosisNodeResponseBodyResultContent setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public GetHasDiagnosisNodeResponseBodyResultContent setData(GetHasDiagnosisNodeResponseBodyResultContentData data) {
            this.data = data;
            return this;
        }
        public GetHasDiagnosisNodeResponseBodyResultContentData getData() {
            return this.data;
        }

        public GetHasDiagnosisNodeResponseBodyResultContent setTopErrorCode(GetHasDiagnosisNodeResponseBodyResultContentTopErrorCode topErrorCode) {
            this.topErrorCode = topErrorCode;
            return this;
        }
        public GetHasDiagnosisNodeResponseBodyResultContentTopErrorCode getTopErrorCode() {
            return this.topErrorCode;
        }

        public GetHasDiagnosisNodeResponseBodyResultContent setTopErrorReason(GetHasDiagnosisNodeResponseBodyResultContentTopErrorReason topErrorReason) {
            this.topErrorReason = topErrorReason;
            return this;
        }
        public GetHasDiagnosisNodeResponseBodyResultContentTopErrorReason getTopErrorReason() {
            return this.topErrorReason;
        }

    }

}
