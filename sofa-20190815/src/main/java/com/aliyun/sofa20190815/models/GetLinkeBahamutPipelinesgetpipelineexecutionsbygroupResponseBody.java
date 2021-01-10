// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutPipelinesgetpipelineexecutionsbygroupResponseBody extends TeaModel {
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
    public GetLinkeBahamutPipelinesgetpipelineexecutionsbygroupResponseBodyResult result;

    public static GetLinkeBahamutPipelinesgetpipelineexecutionsbygroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutPipelinesgetpipelineexecutionsbygroupResponseBody self = new GetLinkeBahamutPipelinesgetpipelineexecutionsbygroupResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutPipelinesgetpipelineexecutionsbygroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLinkeBahamutPipelinesgetpipelineexecutionsbygroupResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetLinkeBahamutPipelinesgetpipelineexecutionsbygroupResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public GetLinkeBahamutPipelinesgetpipelineexecutionsbygroupResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetLinkeBahamutPipelinesgetpipelineexecutionsbygroupResponseBody setErrorMsgParamsMap(String errorMsgParamsMap) {
        this.errorMsgParamsMap = errorMsgParamsMap;
        return this;
    }
    public String getErrorMsgParamsMap() {
        return this.errorMsgParamsMap;
    }

    public GetLinkeBahamutPipelinesgetpipelineexecutionsbygroupResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetLinkeBahamutPipelinesgetpipelineexecutionsbygroupResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public GetLinkeBahamutPipelinesgetpipelineexecutionsbygroupResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetLinkeBahamutPipelinesgetpipelineexecutionsbygroupResponseBody setResult(GetLinkeBahamutPipelinesgetpipelineexecutionsbygroupResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetLinkeBahamutPipelinesgetpipelineexecutionsbygroupResponseBodyResult getResult() {
        return this.result;
    }

    public static class GetLinkeBahamutPipelinesgetpipelineexecutionsbygroupResponseBodyResult extends TeaModel {
        @NameInMap("StageId")
        public String stageId;

        @NameInMap("Executions")
        public java.util.List<String> executions;

        public static GetLinkeBahamutPipelinesgetpipelineexecutionsbygroupResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetLinkeBahamutPipelinesgetpipelineexecutionsbygroupResponseBodyResult self = new GetLinkeBahamutPipelinesgetpipelineexecutionsbygroupResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetLinkeBahamutPipelinesgetpipelineexecutionsbygroupResponseBodyResult setStageId(String stageId) {
            this.stageId = stageId;
            return this;
        }
        public String getStageId() {
            return this.stageId;
        }

        public GetLinkeBahamutPipelinesgetpipelineexecutionsbygroupResponseBodyResult setExecutions(java.util.List<String> executions) {
            this.executions = executions;
            return this;
        }
        public java.util.List<String> getExecutions() {
            return this.executions;
        }

    }

}
