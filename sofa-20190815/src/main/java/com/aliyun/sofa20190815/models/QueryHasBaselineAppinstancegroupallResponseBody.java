// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryHasBaselineAppinstancegroupallResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultContent")
    public QueryHasBaselineAppinstancegroupallResponseBodyResultContent resultContent;

    public static QueryHasBaselineAppinstancegroupallResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryHasBaselineAppinstancegroupallResponseBody self = new QueryHasBaselineAppinstancegroupallResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryHasBaselineAppinstancegroupallResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryHasBaselineAppinstancegroupallResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryHasBaselineAppinstancegroupallResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryHasBaselineAppinstancegroupallResponseBody setResultContent(QueryHasBaselineAppinstancegroupallResponseBodyResultContent resultContent) {
        this.resultContent = resultContent;
        return this;
    }
    public QueryHasBaselineAppinstancegroupallResponseBodyResultContent getResultContent() {
        return this.resultContent;
    }

    public static class QueryHasBaselineAppinstancegroupallResponseBodyResultContentData extends TeaModel {
        @NameInMap("Tenant")
        public String tenant;

        @NameInMap("Namespace")
        public String namespace;

        @NameInMap("WorkspaceGroup")
        public String workspaceGroup;

        @NameInMap("AppName")
        public String appName;

        @NameInMap("Status")
        public String status;

        @NameInMap("Source")
        public String source;

        @NameInMap("Name")
        public String name;

        @NameInMap("Id")
        public String id;

        @NameInMap("UtcCreate")
        public String utcCreate;

        @NameInMap("UtcModified")
        public String utcModified;

        public static QueryHasBaselineAppinstancegroupallResponseBodyResultContentData build(java.util.Map<String, ?> map) throws Exception {
            QueryHasBaselineAppinstancegroupallResponseBodyResultContentData self = new QueryHasBaselineAppinstancegroupallResponseBodyResultContentData();
            return TeaModel.build(map, self);
        }

        public QueryHasBaselineAppinstancegroupallResponseBodyResultContentData setTenant(String tenant) {
            this.tenant = tenant;
            return this;
        }
        public String getTenant() {
            return this.tenant;
        }

        public QueryHasBaselineAppinstancegroupallResponseBodyResultContentData setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public QueryHasBaselineAppinstancegroupallResponseBodyResultContentData setWorkspaceGroup(String workspaceGroup) {
            this.workspaceGroup = workspaceGroup;
            return this;
        }
        public String getWorkspaceGroup() {
            return this.workspaceGroup;
        }

        public QueryHasBaselineAppinstancegroupallResponseBodyResultContentData setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public QueryHasBaselineAppinstancegroupallResponseBodyResultContentData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QueryHasBaselineAppinstancegroupallResponseBodyResultContentData setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public QueryHasBaselineAppinstancegroupallResponseBodyResultContentData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryHasBaselineAppinstancegroupallResponseBodyResultContentData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryHasBaselineAppinstancegroupallResponseBodyResultContentData setUtcCreate(String utcCreate) {
            this.utcCreate = utcCreate;
            return this;
        }
        public String getUtcCreate() {
            return this.utcCreate;
        }

        public QueryHasBaselineAppinstancegroupallResponseBodyResultContentData setUtcModified(String utcModified) {
            this.utcModified = utcModified;
            return this;
        }
        public String getUtcModified() {
            return this.utcModified;
        }

    }

    public static class QueryHasBaselineAppinstancegroupallResponseBodyResultContentTopErrorCode extends TeaModel {
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

        public static QueryHasBaselineAppinstancegroupallResponseBodyResultContentTopErrorCode build(java.util.Map<String, ?> map) throws Exception {
            QueryHasBaselineAppinstancegroupallResponseBodyResultContentTopErrorCode self = new QueryHasBaselineAppinstancegroupallResponseBodyResultContentTopErrorCode();
            return TeaModel.build(map, self);
        }

        public QueryHasBaselineAppinstancegroupallResponseBodyResultContentTopErrorCode setExceptionCode(String exceptionCode) {
            this.exceptionCode = exceptionCode;
            return this;
        }
        public String getExceptionCode() {
            return this.exceptionCode;
        }

        public QueryHasBaselineAppinstancegroupallResponseBodyResultContentTopErrorCode setExceptionCodeDescription(String exceptionCodeDescription) {
            this.exceptionCodeDescription = exceptionCodeDescription;
            return this;
        }
        public String getExceptionCodeDescription() {
            return this.exceptionCodeDescription;
        }

        public QueryHasBaselineAppinstancegroupallResponseBodyResultContentTopErrorCode setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public QueryHasBaselineAppinstancegroupallResponseBodyResultContentTopErrorCode setPrefix(String prefix) {
            this.prefix = prefix;
            return this;
        }
        public String getPrefix() {
            return this.prefix;
        }

        public QueryHasBaselineAppinstancegroupallResponseBodyResultContentTopErrorCode setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public QueryHasBaselineAppinstancegroupallResponseBodyResultContentTopErrorCode setSceneName(String sceneName) {
            this.sceneName = sceneName;
            return this;
        }
        public String getSceneName() {
            return this.sceneName;
        }

        public QueryHasBaselineAppinstancegroupallResponseBodyResultContentTopErrorCode setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public QueryHasBaselineAppinstancegroupallResponseBodyResultContentTopErrorCode setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class QueryHasBaselineAppinstancegroupallResponseBodyResultContentTopErrorReason extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Content")
        public String content;

        public static QueryHasBaselineAppinstancegroupallResponseBodyResultContentTopErrorReason build(java.util.Map<String, ?> map) throws Exception {
            QueryHasBaselineAppinstancegroupallResponseBodyResultContentTopErrorReason self = new QueryHasBaselineAppinstancegroupallResponseBodyResultContentTopErrorReason();
            return TeaModel.build(map, self);
        }

        public QueryHasBaselineAppinstancegroupallResponseBodyResultContentTopErrorReason setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public QueryHasBaselineAppinstancegroupallResponseBodyResultContentTopErrorReason setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

    public static class QueryHasBaselineAppinstancegroupallResponseBodyResultContent extends TeaModel {
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
        public java.util.List<QueryHasBaselineAppinstancegroupallResponseBodyResultContentData> data;

        @NameInMap("TopErrorCode")
        public QueryHasBaselineAppinstancegroupallResponseBodyResultContentTopErrorCode topErrorCode;

        @NameInMap("TopErrorReason")
        public QueryHasBaselineAppinstancegroupallResponseBodyResultContentTopErrorReason topErrorReason;

        public static QueryHasBaselineAppinstancegroupallResponseBodyResultContent build(java.util.Map<String, ?> map) throws Exception {
            QueryHasBaselineAppinstancegroupallResponseBodyResultContent self = new QueryHasBaselineAppinstancegroupallResponseBodyResultContent();
            return TeaModel.build(map, self);
        }

        public QueryHasBaselineAppinstancegroupallResponseBodyResultContent setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public QueryHasBaselineAppinstancegroupallResponseBodyResultContent setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public QueryHasBaselineAppinstancegroupallResponseBodyResultContent setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public QueryHasBaselineAppinstancegroupallResponseBodyResultContent setCurrentPage(Long currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Long getCurrentPage() {
            return this.currentPage;
        }

        public QueryHasBaselineAppinstancegroupallResponseBodyResultContent setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public QueryHasBaselineAppinstancegroupallResponseBodyResultContent setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

        public QueryHasBaselineAppinstancegroupallResponseBodyResultContent setData(java.util.List<QueryHasBaselineAppinstancegroupallResponseBodyResultContentData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<QueryHasBaselineAppinstancegroupallResponseBodyResultContentData> getData() {
            return this.data;
        }

        public QueryHasBaselineAppinstancegroupallResponseBodyResultContent setTopErrorCode(QueryHasBaselineAppinstancegroupallResponseBodyResultContentTopErrorCode topErrorCode) {
            this.topErrorCode = topErrorCode;
            return this;
        }
        public QueryHasBaselineAppinstancegroupallResponseBodyResultContentTopErrorCode getTopErrorCode() {
            return this.topErrorCode;
        }

        public QueryHasBaselineAppinstancegroupallResponseBodyResultContent setTopErrorReason(QueryHasBaselineAppinstancegroupallResponseBodyResultContentTopErrorReason topErrorReason) {
            this.topErrorReason = topErrorReason;
            return this;
        }
        public QueryHasBaselineAppinstancegroupallResponseBodyResultContentTopErrorReason getTopErrorReason() {
            return this.topErrorReason;
        }

    }

}
