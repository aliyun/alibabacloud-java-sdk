// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryHasDiagnosisNodeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultContent")
    public QueryHasDiagnosisNodeResponseBodyResultContent resultContent;

    public static QueryHasDiagnosisNodeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryHasDiagnosisNodeResponseBody self = new QueryHasDiagnosisNodeResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryHasDiagnosisNodeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryHasDiagnosisNodeResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryHasDiagnosisNodeResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryHasDiagnosisNodeResponseBody setResultContent(QueryHasDiagnosisNodeResponseBodyResultContent resultContent) {
        this.resultContent = resultContent;
        return this;
    }
    public QueryHasDiagnosisNodeResponseBodyResultContent getResultContent() {
        return this.resultContent;
    }

    public static class QueryHasDiagnosisNodeResponseBodyResultContentDataTags extends TeaModel {
        @NameInMap("TagCode")
        public String tagCode;

        @NameInMap("Name")
        public String name;

        @NameInMap("Type")
        public String type;

        public static QueryHasDiagnosisNodeResponseBodyResultContentDataTags build(java.util.Map<String, ?> map) throws Exception {
            QueryHasDiagnosisNodeResponseBodyResultContentDataTags self = new QueryHasDiagnosisNodeResponseBodyResultContentDataTags();
            return TeaModel.build(map, self);
        }

        public QueryHasDiagnosisNodeResponseBodyResultContentDataTags setTagCode(String tagCode) {
            this.tagCode = tagCode;
            return this;
        }
        public String getTagCode() {
            return this.tagCode;
        }

        public QueryHasDiagnosisNodeResponseBodyResultContentDataTags setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryHasDiagnosisNodeResponseBodyResultContentDataTags setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class QueryHasDiagnosisNodeResponseBodyResultContentData extends TeaModel {
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
        public java.util.List<QueryHasDiagnosisNodeResponseBodyResultContentDataTags> tags;

        public static QueryHasDiagnosisNodeResponseBodyResultContentData build(java.util.Map<String, ?> map) throws Exception {
            QueryHasDiagnosisNodeResponseBodyResultContentData self = new QueryHasDiagnosisNodeResponseBodyResultContentData();
            return TeaModel.build(map, self);
        }

        public QueryHasDiagnosisNodeResponseBodyResultContentData setIsReference(Boolean isReference) {
            this.isReference = isReference;
            return this;
        }
        public Boolean getIsReference() {
            return this.isReference;
        }

        public QueryHasDiagnosisNodeResponseBodyResultContentData setReferenceCount(Long referenceCount) {
            this.referenceCount = referenceCount;
            return this;
        }
        public Long getReferenceCount() {
            return this.referenceCount;
        }

        public QueryHasDiagnosisNodeResponseBodyResultContentData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryHasDiagnosisNodeResponseBodyResultContentData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public QueryHasDiagnosisNodeResponseBodyResultContentData setNodeType(String nodeType) {
            this.nodeType = nodeType;
            return this;
        }
        public String getNodeType() {
            return this.nodeType;
        }

        public QueryHasDiagnosisNodeResponseBodyResultContentData setExecutableStatus(String executableStatus) {
            this.executableStatus = executableStatus;
            return this;
        }
        public String getExecutableStatus() {
            return this.executableStatus;
        }

        public QueryHasDiagnosisNodeResponseBodyResultContentData setTimeout(String timeout) {
            this.timeout = timeout;
            return this;
        }
        public String getTimeout() {
            return this.timeout;
        }

        public QueryHasDiagnosisNodeResponseBodyResultContentData setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public QueryHasDiagnosisNodeResponseBodyResultContentData setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public QueryHasDiagnosisNodeResponseBodyResultContentData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryHasDiagnosisNodeResponseBodyResultContentData setUtcCreate(String utcCreate) {
            this.utcCreate = utcCreate;
            return this;
        }
        public String getUtcCreate() {
            return this.utcCreate;
        }

        public QueryHasDiagnosisNodeResponseBodyResultContentData setUtcModified(String utcModified) {
            this.utcModified = utcModified;
            return this;
        }
        public String getUtcModified() {
            return this.utcModified;
        }

        public QueryHasDiagnosisNodeResponseBodyResultContentData setTags(java.util.List<QueryHasDiagnosisNodeResponseBodyResultContentDataTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<QueryHasDiagnosisNodeResponseBodyResultContentDataTags> getTags() {
            return this.tags;
        }

    }

    public static class QueryHasDiagnosisNodeResponseBodyResultContentTopErrorCode extends TeaModel {
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

        public static QueryHasDiagnosisNodeResponseBodyResultContentTopErrorCode build(java.util.Map<String, ?> map) throws Exception {
            QueryHasDiagnosisNodeResponseBodyResultContentTopErrorCode self = new QueryHasDiagnosisNodeResponseBodyResultContentTopErrorCode();
            return TeaModel.build(map, self);
        }

        public QueryHasDiagnosisNodeResponseBodyResultContentTopErrorCode setExceptionCode(String exceptionCode) {
            this.exceptionCode = exceptionCode;
            return this;
        }
        public String getExceptionCode() {
            return this.exceptionCode;
        }

        public QueryHasDiagnosisNodeResponseBodyResultContentTopErrorCode setExceptionCodeDescription(String exceptionCodeDescription) {
            this.exceptionCodeDescription = exceptionCodeDescription;
            return this;
        }
        public String getExceptionCodeDescription() {
            return this.exceptionCodeDescription;
        }

        public QueryHasDiagnosisNodeResponseBodyResultContentTopErrorCode setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public QueryHasDiagnosisNodeResponseBodyResultContentTopErrorCode setPrefix(String prefix) {
            this.prefix = prefix;
            return this;
        }
        public String getPrefix() {
            return this.prefix;
        }

        public QueryHasDiagnosisNodeResponseBodyResultContentTopErrorCode setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public QueryHasDiagnosisNodeResponseBodyResultContentTopErrorCode setSceneName(String sceneName) {
            this.sceneName = sceneName;
            return this;
        }
        public String getSceneName() {
            return this.sceneName;
        }

        public QueryHasDiagnosisNodeResponseBodyResultContentTopErrorCode setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public QueryHasDiagnosisNodeResponseBodyResultContentTopErrorCode setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class QueryHasDiagnosisNodeResponseBodyResultContentTopErrorReason extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Content")
        public String content;

        public static QueryHasDiagnosisNodeResponseBodyResultContentTopErrorReason build(java.util.Map<String, ?> map) throws Exception {
            QueryHasDiagnosisNodeResponseBodyResultContentTopErrorReason self = new QueryHasDiagnosisNodeResponseBodyResultContentTopErrorReason();
            return TeaModel.build(map, self);
        }

        public QueryHasDiagnosisNodeResponseBodyResultContentTopErrorReason setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public QueryHasDiagnosisNodeResponseBodyResultContentTopErrorReason setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

    public static class QueryHasDiagnosisNodeResponseBodyResultContent extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Message")
        public String message;

        @NameInMap("Success")
        public Boolean success;

        @NameInMap("CurrentPage")
        public Long currentPage;

        @NameInMap("PageSize")
        public Long pageSize;

        @NameInMap("TotalCount")
        public Long totalCount;

        @NameInMap("Data")
        public java.util.List<QueryHasDiagnosisNodeResponseBodyResultContentData> data;

        @NameInMap("TopErrorCode")
        public QueryHasDiagnosisNodeResponseBodyResultContentTopErrorCode topErrorCode;

        @NameInMap("TopErrorReason")
        public QueryHasDiagnosisNodeResponseBodyResultContentTopErrorReason topErrorReason;

        public static QueryHasDiagnosisNodeResponseBodyResultContent build(java.util.Map<String, ?> map) throws Exception {
            QueryHasDiagnosisNodeResponseBodyResultContent self = new QueryHasDiagnosisNodeResponseBodyResultContent();
            return TeaModel.build(map, self);
        }

        public QueryHasDiagnosisNodeResponseBodyResultContent setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public QueryHasDiagnosisNodeResponseBodyResultContent setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public QueryHasDiagnosisNodeResponseBodyResultContent setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public QueryHasDiagnosisNodeResponseBodyResultContent setCurrentPage(Long currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Long getCurrentPage() {
            return this.currentPage;
        }

        public QueryHasDiagnosisNodeResponseBodyResultContent setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public QueryHasDiagnosisNodeResponseBodyResultContent setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

        public QueryHasDiagnosisNodeResponseBodyResultContent setData(java.util.List<QueryHasDiagnosisNodeResponseBodyResultContentData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<QueryHasDiagnosisNodeResponseBodyResultContentData> getData() {
            return this.data;
        }

        public QueryHasDiagnosisNodeResponseBodyResultContent setTopErrorCode(QueryHasDiagnosisNodeResponseBodyResultContentTopErrorCode topErrorCode) {
            this.topErrorCode = topErrorCode;
            return this;
        }
        public QueryHasDiagnosisNodeResponseBodyResultContentTopErrorCode getTopErrorCode() {
            return this.topErrorCode;
        }

        public QueryHasDiagnosisNodeResponseBodyResultContent setTopErrorReason(QueryHasDiagnosisNodeResponseBodyResultContentTopErrorReason topErrorReason) {
            this.topErrorReason = topErrorReason;
            return this;
        }
        public QueryHasDiagnosisNodeResponseBodyResultContentTopErrorReason getTopErrorReason() {
            return this.topErrorReason;
        }

    }

}
