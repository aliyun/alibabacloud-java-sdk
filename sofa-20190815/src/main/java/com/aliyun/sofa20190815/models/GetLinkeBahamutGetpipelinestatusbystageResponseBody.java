// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutGetpipelinestatusbystageResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("ErrorMsgParamsMap")
    public String errorMsgParamsMap;

    @NameInMap("Message")
    public String message;

    @NameInMap("ResponseStatusCode")
    public Long responseStatusCode;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Result")
    public java.util.List<GetLinkeBahamutGetpipelinestatusbystageResponseBodyResult> result;

    public static GetLinkeBahamutGetpipelinestatusbystageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutGetpipelinestatusbystageResponseBody self = new GetLinkeBahamutGetpipelinestatusbystageResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutGetpipelinestatusbystageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLinkeBahamutGetpipelinestatusbystageResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetLinkeBahamutGetpipelinestatusbystageResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public GetLinkeBahamutGetpipelinestatusbystageResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetLinkeBahamutGetpipelinestatusbystageResponseBody setErrorMsgParamsMap(String errorMsgParamsMap) {
        this.errorMsgParamsMap = errorMsgParamsMap;
        return this;
    }
    public String getErrorMsgParamsMap() {
        return this.errorMsgParamsMap;
    }

    public GetLinkeBahamutGetpipelinestatusbystageResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetLinkeBahamutGetpipelinestatusbystageResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public GetLinkeBahamutGetpipelinestatusbystageResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetLinkeBahamutGetpipelinestatusbystageResponseBody setResult(java.util.List<GetLinkeBahamutGetpipelinestatusbystageResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<GetLinkeBahamutGetpipelinestatusbystageResponseBodyResult> getResult() {
        return this.result;
    }

    public static class GetLinkeBahamutGetpipelinestatusbystageResponseBodyResult extends TeaModel {
        @NameInMap("Context")
        public String context;

        @NameInMap("Description")
        public String description;

        @NameInMap("EndTime")
        public Long endTime;

        @NameInMap("Error")
        public String error;

        @NameInMap("ExecutionId")
        public Long executionId;

        @NameInMap("ExtraKey")
        public String extraKey;

        @NameInMap("GmtModified")
        public Long gmtModified;

        @NameInMap("Id")
        public Long id;

        @NameInMap("InstanceId")
        public Long instanceId;

        @NameInMap("Name")
        public String name;

        @NameInMap("PipelineId")
        public Long pipelineId;

        @NameInMap("Result")
        public String result;

        @NameInMap("StartTime")
        public Long startTime;

        @NameInMap("Status")
        public String status;

        @NameInMap("HistoryOperators")
        public java.util.List<String> historyOperators;

        @NameInMap("StageExecutions")
        public java.util.List<String> stageExecutions;

        @NameInMap("Tags")
        public java.util.List<String> tags;

        public static GetLinkeBahamutGetpipelinestatusbystageResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetLinkeBahamutGetpipelinestatusbystageResponseBodyResult self = new GetLinkeBahamutGetpipelinestatusbystageResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetLinkeBahamutGetpipelinestatusbystageResponseBodyResult setContext(String context) {
            this.context = context;
            return this;
        }
        public String getContext() {
            return this.context;
        }

        public GetLinkeBahamutGetpipelinestatusbystageResponseBodyResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetLinkeBahamutGetpipelinestatusbystageResponseBodyResult setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public GetLinkeBahamutGetpipelinestatusbystageResponseBodyResult setError(String error) {
            this.error = error;
            return this;
        }
        public String getError() {
            return this.error;
        }

        public GetLinkeBahamutGetpipelinestatusbystageResponseBodyResult setExecutionId(Long executionId) {
            this.executionId = executionId;
            return this;
        }
        public Long getExecutionId() {
            return this.executionId;
        }

        public GetLinkeBahamutGetpipelinestatusbystageResponseBodyResult setExtraKey(String extraKey) {
            this.extraKey = extraKey;
            return this;
        }
        public String getExtraKey() {
            return this.extraKey;
        }

        public GetLinkeBahamutGetpipelinestatusbystageResponseBodyResult setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public GetLinkeBahamutGetpipelinestatusbystageResponseBodyResult setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetLinkeBahamutGetpipelinestatusbystageResponseBodyResult setInstanceId(Long instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public Long getInstanceId() {
            return this.instanceId;
        }

        public GetLinkeBahamutGetpipelinestatusbystageResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetLinkeBahamutGetpipelinestatusbystageResponseBodyResult setPipelineId(Long pipelineId) {
            this.pipelineId = pipelineId;
            return this;
        }
        public Long getPipelineId() {
            return this.pipelineId;
        }

        public GetLinkeBahamutGetpipelinestatusbystageResponseBodyResult setResult(String result) {
            this.result = result;
            return this;
        }
        public String getResult() {
            return this.result;
        }

        public GetLinkeBahamutGetpipelinestatusbystageResponseBodyResult setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public GetLinkeBahamutGetpipelinestatusbystageResponseBodyResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetLinkeBahamutGetpipelinestatusbystageResponseBodyResult setHistoryOperators(java.util.List<String> historyOperators) {
            this.historyOperators = historyOperators;
            return this;
        }
        public java.util.List<String> getHistoryOperators() {
            return this.historyOperators;
        }

        public GetLinkeBahamutGetpipelinestatusbystageResponseBodyResult setStageExecutions(java.util.List<String> stageExecutions) {
            this.stageExecutions = stageExecutions;
            return this;
        }
        public java.util.List<String> getStageExecutions() {
            return this.stageExecutions;
        }

        public GetLinkeBahamutGetpipelinestatusbystageResponseBodyResult setTags(java.util.List<String> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<String> getTags() {
            return this.tags;
        }

    }

}
