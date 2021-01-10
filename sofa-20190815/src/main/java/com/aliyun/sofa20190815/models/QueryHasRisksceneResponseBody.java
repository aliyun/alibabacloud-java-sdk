// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryHasRisksceneResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultContent")
    public QueryHasRisksceneResponseBodyResultContent resultContent;

    public static QueryHasRisksceneResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryHasRisksceneResponseBody self = new QueryHasRisksceneResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryHasRisksceneResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryHasRisksceneResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryHasRisksceneResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryHasRisksceneResponseBody setResultContent(QueryHasRisksceneResponseBodyResultContent resultContent) {
        this.resultContent = resultContent;
        return this;
    }
    public QueryHasRisksceneResponseBodyResultContent getResultContent() {
        return this.resultContent;
    }

    public static class QueryHasRisksceneResponseBodyResultContentData extends TeaModel {
        @NameInMap("Id")
        public String id;

        @NameInMap("Name")
        public String name;

        @NameInMap("TenantId")
        public String tenantId;

        @NameInMap("TargetType")
        public String targetType;

        @NameInMap("TargetDescription")
        public String targetDescription;

        @NameInMap("TargetArgs")
        public String targetArgs;

        @NameInMap("RiskLevel")
        public String riskLevel;

        @NameInMap("TriggerDescription")
        public String triggerDescription;

        @NameInMap("PrePlanDescription")
        public String prePlanDescription;

        @NameInMap("BusinessImpact")
        public String businessImpact;

        @NameInMap("Creator")
        public String creator;

        @NameInMap("UtcCreate")
        public String utcCreate;

        @NameInMap("UtcModified")
        public String utcModified;

        public static QueryHasRisksceneResponseBodyResultContentData build(java.util.Map<String, ?> map) throws Exception {
            QueryHasRisksceneResponseBodyResultContentData self = new QueryHasRisksceneResponseBodyResultContentData();
            return TeaModel.build(map, self);
        }

        public QueryHasRisksceneResponseBodyResultContentData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryHasRisksceneResponseBodyResultContentData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryHasRisksceneResponseBodyResultContentData setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public QueryHasRisksceneResponseBodyResultContentData setTargetType(String targetType) {
            this.targetType = targetType;
            return this;
        }
        public String getTargetType() {
            return this.targetType;
        }

        public QueryHasRisksceneResponseBodyResultContentData setTargetDescription(String targetDescription) {
            this.targetDescription = targetDescription;
            return this;
        }
        public String getTargetDescription() {
            return this.targetDescription;
        }

        public QueryHasRisksceneResponseBodyResultContentData setTargetArgs(String targetArgs) {
            this.targetArgs = targetArgs;
            return this;
        }
        public String getTargetArgs() {
            return this.targetArgs;
        }

        public QueryHasRisksceneResponseBodyResultContentData setRiskLevel(String riskLevel) {
            this.riskLevel = riskLevel;
            return this;
        }
        public String getRiskLevel() {
            return this.riskLevel;
        }

        public QueryHasRisksceneResponseBodyResultContentData setTriggerDescription(String triggerDescription) {
            this.triggerDescription = triggerDescription;
            return this;
        }
        public String getTriggerDescription() {
            return this.triggerDescription;
        }

        public QueryHasRisksceneResponseBodyResultContentData setPrePlanDescription(String prePlanDescription) {
            this.prePlanDescription = prePlanDescription;
            return this;
        }
        public String getPrePlanDescription() {
            return this.prePlanDescription;
        }

        public QueryHasRisksceneResponseBodyResultContentData setBusinessImpact(String businessImpact) {
            this.businessImpact = businessImpact;
            return this;
        }
        public String getBusinessImpact() {
            return this.businessImpact;
        }

        public QueryHasRisksceneResponseBodyResultContentData setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public QueryHasRisksceneResponseBodyResultContentData setUtcCreate(String utcCreate) {
            this.utcCreate = utcCreate;
            return this;
        }
        public String getUtcCreate() {
            return this.utcCreate;
        }

        public QueryHasRisksceneResponseBodyResultContentData setUtcModified(String utcModified) {
            this.utcModified = utcModified;
            return this;
        }
        public String getUtcModified() {
            return this.utcModified;
        }

    }

    public static class QueryHasRisksceneResponseBodyResultContentTopErrorCode extends TeaModel {
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

        public static QueryHasRisksceneResponseBodyResultContentTopErrorCode build(java.util.Map<String, ?> map) throws Exception {
            QueryHasRisksceneResponseBodyResultContentTopErrorCode self = new QueryHasRisksceneResponseBodyResultContentTopErrorCode();
            return TeaModel.build(map, self);
        }

        public QueryHasRisksceneResponseBodyResultContentTopErrorCode setExceptionCode(String exceptionCode) {
            this.exceptionCode = exceptionCode;
            return this;
        }
        public String getExceptionCode() {
            return this.exceptionCode;
        }

        public QueryHasRisksceneResponseBodyResultContentTopErrorCode setExceptionCodeDescription(String exceptionCodeDescription) {
            this.exceptionCodeDescription = exceptionCodeDescription;
            return this;
        }
        public String getExceptionCodeDescription() {
            return this.exceptionCodeDescription;
        }

        public QueryHasRisksceneResponseBodyResultContentTopErrorCode setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public QueryHasRisksceneResponseBodyResultContentTopErrorCode setPrefix(String prefix) {
            this.prefix = prefix;
            return this;
        }
        public String getPrefix() {
            return this.prefix;
        }

        public QueryHasRisksceneResponseBodyResultContentTopErrorCode setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public QueryHasRisksceneResponseBodyResultContentTopErrorCode setSceneName(String sceneName) {
            this.sceneName = sceneName;
            return this;
        }
        public String getSceneName() {
            return this.sceneName;
        }

        public QueryHasRisksceneResponseBodyResultContentTopErrorCode setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public QueryHasRisksceneResponseBodyResultContentTopErrorCode setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class QueryHasRisksceneResponseBodyResultContentTopErrorReason extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Content")
        public String content;

        public static QueryHasRisksceneResponseBodyResultContentTopErrorReason build(java.util.Map<String, ?> map) throws Exception {
            QueryHasRisksceneResponseBodyResultContentTopErrorReason self = new QueryHasRisksceneResponseBodyResultContentTopErrorReason();
            return TeaModel.build(map, self);
        }

        public QueryHasRisksceneResponseBodyResultContentTopErrorReason setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public QueryHasRisksceneResponseBodyResultContentTopErrorReason setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

    public static class QueryHasRisksceneResponseBodyResultContent extends TeaModel {
        @NameInMap("CurrentPage")
        public Long currentPage;

        @NameInMap("PageSize")
        public Long pageSize;

        @NameInMap("TotalCount")
        public String totalCount;

        @NameInMap("Success")
        public Boolean success;

        @NameInMap("Message")
        public String message;

        @NameInMap("Code")
        public String code;

        @NameInMap("Data")
        public java.util.List<QueryHasRisksceneResponseBodyResultContentData> data;

        @NameInMap("TopErrorCode")
        public QueryHasRisksceneResponseBodyResultContentTopErrorCode topErrorCode;

        @NameInMap("TopErrorReason")
        public QueryHasRisksceneResponseBodyResultContentTopErrorReason topErrorReason;

        public static QueryHasRisksceneResponseBodyResultContent build(java.util.Map<String, ?> map) throws Exception {
            QueryHasRisksceneResponseBodyResultContent self = new QueryHasRisksceneResponseBodyResultContent();
            return TeaModel.build(map, self);
        }

        public QueryHasRisksceneResponseBodyResultContent setCurrentPage(Long currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Long getCurrentPage() {
            return this.currentPage;
        }

        public QueryHasRisksceneResponseBodyResultContent setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public QueryHasRisksceneResponseBodyResultContent setTotalCount(String totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public String getTotalCount() {
            return this.totalCount;
        }

        public QueryHasRisksceneResponseBodyResultContent setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public QueryHasRisksceneResponseBodyResultContent setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public QueryHasRisksceneResponseBodyResultContent setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public QueryHasRisksceneResponseBodyResultContent setData(java.util.List<QueryHasRisksceneResponseBodyResultContentData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<QueryHasRisksceneResponseBodyResultContentData> getData() {
            return this.data;
        }

        public QueryHasRisksceneResponseBodyResultContent setTopErrorCode(QueryHasRisksceneResponseBodyResultContentTopErrorCode topErrorCode) {
            this.topErrorCode = topErrorCode;
            return this;
        }
        public QueryHasRisksceneResponseBodyResultContentTopErrorCode getTopErrorCode() {
            return this.topErrorCode;
        }

        public QueryHasRisksceneResponseBodyResultContent setTopErrorReason(QueryHasRisksceneResponseBodyResultContentTopErrorReason topErrorReason) {
            this.topErrorReason = topErrorReason;
            return this;
        }
        public QueryHasRisksceneResponseBodyResultContentTopErrorReason getTopErrorReason() {
            return this.topErrorReason;
        }

    }

}
