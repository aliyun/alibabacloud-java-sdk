// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeLinklogLogsresultResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ErrorMsg")
    public String errorMsg;

    @NameInMap("ResponseContentRange")
    public String responseContentRange;

    @NameInMap("ResponseContentType")
    public String responseContentType;

    @NameInMap("ResponseStatusCode")
    public Long responseStatusCode;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Result")
    public GetLinkeLinklogLogsresultResponseBodyResult result;

    public static GetLinkeLinklogLogsresultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeLinklogLogsresultResponseBody self = new GetLinkeLinklogLogsresultResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLinkeLinklogLogsresultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLinkeLinklogLogsresultResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetLinkeLinklogLogsresultResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public GetLinkeLinklogLogsresultResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public GetLinkeLinklogLogsresultResponseBody setResponseContentRange(String responseContentRange) {
        this.responseContentRange = responseContentRange;
        return this;
    }
    public String getResponseContentRange() {
        return this.responseContentRange;
    }

    public GetLinkeLinklogLogsresultResponseBody setResponseContentType(String responseContentType) {
        this.responseContentType = responseContentType;
        return this;
    }
    public String getResponseContentType() {
        return this.responseContentType;
    }

    public GetLinkeLinklogLogsresultResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public GetLinkeLinklogLogsresultResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetLinkeLinklogLogsresultResponseBody setResult(GetLinkeLinklogLogsresultResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetLinkeLinklogLogsresultResponseBodyResult getResult() {
        return this.result;
    }

    public static class GetLinkeLinklogLogsresultResponseBodyResult extends TeaModel {
        @NameInMap("BizInfo")
        public String bizInfo;

        @NameInMap("FullLogUrl")
        public String fullLogUrl;

        @NameInMap("LineCount")
        public Long lineCount;

        @NameInMap("LogId")
        public Long logId;

        @NameInMap("RawLogDownloadUrl")
        public String rawLogDownloadUrl;

        @NameInMap("SourceId")
        public String sourceId;

        @NameInMap("SourcePath")
        public String sourcePath;

        @NameInMap("SourceType")
        public String sourceType;

        @NameInMap("Status")
        public String status;

        @NameInMap("StoreId")
        public Long storeId;

        @NameInMap("StoreName")
        public String storeName;

        @NameInMap("TaskId")
        public String taskId;

        @NameInMap("TaskStatus")
        public String taskStatus;

        @NameInMap("TaskUrl")
        public String taskUrl;

        @NameInMap("BlockContent")
        public java.util.List<String> blockContent;

        @NameInMap("CauseResults")
        public java.util.List<String> causeResults;

        @NameInMap("Envs")
        public java.util.List<String> envs;

        @NameInMap("FeedbackOptions")
        public java.util.List<String> feedbackOptions;

        @NameInMap("FeedbackResult")
        public java.util.List<String> feedbackResult;

        @NameInMap("PatternResult")
        public java.util.List<String> patternResult;

        @NameInMap("Steps")
        public java.util.List<String> steps;

        public static GetLinkeLinklogLogsresultResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetLinkeLinklogLogsresultResponseBodyResult self = new GetLinkeLinklogLogsresultResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetLinkeLinklogLogsresultResponseBodyResult setBizInfo(String bizInfo) {
            this.bizInfo = bizInfo;
            return this;
        }
        public String getBizInfo() {
            return this.bizInfo;
        }

        public GetLinkeLinklogLogsresultResponseBodyResult setFullLogUrl(String fullLogUrl) {
            this.fullLogUrl = fullLogUrl;
            return this;
        }
        public String getFullLogUrl() {
            return this.fullLogUrl;
        }

        public GetLinkeLinklogLogsresultResponseBodyResult setLineCount(Long lineCount) {
            this.lineCount = lineCount;
            return this;
        }
        public Long getLineCount() {
            return this.lineCount;
        }

        public GetLinkeLinklogLogsresultResponseBodyResult setLogId(Long logId) {
            this.logId = logId;
            return this;
        }
        public Long getLogId() {
            return this.logId;
        }

        public GetLinkeLinklogLogsresultResponseBodyResult setRawLogDownloadUrl(String rawLogDownloadUrl) {
            this.rawLogDownloadUrl = rawLogDownloadUrl;
            return this;
        }
        public String getRawLogDownloadUrl() {
            return this.rawLogDownloadUrl;
        }

        public GetLinkeLinklogLogsresultResponseBodyResult setSourceId(String sourceId) {
            this.sourceId = sourceId;
            return this;
        }
        public String getSourceId() {
            return this.sourceId;
        }

        public GetLinkeLinklogLogsresultResponseBodyResult setSourcePath(String sourcePath) {
            this.sourcePath = sourcePath;
            return this;
        }
        public String getSourcePath() {
            return this.sourcePath;
        }

        public GetLinkeLinklogLogsresultResponseBodyResult setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public GetLinkeLinklogLogsresultResponseBodyResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetLinkeLinklogLogsresultResponseBodyResult setStoreId(Long storeId) {
            this.storeId = storeId;
            return this;
        }
        public Long getStoreId() {
            return this.storeId;
        }

        public GetLinkeLinklogLogsresultResponseBodyResult setStoreName(String storeName) {
            this.storeName = storeName;
            return this;
        }
        public String getStoreName() {
            return this.storeName;
        }

        public GetLinkeLinklogLogsresultResponseBodyResult setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public GetLinkeLinklogLogsresultResponseBodyResult setTaskStatus(String taskStatus) {
            this.taskStatus = taskStatus;
            return this;
        }
        public String getTaskStatus() {
            return this.taskStatus;
        }

        public GetLinkeLinklogLogsresultResponseBodyResult setTaskUrl(String taskUrl) {
            this.taskUrl = taskUrl;
            return this;
        }
        public String getTaskUrl() {
            return this.taskUrl;
        }

        public GetLinkeLinklogLogsresultResponseBodyResult setBlockContent(java.util.List<String> blockContent) {
            this.blockContent = blockContent;
            return this;
        }
        public java.util.List<String> getBlockContent() {
            return this.blockContent;
        }

        public GetLinkeLinklogLogsresultResponseBodyResult setCauseResults(java.util.List<String> causeResults) {
            this.causeResults = causeResults;
            return this;
        }
        public java.util.List<String> getCauseResults() {
            return this.causeResults;
        }

        public GetLinkeLinklogLogsresultResponseBodyResult setEnvs(java.util.List<String> envs) {
            this.envs = envs;
            return this;
        }
        public java.util.List<String> getEnvs() {
            return this.envs;
        }

        public GetLinkeLinklogLogsresultResponseBodyResult setFeedbackOptions(java.util.List<String> feedbackOptions) {
            this.feedbackOptions = feedbackOptions;
            return this;
        }
        public java.util.List<String> getFeedbackOptions() {
            return this.feedbackOptions;
        }

        public GetLinkeLinklogLogsresultResponseBodyResult setFeedbackResult(java.util.List<String> feedbackResult) {
            this.feedbackResult = feedbackResult;
            return this;
        }
        public java.util.List<String> getFeedbackResult() {
            return this.feedbackResult;
        }

        public GetLinkeLinklogLogsresultResponseBodyResult setPatternResult(java.util.List<String> patternResult) {
            this.patternResult = patternResult;
            return this;
        }
        public java.util.List<String> getPatternResult() {
            return this.patternResult;
        }

        public GetLinkeLinklogLogsresultResponseBodyResult setSteps(java.util.List<String> steps) {
            this.steps = steps;
            return this;
        }
        public java.util.List<String> getSteps() {
            return this.steps;
        }

    }

}
