// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutPipelinegetcomponentresultResponseBody extends TeaModel {
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
    public GetLinkeBahamutPipelinegetcomponentresultResponseBodyResult result;

    public static GetLinkeBahamutPipelinegetcomponentresultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutPipelinegetcomponentresultResponseBody self = new GetLinkeBahamutPipelinegetcomponentresultResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutPipelinegetcomponentresultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLinkeBahamutPipelinegetcomponentresultResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetLinkeBahamutPipelinegetcomponentresultResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public GetLinkeBahamutPipelinegetcomponentresultResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetLinkeBahamutPipelinegetcomponentresultResponseBody setErrorMsgParamsMap(String errorMsgParamsMap) {
        this.errorMsgParamsMap = errorMsgParamsMap;
        return this;
    }
    public String getErrorMsgParamsMap() {
        return this.errorMsgParamsMap;
    }

    public GetLinkeBahamutPipelinegetcomponentresultResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetLinkeBahamutPipelinegetcomponentresultResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public GetLinkeBahamutPipelinegetcomponentresultResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetLinkeBahamutPipelinegetcomponentresultResponseBody setResult(GetLinkeBahamutPipelinegetcomponentresultResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetLinkeBahamutPipelinegetcomponentresultResponseBodyResult getResult() {
        return this.result;
    }

    public static class GetLinkeBahamutPipelinegetcomponentresultResponseBodyResult extends TeaModel {
        @NameInMap("CausedBy")
        public String causedBy;

        @NameInMap("ComponentDisplayName")
        public String componentDisplayName;

        @NameInMap("ComponentId")
        public String componentId;

        @NameInMap("ComponentName")
        public String componentName;

        @NameInMap("ComponentType")
        public String componentType;

        @NameInMap("Data")
        public String data;

        @NameInMap("DetailStatus")
        public String detailStatus;

        @NameInMap("ErrorMsg")
        public String errorMsg;

        @NameInMap("ExecutionResult")
        public String executionResult;

        @NameInMap("ExecutionTaskId")
        public String executionTaskId;

        @NameInMap("ExpressionData")
        public String expressionData;

        @NameInMap("ExpressionDesc")
        public String expressionDesc;

        @NameInMap("ExpressionRule")
        public String expressionRule;

        @NameInMap("FailReason")
        public String failReason;

        @NameInMap("HtmlText")
        public String htmlText;

        @NameInMap("LoggerUrl")
        public String loggerUrl;

        @NameInMap("Status")
        public String status;

        @NameInMap("Success")
        public Boolean success;

        @NameInMap("TipHtml")
        public String tipHtml;

        public static GetLinkeBahamutPipelinegetcomponentresultResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetLinkeBahamutPipelinegetcomponentresultResponseBodyResult self = new GetLinkeBahamutPipelinegetcomponentresultResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetLinkeBahamutPipelinegetcomponentresultResponseBodyResult setCausedBy(String causedBy) {
            this.causedBy = causedBy;
            return this;
        }
        public String getCausedBy() {
            return this.causedBy;
        }

        public GetLinkeBahamutPipelinegetcomponentresultResponseBodyResult setComponentDisplayName(String componentDisplayName) {
            this.componentDisplayName = componentDisplayName;
            return this;
        }
        public String getComponentDisplayName() {
            return this.componentDisplayName;
        }

        public GetLinkeBahamutPipelinegetcomponentresultResponseBodyResult setComponentId(String componentId) {
            this.componentId = componentId;
            return this;
        }
        public String getComponentId() {
            return this.componentId;
        }

        public GetLinkeBahamutPipelinegetcomponentresultResponseBodyResult setComponentName(String componentName) {
            this.componentName = componentName;
            return this;
        }
        public String getComponentName() {
            return this.componentName;
        }

        public GetLinkeBahamutPipelinegetcomponentresultResponseBodyResult setComponentType(String componentType) {
            this.componentType = componentType;
            return this;
        }
        public String getComponentType() {
            return this.componentType;
        }

        public GetLinkeBahamutPipelinegetcomponentresultResponseBodyResult setData(String data) {
            this.data = data;
            return this;
        }
        public String getData() {
            return this.data;
        }

        public GetLinkeBahamutPipelinegetcomponentresultResponseBodyResult setDetailStatus(String detailStatus) {
            this.detailStatus = detailStatus;
            return this;
        }
        public String getDetailStatus() {
            return this.detailStatus;
        }

        public GetLinkeBahamutPipelinegetcomponentresultResponseBodyResult setErrorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }
        public String getErrorMsg() {
            return this.errorMsg;
        }

        public GetLinkeBahamutPipelinegetcomponentresultResponseBodyResult setExecutionResult(String executionResult) {
            this.executionResult = executionResult;
            return this;
        }
        public String getExecutionResult() {
            return this.executionResult;
        }

        public GetLinkeBahamutPipelinegetcomponentresultResponseBodyResult setExecutionTaskId(String executionTaskId) {
            this.executionTaskId = executionTaskId;
            return this;
        }
        public String getExecutionTaskId() {
            return this.executionTaskId;
        }

        public GetLinkeBahamutPipelinegetcomponentresultResponseBodyResult setExpressionData(String expressionData) {
            this.expressionData = expressionData;
            return this;
        }
        public String getExpressionData() {
            return this.expressionData;
        }

        public GetLinkeBahamutPipelinegetcomponentresultResponseBodyResult setExpressionDesc(String expressionDesc) {
            this.expressionDesc = expressionDesc;
            return this;
        }
        public String getExpressionDesc() {
            return this.expressionDesc;
        }

        public GetLinkeBahamutPipelinegetcomponentresultResponseBodyResult setExpressionRule(String expressionRule) {
            this.expressionRule = expressionRule;
            return this;
        }
        public String getExpressionRule() {
            return this.expressionRule;
        }

        public GetLinkeBahamutPipelinegetcomponentresultResponseBodyResult setFailReason(String failReason) {
            this.failReason = failReason;
            return this;
        }
        public String getFailReason() {
            return this.failReason;
        }

        public GetLinkeBahamutPipelinegetcomponentresultResponseBodyResult setHtmlText(String htmlText) {
            this.htmlText = htmlText;
            return this;
        }
        public String getHtmlText() {
            return this.htmlText;
        }

        public GetLinkeBahamutPipelinegetcomponentresultResponseBodyResult setLoggerUrl(String loggerUrl) {
            this.loggerUrl = loggerUrl;
            return this;
        }
        public String getLoggerUrl() {
            return this.loggerUrl;
        }

        public GetLinkeBahamutPipelinegetcomponentresultResponseBodyResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetLinkeBahamutPipelinegetcomponentresultResponseBodyResult setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public GetLinkeBahamutPipelinegetcomponentresultResponseBodyResult setTipHtml(String tipHtml) {
            this.tipHtml = tipHtml;
            return this;
        }
        public String getTipHtml() {
            return this.tipHtml;
        }

    }

}
