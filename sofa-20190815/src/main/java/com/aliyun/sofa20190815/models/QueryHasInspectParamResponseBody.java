// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryHasInspectParamResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultContent")
    public QueryHasInspectParamResponseBodyResultContent resultContent;

    public static QueryHasInspectParamResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryHasInspectParamResponseBody self = new QueryHasInspectParamResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryHasInspectParamResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryHasInspectParamResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryHasInspectParamResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryHasInspectParamResponseBody setResultContent(QueryHasInspectParamResponseBodyResultContent resultContent) {
        this.resultContent = resultContent;
        return this;
    }
    public QueryHasInspectParamResponseBodyResultContent getResultContent() {
        return this.resultContent;
    }

    public static class QueryHasInspectParamResponseBodyResultContentData extends TeaModel {
        @NameInMap("ConfigKey")
        public String configKey;

        @NameInMap("Value")
        public String value;

        @NameInMap("Memo")
        public String memo;

        @NameInMap("Creator")
        public String creator;

        @NameInMap("Operator")
        public String operator;

        @NameInMap("Id")
        public String id;

        @NameInMap("UtcCreate")
        public String utcCreate;

        @NameInMap("UtcModified")
        public String utcModified;

        @NameInMap("TenantId")
        public String tenantId;

        public static QueryHasInspectParamResponseBodyResultContentData build(java.util.Map<String, ?> map) throws Exception {
            QueryHasInspectParamResponseBodyResultContentData self = new QueryHasInspectParamResponseBodyResultContentData();
            return TeaModel.build(map, self);
        }

        public QueryHasInspectParamResponseBodyResultContentData setConfigKey(String configKey) {
            this.configKey = configKey;
            return this;
        }
        public String getConfigKey() {
            return this.configKey;
        }

        public QueryHasInspectParamResponseBodyResultContentData setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public QueryHasInspectParamResponseBodyResultContentData setMemo(String memo) {
            this.memo = memo;
            return this;
        }
        public String getMemo() {
            return this.memo;
        }

        public QueryHasInspectParamResponseBodyResultContentData setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public QueryHasInspectParamResponseBodyResultContentData setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public QueryHasInspectParamResponseBodyResultContentData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryHasInspectParamResponseBodyResultContentData setUtcCreate(String utcCreate) {
            this.utcCreate = utcCreate;
            return this;
        }
        public String getUtcCreate() {
            return this.utcCreate;
        }

        public QueryHasInspectParamResponseBodyResultContentData setUtcModified(String utcModified) {
            this.utcModified = utcModified;
            return this;
        }
        public String getUtcModified() {
            return this.utcModified;
        }

        public QueryHasInspectParamResponseBodyResultContentData setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

    public static class QueryHasInspectParamResponseBodyResultContentTopErrorCode extends TeaModel {
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

        public static QueryHasInspectParamResponseBodyResultContentTopErrorCode build(java.util.Map<String, ?> map) throws Exception {
            QueryHasInspectParamResponseBodyResultContentTopErrorCode self = new QueryHasInspectParamResponseBodyResultContentTopErrorCode();
            return TeaModel.build(map, self);
        }

        public QueryHasInspectParamResponseBodyResultContentTopErrorCode setExceptionCode(String exceptionCode) {
            this.exceptionCode = exceptionCode;
            return this;
        }
        public String getExceptionCode() {
            return this.exceptionCode;
        }

        public QueryHasInspectParamResponseBodyResultContentTopErrorCode setExceptionCodeDescription(String exceptionCodeDescription) {
            this.exceptionCodeDescription = exceptionCodeDescription;
            return this;
        }
        public String getExceptionCodeDescription() {
            return this.exceptionCodeDescription;
        }

        public QueryHasInspectParamResponseBodyResultContentTopErrorCode setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public QueryHasInspectParamResponseBodyResultContentTopErrorCode setPrefix(String prefix) {
            this.prefix = prefix;
            return this;
        }
        public String getPrefix() {
            return this.prefix;
        }

        public QueryHasInspectParamResponseBodyResultContentTopErrorCode setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public QueryHasInspectParamResponseBodyResultContentTopErrorCode setSceneName(String sceneName) {
            this.sceneName = sceneName;
            return this;
        }
        public String getSceneName() {
            return this.sceneName;
        }

        public QueryHasInspectParamResponseBodyResultContentTopErrorCode setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public QueryHasInspectParamResponseBodyResultContentTopErrorCode setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class QueryHasInspectParamResponseBodyResultContentTopErrorReason extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Content")
        public String content;

        public static QueryHasInspectParamResponseBodyResultContentTopErrorReason build(java.util.Map<String, ?> map) throws Exception {
            QueryHasInspectParamResponseBodyResultContentTopErrorReason self = new QueryHasInspectParamResponseBodyResultContentTopErrorReason();
            return TeaModel.build(map, self);
        }

        public QueryHasInspectParamResponseBodyResultContentTopErrorReason setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public QueryHasInspectParamResponseBodyResultContentTopErrorReason setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

    public static class QueryHasInspectParamResponseBodyResultContent extends TeaModel {
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
        public java.util.List<QueryHasInspectParamResponseBodyResultContentData> data;

        @NameInMap("TopErrorCode")
        public QueryHasInspectParamResponseBodyResultContentTopErrorCode topErrorCode;

        @NameInMap("TopErrorReason")
        public QueryHasInspectParamResponseBodyResultContentTopErrorReason topErrorReason;

        public static QueryHasInspectParamResponseBodyResultContent build(java.util.Map<String, ?> map) throws Exception {
            QueryHasInspectParamResponseBodyResultContent self = new QueryHasInspectParamResponseBodyResultContent();
            return TeaModel.build(map, self);
        }

        public QueryHasInspectParamResponseBodyResultContent setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public QueryHasInspectParamResponseBodyResultContent setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public QueryHasInspectParamResponseBodyResultContent setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public QueryHasInspectParamResponseBodyResultContent setCurrentPage(Long currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Long getCurrentPage() {
            return this.currentPage;
        }

        public QueryHasInspectParamResponseBodyResultContent setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public QueryHasInspectParamResponseBodyResultContent setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

        public QueryHasInspectParamResponseBodyResultContent setData(java.util.List<QueryHasInspectParamResponseBodyResultContentData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<QueryHasInspectParamResponseBodyResultContentData> getData() {
            return this.data;
        }

        public QueryHasInspectParamResponseBodyResultContent setTopErrorCode(QueryHasInspectParamResponseBodyResultContentTopErrorCode topErrorCode) {
            this.topErrorCode = topErrorCode;
            return this;
        }
        public QueryHasInspectParamResponseBodyResultContentTopErrorCode getTopErrorCode() {
            return this.topErrorCode;
        }

        public QueryHasInspectParamResponseBodyResultContent setTopErrorReason(QueryHasInspectParamResponseBodyResultContentTopErrorReason topErrorReason) {
            this.topErrorReason = topErrorReason;
            return this;
        }
        public QueryHasInspectParamResponseBodyResultContentTopErrorReason getTopErrorReason() {
            return this.topErrorReason;
        }

    }

}
