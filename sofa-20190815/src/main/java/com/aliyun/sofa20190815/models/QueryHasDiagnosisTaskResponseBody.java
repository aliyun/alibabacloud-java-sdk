// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryHasDiagnosisTaskResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultContent")
    public QueryHasDiagnosisTaskResponseBodyResultContent resultContent;

    public static QueryHasDiagnosisTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryHasDiagnosisTaskResponseBody self = new QueryHasDiagnosisTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryHasDiagnosisTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryHasDiagnosisTaskResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryHasDiagnosisTaskResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryHasDiagnosisTaskResponseBody setResultContent(QueryHasDiagnosisTaskResponseBodyResultContent resultContent) {
        this.resultContent = resultContent;
        return this;
    }
    public QueryHasDiagnosisTaskResponseBodyResultContent getResultContent() {
        return this.resultContent;
    }

    public static class QueryHasDiagnosisTaskResponseBodyResultContentDataInspectExecSummary extends TeaModel {
        @NameInMap("ExecStatusSummaryJsonStr")
        public String execStatusSummaryJsonStr;

        @NameInMap("InspectVerdictSummaryJsonStr")
        public String inspectVerdictSummaryJsonStr;

        @NameInMap("IsEmpty")
        public Boolean isEmpty;

        @NameInMap("TotalExecCount")
        public Long totalExecCount;

        public static QueryHasDiagnosisTaskResponseBodyResultContentDataInspectExecSummary build(java.util.Map<String, ?> map) throws Exception {
            QueryHasDiagnosisTaskResponseBodyResultContentDataInspectExecSummary self = new QueryHasDiagnosisTaskResponseBodyResultContentDataInspectExecSummary();
            return TeaModel.build(map, self);
        }

        public QueryHasDiagnosisTaskResponseBodyResultContentDataInspectExecSummary setExecStatusSummaryJsonStr(String execStatusSummaryJsonStr) {
            this.execStatusSummaryJsonStr = execStatusSummaryJsonStr;
            return this;
        }
        public String getExecStatusSummaryJsonStr() {
            return this.execStatusSummaryJsonStr;
        }

        public QueryHasDiagnosisTaskResponseBodyResultContentDataInspectExecSummary setInspectVerdictSummaryJsonStr(String inspectVerdictSummaryJsonStr) {
            this.inspectVerdictSummaryJsonStr = inspectVerdictSummaryJsonStr;
            return this;
        }
        public String getInspectVerdictSummaryJsonStr() {
            return this.inspectVerdictSummaryJsonStr;
        }

        public QueryHasDiagnosisTaskResponseBodyResultContentDataInspectExecSummary setIsEmpty(Boolean isEmpty) {
            this.isEmpty = isEmpty;
            return this;
        }
        public Boolean getIsEmpty() {
            return this.isEmpty;
        }

        public QueryHasDiagnosisTaskResponseBodyResultContentDataInspectExecSummary setTotalExecCount(Long totalExecCount) {
            this.totalExecCount = totalExecCount;
            return this;
        }
        public Long getTotalExecCount() {
            return this.totalExecCount;
        }

    }

    public static class QueryHasDiagnosisTaskResponseBodyResultContentData extends TeaModel {
        @NameInMap("PlanId")
        public String planId;

        @NameInMap("PlanName")
        public String planName;

        @NameInMap("Deleted")
        public Boolean deleted;

        @NameInMap("TriggerType")
        public String triggerType;

        @NameInMap("Creator")
        public String creator;

        @NameInMap("Status")
        public String status;

        @NameInMap("AggregateStatus")
        public String aggregateStatus;

        @NameInMap("TenantId")
        public String tenantId;

        @NameInMap("Id")
        public String id;

        @NameInMap("UtcCreate")
        public String utcCreate;

        @NameInMap("UtcModified")
        public String utcModified;

        @NameInMap("InspectExecSummary")
        public QueryHasDiagnosisTaskResponseBodyResultContentDataInspectExecSummary inspectExecSummary;

        public static QueryHasDiagnosisTaskResponseBodyResultContentData build(java.util.Map<String, ?> map) throws Exception {
            QueryHasDiagnosisTaskResponseBodyResultContentData self = new QueryHasDiagnosisTaskResponseBodyResultContentData();
            return TeaModel.build(map, self);
        }

        public QueryHasDiagnosisTaskResponseBodyResultContentData setPlanId(String planId) {
            this.planId = planId;
            return this;
        }
        public String getPlanId() {
            return this.planId;
        }

        public QueryHasDiagnosisTaskResponseBodyResultContentData setPlanName(String planName) {
            this.planName = planName;
            return this;
        }
        public String getPlanName() {
            return this.planName;
        }

        public QueryHasDiagnosisTaskResponseBodyResultContentData setDeleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }
        public Boolean getDeleted() {
            return this.deleted;
        }

        public QueryHasDiagnosisTaskResponseBodyResultContentData setTriggerType(String triggerType) {
            this.triggerType = triggerType;
            return this;
        }
        public String getTriggerType() {
            return this.triggerType;
        }

        public QueryHasDiagnosisTaskResponseBodyResultContentData setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public QueryHasDiagnosisTaskResponseBodyResultContentData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QueryHasDiagnosisTaskResponseBodyResultContentData setAggregateStatus(String aggregateStatus) {
            this.aggregateStatus = aggregateStatus;
            return this;
        }
        public String getAggregateStatus() {
            return this.aggregateStatus;
        }

        public QueryHasDiagnosisTaskResponseBodyResultContentData setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public QueryHasDiagnosisTaskResponseBodyResultContentData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryHasDiagnosisTaskResponseBodyResultContentData setUtcCreate(String utcCreate) {
            this.utcCreate = utcCreate;
            return this;
        }
        public String getUtcCreate() {
            return this.utcCreate;
        }

        public QueryHasDiagnosisTaskResponseBodyResultContentData setUtcModified(String utcModified) {
            this.utcModified = utcModified;
            return this;
        }
        public String getUtcModified() {
            return this.utcModified;
        }

        public QueryHasDiagnosisTaskResponseBodyResultContentData setInspectExecSummary(QueryHasDiagnosisTaskResponseBodyResultContentDataInspectExecSummary inspectExecSummary) {
            this.inspectExecSummary = inspectExecSummary;
            return this;
        }
        public QueryHasDiagnosisTaskResponseBodyResultContentDataInspectExecSummary getInspectExecSummary() {
            return this.inspectExecSummary;
        }

    }

    public static class QueryHasDiagnosisTaskResponseBodyResultContentTopErrorCode extends TeaModel {
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

        public static QueryHasDiagnosisTaskResponseBodyResultContentTopErrorCode build(java.util.Map<String, ?> map) throws Exception {
            QueryHasDiagnosisTaskResponseBodyResultContentTopErrorCode self = new QueryHasDiagnosisTaskResponseBodyResultContentTopErrorCode();
            return TeaModel.build(map, self);
        }

        public QueryHasDiagnosisTaskResponseBodyResultContentTopErrorCode setExceptionCode(String exceptionCode) {
            this.exceptionCode = exceptionCode;
            return this;
        }
        public String getExceptionCode() {
            return this.exceptionCode;
        }

        public QueryHasDiagnosisTaskResponseBodyResultContentTopErrorCode setExceptionCodeDescription(String exceptionCodeDescription) {
            this.exceptionCodeDescription = exceptionCodeDescription;
            return this;
        }
        public String getExceptionCodeDescription() {
            return this.exceptionCodeDescription;
        }

        public QueryHasDiagnosisTaskResponseBodyResultContentTopErrorCode setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public QueryHasDiagnosisTaskResponseBodyResultContentTopErrorCode setPrefix(String prefix) {
            this.prefix = prefix;
            return this;
        }
        public String getPrefix() {
            return this.prefix;
        }

        public QueryHasDiagnosisTaskResponseBodyResultContentTopErrorCode setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public QueryHasDiagnosisTaskResponseBodyResultContentTopErrorCode setSceneName(String sceneName) {
            this.sceneName = sceneName;
            return this;
        }
        public String getSceneName() {
            return this.sceneName;
        }

        public QueryHasDiagnosisTaskResponseBodyResultContentTopErrorCode setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public QueryHasDiagnosisTaskResponseBodyResultContentTopErrorCode setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class QueryHasDiagnosisTaskResponseBodyResultContentTopErrorReason extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Content")
        public String content;

        public static QueryHasDiagnosisTaskResponseBodyResultContentTopErrorReason build(java.util.Map<String, ?> map) throws Exception {
            QueryHasDiagnosisTaskResponseBodyResultContentTopErrorReason self = new QueryHasDiagnosisTaskResponseBodyResultContentTopErrorReason();
            return TeaModel.build(map, self);
        }

        public QueryHasDiagnosisTaskResponseBodyResultContentTopErrorReason setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public QueryHasDiagnosisTaskResponseBodyResultContentTopErrorReason setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

    public static class QueryHasDiagnosisTaskResponseBodyResultContent extends TeaModel {
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
        public java.util.List<QueryHasDiagnosisTaskResponseBodyResultContentData> data;

        @NameInMap("TopErrorCode")
        public QueryHasDiagnosisTaskResponseBodyResultContentTopErrorCode topErrorCode;

        @NameInMap("TopErrorReason")
        public QueryHasDiagnosisTaskResponseBodyResultContentTopErrorReason topErrorReason;

        public static QueryHasDiagnosisTaskResponseBodyResultContent build(java.util.Map<String, ?> map) throws Exception {
            QueryHasDiagnosisTaskResponseBodyResultContent self = new QueryHasDiagnosisTaskResponseBodyResultContent();
            return TeaModel.build(map, self);
        }

        public QueryHasDiagnosisTaskResponseBodyResultContent setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public QueryHasDiagnosisTaskResponseBodyResultContent setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public QueryHasDiagnosisTaskResponseBodyResultContent setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public QueryHasDiagnosisTaskResponseBodyResultContent setCurrentPage(Long currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Long getCurrentPage() {
            return this.currentPage;
        }

        public QueryHasDiagnosisTaskResponseBodyResultContent setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public QueryHasDiagnosisTaskResponseBodyResultContent setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

        public QueryHasDiagnosisTaskResponseBodyResultContent setData(java.util.List<QueryHasDiagnosisTaskResponseBodyResultContentData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<QueryHasDiagnosisTaskResponseBodyResultContentData> getData() {
            return this.data;
        }

        public QueryHasDiagnosisTaskResponseBodyResultContent setTopErrorCode(QueryHasDiagnosisTaskResponseBodyResultContentTopErrorCode topErrorCode) {
            this.topErrorCode = topErrorCode;
            return this;
        }
        public QueryHasDiagnosisTaskResponseBodyResultContentTopErrorCode getTopErrorCode() {
            return this.topErrorCode;
        }

        public QueryHasDiagnosisTaskResponseBodyResultContent setTopErrorReason(QueryHasDiagnosisTaskResponseBodyResultContentTopErrorReason topErrorReason) {
            this.topErrorReason = topErrorReason;
            return this;
        }
        public QueryHasDiagnosisTaskResponseBodyResultContentTopErrorReason getTopErrorReason() {
            return this.topErrorReason;
        }

    }

}
