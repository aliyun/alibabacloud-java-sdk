// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryHasInspectPluginResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultContent")
    public QueryHasInspectPluginResponseBodyResultContent resultContent;

    public static QueryHasInspectPluginResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryHasInspectPluginResponseBody self = new QueryHasInspectPluginResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryHasInspectPluginResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryHasInspectPluginResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryHasInspectPluginResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryHasInspectPluginResponseBody setResultContent(QueryHasInspectPluginResponseBodyResultContent resultContent) {
        this.resultContent = resultContent;
        return this;
    }
    public QueryHasInspectPluginResponseBodyResultContent getResultContent() {
        return this.resultContent;
    }

    public static class QueryHasInspectPluginResponseBodyResultContentDataTags extends TeaModel {
        @NameInMap("TagCode")
        public String tagCode;

        @NameInMap("Name")
        public String name;

        @NameInMap("Type")
        public String type;

        public static QueryHasInspectPluginResponseBodyResultContentDataTags build(java.util.Map<String, ?> map) throws Exception {
            QueryHasInspectPluginResponseBodyResultContentDataTags self = new QueryHasInspectPluginResponseBodyResultContentDataTags();
            return TeaModel.build(map, self);
        }

        public QueryHasInspectPluginResponseBodyResultContentDataTags setTagCode(String tagCode) {
            this.tagCode = tagCode;
            return this;
        }
        public String getTagCode() {
            return this.tagCode;
        }

        public QueryHasInspectPluginResponseBodyResultContentDataTags setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryHasInspectPluginResponseBodyResultContentDataTags setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class QueryHasInspectPluginResponseBodyResultContentDataAvailableActions extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Description")
        public String description;

        public static QueryHasInspectPluginResponseBodyResultContentDataAvailableActions build(java.util.Map<String, ?> map) throws Exception {
            QueryHasInspectPluginResponseBodyResultContentDataAvailableActions self = new QueryHasInspectPluginResponseBodyResultContentDataAvailableActions();
            return TeaModel.build(map, self);
        }

        public QueryHasInspectPluginResponseBodyResultContentDataAvailableActions setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public QueryHasInspectPluginResponseBodyResultContentDataAvailableActions setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

    }

    public static class QueryHasInspectPluginResponseBodyResultContentDataMaintainTeam extends TeaModel {
        @NameInMap("TagCode")
        public String tagCode;

        @NameInMap("Name")
        public String name;

        @NameInMap("Type")
        public String type;

        public static QueryHasInspectPluginResponseBodyResultContentDataMaintainTeam build(java.util.Map<String, ?> map) throws Exception {
            QueryHasInspectPluginResponseBodyResultContentDataMaintainTeam self = new QueryHasInspectPluginResponseBodyResultContentDataMaintainTeam();
            return TeaModel.build(map, self);
        }

        public QueryHasInspectPluginResponseBodyResultContentDataMaintainTeam setTagCode(String tagCode) {
            this.tagCode = tagCode;
            return this;
        }
        public String getTagCode() {
            return this.tagCode;
        }

        public QueryHasInspectPluginResponseBodyResultContentDataMaintainTeam setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryHasInspectPluginResponseBodyResultContentDataMaintainTeam setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class QueryHasInspectPluginResponseBodyResultContentData extends TeaModel {
        @NameInMap("Associated")
        public Boolean associated;

        @NameInMap("Id")
        public String id;

        @NameInMap("Name")
        public String name;

        @NameInMap("Description")
        public String description;

        @NameInMap("Status")
        public String status;

        @NameInMap("PluginType")
        public String pluginType;

        @NameInMap("DeleteStatus")
        public Long deleteStatus;

        @NameInMap("DeleteAt")
        public String deleteAt;

        @NameInMap("Gid")
        public String gid;

        @NameInMap("Creator")
        public String creator;

        @NameInMap("TenantId")
        public String tenantId;

        @NameInMap("UtcCreate")
        public String utcCreate;

        @NameInMap("UtcModified")
        public String utcModified;

        @NameInMap("Tags")
        public java.util.List<QueryHasInspectPluginResponseBodyResultContentDataTags> tags;

        @NameInMap("AvailableActions")
        public java.util.List<QueryHasInspectPluginResponseBodyResultContentDataAvailableActions> availableActions;

        @NameInMap("MaintainTeam")
        public QueryHasInspectPluginResponseBodyResultContentDataMaintainTeam maintainTeam;

        public static QueryHasInspectPluginResponseBodyResultContentData build(java.util.Map<String, ?> map) throws Exception {
            QueryHasInspectPluginResponseBodyResultContentData self = new QueryHasInspectPluginResponseBodyResultContentData();
            return TeaModel.build(map, self);
        }

        public QueryHasInspectPluginResponseBodyResultContentData setAssociated(Boolean associated) {
            this.associated = associated;
            return this;
        }
        public Boolean getAssociated() {
            return this.associated;
        }

        public QueryHasInspectPluginResponseBodyResultContentData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryHasInspectPluginResponseBodyResultContentData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryHasInspectPluginResponseBodyResultContentData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public QueryHasInspectPluginResponseBodyResultContentData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QueryHasInspectPluginResponseBodyResultContentData setPluginType(String pluginType) {
            this.pluginType = pluginType;
            return this;
        }
        public String getPluginType() {
            return this.pluginType;
        }

        public QueryHasInspectPluginResponseBodyResultContentData setDeleteStatus(Long deleteStatus) {
            this.deleteStatus = deleteStatus;
            return this;
        }
        public Long getDeleteStatus() {
            return this.deleteStatus;
        }

        public QueryHasInspectPluginResponseBodyResultContentData setDeleteAt(String deleteAt) {
            this.deleteAt = deleteAt;
            return this;
        }
        public String getDeleteAt() {
            return this.deleteAt;
        }

        public QueryHasInspectPluginResponseBodyResultContentData setGid(String gid) {
            this.gid = gid;
            return this;
        }
        public String getGid() {
            return this.gid;
        }

        public QueryHasInspectPluginResponseBodyResultContentData setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public QueryHasInspectPluginResponseBodyResultContentData setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public QueryHasInspectPluginResponseBodyResultContentData setUtcCreate(String utcCreate) {
            this.utcCreate = utcCreate;
            return this;
        }
        public String getUtcCreate() {
            return this.utcCreate;
        }

        public QueryHasInspectPluginResponseBodyResultContentData setUtcModified(String utcModified) {
            this.utcModified = utcModified;
            return this;
        }
        public String getUtcModified() {
            return this.utcModified;
        }

        public QueryHasInspectPluginResponseBodyResultContentData setTags(java.util.List<QueryHasInspectPluginResponseBodyResultContentDataTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<QueryHasInspectPluginResponseBodyResultContentDataTags> getTags() {
            return this.tags;
        }

        public QueryHasInspectPluginResponseBodyResultContentData setAvailableActions(java.util.List<QueryHasInspectPluginResponseBodyResultContentDataAvailableActions> availableActions) {
            this.availableActions = availableActions;
            return this;
        }
        public java.util.List<QueryHasInspectPluginResponseBodyResultContentDataAvailableActions> getAvailableActions() {
            return this.availableActions;
        }

        public QueryHasInspectPluginResponseBodyResultContentData setMaintainTeam(QueryHasInspectPluginResponseBodyResultContentDataMaintainTeam maintainTeam) {
            this.maintainTeam = maintainTeam;
            return this;
        }
        public QueryHasInspectPluginResponseBodyResultContentDataMaintainTeam getMaintainTeam() {
            return this.maintainTeam;
        }

    }

    public static class QueryHasInspectPluginResponseBodyResultContentTopErrorCode extends TeaModel {
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

        public static QueryHasInspectPluginResponseBodyResultContentTopErrorCode build(java.util.Map<String, ?> map) throws Exception {
            QueryHasInspectPluginResponseBodyResultContentTopErrorCode self = new QueryHasInspectPluginResponseBodyResultContentTopErrorCode();
            return TeaModel.build(map, self);
        }

        public QueryHasInspectPluginResponseBodyResultContentTopErrorCode setExceptionCode(String exceptionCode) {
            this.exceptionCode = exceptionCode;
            return this;
        }
        public String getExceptionCode() {
            return this.exceptionCode;
        }

        public QueryHasInspectPluginResponseBodyResultContentTopErrorCode setExceptionCodeDescription(String exceptionCodeDescription) {
            this.exceptionCodeDescription = exceptionCodeDescription;
            return this;
        }
        public String getExceptionCodeDescription() {
            return this.exceptionCodeDescription;
        }

        public QueryHasInspectPluginResponseBodyResultContentTopErrorCode setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public QueryHasInspectPluginResponseBodyResultContentTopErrorCode setPrefix(String prefix) {
            this.prefix = prefix;
            return this;
        }
        public String getPrefix() {
            return this.prefix;
        }

        public QueryHasInspectPluginResponseBodyResultContentTopErrorCode setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public QueryHasInspectPluginResponseBodyResultContentTopErrorCode setSceneName(String sceneName) {
            this.sceneName = sceneName;
            return this;
        }
        public String getSceneName() {
            return this.sceneName;
        }

        public QueryHasInspectPluginResponseBodyResultContentTopErrorCode setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public QueryHasInspectPluginResponseBodyResultContentTopErrorCode setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class QueryHasInspectPluginResponseBodyResultContentTopErrorReason extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Content")
        public String content;

        public static QueryHasInspectPluginResponseBodyResultContentTopErrorReason build(java.util.Map<String, ?> map) throws Exception {
            QueryHasInspectPluginResponseBodyResultContentTopErrorReason self = new QueryHasInspectPluginResponseBodyResultContentTopErrorReason();
            return TeaModel.build(map, self);
        }

        public QueryHasInspectPluginResponseBodyResultContentTopErrorReason setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public QueryHasInspectPluginResponseBodyResultContentTopErrorReason setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

    public static class QueryHasInspectPluginResponseBodyResultContent extends TeaModel {
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
        public java.util.List<QueryHasInspectPluginResponseBodyResultContentData> data;

        @NameInMap("TopErrorCode")
        public QueryHasInspectPluginResponseBodyResultContentTopErrorCode topErrorCode;

        @NameInMap("TopErrorReason")
        public QueryHasInspectPluginResponseBodyResultContentTopErrorReason topErrorReason;

        public static QueryHasInspectPluginResponseBodyResultContent build(java.util.Map<String, ?> map) throws Exception {
            QueryHasInspectPluginResponseBodyResultContent self = new QueryHasInspectPluginResponseBodyResultContent();
            return TeaModel.build(map, self);
        }

        public QueryHasInspectPluginResponseBodyResultContent setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public QueryHasInspectPluginResponseBodyResultContent setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public QueryHasInspectPluginResponseBodyResultContent setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public QueryHasInspectPluginResponseBodyResultContent setCurrentPage(Long currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Long getCurrentPage() {
            return this.currentPage;
        }

        public QueryHasInspectPluginResponseBodyResultContent setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public QueryHasInspectPluginResponseBodyResultContent setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

        public QueryHasInspectPluginResponseBodyResultContent setData(java.util.List<QueryHasInspectPluginResponseBodyResultContentData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<QueryHasInspectPluginResponseBodyResultContentData> getData() {
            return this.data;
        }

        public QueryHasInspectPluginResponseBodyResultContent setTopErrorCode(QueryHasInspectPluginResponseBodyResultContentTopErrorCode topErrorCode) {
            this.topErrorCode = topErrorCode;
            return this;
        }
        public QueryHasInspectPluginResponseBodyResultContentTopErrorCode getTopErrorCode() {
            return this.topErrorCode;
        }

        public QueryHasInspectPluginResponseBodyResultContent setTopErrorReason(QueryHasInspectPluginResponseBodyResultContentTopErrorReason topErrorReason) {
            this.topErrorReason = topErrorReason;
            return this;
        }
        public QueryHasInspectPluginResponseBodyResultContentTopErrorReason getTopErrorReason() {
            return this.topErrorReason;
        }

    }

}
