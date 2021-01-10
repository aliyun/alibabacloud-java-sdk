// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryHasInspectWebruleResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultContent")
    public QueryHasInspectWebruleResponseBodyResultContent resultContent;

    public static QueryHasInspectWebruleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryHasInspectWebruleResponseBody self = new QueryHasInspectWebruleResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryHasInspectWebruleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryHasInspectWebruleResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryHasInspectWebruleResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryHasInspectWebruleResponseBody setResultContent(QueryHasInspectWebruleResponseBodyResultContent resultContent) {
        this.resultContent = resultContent;
        return this;
    }
    public QueryHasInspectWebruleResponseBodyResultContent getResultContent() {
        return this.resultContent;
    }

    public static class QueryHasInspectWebruleResponseBodyResultContentDataAvailableActions extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Description")
        public String description;

        public static QueryHasInspectWebruleResponseBodyResultContentDataAvailableActions build(java.util.Map<String, ?> map) throws Exception {
            QueryHasInspectWebruleResponseBodyResultContentDataAvailableActions self = new QueryHasInspectWebruleResponseBodyResultContentDataAvailableActions();
            return TeaModel.build(map, self);
        }

        public QueryHasInspectWebruleResponseBodyResultContentDataAvailableActions setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public QueryHasInspectWebruleResponseBodyResultContentDataAvailableActions setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

    }

    public static class QueryHasInspectWebruleResponseBodyResultContentData extends TeaModel {
        @NameInMap("Creator")
        public String creator;

        @NameInMap("DeleteAt")
        public String deleteAt;

        @NameInMap("DeleteStatus")
        public Long deleteStatus;

        @NameInMap("Description")
        public String description;

        @NameInMap("FixMethod")
        public String fixMethod;

        @NameInMap("Gid")
        public String gid;

        @NameInMap("Id")
        public String id;

        @NameInMap("IsIntra")
        public Boolean isIntra;

        @NameInMap("Name")
        public String name;

        @NameInMap("PluginId")
        public String pluginId;

        @NameInMap("PluginType")
        public String pluginType;

        @NameInMap("RuleStatus")
        public String ruleStatus;

        @NameInMap("TenantId")
        public String tenantId;

        @NameInMap("UtcCreate")
        public String utcCreate;

        @NameInMap("UtcModified")
        public String utcModified;

        @NameInMap("Args")
        public String args;

        @NameInMap("AvailableActions")
        public java.util.List<QueryHasInspectWebruleResponseBodyResultContentDataAvailableActions> availableActions;

        public static QueryHasInspectWebruleResponseBodyResultContentData build(java.util.Map<String, ?> map) throws Exception {
            QueryHasInspectWebruleResponseBodyResultContentData self = new QueryHasInspectWebruleResponseBodyResultContentData();
            return TeaModel.build(map, self);
        }

        public QueryHasInspectWebruleResponseBodyResultContentData setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public QueryHasInspectWebruleResponseBodyResultContentData setDeleteAt(String deleteAt) {
            this.deleteAt = deleteAt;
            return this;
        }
        public String getDeleteAt() {
            return this.deleteAt;
        }

        public QueryHasInspectWebruleResponseBodyResultContentData setDeleteStatus(Long deleteStatus) {
            this.deleteStatus = deleteStatus;
            return this;
        }
        public Long getDeleteStatus() {
            return this.deleteStatus;
        }

        public QueryHasInspectWebruleResponseBodyResultContentData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public QueryHasInspectWebruleResponseBodyResultContentData setFixMethod(String fixMethod) {
            this.fixMethod = fixMethod;
            return this;
        }
        public String getFixMethod() {
            return this.fixMethod;
        }

        public QueryHasInspectWebruleResponseBodyResultContentData setGid(String gid) {
            this.gid = gid;
            return this;
        }
        public String getGid() {
            return this.gid;
        }

        public QueryHasInspectWebruleResponseBodyResultContentData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryHasInspectWebruleResponseBodyResultContentData setIsIntra(Boolean isIntra) {
            this.isIntra = isIntra;
            return this;
        }
        public Boolean getIsIntra() {
            return this.isIntra;
        }

        public QueryHasInspectWebruleResponseBodyResultContentData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryHasInspectWebruleResponseBodyResultContentData setPluginId(String pluginId) {
            this.pluginId = pluginId;
            return this;
        }
        public String getPluginId() {
            return this.pluginId;
        }

        public QueryHasInspectWebruleResponseBodyResultContentData setPluginType(String pluginType) {
            this.pluginType = pluginType;
            return this;
        }
        public String getPluginType() {
            return this.pluginType;
        }

        public QueryHasInspectWebruleResponseBodyResultContentData setRuleStatus(String ruleStatus) {
            this.ruleStatus = ruleStatus;
            return this;
        }
        public String getRuleStatus() {
            return this.ruleStatus;
        }

        public QueryHasInspectWebruleResponseBodyResultContentData setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public QueryHasInspectWebruleResponseBodyResultContentData setUtcCreate(String utcCreate) {
            this.utcCreate = utcCreate;
            return this;
        }
        public String getUtcCreate() {
            return this.utcCreate;
        }

        public QueryHasInspectWebruleResponseBodyResultContentData setUtcModified(String utcModified) {
            this.utcModified = utcModified;
            return this;
        }
        public String getUtcModified() {
            return this.utcModified;
        }

        public QueryHasInspectWebruleResponseBodyResultContentData setArgs(String args) {
            this.args = args;
            return this;
        }
        public String getArgs() {
            return this.args;
        }

        public QueryHasInspectWebruleResponseBodyResultContentData setAvailableActions(java.util.List<QueryHasInspectWebruleResponseBodyResultContentDataAvailableActions> availableActions) {
            this.availableActions = availableActions;
            return this;
        }
        public java.util.List<QueryHasInspectWebruleResponseBodyResultContentDataAvailableActions> getAvailableActions() {
            return this.availableActions;
        }

    }

    public static class QueryHasInspectWebruleResponseBodyResultContentTopErrorCode extends TeaModel {
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

        public static QueryHasInspectWebruleResponseBodyResultContentTopErrorCode build(java.util.Map<String, ?> map) throws Exception {
            QueryHasInspectWebruleResponseBodyResultContentTopErrorCode self = new QueryHasInspectWebruleResponseBodyResultContentTopErrorCode();
            return TeaModel.build(map, self);
        }

        public QueryHasInspectWebruleResponseBodyResultContentTopErrorCode setExceptionCode(String exceptionCode) {
            this.exceptionCode = exceptionCode;
            return this;
        }
        public String getExceptionCode() {
            return this.exceptionCode;
        }

        public QueryHasInspectWebruleResponseBodyResultContentTopErrorCode setExceptionCodeDescription(String exceptionCodeDescription) {
            this.exceptionCodeDescription = exceptionCodeDescription;
            return this;
        }
        public String getExceptionCodeDescription() {
            return this.exceptionCodeDescription;
        }

        public QueryHasInspectWebruleResponseBodyResultContentTopErrorCode setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public QueryHasInspectWebruleResponseBodyResultContentTopErrorCode setPrefix(String prefix) {
            this.prefix = prefix;
            return this;
        }
        public String getPrefix() {
            return this.prefix;
        }

        public QueryHasInspectWebruleResponseBodyResultContentTopErrorCode setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public QueryHasInspectWebruleResponseBodyResultContentTopErrorCode setSceneName(String sceneName) {
            this.sceneName = sceneName;
            return this;
        }
        public String getSceneName() {
            return this.sceneName;
        }

        public QueryHasInspectWebruleResponseBodyResultContentTopErrorCode setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public QueryHasInspectWebruleResponseBodyResultContentTopErrorCode setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class QueryHasInspectWebruleResponseBodyResultContentTopErrorReason extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Content")
        public String content;

        public static QueryHasInspectWebruleResponseBodyResultContentTopErrorReason build(java.util.Map<String, ?> map) throws Exception {
            QueryHasInspectWebruleResponseBodyResultContentTopErrorReason self = new QueryHasInspectWebruleResponseBodyResultContentTopErrorReason();
            return TeaModel.build(map, self);
        }

        public QueryHasInspectWebruleResponseBodyResultContentTopErrorReason setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public QueryHasInspectWebruleResponseBodyResultContentTopErrorReason setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

    public static class QueryHasInspectWebruleResponseBodyResultContent extends TeaModel {
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
        public java.util.List<QueryHasInspectWebruleResponseBodyResultContentData> data;

        @NameInMap("TopErrorCode")
        public QueryHasInspectWebruleResponseBodyResultContentTopErrorCode topErrorCode;

        @NameInMap("TopErrorReason")
        public QueryHasInspectWebruleResponseBodyResultContentTopErrorReason topErrorReason;

        public static QueryHasInspectWebruleResponseBodyResultContent build(java.util.Map<String, ?> map) throws Exception {
            QueryHasInspectWebruleResponseBodyResultContent self = new QueryHasInspectWebruleResponseBodyResultContent();
            return TeaModel.build(map, self);
        }

        public QueryHasInspectWebruleResponseBodyResultContent setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public QueryHasInspectWebruleResponseBodyResultContent setCurrentPage(Long currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Long getCurrentPage() {
            return this.currentPage;
        }

        public QueryHasInspectWebruleResponseBodyResultContent setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public QueryHasInspectWebruleResponseBodyResultContent setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public QueryHasInspectWebruleResponseBodyResultContent setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public QueryHasInspectWebruleResponseBodyResultContent setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

        public QueryHasInspectWebruleResponseBodyResultContent setData(java.util.List<QueryHasInspectWebruleResponseBodyResultContentData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<QueryHasInspectWebruleResponseBodyResultContentData> getData() {
            return this.data;
        }

        public QueryHasInspectWebruleResponseBodyResultContent setTopErrorCode(QueryHasInspectWebruleResponseBodyResultContentTopErrorCode topErrorCode) {
            this.topErrorCode = topErrorCode;
            return this;
        }
        public QueryHasInspectWebruleResponseBodyResultContentTopErrorCode getTopErrorCode() {
            return this.topErrorCode;
        }

        public QueryHasInspectWebruleResponseBodyResultContent setTopErrorReason(QueryHasInspectWebruleResponseBodyResultContentTopErrorReason topErrorReason) {
            this.topErrorReason = topErrorReason;
            return this;
        }
        public QueryHasInspectWebruleResponseBodyResultContentTopErrorReason getTopErrorReason() {
            return this.topErrorReason;
        }

    }

}
