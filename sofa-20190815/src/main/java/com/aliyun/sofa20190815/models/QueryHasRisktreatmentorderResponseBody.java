// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryHasRisktreatmentorderResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultContent")
    public QueryHasRisktreatmentorderResponseBodyResultContent resultContent;

    public static QueryHasRisktreatmentorderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryHasRisktreatmentorderResponseBody self = new QueryHasRisktreatmentorderResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryHasRisktreatmentorderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryHasRisktreatmentorderResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryHasRisktreatmentorderResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryHasRisktreatmentorderResponseBody setResultContent(QueryHasRisktreatmentorderResponseBodyResultContent resultContent) {
        this.resultContent = resultContent;
        return this;
    }
    public QueryHasRisktreatmentorderResponseBodyResultContent getResultContent() {
        return this.resultContent;
    }

    public static class QueryHasRisktreatmentorderResponseBodyResultContentData extends TeaModel {
        @NameInMap("Id")
        public String id;

        @NameInMap("RiskSceneId")
        public String riskSceneId;

        @NameInMap("AggregationRiskItemId")
        public String aggregationRiskItemId;

        @NameInMap("TenantId")
        public String tenantId;

        @NameInMap("Creator")
        public String creator;

        @NameInMap("RiskStatus")
        public String riskStatus;

        @NameInMap("Resolver")
        public String resolver;

        @NameInMap("UtcCreate")
        public String utcCreate;

        @NameInMap("UtcModified")
        public String utcModified;

        public static QueryHasRisktreatmentorderResponseBodyResultContentData build(java.util.Map<String, ?> map) throws Exception {
            QueryHasRisktreatmentorderResponseBodyResultContentData self = new QueryHasRisktreatmentorderResponseBodyResultContentData();
            return TeaModel.build(map, self);
        }

        public QueryHasRisktreatmentorderResponseBodyResultContentData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryHasRisktreatmentorderResponseBodyResultContentData setRiskSceneId(String riskSceneId) {
            this.riskSceneId = riskSceneId;
            return this;
        }
        public String getRiskSceneId() {
            return this.riskSceneId;
        }

        public QueryHasRisktreatmentorderResponseBodyResultContentData setAggregationRiskItemId(String aggregationRiskItemId) {
            this.aggregationRiskItemId = aggregationRiskItemId;
            return this;
        }
        public String getAggregationRiskItemId() {
            return this.aggregationRiskItemId;
        }

        public QueryHasRisktreatmentorderResponseBodyResultContentData setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public QueryHasRisktreatmentorderResponseBodyResultContentData setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public QueryHasRisktreatmentorderResponseBodyResultContentData setRiskStatus(String riskStatus) {
            this.riskStatus = riskStatus;
            return this;
        }
        public String getRiskStatus() {
            return this.riskStatus;
        }

        public QueryHasRisktreatmentorderResponseBodyResultContentData setResolver(String resolver) {
            this.resolver = resolver;
            return this;
        }
        public String getResolver() {
            return this.resolver;
        }

        public QueryHasRisktreatmentorderResponseBodyResultContentData setUtcCreate(String utcCreate) {
            this.utcCreate = utcCreate;
            return this;
        }
        public String getUtcCreate() {
            return this.utcCreate;
        }

        public QueryHasRisktreatmentorderResponseBodyResultContentData setUtcModified(String utcModified) {
            this.utcModified = utcModified;
            return this;
        }
        public String getUtcModified() {
            return this.utcModified;
        }

    }

    public static class QueryHasRisktreatmentorderResponseBodyResultContentTopErrorCode extends TeaModel {
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

        public static QueryHasRisktreatmentorderResponseBodyResultContentTopErrorCode build(java.util.Map<String, ?> map) throws Exception {
            QueryHasRisktreatmentorderResponseBodyResultContentTopErrorCode self = new QueryHasRisktreatmentorderResponseBodyResultContentTopErrorCode();
            return TeaModel.build(map, self);
        }

        public QueryHasRisktreatmentorderResponseBodyResultContentTopErrorCode setExceptionCode(String exceptionCode) {
            this.exceptionCode = exceptionCode;
            return this;
        }
        public String getExceptionCode() {
            return this.exceptionCode;
        }

        public QueryHasRisktreatmentorderResponseBodyResultContentTopErrorCode setExceptionCodeDescription(String exceptionCodeDescription) {
            this.exceptionCodeDescription = exceptionCodeDescription;
            return this;
        }
        public String getExceptionCodeDescription() {
            return this.exceptionCodeDescription;
        }

        public QueryHasRisktreatmentorderResponseBodyResultContentTopErrorCode setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public QueryHasRisktreatmentorderResponseBodyResultContentTopErrorCode setPrefix(String prefix) {
            this.prefix = prefix;
            return this;
        }
        public String getPrefix() {
            return this.prefix;
        }

        public QueryHasRisktreatmentorderResponseBodyResultContentTopErrorCode setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public QueryHasRisktreatmentorderResponseBodyResultContentTopErrorCode setSceneName(String sceneName) {
            this.sceneName = sceneName;
            return this;
        }
        public String getSceneName() {
            return this.sceneName;
        }

        public QueryHasRisktreatmentorderResponseBodyResultContentTopErrorCode setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public QueryHasRisktreatmentorderResponseBodyResultContentTopErrorCode setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class QueryHasRisktreatmentorderResponseBodyResultContentTopErrorReason extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Content")
        public String content;

        public static QueryHasRisktreatmentorderResponseBodyResultContentTopErrorReason build(java.util.Map<String, ?> map) throws Exception {
            QueryHasRisktreatmentorderResponseBodyResultContentTopErrorReason self = new QueryHasRisktreatmentorderResponseBodyResultContentTopErrorReason();
            return TeaModel.build(map, self);
        }

        public QueryHasRisktreatmentorderResponseBodyResultContentTopErrorReason setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public QueryHasRisktreatmentorderResponseBodyResultContentTopErrorReason setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

    public static class QueryHasRisktreatmentorderResponseBodyResultContent extends TeaModel {
        @NameInMap("CurrentPage")
        public Long currentPage;

        @NameInMap("PageSize")
        public String pageSize;

        @NameInMap("TotalCount")
        public String totalCount;

        @NameInMap("Success")
        public Boolean success;

        @NameInMap("Message")
        public String message;

        @NameInMap("Code")
        public String code;

        @NameInMap("Data")
        public java.util.List<QueryHasRisktreatmentorderResponseBodyResultContentData> data;

        @NameInMap("TopErrorCode")
        public QueryHasRisktreatmentorderResponseBodyResultContentTopErrorCode topErrorCode;

        @NameInMap("TopErrorReason")
        public QueryHasRisktreatmentorderResponseBodyResultContentTopErrorReason topErrorReason;

        public static QueryHasRisktreatmentorderResponseBodyResultContent build(java.util.Map<String, ?> map) throws Exception {
            QueryHasRisktreatmentorderResponseBodyResultContent self = new QueryHasRisktreatmentorderResponseBodyResultContent();
            return TeaModel.build(map, self);
        }

        public QueryHasRisktreatmentorderResponseBodyResultContent setCurrentPage(Long currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Long getCurrentPage() {
            return this.currentPage;
        }

        public QueryHasRisktreatmentorderResponseBodyResultContent setPageSize(String pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public String getPageSize() {
            return this.pageSize;
        }

        public QueryHasRisktreatmentorderResponseBodyResultContent setTotalCount(String totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public String getTotalCount() {
            return this.totalCount;
        }

        public QueryHasRisktreatmentorderResponseBodyResultContent setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public QueryHasRisktreatmentorderResponseBodyResultContent setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public QueryHasRisktreatmentorderResponseBodyResultContent setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public QueryHasRisktreatmentorderResponseBodyResultContent setData(java.util.List<QueryHasRisktreatmentorderResponseBodyResultContentData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<QueryHasRisktreatmentorderResponseBodyResultContentData> getData() {
            return this.data;
        }

        public QueryHasRisktreatmentorderResponseBodyResultContent setTopErrorCode(QueryHasRisktreatmentorderResponseBodyResultContentTopErrorCode topErrorCode) {
            this.topErrorCode = topErrorCode;
            return this;
        }
        public QueryHasRisktreatmentorderResponseBodyResultContentTopErrorCode getTopErrorCode() {
            return this.topErrorCode;
        }

        public QueryHasRisktreatmentorderResponseBodyResultContent setTopErrorReason(QueryHasRisktreatmentorderResponseBodyResultContentTopErrorReason topErrorReason) {
            this.topErrorReason = topErrorReason;
            return this;
        }
        public QueryHasRisktreatmentorderResponseBodyResultContentTopErrorReason getTopErrorReason() {
            return this.topErrorReason;
        }

    }

}
