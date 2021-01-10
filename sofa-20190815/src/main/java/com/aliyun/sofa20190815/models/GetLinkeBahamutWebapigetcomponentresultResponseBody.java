// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutWebapigetcomponentresultResponseBody extends TeaModel {
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
    public GetLinkeBahamutWebapigetcomponentresultResponseBodyResult result;

    public static GetLinkeBahamutWebapigetcomponentresultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutWebapigetcomponentresultResponseBody self = new GetLinkeBahamutWebapigetcomponentresultResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutWebapigetcomponentresultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLinkeBahamutWebapigetcomponentresultResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetLinkeBahamutWebapigetcomponentresultResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public GetLinkeBahamutWebapigetcomponentresultResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetLinkeBahamutWebapigetcomponentresultResponseBody setErrorMsgParamsMap(String errorMsgParamsMap) {
        this.errorMsgParamsMap = errorMsgParamsMap;
        return this;
    }
    public String getErrorMsgParamsMap() {
        return this.errorMsgParamsMap;
    }

    public GetLinkeBahamutWebapigetcomponentresultResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetLinkeBahamutWebapigetcomponentresultResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public GetLinkeBahamutWebapigetcomponentresultResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetLinkeBahamutWebapigetcomponentresultResponseBody setResult(GetLinkeBahamutWebapigetcomponentresultResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetLinkeBahamutWebapigetcomponentresultResponseBodyResult getResult() {
        return this.result;
    }

    public static class GetLinkeBahamutWebapigetcomponentresultResponseBodyResult extends TeaModel {
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

        public static GetLinkeBahamutWebapigetcomponentresultResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetLinkeBahamutWebapigetcomponentresultResponseBodyResult self = new GetLinkeBahamutWebapigetcomponentresultResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetLinkeBahamutWebapigetcomponentresultResponseBodyResult setCausedBy(String causedBy) {
            this.causedBy = causedBy;
            return this;
        }
        public String getCausedBy() {
            return this.causedBy;
        }

        public GetLinkeBahamutWebapigetcomponentresultResponseBodyResult setComponentDisplayName(String componentDisplayName) {
            this.componentDisplayName = componentDisplayName;
            return this;
        }
        public String getComponentDisplayName() {
            return this.componentDisplayName;
        }

        public GetLinkeBahamutWebapigetcomponentresultResponseBodyResult setComponentId(String componentId) {
            this.componentId = componentId;
            return this;
        }
        public String getComponentId() {
            return this.componentId;
        }

        public GetLinkeBahamutWebapigetcomponentresultResponseBodyResult setComponentName(String componentName) {
            this.componentName = componentName;
            return this;
        }
        public String getComponentName() {
            return this.componentName;
        }

        public GetLinkeBahamutWebapigetcomponentresultResponseBodyResult setComponentType(String componentType) {
            this.componentType = componentType;
            return this;
        }
        public String getComponentType() {
            return this.componentType;
        }

        public GetLinkeBahamutWebapigetcomponentresultResponseBodyResult setData(String data) {
            this.data = data;
            return this;
        }
        public String getData() {
            return this.data;
        }

        public GetLinkeBahamutWebapigetcomponentresultResponseBodyResult setDetailStatus(String detailStatus) {
            this.detailStatus = detailStatus;
            return this;
        }
        public String getDetailStatus() {
            return this.detailStatus;
        }

        public GetLinkeBahamutWebapigetcomponentresultResponseBodyResult setErrorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }
        public String getErrorMsg() {
            return this.errorMsg;
        }

        public GetLinkeBahamutWebapigetcomponentresultResponseBodyResult setExecutionResult(String executionResult) {
            this.executionResult = executionResult;
            return this;
        }
        public String getExecutionResult() {
            return this.executionResult;
        }

        public GetLinkeBahamutWebapigetcomponentresultResponseBodyResult setExecutionTaskId(String executionTaskId) {
            this.executionTaskId = executionTaskId;
            return this;
        }
        public String getExecutionTaskId() {
            return this.executionTaskId;
        }

        public GetLinkeBahamutWebapigetcomponentresultResponseBodyResult setExpressionData(String expressionData) {
            this.expressionData = expressionData;
            return this;
        }
        public String getExpressionData() {
            return this.expressionData;
        }

        public GetLinkeBahamutWebapigetcomponentresultResponseBodyResult setExpressionDesc(String expressionDesc) {
            this.expressionDesc = expressionDesc;
            return this;
        }
        public String getExpressionDesc() {
            return this.expressionDesc;
        }

        public GetLinkeBahamutWebapigetcomponentresultResponseBodyResult setExpressionRule(String expressionRule) {
            this.expressionRule = expressionRule;
            return this;
        }
        public String getExpressionRule() {
            return this.expressionRule;
        }

        public GetLinkeBahamutWebapigetcomponentresultResponseBodyResult setFailReason(String failReason) {
            this.failReason = failReason;
            return this;
        }
        public String getFailReason() {
            return this.failReason;
        }

        public GetLinkeBahamutWebapigetcomponentresultResponseBodyResult setHtmlText(String htmlText) {
            this.htmlText = htmlText;
            return this;
        }
        public String getHtmlText() {
            return this.htmlText;
        }

        public GetLinkeBahamutWebapigetcomponentresultResponseBodyResult setLoggerUrl(String loggerUrl) {
            this.loggerUrl = loggerUrl;
            return this;
        }
        public String getLoggerUrl() {
            return this.loggerUrl;
        }

        public GetLinkeBahamutWebapigetcomponentresultResponseBodyResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetLinkeBahamutWebapigetcomponentresultResponseBodyResult setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public GetLinkeBahamutWebapigetcomponentresultResponseBodyResult setTipHtml(String tipHtml) {
            this.tipHtml = tipHtml;
            return this;
        }
        public String getTipHtml() {
            return this.tipHtml;
        }

    }

}
