// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryHasAdminConfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultContent")
    public QueryHasAdminConfigResponseBodyResultContent resultContent;

    public static QueryHasAdminConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryHasAdminConfigResponseBody self = new QueryHasAdminConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryHasAdminConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryHasAdminConfigResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryHasAdminConfigResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryHasAdminConfigResponseBody setResultContent(QueryHasAdminConfigResponseBodyResultContent resultContent) {
        this.resultContent = resultContent;
        return this;
    }
    public QueryHasAdminConfigResponseBodyResultContent getResultContent() {
        return this.resultContent;
    }

    public static class QueryHasAdminConfigResponseBodyResultContentData extends TeaModel {
        @NameInMap("CellId")
        public String cellId;

        @NameInMap("ConfigKey")
        public String configKey;

        @NameInMap("ConfigType")
        public Long configType;

        @NameInMap("Id")
        public String id;

        @NameInMap("Memo")
        public String memo;

        @NameInMap("Operator")
        public String operator;

        @NameInMap("Type")
        public String type;

        @NameInMap("UtcCreate")
        public String utcCreate;

        @NameInMap("UtcModified")
        public String utcModified;

        @NameInMap("Value")
        public String value;

        public static QueryHasAdminConfigResponseBodyResultContentData build(java.util.Map<String, ?> map) throws Exception {
            QueryHasAdminConfigResponseBodyResultContentData self = new QueryHasAdminConfigResponseBodyResultContentData();
            return TeaModel.build(map, self);
        }

        public QueryHasAdminConfigResponseBodyResultContentData setCellId(String cellId) {
            this.cellId = cellId;
            return this;
        }
        public String getCellId() {
            return this.cellId;
        }

        public QueryHasAdminConfigResponseBodyResultContentData setConfigKey(String configKey) {
            this.configKey = configKey;
            return this;
        }
        public String getConfigKey() {
            return this.configKey;
        }

        public QueryHasAdminConfigResponseBodyResultContentData setConfigType(Long configType) {
            this.configType = configType;
            return this;
        }
        public Long getConfigType() {
            return this.configType;
        }

        public QueryHasAdminConfigResponseBodyResultContentData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryHasAdminConfigResponseBodyResultContentData setMemo(String memo) {
            this.memo = memo;
            return this;
        }
        public String getMemo() {
            return this.memo;
        }

        public QueryHasAdminConfigResponseBodyResultContentData setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public QueryHasAdminConfigResponseBodyResultContentData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public QueryHasAdminConfigResponseBodyResultContentData setUtcCreate(String utcCreate) {
            this.utcCreate = utcCreate;
            return this;
        }
        public String getUtcCreate() {
            return this.utcCreate;
        }

        public QueryHasAdminConfigResponseBodyResultContentData setUtcModified(String utcModified) {
            this.utcModified = utcModified;
            return this;
        }
        public String getUtcModified() {
            return this.utcModified;
        }

        public QueryHasAdminConfigResponseBodyResultContentData setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class QueryHasAdminConfigResponseBodyResultContentTopErrorCode extends TeaModel {
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

        public static QueryHasAdminConfigResponseBodyResultContentTopErrorCode build(java.util.Map<String, ?> map) throws Exception {
            QueryHasAdminConfigResponseBodyResultContentTopErrorCode self = new QueryHasAdminConfigResponseBodyResultContentTopErrorCode();
            return TeaModel.build(map, self);
        }

        public QueryHasAdminConfigResponseBodyResultContentTopErrorCode setExceptionCode(String exceptionCode) {
            this.exceptionCode = exceptionCode;
            return this;
        }
        public String getExceptionCode() {
            return this.exceptionCode;
        }

        public QueryHasAdminConfigResponseBodyResultContentTopErrorCode setExceptionCodeDescription(String exceptionCodeDescription) {
            this.exceptionCodeDescription = exceptionCodeDescription;
            return this;
        }
        public String getExceptionCodeDescription() {
            return this.exceptionCodeDescription;
        }

        public QueryHasAdminConfigResponseBodyResultContentTopErrorCode setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public QueryHasAdminConfigResponseBodyResultContentTopErrorCode setPrefix(String prefix) {
            this.prefix = prefix;
            return this;
        }
        public String getPrefix() {
            return this.prefix;
        }

        public QueryHasAdminConfigResponseBodyResultContentTopErrorCode setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public QueryHasAdminConfigResponseBodyResultContentTopErrorCode setSceneName(String sceneName) {
            this.sceneName = sceneName;
            return this;
        }
        public String getSceneName() {
            return this.sceneName;
        }

        public QueryHasAdminConfigResponseBodyResultContentTopErrorCode setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public QueryHasAdminConfigResponseBodyResultContentTopErrorCode setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class QueryHasAdminConfigResponseBodyResultContentTopErrorReason extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Content")
        public String content;

        public static QueryHasAdminConfigResponseBodyResultContentTopErrorReason build(java.util.Map<String, ?> map) throws Exception {
            QueryHasAdminConfigResponseBodyResultContentTopErrorReason self = new QueryHasAdminConfigResponseBodyResultContentTopErrorReason();
            return TeaModel.build(map, self);
        }

        public QueryHasAdminConfigResponseBodyResultContentTopErrorReason setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public QueryHasAdminConfigResponseBodyResultContentTopErrorReason setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

    public static class QueryHasAdminConfigResponseBodyResultContent extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("CurrentPage")
        public Long currentPage;

        @NameInMap("Message")
        public String message;

        @NameInMap("PageSize")
        public Long pageSize;

        @NameInMap("Success")
        public Boolean success;

        @NameInMap("TotalCount")
        public Long totalCount;

        @NameInMap("Data")
        public java.util.List<QueryHasAdminConfigResponseBodyResultContentData> data;

        @NameInMap("TopErrorCode")
        public QueryHasAdminConfigResponseBodyResultContentTopErrorCode topErrorCode;

        @NameInMap("TopErrorReason")
        public QueryHasAdminConfigResponseBodyResultContentTopErrorReason topErrorReason;

        public static QueryHasAdminConfigResponseBodyResultContent build(java.util.Map<String, ?> map) throws Exception {
            QueryHasAdminConfigResponseBodyResultContent self = new QueryHasAdminConfigResponseBodyResultContent();
            return TeaModel.build(map, self);
        }

        public QueryHasAdminConfigResponseBodyResultContent setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public QueryHasAdminConfigResponseBodyResultContent setCurrentPage(Long currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Long getCurrentPage() {
            return this.currentPage;
        }

        public QueryHasAdminConfigResponseBodyResultContent setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public QueryHasAdminConfigResponseBodyResultContent setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public QueryHasAdminConfigResponseBodyResultContent setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public QueryHasAdminConfigResponseBodyResultContent setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

        public QueryHasAdminConfigResponseBodyResultContent setData(java.util.List<QueryHasAdminConfigResponseBodyResultContentData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<QueryHasAdminConfigResponseBodyResultContentData> getData() {
            return this.data;
        }

        public QueryHasAdminConfigResponseBodyResultContent setTopErrorCode(QueryHasAdminConfigResponseBodyResultContentTopErrorCode topErrorCode) {
            this.topErrorCode = topErrorCode;
            return this;
        }
        public QueryHasAdminConfigResponseBodyResultContentTopErrorCode getTopErrorCode() {
            return this.topErrorCode;
        }

        public QueryHasAdminConfigResponseBodyResultContent setTopErrorReason(QueryHasAdminConfigResponseBodyResultContentTopErrorReason topErrorReason) {
            this.topErrorReason = topErrorReason;
            return this;
        }
        public QueryHasAdminConfigResponseBodyResultContentTopErrorReason getTopErrorReason() {
            return this.topErrorReason;
        }

    }

}
