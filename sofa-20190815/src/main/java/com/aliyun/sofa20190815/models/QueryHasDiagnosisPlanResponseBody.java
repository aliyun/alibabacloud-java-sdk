// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryHasDiagnosisPlanResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultContent")
    public QueryHasDiagnosisPlanResponseBodyResultContent resultContent;

    public static QueryHasDiagnosisPlanResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryHasDiagnosisPlanResponseBody self = new QueryHasDiagnosisPlanResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryHasDiagnosisPlanResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryHasDiagnosisPlanResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryHasDiagnosisPlanResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryHasDiagnosisPlanResponseBody setResultContent(QueryHasDiagnosisPlanResponseBodyResultContent resultContent) {
        this.resultContent = resultContent;
        return this;
    }
    public QueryHasDiagnosisPlanResponseBodyResultContent getResultContent() {
        return this.resultContent;
    }

    public static class QueryHasDiagnosisPlanResponseBodyResultContentDataTags extends TeaModel {
        @NameInMap("TagCode")
        public String tagCode;

        @NameInMap("Name")
        public String name;

        @NameInMap("Type")
        public String type;

        public static QueryHasDiagnosisPlanResponseBodyResultContentDataTags build(java.util.Map<String, ?> map) throws Exception {
            QueryHasDiagnosisPlanResponseBodyResultContentDataTags self = new QueryHasDiagnosisPlanResponseBodyResultContentDataTags();
            return TeaModel.build(map, self);
        }

        public QueryHasDiagnosisPlanResponseBodyResultContentDataTags setTagCode(String tagCode) {
            this.tagCode = tagCode;
            return this;
        }
        public String getTagCode() {
            return this.tagCode;
        }

        public QueryHasDiagnosisPlanResponseBodyResultContentDataTags setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryHasDiagnosisPlanResponseBodyResultContentDataTags setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class QueryHasDiagnosisPlanResponseBodyResultContentDataDgGraph extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("DeleteStatus")
        public Boolean deleteStatus;

        @NameInMap("NameSpace")
        public String nameSpace;

        @NameInMap("DeleteAt")
        public String deleteAt;

        @NameInMap("Creator")
        public String creator;

        @NameInMap("DiagPlanId")
        public String diagPlanId;

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

        public static QueryHasDiagnosisPlanResponseBodyResultContentDataDgGraph build(java.util.Map<String, ?> map) throws Exception {
            QueryHasDiagnosisPlanResponseBodyResultContentDataDgGraph self = new QueryHasDiagnosisPlanResponseBodyResultContentDataDgGraph();
            return TeaModel.build(map, self);
        }

        public QueryHasDiagnosisPlanResponseBodyResultContentDataDgGraph setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryHasDiagnosisPlanResponseBodyResultContentDataDgGraph setDeleteStatus(Boolean deleteStatus) {
            this.deleteStatus = deleteStatus;
            return this;
        }
        public Boolean getDeleteStatus() {
            return this.deleteStatus;
        }

        public QueryHasDiagnosisPlanResponseBodyResultContentDataDgGraph setNameSpace(String nameSpace) {
            this.nameSpace = nameSpace;
            return this;
        }
        public String getNameSpace() {
            return this.nameSpace;
        }

        public QueryHasDiagnosisPlanResponseBodyResultContentDataDgGraph setDeleteAt(String deleteAt) {
            this.deleteAt = deleteAt;
            return this;
        }
        public String getDeleteAt() {
            return this.deleteAt;
        }

        public QueryHasDiagnosisPlanResponseBodyResultContentDataDgGraph setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public QueryHasDiagnosisPlanResponseBodyResultContentDataDgGraph setDiagPlanId(String diagPlanId) {
            this.diagPlanId = diagPlanId;
            return this;
        }
        public String getDiagPlanId() {
            return this.diagPlanId;
        }

        public QueryHasDiagnosisPlanResponseBodyResultContentDataDgGraph setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public QueryHasDiagnosisPlanResponseBodyResultContentDataDgGraph setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public QueryHasDiagnosisPlanResponseBodyResultContentDataDgGraph setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryHasDiagnosisPlanResponseBodyResultContentDataDgGraph setUtcCreate(String utcCreate) {
            this.utcCreate = utcCreate;
            return this;
        }
        public String getUtcCreate() {
            return this.utcCreate;
        }

        public QueryHasDiagnosisPlanResponseBodyResultContentDataDgGraph setUtcModified(String utcModified) {
            this.utcModified = utcModified;
            return this;
        }
        public String getUtcModified() {
            return this.utcModified;
        }

    }

    public static class QueryHasDiagnosisPlanResponseBodyResultContentData extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("Description")
        public String description;

        @NameInMap("ExecutableStatus")
        public String executableStatus;

        @NameInMap("RunningStatus")
        public String runningStatus;

        @NameInMap("Timeout")
        public Long timeout;

        @NameInMap("IsDeleted")
        public Boolean isDeleted;

        @NameInMap("DeleteTime")
        public String deleteTime;

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
        public java.util.List<QueryHasDiagnosisPlanResponseBodyResultContentDataTags> tags;

        @NameInMap("DgGraph")
        public QueryHasDiagnosisPlanResponseBodyResultContentDataDgGraph dgGraph;

        public static QueryHasDiagnosisPlanResponseBodyResultContentData build(java.util.Map<String, ?> map) throws Exception {
            QueryHasDiagnosisPlanResponseBodyResultContentData self = new QueryHasDiagnosisPlanResponseBodyResultContentData();
            return TeaModel.build(map, self);
        }

        public QueryHasDiagnosisPlanResponseBodyResultContentData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryHasDiagnosisPlanResponseBodyResultContentData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public QueryHasDiagnosisPlanResponseBodyResultContentData setExecutableStatus(String executableStatus) {
            this.executableStatus = executableStatus;
            return this;
        }
        public String getExecutableStatus() {
            return this.executableStatus;
        }

        public QueryHasDiagnosisPlanResponseBodyResultContentData setRunningStatus(String runningStatus) {
            this.runningStatus = runningStatus;
            return this;
        }
        public String getRunningStatus() {
            return this.runningStatus;
        }

        public QueryHasDiagnosisPlanResponseBodyResultContentData setTimeout(Long timeout) {
            this.timeout = timeout;
            return this;
        }
        public Long getTimeout() {
            return this.timeout;
        }

        public QueryHasDiagnosisPlanResponseBodyResultContentData setIsDeleted(Boolean isDeleted) {
            this.isDeleted = isDeleted;
            return this;
        }
        public Boolean getIsDeleted() {
            return this.isDeleted;
        }

        public QueryHasDiagnosisPlanResponseBodyResultContentData setDeleteTime(String deleteTime) {
            this.deleteTime = deleteTime;
            return this;
        }
        public String getDeleteTime() {
            return this.deleteTime;
        }

        public QueryHasDiagnosisPlanResponseBodyResultContentData setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public QueryHasDiagnosisPlanResponseBodyResultContentData setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public QueryHasDiagnosisPlanResponseBodyResultContentData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryHasDiagnosisPlanResponseBodyResultContentData setUtcCreate(String utcCreate) {
            this.utcCreate = utcCreate;
            return this;
        }
        public String getUtcCreate() {
            return this.utcCreate;
        }

        public QueryHasDiagnosisPlanResponseBodyResultContentData setUtcModified(String utcModified) {
            this.utcModified = utcModified;
            return this;
        }
        public String getUtcModified() {
            return this.utcModified;
        }

        public QueryHasDiagnosisPlanResponseBodyResultContentData setTags(java.util.List<QueryHasDiagnosisPlanResponseBodyResultContentDataTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<QueryHasDiagnosisPlanResponseBodyResultContentDataTags> getTags() {
            return this.tags;
        }

        public QueryHasDiagnosisPlanResponseBodyResultContentData setDgGraph(QueryHasDiagnosisPlanResponseBodyResultContentDataDgGraph dgGraph) {
            this.dgGraph = dgGraph;
            return this;
        }
        public QueryHasDiagnosisPlanResponseBodyResultContentDataDgGraph getDgGraph() {
            return this.dgGraph;
        }

    }

    public static class QueryHasDiagnosisPlanResponseBodyResultContentTopErrorCode extends TeaModel {
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

        public static QueryHasDiagnosisPlanResponseBodyResultContentTopErrorCode build(java.util.Map<String, ?> map) throws Exception {
            QueryHasDiagnosisPlanResponseBodyResultContentTopErrorCode self = new QueryHasDiagnosisPlanResponseBodyResultContentTopErrorCode();
            return TeaModel.build(map, self);
        }

        public QueryHasDiagnosisPlanResponseBodyResultContentTopErrorCode setExceptionCode(String exceptionCode) {
            this.exceptionCode = exceptionCode;
            return this;
        }
        public String getExceptionCode() {
            return this.exceptionCode;
        }

        public QueryHasDiagnosisPlanResponseBodyResultContentTopErrorCode setExceptionCodeDescription(String exceptionCodeDescription) {
            this.exceptionCodeDescription = exceptionCodeDescription;
            return this;
        }
        public String getExceptionCodeDescription() {
            return this.exceptionCodeDescription;
        }

        public QueryHasDiagnosisPlanResponseBodyResultContentTopErrorCode setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public QueryHasDiagnosisPlanResponseBodyResultContentTopErrorCode setPrefix(String prefix) {
            this.prefix = prefix;
            return this;
        }
        public String getPrefix() {
            return this.prefix;
        }

        public QueryHasDiagnosisPlanResponseBodyResultContentTopErrorCode setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public QueryHasDiagnosisPlanResponseBodyResultContentTopErrorCode setSceneName(String sceneName) {
            this.sceneName = sceneName;
            return this;
        }
        public String getSceneName() {
            return this.sceneName;
        }

        public QueryHasDiagnosisPlanResponseBodyResultContentTopErrorCode setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public QueryHasDiagnosisPlanResponseBodyResultContentTopErrorCode setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class QueryHasDiagnosisPlanResponseBodyResultContentTopErrorReason extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Content")
        public String content;

        public static QueryHasDiagnosisPlanResponseBodyResultContentTopErrorReason build(java.util.Map<String, ?> map) throws Exception {
            QueryHasDiagnosisPlanResponseBodyResultContentTopErrorReason self = new QueryHasDiagnosisPlanResponseBodyResultContentTopErrorReason();
            return TeaModel.build(map, self);
        }

        public QueryHasDiagnosisPlanResponseBodyResultContentTopErrorReason setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public QueryHasDiagnosisPlanResponseBodyResultContentTopErrorReason setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

    public static class QueryHasDiagnosisPlanResponseBodyResultContent extends TeaModel {
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
        public java.util.List<QueryHasDiagnosisPlanResponseBodyResultContentData> data;

        @NameInMap("TopErrorCode")
        public QueryHasDiagnosisPlanResponseBodyResultContentTopErrorCode topErrorCode;

        @NameInMap("TopErrorReason")
        public QueryHasDiagnosisPlanResponseBodyResultContentTopErrorReason topErrorReason;

        public static QueryHasDiagnosisPlanResponseBodyResultContent build(java.util.Map<String, ?> map) throws Exception {
            QueryHasDiagnosisPlanResponseBodyResultContent self = new QueryHasDiagnosisPlanResponseBodyResultContent();
            return TeaModel.build(map, self);
        }

        public QueryHasDiagnosisPlanResponseBodyResultContent setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public QueryHasDiagnosisPlanResponseBodyResultContent setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public QueryHasDiagnosisPlanResponseBodyResultContent setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public QueryHasDiagnosisPlanResponseBodyResultContent setCurrentPage(Long currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Long getCurrentPage() {
            return this.currentPage;
        }

        public QueryHasDiagnosisPlanResponseBodyResultContent setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public QueryHasDiagnosisPlanResponseBodyResultContent setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

        public QueryHasDiagnosisPlanResponseBodyResultContent setData(java.util.List<QueryHasDiagnosisPlanResponseBodyResultContentData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<QueryHasDiagnosisPlanResponseBodyResultContentData> getData() {
            return this.data;
        }

        public QueryHasDiagnosisPlanResponseBodyResultContent setTopErrorCode(QueryHasDiagnosisPlanResponseBodyResultContentTopErrorCode topErrorCode) {
            this.topErrorCode = topErrorCode;
            return this;
        }
        public QueryHasDiagnosisPlanResponseBodyResultContentTopErrorCode getTopErrorCode() {
            return this.topErrorCode;
        }

        public QueryHasDiagnosisPlanResponseBodyResultContent setTopErrorReason(QueryHasDiagnosisPlanResponseBodyResultContentTopErrorReason topErrorReason) {
            this.topErrorReason = topErrorReason;
            return this;
        }
        public QueryHasDiagnosisPlanResponseBodyResultContentTopErrorReason getTopErrorReason() {
            return this.topErrorReason;
        }

    }

}
