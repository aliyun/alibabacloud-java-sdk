// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryHasMonitorRmsworkspaceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultContent")
    public QueryHasMonitorRmsworkspaceResponseBodyResultContent resultContent;

    public static QueryHasMonitorRmsworkspaceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryHasMonitorRmsworkspaceResponseBody self = new QueryHasMonitorRmsworkspaceResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryHasMonitorRmsworkspaceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryHasMonitorRmsworkspaceResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryHasMonitorRmsworkspaceResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryHasMonitorRmsworkspaceResponseBody setResultContent(QueryHasMonitorRmsworkspaceResponseBodyResultContent resultContent) {
        this.resultContent = resultContent;
        return this;
    }
    public QueryHasMonitorRmsworkspaceResponseBodyResultContent getResultContent() {
        return this.resultContent;
    }

    public static class QueryHasMonitorRmsworkspaceResponseBodyResultContentData extends TeaModel {
        @NameInMap("Id")
        public Long id;

        @NameInMap("Name")
        public String name;

        @NameInMap("DisplayName")
        public String displayName;

        @NameInMap("TenantId")
        public Long tenantId;

        @NameInMap("OutsideTenantId")
        public String outsideTenantId;

        @NameInMap("OutsideWsId")
        public String outsideWsId;

        @NameInMap("Config")
        public String config;

        @NameInMap("StackView")
        public Boolean stackView;

        public static QueryHasMonitorRmsworkspaceResponseBodyResultContentData build(java.util.Map<String, ?> map) throws Exception {
            QueryHasMonitorRmsworkspaceResponseBodyResultContentData self = new QueryHasMonitorRmsworkspaceResponseBodyResultContentData();
            return TeaModel.build(map, self);
        }

        public QueryHasMonitorRmsworkspaceResponseBodyResultContentData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public QueryHasMonitorRmsworkspaceResponseBodyResultContentData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryHasMonitorRmsworkspaceResponseBodyResultContentData setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public QueryHasMonitorRmsworkspaceResponseBodyResultContentData setTenantId(Long tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public Long getTenantId() {
            return this.tenantId;
        }

        public QueryHasMonitorRmsworkspaceResponseBodyResultContentData setOutsideTenantId(String outsideTenantId) {
            this.outsideTenantId = outsideTenantId;
            return this;
        }
        public String getOutsideTenantId() {
            return this.outsideTenantId;
        }

        public QueryHasMonitorRmsworkspaceResponseBodyResultContentData setOutsideWsId(String outsideWsId) {
            this.outsideWsId = outsideWsId;
            return this;
        }
        public String getOutsideWsId() {
            return this.outsideWsId;
        }

        public QueryHasMonitorRmsworkspaceResponseBodyResultContentData setConfig(String config) {
            this.config = config;
            return this;
        }
        public String getConfig() {
            return this.config;
        }

        public QueryHasMonitorRmsworkspaceResponseBodyResultContentData setStackView(Boolean stackView) {
            this.stackView = stackView;
            return this;
        }
        public Boolean getStackView() {
            return this.stackView;
        }

    }

    public static class QueryHasMonitorRmsworkspaceResponseBodyResultContentTopErrorCode extends TeaModel {
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

        public static QueryHasMonitorRmsworkspaceResponseBodyResultContentTopErrorCode build(java.util.Map<String, ?> map) throws Exception {
            QueryHasMonitorRmsworkspaceResponseBodyResultContentTopErrorCode self = new QueryHasMonitorRmsworkspaceResponseBodyResultContentTopErrorCode();
            return TeaModel.build(map, self);
        }

        public QueryHasMonitorRmsworkspaceResponseBodyResultContentTopErrorCode setExceptionCode(String exceptionCode) {
            this.exceptionCode = exceptionCode;
            return this;
        }
        public String getExceptionCode() {
            return this.exceptionCode;
        }

        public QueryHasMonitorRmsworkspaceResponseBodyResultContentTopErrorCode setExceptionCodeDescription(String exceptionCodeDescription) {
            this.exceptionCodeDescription = exceptionCodeDescription;
            return this;
        }
        public String getExceptionCodeDescription() {
            return this.exceptionCodeDescription;
        }

        public QueryHasMonitorRmsworkspaceResponseBodyResultContentTopErrorCode setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public QueryHasMonitorRmsworkspaceResponseBodyResultContentTopErrorCode setPrefix(String prefix) {
            this.prefix = prefix;
            return this;
        }
        public String getPrefix() {
            return this.prefix;
        }

        public QueryHasMonitorRmsworkspaceResponseBodyResultContentTopErrorCode setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public QueryHasMonitorRmsworkspaceResponseBodyResultContentTopErrorCode setSceneName(String sceneName) {
            this.sceneName = sceneName;
            return this;
        }
        public String getSceneName() {
            return this.sceneName;
        }

        public QueryHasMonitorRmsworkspaceResponseBodyResultContentTopErrorCode setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public QueryHasMonitorRmsworkspaceResponseBodyResultContentTopErrorCode setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class QueryHasMonitorRmsworkspaceResponseBodyResultContentTopErrorReason extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Content")
        public String content;

        public static QueryHasMonitorRmsworkspaceResponseBodyResultContentTopErrorReason build(java.util.Map<String, ?> map) throws Exception {
            QueryHasMonitorRmsworkspaceResponseBodyResultContentTopErrorReason self = new QueryHasMonitorRmsworkspaceResponseBodyResultContentTopErrorReason();
            return TeaModel.build(map, self);
        }

        public QueryHasMonitorRmsworkspaceResponseBodyResultContentTopErrorReason setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public QueryHasMonitorRmsworkspaceResponseBodyResultContentTopErrorReason setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

    public static class QueryHasMonitorRmsworkspaceResponseBodyResultContent extends TeaModel {
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
        public java.util.List<QueryHasMonitorRmsworkspaceResponseBodyResultContentData> data;

        @NameInMap("TopErrorCode")
        public QueryHasMonitorRmsworkspaceResponseBodyResultContentTopErrorCode topErrorCode;

        @NameInMap("TopErrorReason")
        public QueryHasMonitorRmsworkspaceResponseBodyResultContentTopErrorReason topErrorReason;

        public static QueryHasMonitorRmsworkspaceResponseBodyResultContent build(java.util.Map<String, ?> map) throws Exception {
            QueryHasMonitorRmsworkspaceResponseBodyResultContent self = new QueryHasMonitorRmsworkspaceResponseBodyResultContent();
            return TeaModel.build(map, self);
        }

        public QueryHasMonitorRmsworkspaceResponseBodyResultContent setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public QueryHasMonitorRmsworkspaceResponseBodyResultContent setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public QueryHasMonitorRmsworkspaceResponseBodyResultContent setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public QueryHasMonitorRmsworkspaceResponseBodyResultContent setCurrentPage(Long currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Long getCurrentPage() {
            return this.currentPage;
        }

        public QueryHasMonitorRmsworkspaceResponseBodyResultContent setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public QueryHasMonitorRmsworkspaceResponseBodyResultContent setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

        public QueryHasMonitorRmsworkspaceResponseBodyResultContent setData(java.util.List<QueryHasMonitorRmsworkspaceResponseBodyResultContentData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<QueryHasMonitorRmsworkspaceResponseBodyResultContentData> getData() {
            return this.data;
        }

        public QueryHasMonitorRmsworkspaceResponseBodyResultContent setTopErrorCode(QueryHasMonitorRmsworkspaceResponseBodyResultContentTopErrorCode topErrorCode) {
            this.topErrorCode = topErrorCode;
            return this;
        }
        public QueryHasMonitorRmsworkspaceResponseBodyResultContentTopErrorCode getTopErrorCode() {
            return this.topErrorCode;
        }

        public QueryHasMonitorRmsworkspaceResponseBodyResultContent setTopErrorReason(QueryHasMonitorRmsworkspaceResponseBodyResultContentTopErrorReason topErrorReason) {
            this.topErrorReason = topErrorReason;
            return this;
        }
        public QueryHasMonitorRmsworkspaceResponseBodyResultContentTopErrorReason getTopErrorReason() {
            return this.topErrorReason;
        }

    }

}
