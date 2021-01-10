// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryHasInspectPlugintypesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultContent")
    public QueryHasInspectPlugintypesResponseBodyResultContent resultContent;

    public static QueryHasInspectPlugintypesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryHasInspectPlugintypesResponseBody self = new QueryHasInspectPlugintypesResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryHasInspectPlugintypesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryHasInspectPlugintypesResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryHasInspectPlugintypesResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryHasInspectPlugintypesResponseBody setResultContent(QueryHasInspectPlugintypesResponseBodyResultContent resultContent) {
        this.resultContent = resultContent;
        return this;
    }
    public QueryHasInspectPlugintypesResponseBodyResultContent getResultContent() {
        return this.resultContent;
    }

    public static class QueryHasInspectPlugintypesResponseBodyResultContentData extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Description")
        public String description;

        @NameInMap("IsSync")
        public Boolean isSync;

        @NameInMap("IsSupportHalt")
        public Boolean isSupportHalt;

        @NameInMap("IsSystemPlugin")
        public Boolean isSystemPlugin;

        @NameInMap("IsSupportUserSpace")
        public Boolean isSupportUserSpace;

        @NameInMap("IsSupportKernelSpace")
        public Boolean isSupportKernelSpace;

        @NameInMap("IsInspectPlugin")
        public Boolean isInspectPlugin;

        @NameInMap("IsDiagPlugin")
        public Boolean isDiagPlugin;

        @NameInMap("ThresholdPrefix")
        public String thresholdPrefix;

        @NameInMap("ThresholdType")
        public String thresholdType;

        @NameInMap("RuleArgClazz")
        public String ruleArgClazz;

        @NameInMap("ExecArgClazz")
        public String execArgClazz;

        @NameInMap("RetryTimes")
        public Long retryTimes;

        public static QueryHasInspectPlugintypesResponseBodyResultContentData build(java.util.Map<String, ?> map) throws Exception {
            QueryHasInspectPlugintypesResponseBodyResultContentData self = new QueryHasInspectPlugintypesResponseBodyResultContentData();
            return TeaModel.build(map, self);
        }

        public QueryHasInspectPlugintypesResponseBodyResultContentData setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public QueryHasInspectPlugintypesResponseBodyResultContentData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public QueryHasInspectPlugintypesResponseBodyResultContentData setIsSync(Boolean isSync) {
            this.isSync = isSync;
            return this;
        }
        public Boolean getIsSync() {
            return this.isSync;
        }

        public QueryHasInspectPlugintypesResponseBodyResultContentData setIsSupportHalt(Boolean isSupportHalt) {
            this.isSupportHalt = isSupportHalt;
            return this;
        }
        public Boolean getIsSupportHalt() {
            return this.isSupportHalt;
        }

        public QueryHasInspectPlugintypesResponseBodyResultContentData setIsSystemPlugin(Boolean isSystemPlugin) {
            this.isSystemPlugin = isSystemPlugin;
            return this;
        }
        public Boolean getIsSystemPlugin() {
            return this.isSystemPlugin;
        }

        public QueryHasInspectPlugintypesResponseBodyResultContentData setIsSupportUserSpace(Boolean isSupportUserSpace) {
            this.isSupportUserSpace = isSupportUserSpace;
            return this;
        }
        public Boolean getIsSupportUserSpace() {
            return this.isSupportUserSpace;
        }

        public QueryHasInspectPlugintypesResponseBodyResultContentData setIsSupportKernelSpace(Boolean isSupportKernelSpace) {
            this.isSupportKernelSpace = isSupportKernelSpace;
            return this;
        }
        public Boolean getIsSupportKernelSpace() {
            return this.isSupportKernelSpace;
        }

        public QueryHasInspectPlugintypesResponseBodyResultContentData setIsInspectPlugin(Boolean isInspectPlugin) {
            this.isInspectPlugin = isInspectPlugin;
            return this;
        }
        public Boolean getIsInspectPlugin() {
            return this.isInspectPlugin;
        }

        public QueryHasInspectPlugintypesResponseBodyResultContentData setIsDiagPlugin(Boolean isDiagPlugin) {
            this.isDiagPlugin = isDiagPlugin;
            return this;
        }
        public Boolean getIsDiagPlugin() {
            return this.isDiagPlugin;
        }

        public QueryHasInspectPlugintypesResponseBodyResultContentData setThresholdPrefix(String thresholdPrefix) {
            this.thresholdPrefix = thresholdPrefix;
            return this;
        }
        public String getThresholdPrefix() {
            return this.thresholdPrefix;
        }

        public QueryHasInspectPlugintypesResponseBodyResultContentData setThresholdType(String thresholdType) {
            this.thresholdType = thresholdType;
            return this;
        }
        public String getThresholdType() {
            return this.thresholdType;
        }

        public QueryHasInspectPlugintypesResponseBodyResultContentData setRuleArgClazz(String ruleArgClazz) {
            this.ruleArgClazz = ruleArgClazz;
            return this;
        }
        public String getRuleArgClazz() {
            return this.ruleArgClazz;
        }

        public QueryHasInspectPlugintypesResponseBodyResultContentData setExecArgClazz(String execArgClazz) {
            this.execArgClazz = execArgClazz;
            return this;
        }
        public String getExecArgClazz() {
            return this.execArgClazz;
        }

        public QueryHasInspectPlugintypesResponseBodyResultContentData setRetryTimes(Long retryTimes) {
            this.retryTimes = retryTimes;
            return this;
        }
        public Long getRetryTimes() {
            return this.retryTimes;
        }

    }

    public static class QueryHasInspectPlugintypesResponseBodyResultContentTopErrorCode extends TeaModel {
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

        public static QueryHasInspectPlugintypesResponseBodyResultContentTopErrorCode build(java.util.Map<String, ?> map) throws Exception {
            QueryHasInspectPlugintypesResponseBodyResultContentTopErrorCode self = new QueryHasInspectPlugintypesResponseBodyResultContentTopErrorCode();
            return TeaModel.build(map, self);
        }

        public QueryHasInspectPlugintypesResponseBodyResultContentTopErrorCode setExceptionCode(String exceptionCode) {
            this.exceptionCode = exceptionCode;
            return this;
        }
        public String getExceptionCode() {
            return this.exceptionCode;
        }

        public QueryHasInspectPlugintypesResponseBodyResultContentTopErrorCode setExceptionCodeDescription(String exceptionCodeDescription) {
            this.exceptionCodeDescription = exceptionCodeDescription;
            return this;
        }
        public String getExceptionCodeDescription() {
            return this.exceptionCodeDescription;
        }

        public QueryHasInspectPlugintypesResponseBodyResultContentTopErrorCode setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public QueryHasInspectPlugintypesResponseBodyResultContentTopErrorCode setPrefix(String prefix) {
            this.prefix = prefix;
            return this;
        }
        public String getPrefix() {
            return this.prefix;
        }

        public QueryHasInspectPlugintypesResponseBodyResultContentTopErrorCode setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public QueryHasInspectPlugintypesResponseBodyResultContentTopErrorCode setSceneName(String sceneName) {
            this.sceneName = sceneName;
            return this;
        }
        public String getSceneName() {
            return this.sceneName;
        }

        public QueryHasInspectPlugintypesResponseBodyResultContentTopErrorCode setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public QueryHasInspectPlugintypesResponseBodyResultContentTopErrorCode setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class QueryHasInspectPlugintypesResponseBodyResultContentTopErrorReason extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Content")
        public String content;

        public static QueryHasInspectPlugintypesResponseBodyResultContentTopErrorReason build(java.util.Map<String, ?> map) throws Exception {
            QueryHasInspectPlugintypesResponseBodyResultContentTopErrorReason self = new QueryHasInspectPlugintypesResponseBodyResultContentTopErrorReason();
            return TeaModel.build(map, self);
        }

        public QueryHasInspectPlugintypesResponseBodyResultContentTopErrorReason setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public QueryHasInspectPlugintypesResponseBodyResultContentTopErrorReason setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

    public static class QueryHasInspectPlugintypesResponseBodyResultContent extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Message")
        public String message;

        @NameInMap("Success")
        public Boolean success;

        @NameInMap("Data")
        public java.util.List<QueryHasInspectPlugintypesResponseBodyResultContentData> data;

        @NameInMap("TopErrorCode")
        public QueryHasInspectPlugintypesResponseBodyResultContentTopErrorCode topErrorCode;

        @NameInMap("TopErrorReason")
        public QueryHasInspectPlugintypesResponseBodyResultContentTopErrorReason topErrorReason;

        public static QueryHasInspectPlugintypesResponseBodyResultContent build(java.util.Map<String, ?> map) throws Exception {
            QueryHasInspectPlugintypesResponseBodyResultContent self = new QueryHasInspectPlugintypesResponseBodyResultContent();
            return TeaModel.build(map, self);
        }

        public QueryHasInspectPlugintypesResponseBodyResultContent setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public QueryHasInspectPlugintypesResponseBodyResultContent setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public QueryHasInspectPlugintypesResponseBodyResultContent setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public QueryHasInspectPlugintypesResponseBodyResultContent setData(java.util.List<QueryHasInspectPlugintypesResponseBodyResultContentData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<QueryHasInspectPlugintypesResponseBodyResultContentData> getData() {
            return this.data;
        }

        public QueryHasInspectPlugintypesResponseBodyResultContent setTopErrorCode(QueryHasInspectPlugintypesResponseBodyResultContentTopErrorCode topErrorCode) {
            this.topErrorCode = topErrorCode;
            return this;
        }
        public QueryHasInspectPlugintypesResponseBodyResultContentTopErrorCode getTopErrorCode() {
            return this.topErrorCode;
        }

        public QueryHasInspectPlugintypesResponseBodyResultContent setTopErrorReason(QueryHasInspectPlugintypesResponseBodyResultContentTopErrorReason topErrorReason) {
            this.topErrorReason = topErrorReason;
            return this;
        }
        public QueryHasInspectPlugintypesResponseBodyResultContentTopErrorReason getTopErrorReason() {
            return this.topErrorReason;
        }

    }

}
