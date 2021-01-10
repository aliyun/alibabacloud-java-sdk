// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryHasBaselineAppinstancegroupResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultContent")
    public QueryHasBaselineAppinstancegroupResponseBodyResultContent resultContent;

    public static QueryHasBaselineAppinstancegroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryHasBaselineAppinstancegroupResponseBody self = new QueryHasBaselineAppinstancegroupResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryHasBaselineAppinstancegroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryHasBaselineAppinstancegroupResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryHasBaselineAppinstancegroupResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryHasBaselineAppinstancegroupResponseBody setResultContent(QueryHasBaselineAppinstancegroupResponseBodyResultContent resultContent) {
        this.resultContent = resultContent;
        return this;
    }
    public QueryHasBaselineAppinstancegroupResponseBodyResultContent getResultContent() {
        return this.resultContent;
    }

    public static class QueryHasBaselineAppinstancegroupResponseBodyResultContentData extends TeaModel {
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

        public static QueryHasBaselineAppinstancegroupResponseBodyResultContentData build(java.util.Map<String, ?> map) throws Exception {
            QueryHasBaselineAppinstancegroupResponseBodyResultContentData self = new QueryHasBaselineAppinstancegroupResponseBodyResultContentData();
            return TeaModel.build(map, self);
        }

        public QueryHasBaselineAppinstancegroupResponseBodyResultContentData setTenant(String tenant) {
            this.tenant = tenant;
            return this;
        }
        public String getTenant() {
            return this.tenant;
        }

        public QueryHasBaselineAppinstancegroupResponseBodyResultContentData setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public QueryHasBaselineAppinstancegroupResponseBodyResultContentData setWorkspaceGroup(String workspaceGroup) {
            this.workspaceGroup = workspaceGroup;
            return this;
        }
        public String getWorkspaceGroup() {
            return this.workspaceGroup;
        }

        public QueryHasBaselineAppinstancegroupResponseBodyResultContentData setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public QueryHasBaselineAppinstancegroupResponseBodyResultContentData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QueryHasBaselineAppinstancegroupResponseBodyResultContentData setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public QueryHasBaselineAppinstancegroupResponseBodyResultContentData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryHasBaselineAppinstancegroupResponseBodyResultContentData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryHasBaselineAppinstancegroupResponseBodyResultContentData setUtcCreate(String utcCreate) {
            this.utcCreate = utcCreate;
            return this;
        }
        public String getUtcCreate() {
            return this.utcCreate;
        }

        public QueryHasBaselineAppinstancegroupResponseBodyResultContentData setUtcModified(String utcModified) {
            this.utcModified = utcModified;
            return this;
        }
        public String getUtcModified() {
            return this.utcModified;
        }

    }

    public static class QueryHasBaselineAppinstancegroupResponseBodyResultContentTopErrorCode extends TeaModel {
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

        public static QueryHasBaselineAppinstancegroupResponseBodyResultContentTopErrorCode build(java.util.Map<String, ?> map) throws Exception {
            QueryHasBaselineAppinstancegroupResponseBodyResultContentTopErrorCode self = new QueryHasBaselineAppinstancegroupResponseBodyResultContentTopErrorCode();
            return TeaModel.build(map, self);
        }

        public QueryHasBaselineAppinstancegroupResponseBodyResultContentTopErrorCode setExceptionCode(String exceptionCode) {
            this.exceptionCode = exceptionCode;
            return this;
        }
        public String getExceptionCode() {
            return this.exceptionCode;
        }

        public QueryHasBaselineAppinstancegroupResponseBodyResultContentTopErrorCode setExceptionCodeDescription(String exceptionCodeDescription) {
            this.exceptionCodeDescription = exceptionCodeDescription;
            return this;
        }
        public String getExceptionCodeDescription() {
            return this.exceptionCodeDescription;
        }

        public QueryHasBaselineAppinstancegroupResponseBodyResultContentTopErrorCode setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public QueryHasBaselineAppinstancegroupResponseBodyResultContentTopErrorCode setPrefix(String prefix) {
            this.prefix = prefix;
            return this;
        }
        public String getPrefix() {
            return this.prefix;
        }

        public QueryHasBaselineAppinstancegroupResponseBodyResultContentTopErrorCode setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public QueryHasBaselineAppinstancegroupResponseBodyResultContentTopErrorCode setSceneName(String sceneName) {
            this.sceneName = sceneName;
            return this;
        }
        public String getSceneName() {
            return this.sceneName;
        }

        public QueryHasBaselineAppinstancegroupResponseBodyResultContentTopErrorCode setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public QueryHasBaselineAppinstancegroupResponseBodyResultContentTopErrorCode setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class QueryHasBaselineAppinstancegroupResponseBodyResultContentTopErrorReason extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Content")
        public String content;

        public static QueryHasBaselineAppinstancegroupResponseBodyResultContentTopErrorReason build(java.util.Map<String, ?> map) throws Exception {
            QueryHasBaselineAppinstancegroupResponseBodyResultContentTopErrorReason self = new QueryHasBaselineAppinstancegroupResponseBodyResultContentTopErrorReason();
            return TeaModel.build(map, self);
        }

        public QueryHasBaselineAppinstancegroupResponseBodyResultContentTopErrorReason setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public QueryHasBaselineAppinstancegroupResponseBodyResultContentTopErrorReason setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

    public static class QueryHasBaselineAppinstancegroupResponseBodyResultContent extends TeaModel {
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
        public java.util.List<QueryHasBaselineAppinstancegroupResponseBodyResultContentData> data;

        @NameInMap("TopErrorCode")
        public QueryHasBaselineAppinstancegroupResponseBodyResultContentTopErrorCode topErrorCode;

        @NameInMap("TopErrorReason")
        public QueryHasBaselineAppinstancegroupResponseBodyResultContentTopErrorReason topErrorReason;

        public static QueryHasBaselineAppinstancegroupResponseBodyResultContent build(java.util.Map<String, ?> map) throws Exception {
            QueryHasBaselineAppinstancegroupResponseBodyResultContent self = new QueryHasBaselineAppinstancegroupResponseBodyResultContent();
            return TeaModel.build(map, self);
        }

        public QueryHasBaselineAppinstancegroupResponseBodyResultContent setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public QueryHasBaselineAppinstancegroupResponseBodyResultContent setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public QueryHasBaselineAppinstancegroupResponseBodyResultContent setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public QueryHasBaselineAppinstancegroupResponseBodyResultContent setCurrentPage(Long currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Long getCurrentPage() {
            return this.currentPage;
        }

        public QueryHasBaselineAppinstancegroupResponseBodyResultContent setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public QueryHasBaselineAppinstancegroupResponseBodyResultContent setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

        public QueryHasBaselineAppinstancegroupResponseBodyResultContent setData(java.util.List<QueryHasBaselineAppinstancegroupResponseBodyResultContentData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<QueryHasBaselineAppinstancegroupResponseBodyResultContentData> getData() {
            return this.data;
        }

        public QueryHasBaselineAppinstancegroupResponseBodyResultContent setTopErrorCode(QueryHasBaselineAppinstancegroupResponseBodyResultContentTopErrorCode topErrorCode) {
            this.topErrorCode = topErrorCode;
            return this;
        }
        public QueryHasBaselineAppinstancegroupResponseBodyResultContentTopErrorCode getTopErrorCode() {
            return this.topErrorCode;
        }

        public QueryHasBaselineAppinstancegroupResponseBodyResultContent setTopErrorReason(QueryHasBaselineAppinstancegroupResponseBodyResultContentTopErrorReason topErrorReason) {
            this.topErrorReason = topErrorReason;
            return this;
        }
        public QueryHasBaselineAppinstancegroupResponseBodyResultContentTopErrorReason getTopErrorReason() {
            return this.topErrorReason;
        }

    }

}
