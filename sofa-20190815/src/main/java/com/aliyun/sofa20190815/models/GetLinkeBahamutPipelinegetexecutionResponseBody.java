// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutPipelinegetexecutionResponseBody extends TeaModel {
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
    public GetLinkeBahamutPipelinegetexecutionResponseBodyResult result;

    public static GetLinkeBahamutPipelinegetexecutionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutPipelinegetexecutionResponseBody self = new GetLinkeBahamutPipelinegetexecutionResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutPipelinegetexecutionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLinkeBahamutPipelinegetexecutionResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetLinkeBahamutPipelinegetexecutionResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public GetLinkeBahamutPipelinegetexecutionResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetLinkeBahamutPipelinegetexecutionResponseBody setErrorMsgParamsMap(String errorMsgParamsMap) {
        this.errorMsgParamsMap = errorMsgParamsMap;
        return this;
    }
    public String getErrorMsgParamsMap() {
        return this.errorMsgParamsMap;
    }

    public GetLinkeBahamutPipelinegetexecutionResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetLinkeBahamutPipelinegetexecutionResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public GetLinkeBahamutPipelinegetexecutionResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetLinkeBahamutPipelinegetexecutionResponseBody setResult(GetLinkeBahamutPipelinegetexecutionResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetLinkeBahamutPipelinegetexecutionResponseBodyResult getResult() {
        return this.result;
    }

    public static class GetLinkeBahamutPipelinegetexecutionResponseBodyResult extends TeaModel {
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

        public static GetLinkeBahamutPipelinegetexecutionResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetLinkeBahamutPipelinegetexecutionResponseBodyResult self = new GetLinkeBahamutPipelinegetexecutionResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetLinkeBahamutPipelinegetexecutionResponseBodyResult setContext(String context) {
            this.context = context;
            return this;
        }
        public String getContext() {
            return this.context;
        }

        public GetLinkeBahamutPipelinegetexecutionResponseBodyResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetLinkeBahamutPipelinegetexecutionResponseBodyResult setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public GetLinkeBahamutPipelinegetexecutionResponseBodyResult setError(String error) {
            this.error = error;
            return this;
        }
        public String getError() {
            return this.error;
        }

        public GetLinkeBahamutPipelinegetexecutionResponseBodyResult setExecutionId(Long executionId) {
            this.executionId = executionId;
            return this;
        }
        public Long getExecutionId() {
            return this.executionId;
        }

        public GetLinkeBahamutPipelinegetexecutionResponseBodyResult setExtraKey(String extraKey) {
            this.extraKey = extraKey;
            return this;
        }
        public String getExtraKey() {
            return this.extraKey;
        }

        public GetLinkeBahamutPipelinegetexecutionResponseBodyResult setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public GetLinkeBahamutPipelinegetexecutionResponseBodyResult setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetLinkeBahamutPipelinegetexecutionResponseBodyResult setInstanceId(Long instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public Long getInstanceId() {
            return this.instanceId;
        }

        public GetLinkeBahamutPipelinegetexecutionResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetLinkeBahamutPipelinegetexecutionResponseBodyResult setPipelineId(Long pipelineId) {
            this.pipelineId = pipelineId;
            return this;
        }
        public Long getPipelineId() {
            return this.pipelineId;
        }

        public GetLinkeBahamutPipelinegetexecutionResponseBodyResult setResult(String result) {
            this.result = result;
            return this;
        }
        public String getResult() {
            return this.result;
        }

        public GetLinkeBahamutPipelinegetexecutionResponseBodyResult setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public GetLinkeBahamutPipelinegetexecutionResponseBodyResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetLinkeBahamutPipelinegetexecutionResponseBodyResult setHistoryOperators(java.util.List<String> historyOperators) {
            this.historyOperators = historyOperators;
            return this;
        }
        public java.util.List<String> getHistoryOperators() {
            return this.historyOperators;
        }

        public GetLinkeBahamutPipelinegetexecutionResponseBodyResult setStageExecutions(java.util.List<String> stageExecutions) {
            this.stageExecutions = stageExecutions;
            return this;
        }
        public java.util.List<String> getStageExecutions() {
            return this.stageExecutions;
        }

        public GetLinkeBahamutPipelinegetexecutionResponseBodyResult setTags(java.util.List<String> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<String> getTags() {
            return this.tags;
        }

    }

}
