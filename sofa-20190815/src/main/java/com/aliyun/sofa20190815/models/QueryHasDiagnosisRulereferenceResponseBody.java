// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryHasDiagnosisRulereferenceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultContent")
    public QueryHasDiagnosisRulereferenceResponseBodyResultContent resultContent;

    public static QueryHasDiagnosisRulereferenceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryHasDiagnosisRulereferenceResponseBody self = new QueryHasDiagnosisRulereferenceResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryHasDiagnosisRulereferenceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryHasDiagnosisRulereferenceResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryHasDiagnosisRulereferenceResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryHasDiagnosisRulereferenceResponseBody setResultContent(QueryHasDiagnosisRulereferenceResponseBodyResultContent resultContent) {
        this.resultContent = resultContent;
        return this;
    }
    public QueryHasDiagnosisRulereferenceResponseBodyResultContent getResultContent() {
        return this.resultContent;
    }

    public static class QueryHasDiagnosisRulereferenceResponseBodyResultContentData extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("Description")
        public String description;

        @NameInMap("NodeType")
        public String nodeType;

        @NameInMap("ExecutableStatus")
        public String executableStatus;

        @NameInMap("Timeout")
        public Long timeout;

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

        public static QueryHasDiagnosisRulereferenceResponseBodyResultContentData build(java.util.Map<String, ?> map) throws Exception {
            QueryHasDiagnosisRulereferenceResponseBodyResultContentData self = new QueryHasDiagnosisRulereferenceResponseBodyResultContentData();
            return TeaModel.build(map, self);
        }

        public QueryHasDiagnosisRulereferenceResponseBodyResultContentData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryHasDiagnosisRulereferenceResponseBodyResultContentData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public QueryHasDiagnosisRulereferenceResponseBodyResultContentData setNodeType(String nodeType) {
            this.nodeType = nodeType;
            return this;
        }
        public String getNodeType() {
            return this.nodeType;
        }

        public QueryHasDiagnosisRulereferenceResponseBodyResultContentData setExecutableStatus(String executableStatus) {
            this.executableStatus = executableStatus;
            return this;
        }
        public String getExecutableStatus() {
            return this.executableStatus;
        }

        public QueryHasDiagnosisRulereferenceResponseBodyResultContentData setTimeout(Long timeout) {
            this.timeout = timeout;
            return this;
        }
        public Long getTimeout() {
            return this.timeout;
        }

        public QueryHasDiagnosisRulereferenceResponseBodyResultContentData setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public QueryHasDiagnosisRulereferenceResponseBodyResultContentData setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public QueryHasDiagnosisRulereferenceResponseBodyResultContentData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryHasDiagnosisRulereferenceResponseBodyResultContentData setUtcCreate(String utcCreate) {
            this.utcCreate = utcCreate;
            return this;
        }
        public String getUtcCreate() {
            return this.utcCreate;
        }

        public QueryHasDiagnosisRulereferenceResponseBodyResultContentData setUtcModified(String utcModified) {
            this.utcModified = utcModified;
            return this;
        }
        public String getUtcModified() {
            return this.utcModified;
        }

    }

    public static class QueryHasDiagnosisRulereferenceResponseBodyResultContentTopErrorCode extends TeaModel {
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

        public static QueryHasDiagnosisRulereferenceResponseBodyResultContentTopErrorCode build(java.util.Map<String, ?> map) throws Exception {
            QueryHasDiagnosisRulereferenceResponseBodyResultContentTopErrorCode self = new QueryHasDiagnosisRulereferenceResponseBodyResultContentTopErrorCode();
            return TeaModel.build(map, self);
        }

        public QueryHasDiagnosisRulereferenceResponseBodyResultContentTopErrorCode setExceptionCode(String exceptionCode) {
            this.exceptionCode = exceptionCode;
            return this;
        }
        public String getExceptionCode() {
            return this.exceptionCode;
        }

        public QueryHasDiagnosisRulereferenceResponseBodyResultContentTopErrorCode setExceptionCodeDescription(String exceptionCodeDescription) {
            this.exceptionCodeDescription = exceptionCodeDescription;
            return this;
        }
        public String getExceptionCodeDescription() {
            return this.exceptionCodeDescription;
        }

        public QueryHasDiagnosisRulereferenceResponseBodyResultContentTopErrorCode setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public QueryHasDiagnosisRulereferenceResponseBodyResultContentTopErrorCode setPrefix(String prefix) {
            this.prefix = prefix;
            return this;
        }
        public String getPrefix() {
            return this.prefix;
        }

        public QueryHasDiagnosisRulereferenceResponseBodyResultContentTopErrorCode setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public QueryHasDiagnosisRulereferenceResponseBodyResultContentTopErrorCode setSceneName(String sceneName) {
            this.sceneName = sceneName;
            return this;
        }
        public String getSceneName() {
            return this.sceneName;
        }

        public QueryHasDiagnosisRulereferenceResponseBodyResultContentTopErrorCode setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public QueryHasDiagnosisRulereferenceResponseBodyResultContentTopErrorCode setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class QueryHasDiagnosisRulereferenceResponseBodyResultContentTopErrorReason extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Content")
        public String content;

        public static QueryHasDiagnosisRulereferenceResponseBodyResultContentTopErrorReason build(java.util.Map<String, ?> map) throws Exception {
            QueryHasDiagnosisRulereferenceResponseBodyResultContentTopErrorReason self = new QueryHasDiagnosisRulereferenceResponseBodyResultContentTopErrorReason();
            return TeaModel.build(map, self);
        }

        public QueryHasDiagnosisRulereferenceResponseBodyResultContentTopErrorReason setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public QueryHasDiagnosisRulereferenceResponseBodyResultContentTopErrorReason setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

    public static class QueryHasDiagnosisRulereferenceResponseBodyResultContent extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Message")
        public String message;

        @NameInMap("Success")
        public Boolean success;

        @NameInMap("Data")
        public java.util.List<QueryHasDiagnosisRulereferenceResponseBodyResultContentData> data;

        @NameInMap("TopErrorCode")
        public QueryHasDiagnosisRulereferenceResponseBodyResultContentTopErrorCode topErrorCode;

        @NameInMap("TopErrorReason")
        public QueryHasDiagnosisRulereferenceResponseBodyResultContentTopErrorReason topErrorReason;

        public static QueryHasDiagnosisRulereferenceResponseBodyResultContent build(java.util.Map<String, ?> map) throws Exception {
            QueryHasDiagnosisRulereferenceResponseBodyResultContent self = new QueryHasDiagnosisRulereferenceResponseBodyResultContent();
            return TeaModel.build(map, self);
        }

        public QueryHasDiagnosisRulereferenceResponseBodyResultContent setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public QueryHasDiagnosisRulereferenceResponseBodyResultContent setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public QueryHasDiagnosisRulereferenceResponseBodyResultContent setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public QueryHasDiagnosisRulereferenceResponseBodyResultContent setData(java.util.List<QueryHasDiagnosisRulereferenceResponseBodyResultContentData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<QueryHasDiagnosisRulereferenceResponseBodyResultContentData> getData() {
            return this.data;
        }

        public QueryHasDiagnosisRulereferenceResponseBodyResultContent setTopErrorCode(QueryHasDiagnosisRulereferenceResponseBodyResultContentTopErrorCode topErrorCode) {
            this.topErrorCode = topErrorCode;
            return this;
        }
        public QueryHasDiagnosisRulereferenceResponseBodyResultContentTopErrorCode getTopErrorCode() {
            return this.topErrorCode;
        }

        public QueryHasDiagnosisRulereferenceResponseBodyResultContent setTopErrorReason(QueryHasDiagnosisRulereferenceResponseBodyResultContentTopErrorReason topErrorReason) {
            this.topErrorReason = topErrorReason;
            return this;
        }
        public QueryHasDiagnosisRulereferenceResponseBodyResultContentTopErrorReason getTopErrorReason() {
            return this.topErrorReason;
        }

    }

}
