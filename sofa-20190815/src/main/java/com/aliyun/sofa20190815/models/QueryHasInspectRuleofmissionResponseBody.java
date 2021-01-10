// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryHasInspectRuleofmissionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultContent")
    public QueryHasInspectRuleofmissionResponseBodyResultContent resultContent;

    public static QueryHasInspectRuleofmissionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryHasInspectRuleofmissionResponseBody self = new QueryHasInspectRuleofmissionResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryHasInspectRuleofmissionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryHasInspectRuleofmissionResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryHasInspectRuleofmissionResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryHasInspectRuleofmissionResponseBody setResultContent(QueryHasInspectRuleofmissionResponseBodyResultContent resultContent) {
        this.resultContent = resultContent;
        return this;
    }
    public QueryHasInspectRuleofmissionResponseBodyResultContent getResultContent() {
        return this.resultContent;
    }

    public static class QueryHasInspectRuleofmissionResponseBodyResultContentData extends TeaModel {
        @NameInMap("MissionId")
        public String missionId;

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

        public static QueryHasInspectRuleofmissionResponseBodyResultContentData build(java.util.Map<String, ?> map) throws Exception {
            QueryHasInspectRuleofmissionResponseBodyResultContentData self = new QueryHasInspectRuleofmissionResponseBodyResultContentData();
            return TeaModel.build(map, self);
        }

        public QueryHasInspectRuleofmissionResponseBodyResultContentData setMissionId(String missionId) {
            this.missionId = missionId;
            return this;
        }
        public String getMissionId() {
            return this.missionId;
        }

        public QueryHasInspectRuleofmissionResponseBodyResultContentData setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
        }

        public QueryHasInspectRuleofmissionResponseBodyResultContentData setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public QueryHasInspectRuleofmissionResponseBodyResultContentData setArgHumanShow(String argHumanShow) {
            this.argHumanShow = argHumanShow;
            return this;
        }
        public String getArgHumanShow() {
            return this.argHumanShow;
        }

        public QueryHasInspectRuleofmissionResponseBodyResultContentData setPluginType(String pluginType) {
            this.pluginType = pluginType;
            return this;
        }
        public String getPluginType() {
            return this.pluginType;
        }

        public QueryHasInspectRuleofmissionResponseBodyResultContentData setExecutableStatus(String executableStatus) {
            this.executableStatus = executableStatus;
            return this;
        }
        public String getExecutableStatus() {
            return this.executableStatus;
        }

        public QueryHasInspectRuleofmissionResponseBodyResultContentData setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

    }

    public static class QueryHasInspectRuleofmissionResponseBodyResultContentTopErrorCode extends TeaModel {
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

        public static QueryHasInspectRuleofmissionResponseBodyResultContentTopErrorCode build(java.util.Map<String, ?> map) throws Exception {
            QueryHasInspectRuleofmissionResponseBodyResultContentTopErrorCode self = new QueryHasInspectRuleofmissionResponseBodyResultContentTopErrorCode();
            return TeaModel.build(map, self);
        }

        public QueryHasInspectRuleofmissionResponseBodyResultContentTopErrorCode setExceptionCode(String exceptionCode) {
            this.exceptionCode = exceptionCode;
            return this;
        }
        public String getExceptionCode() {
            return this.exceptionCode;
        }

        public QueryHasInspectRuleofmissionResponseBodyResultContentTopErrorCode setExceptionCodeDescription(String exceptionCodeDescription) {
            this.exceptionCodeDescription = exceptionCodeDescription;
            return this;
        }
        public String getExceptionCodeDescription() {
            return this.exceptionCodeDescription;
        }

        public QueryHasInspectRuleofmissionResponseBodyResultContentTopErrorCode setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public QueryHasInspectRuleofmissionResponseBodyResultContentTopErrorCode setPrefix(String prefix) {
            this.prefix = prefix;
            return this;
        }
        public String getPrefix() {
            return this.prefix;
        }

        public QueryHasInspectRuleofmissionResponseBodyResultContentTopErrorCode setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public QueryHasInspectRuleofmissionResponseBodyResultContentTopErrorCode setSceneName(String sceneName) {
            this.sceneName = sceneName;
            return this;
        }
        public String getSceneName() {
            return this.sceneName;
        }

        public QueryHasInspectRuleofmissionResponseBodyResultContentTopErrorCode setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public QueryHasInspectRuleofmissionResponseBodyResultContentTopErrorCode setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class QueryHasInspectRuleofmissionResponseBodyResultContentTopErrorReason extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Content")
        public String content;

        public static QueryHasInspectRuleofmissionResponseBodyResultContentTopErrorReason build(java.util.Map<String, ?> map) throws Exception {
            QueryHasInspectRuleofmissionResponseBodyResultContentTopErrorReason self = new QueryHasInspectRuleofmissionResponseBodyResultContentTopErrorReason();
            return TeaModel.build(map, self);
        }

        public QueryHasInspectRuleofmissionResponseBodyResultContentTopErrorReason setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public QueryHasInspectRuleofmissionResponseBodyResultContentTopErrorReason setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

    public static class QueryHasInspectRuleofmissionResponseBodyResultContent extends TeaModel {
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
        public java.util.List<QueryHasInspectRuleofmissionResponseBodyResultContentData> data;

        @NameInMap("TopErrorCode")
        public QueryHasInspectRuleofmissionResponseBodyResultContentTopErrorCode topErrorCode;

        @NameInMap("TopErrorReason")
        public QueryHasInspectRuleofmissionResponseBodyResultContentTopErrorReason topErrorReason;

        public static QueryHasInspectRuleofmissionResponseBodyResultContent build(java.util.Map<String, ?> map) throws Exception {
            QueryHasInspectRuleofmissionResponseBodyResultContent self = new QueryHasInspectRuleofmissionResponseBodyResultContent();
            return TeaModel.build(map, self);
        }

        public QueryHasInspectRuleofmissionResponseBodyResultContent setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public QueryHasInspectRuleofmissionResponseBodyResultContent setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public QueryHasInspectRuleofmissionResponseBodyResultContent setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public QueryHasInspectRuleofmissionResponseBodyResultContent setCurrentPage(Long currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Long getCurrentPage() {
            return this.currentPage;
        }

        public QueryHasInspectRuleofmissionResponseBodyResultContent setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public QueryHasInspectRuleofmissionResponseBodyResultContent setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

        public QueryHasInspectRuleofmissionResponseBodyResultContent setData(java.util.List<QueryHasInspectRuleofmissionResponseBodyResultContentData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<QueryHasInspectRuleofmissionResponseBodyResultContentData> getData() {
            return this.data;
        }

        public QueryHasInspectRuleofmissionResponseBodyResultContent setTopErrorCode(QueryHasInspectRuleofmissionResponseBodyResultContentTopErrorCode topErrorCode) {
            this.topErrorCode = topErrorCode;
            return this;
        }
        public QueryHasInspectRuleofmissionResponseBodyResultContentTopErrorCode getTopErrorCode() {
            return this.topErrorCode;
        }

        public QueryHasInspectRuleofmissionResponseBodyResultContent setTopErrorReason(QueryHasInspectRuleofmissionResponseBodyResultContentTopErrorReason topErrorReason) {
            this.topErrorReason = topErrorReason;
            return this;
        }
        public QueryHasInspectRuleofmissionResponseBodyResultContentTopErrorReason getTopErrorReason() {
            return this.topErrorReason;
        }

    }

}
