// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryHasBaselineAppinstanceallResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultContent")
    public QueryHasBaselineAppinstanceallResponseBodyResultContent resultContent;

    public static QueryHasBaselineAppinstanceallResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryHasBaselineAppinstanceallResponseBody self = new QueryHasBaselineAppinstanceallResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryHasBaselineAppinstanceallResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryHasBaselineAppinstanceallResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryHasBaselineAppinstanceallResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryHasBaselineAppinstanceallResponseBody setResultContent(QueryHasBaselineAppinstanceallResponseBodyResultContent resultContent) {
        this.resultContent = resultContent;
        return this;
    }
    public QueryHasBaselineAppinstanceallResponseBodyResultContent getResultContent() {
        return this.resultContent;
    }

    public static class QueryHasBaselineAppinstanceallResponseBodyResultContentData extends TeaModel {
        @NameInMap("AppInstanceName")
        public String appInstanceName;

        @NameInMap("ProdInstanceName")
        public String prodInstanceName;

        @NameInMap("Tenant")
        public String tenant;

        @NameInMap("WorkspaceGroup")
        public String workspaceGroup;

        @NameInMap("Workspace")
        public String workspace;

        @NameInMap("Cell")
        public String cell;

        @NameInMap("AppName")
        public String appName;

        @NameInMap("AppVersion")
        public String appVersion;

        @NameInMap("Namespace")
        public String namespace;

        @NameInMap("AppInstanceGroup")
        public String appInstanceGroup;

        @NameInMap("ProdCode")
        public String prodCode;

        @NameInMap("Status")
        public String status;

        @NameInMap("Source")
        public String source;

        @NameInMap("Id")
        public String id;

        @NameInMap("UtcCreate")
        public String utcCreate;

        @NameInMap("UtcModified")
        public String utcModified;

        public static QueryHasBaselineAppinstanceallResponseBodyResultContentData build(java.util.Map<String, ?> map) throws Exception {
            QueryHasBaselineAppinstanceallResponseBodyResultContentData self = new QueryHasBaselineAppinstanceallResponseBodyResultContentData();
            return TeaModel.build(map, self);
        }

        public QueryHasBaselineAppinstanceallResponseBodyResultContentData setAppInstanceName(String appInstanceName) {
            this.appInstanceName = appInstanceName;
            return this;
        }
        public String getAppInstanceName() {
            return this.appInstanceName;
        }

        public QueryHasBaselineAppinstanceallResponseBodyResultContentData setProdInstanceName(String prodInstanceName) {
            this.prodInstanceName = prodInstanceName;
            return this;
        }
        public String getProdInstanceName() {
            return this.prodInstanceName;
        }

        public QueryHasBaselineAppinstanceallResponseBodyResultContentData setTenant(String tenant) {
            this.tenant = tenant;
            return this;
        }
        public String getTenant() {
            return this.tenant;
        }

        public QueryHasBaselineAppinstanceallResponseBodyResultContentData setWorkspaceGroup(String workspaceGroup) {
            this.workspaceGroup = workspaceGroup;
            return this;
        }
        public String getWorkspaceGroup() {
            return this.workspaceGroup;
        }

        public QueryHasBaselineAppinstanceallResponseBodyResultContentData setWorkspace(String workspace) {
            this.workspace = workspace;
            return this;
        }
        public String getWorkspace() {
            return this.workspace;
        }

        public QueryHasBaselineAppinstanceallResponseBodyResultContentData setCell(String cell) {
            this.cell = cell;
            return this;
        }
        public String getCell() {
            return this.cell;
        }

        public QueryHasBaselineAppinstanceallResponseBodyResultContentData setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public QueryHasBaselineAppinstanceallResponseBodyResultContentData setAppVersion(String appVersion) {
            this.appVersion = appVersion;
            return this;
        }
        public String getAppVersion() {
            return this.appVersion;
        }

        public QueryHasBaselineAppinstanceallResponseBodyResultContentData setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public QueryHasBaselineAppinstanceallResponseBodyResultContentData setAppInstanceGroup(String appInstanceGroup) {
            this.appInstanceGroup = appInstanceGroup;
            return this;
        }
        public String getAppInstanceGroup() {
            return this.appInstanceGroup;
        }

        public QueryHasBaselineAppinstanceallResponseBodyResultContentData setProdCode(String prodCode) {
            this.prodCode = prodCode;
            return this;
        }
        public String getProdCode() {
            return this.prodCode;
        }

        public QueryHasBaselineAppinstanceallResponseBodyResultContentData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QueryHasBaselineAppinstanceallResponseBodyResultContentData setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public QueryHasBaselineAppinstanceallResponseBodyResultContentData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryHasBaselineAppinstanceallResponseBodyResultContentData setUtcCreate(String utcCreate) {
            this.utcCreate = utcCreate;
            return this;
        }
        public String getUtcCreate() {
            return this.utcCreate;
        }

        public QueryHasBaselineAppinstanceallResponseBodyResultContentData setUtcModified(String utcModified) {
            this.utcModified = utcModified;
            return this;
        }
        public String getUtcModified() {
            return this.utcModified;
        }

    }

    public static class QueryHasBaselineAppinstanceallResponseBodyResultContentTopErrorCode extends TeaModel {
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

        public static QueryHasBaselineAppinstanceallResponseBodyResultContentTopErrorCode build(java.util.Map<String, ?> map) throws Exception {
            QueryHasBaselineAppinstanceallResponseBodyResultContentTopErrorCode self = new QueryHasBaselineAppinstanceallResponseBodyResultContentTopErrorCode();
            return TeaModel.build(map, self);
        }

        public QueryHasBaselineAppinstanceallResponseBodyResultContentTopErrorCode setExceptionCode(String exceptionCode) {
            this.exceptionCode = exceptionCode;
            return this;
        }
        public String getExceptionCode() {
            return this.exceptionCode;
        }

        public QueryHasBaselineAppinstanceallResponseBodyResultContentTopErrorCode setExceptionCodeDescription(String exceptionCodeDescription) {
            this.exceptionCodeDescription = exceptionCodeDescription;
            return this;
        }
        public String getExceptionCodeDescription() {
            return this.exceptionCodeDescription;
        }

        public QueryHasBaselineAppinstanceallResponseBodyResultContentTopErrorCode setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public QueryHasBaselineAppinstanceallResponseBodyResultContentTopErrorCode setPrefix(String prefix) {
            this.prefix = prefix;
            return this;
        }
        public String getPrefix() {
            return this.prefix;
        }

        public QueryHasBaselineAppinstanceallResponseBodyResultContentTopErrorCode setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public QueryHasBaselineAppinstanceallResponseBodyResultContentTopErrorCode setSceneName(String sceneName) {
            this.sceneName = sceneName;
            return this;
        }
        public String getSceneName() {
            return this.sceneName;
        }

        public QueryHasBaselineAppinstanceallResponseBodyResultContentTopErrorCode setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public QueryHasBaselineAppinstanceallResponseBodyResultContentTopErrorCode setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class QueryHasBaselineAppinstanceallResponseBodyResultContentTopErrorReason extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Content")
        public String content;

        public static QueryHasBaselineAppinstanceallResponseBodyResultContentTopErrorReason build(java.util.Map<String, ?> map) throws Exception {
            QueryHasBaselineAppinstanceallResponseBodyResultContentTopErrorReason self = new QueryHasBaselineAppinstanceallResponseBodyResultContentTopErrorReason();
            return TeaModel.build(map, self);
        }

        public QueryHasBaselineAppinstanceallResponseBodyResultContentTopErrorReason setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public QueryHasBaselineAppinstanceallResponseBodyResultContentTopErrorReason setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

    public static class QueryHasBaselineAppinstanceallResponseBodyResultContent extends TeaModel {
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
        public java.util.List<QueryHasBaselineAppinstanceallResponseBodyResultContentData> data;

        @NameInMap("TopErrorCode")
        public QueryHasBaselineAppinstanceallResponseBodyResultContentTopErrorCode topErrorCode;

        @NameInMap("TopErrorReason")
        public QueryHasBaselineAppinstanceallResponseBodyResultContentTopErrorReason topErrorReason;

        public static QueryHasBaselineAppinstanceallResponseBodyResultContent build(java.util.Map<String, ?> map) throws Exception {
            QueryHasBaselineAppinstanceallResponseBodyResultContent self = new QueryHasBaselineAppinstanceallResponseBodyResultContent();
            return TeaModel.build(map, self);
        }

        public QueryHasBaselineAppinstanceallResponseBodyResultContent setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public QueryHasBaselineAppinstanceallResponseBodyResultContent setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public QueryHasBaselineAppinstanceallResponseBodyResultContent setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public QueryHasBaselineAppinstanceallResponseBodyResultContent setCurrentPage(Long currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Long getCurrentPage() {
            return this.currentPage;
        }

        public QueryHasBaselineAppinstanceallResponseBodyResultContent setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public QueryHasBaselineAppinstanceallResponseBodyResultContent setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

        public QueryHasBaselineAppinstanceallResponseBodyResultContent setData(java.util.List<QueryHasBaselineAppinstanceallResponseBodyResultContentData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<QueryHasBaselineAppinstanceallResponseBodyResultContentData> getData() {
            return this.data;
        }

        public QueryHasBaselineAppinstanceallResponseBodyResultContent setTopErrorCode(QueryHasBaselineAppinstanceallResponseBodyResultContentTopErrorCode topErrorCode) {
            this.topErrorCode = topErrorCode;
            return this;
        }
        public QueryHasBaselineAppinstanceallResponseBodyResultContentTopErrorCode getTopErrorCode() {
            return this.topErrorCode;
        }

        public QueryHasBaselineAppinstanceallResponseBodyResultContent setTopErrorReason(QueryHasBaselineAppinstanceallResponseBodyResultContentTopErrorReason topErrorReason) {
            this.topErrorReason = topErrorReason;
            return this;
        }
        public QueryHasBaselineAppinstanceallResponseBodyResultContentTopErrorReason getTopErrorReason() {
            return this.topErrorReason;
        }

    }

}
