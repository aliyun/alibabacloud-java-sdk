// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryHasDiagnosisAtomicofnodeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultContent")
    public QueryHasDiagnosisAtomicofnodeResponseBodyResultContent resultContent;

    public static QueryHasDiagnosisAtomicofnodeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryHasDiagnosisAtomicofnodeResponseBody self = new QueryHasDiagnosisAtomicofnodeResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryHasDiagnosisAtomicofnodeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryHasDiagnosisAtomicofnodeResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryHasDiagnosisAtomicofnodeResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryHasDiagnosisAtomicofnodeResponseBody setResultContent(QueryHasDiagnosisAtomicofnodeResponseBodyResultContent resultContent) {
        this.resultContent = resultContent;
        return this;
    }
    public QueryHasDiagnosisAtomicofnodeResponseBodyResultContent getResultContent() {
        return this.resultContent;
    }

    public static class QueryHasDiagnosisAtomicofnodeResponseBodyResultContentData extends TeaModel {
        @NameInMap("DiagPlanNodeId")
        public String diagPlanNodeId;

        @NameInMap("RuleId")
        public String ruleId;

        @NameInMap("RuleName")
        public String ruleName;

        @NameInMap("ArgHumanShow")
        public String argHumanShow;

        @NameInMap("PluginType")
        public String pluginType;

        @NameInMap("ExecutableStatus")
        public String executableStatus;

        @NameInMap("Creator")
        public String creator;

        @NameInMap("Id")
        public String id;

        public static QueryHasDiagnosisAtomicofnodeResponseBodyResultContentData build(java.util.Map<String, ?> map) throws Exception {
            QueryHasDiagnosisAtomicofnodeResponseBodyResultContentData self = new QueryHasDiagnosisAtomicofnodeResponseBodyResultContentData();
            return TeaModel.build(map, self);
        }

        public QueryHasDiagnosisAtomicofnodeResponseBodyResultContentData setDiagPlanNodeId(String diagPlanNodeId) {
            this.diagPlanNodeId = diagPlanNodeId;
            return this;
        }
        public String getDiagPlanNodeId() {
            return this.diagPlanNodeId;
        }

        public QueryHasDiagnosisAtomicofnodeResponseBodyResultContentData setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
        }

        public QueryHasDiagnosisAtomicofnodeResponseBodyResultContentData setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public QueryHasDiagnosisAtomicofnodeResponseBodyResultContentData setArgHumanShow(String argHumanShow) {
            this.argHumanShow = argHumanShow;
            return this;
        }
        public String getArgHumanShow() {
            return this.argHumanShow;
        }

        public QueryHasDiagnosisAtomicofnodeResponseBodyResultContentData setPluginType(String pluginType) {
            this.pluginType = pluginType;
            return this;
        }
        public String getPluginType() {
            return this.pluginType;
        }

        public QueryHasDiagnosisAtomicofnodeResponseBodyResultContentData setExecutableStatus(String executableStatus) {
            this.executableStatus = executableStatus;
            return this;
        }
        public String getExecutableStatus() {
            return this.executableStatus;
        }

        public QueryHasDiagnosisAtomicofnodeResponseBodyResultContentData setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public QueryHasDiagnosisAtomicofnodeResponseBodyResultContentData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

    public static class QueryHasDiagnosisAtomicofnodeResponseBodyResultContentTopErrorCode extends TeaModel {
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

        public static QueryHasDiagnosisAtomicofnodeResponseBodyResultContentTopErrorCode build(java.util.Map<String, ?> map) throws Exception {
            QueryHasDiagnosisAtomicofnodeResponseBodyResultContentTopErrorCode self = new QueryHasDiagnosisAtomicofnodeResponseBodyResultContentTopErrorCode();
            return TeaModel.build(map, self);
        }

        public QueryHasDiagnosisAtomicofnodeResponseBodyResultContentTopErrorCode setExceptionCode(String exceptionCode) {
            this.exceptionCode = exceptionCode;
            return this;
        }
        public String getExceptionCode() {
            return this.exceptionCode;
        }

        public QueryHasDiagnosisAtomicofnodeResponseBodyResultContentTopErrorCode setExceptionCodeDescription(String exceptionCodeDescription) {
            this.exceptionCodeDescription = exceptionCodeDescription;
            return this;
        }
        public String getExceptionCodeDescription() {
            return this.exceptionCodeDescription;
        }

        public QueryHasDiagnosisAtomicofnodeResponseBodyResultContentTopErrorCode setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public QueryHasDiagnosisAtomicofnodeResponseBodyResultContentTopErrorCode setPrefix(String prefix) {
            this.prefix = prefix;
            return this;
        }
        public String getPrefix() {
            return this.prefix;
        }

        public QueryHasDiagnosisAtomicofnodeResponseBodyResultContentTopErrorCode setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public QueryHasDiagnosisAtomicofnodeResponseBodyResultContentTopErrorCode setSceneName(String sceneName) {
            this.sceneName = sceneName;
            return this;
        }
        public String getSceneName() {
            return this.sceneName;
        }

        public QueryHasDiagnosisAtomicofnodeResponseBodyResultContentTopErrorCode setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public QueryHasDiagnosisAtomicofnodeResponseBodyResultContentTopErrorCode setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class QueryHasDiagnosisAtomicofnodeResponseBodyResultContentTopErrorReason extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Content")
        public String content;

        public static QueryHasDiagnosisAtomicofnodeResponseBodyResultContentTopErrorReason build(java.util.Map<String, ?> map) throws Exception {
            QueryHasDiagnosisAtomicofnodeResponseBodyResultContentTopErrorReason self = new QueryHasDiagnosisAtomicofnodeResponseBodyResultContentTopErrorReason();
            return TeaModel.build(map, self);
        }

        public QueryHasDiagnosisAtomicofnodeResponseBodyResultContentTopErrorReason setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public QueryHasDiagnosisAtomicofnodeResponseBodyResultContentTopErrorReason setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

    public static class QueryHasDiagnosisAtomicofnodeResponseBodyResultContent extends TeaModel {
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
        public java.util.List<QueryHasDiagnosisAtomicofnodeResponseBodyResultContentData> data;

        @NameInMap("TopErrorCode")
        public QueryHasDiagnosisAtomicofnodeResponseBodyResultContentTopErrorCode topErrorCode;

        @NameInMap("TopErrorReason")
        public QueryHasDiagnosisAtomicofnodeResponseBodyResultContentTopErrorReason topErrorReason;

        public static QueryHasDiagnosisAtomicofnodeResponseBodyResultContent build(java.util.Map<String, ?> map) throws Exception {
            QueryHasDiagnosisAtomicofnodeResponseBodyResultContent self = new QueryHasDiagnosisAtomicofnodeResponseBodyResultContent();
            return TeaModel.build(map, self);
        }

        public QueryHasDiagnosisAtomicofnodeResponseBodyResultContent setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public QueryHasDiagnosisAtomicofnodeResponseBodyResultContent setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public QueryHasDiagnosisAtomicofnodeResponseBodyResultContent setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public QueryHasDiagnosisAtomicofnodeResponseBodyResultContent setCurrentPage(Long currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Long getCurrentPage() {
            return this.currentPage;
        }

        public QueryHasDiagnosisAtomicofnodeResponseBodyResultContent setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public QueryHasDiagnosisAtomicofnodeResponseBodyResultContent setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

        public QueryHasDiagnosisAtomicofnodeResponseBodyResultContent setData(java.util.List<QueryHasDiagnosisAtomicofnodeResponseBodyResultContentData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<QueryHasDiagnosisAtomicofnodeResponseBodyResultContentData> getData() {
            return this.data;
        }

        public QueryHasDiagnosisAtomicofnodeResponseBodyResultContent setTopErrorCode(QueryHasDiagnosisAtomicofnodeResponseBodyResultContentTopErrorCode topErrorCode) {
            this.topErrorCode = topErrorCode;
            return this;
        }
        public QueryHasDiagnosisAtomicofnodeResponseBodyResultContentTopErrorCode getTopErrorCode() {
            return this.topErrorCode;
        }

        public QueryHasDiagnosisAtomicofnodeResponseBodyResultContent setTopErrorReason(QueryHasDiagnosisAtomicofnodeResponseBodyResultContentTopErrorReason topErrorReason) {
            this.topErrorReason = topErrorReason;
            return this;
        }
        public QueryHasDiagnosisAtomicofnodeResponseBodyResultContentTopErrorReason getTopErrorReason() {
            return this.topErrorReason;
        }

    }

}
