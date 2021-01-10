// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutComponentexecutionsResponseBody extends TeaModel {
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
    public java.util.List<GetLinkeBahamutComponentexecutionsResponseBodyResult> result;

    public static GetLinkeBahamutComponentexecutionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutComponentexecutionsResponseBody self = new GetLinkeBahamutComponentexecutionsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutComponentexecutionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLinkeBahamutComponentexecutionsResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetLinkeBahamutComponentexecutionsResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public GetLinkeBahamutComponentexecutionsResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetLinkeBahamutComponentexecutionsResponseBody setErrorMsgParamsMap(String errorMsgParamsMap) {
        this.errorMsgParamsMap = errorMsgParamsMap;
        return this;
    }
    public String getErrorMsgParamsMap() {
        return this.errorMsgParamsMap;
    }

    public GetLinkeBahamutComponentexecutionsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetLinkeBahamutComponentexecutionsResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public GetLinkeBahamutComponentexecutionsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetLinkeBahamutComponentexecutionsResponseBody setResult(java.util.List<GetLinkeBahamutComponentexecutionsResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<GetLinkeBahamutComponentexecutionsResponseBodyResult> getResult() {
        return this.result;
    }

    public static class GetLinkeBahamutComponentexecutionsResponseBodyResult extends TeaModel {
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

        public static GetLinkeBahamutComponentexecutionsResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetLinkeBahamutComponentexecutionsResponseBodyResult self = new GetLinkeBahamutComponentexecutionsResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetLinkeBahamutComponentexecutionsResponseBodyResult setCausedBy(String causedBy) {
            this.causedBy = causedBy;
            return this;
        }
        public String getCausedBy() {
            return this.causedBy;
        }

        public GetLinkeBahamutComponentexecutionsResponseBodyResult setComponentDisplayName(String componentDisplayName) {
            this.componentDisplayName = componentDisplayName;
            return this;
        }
        public String getComponentDisplayName() {
            return this.componentDisplayName;
        }

        public GetLinkeBahamutComponentexecutionsResponseBodyResult setComponentId(String componentId) {
            this.componentId = componentId;
            return this;
        }
        public String getComponentId() {
            return this.componentId;
        }

        public GetLinkeBahamutComponentexecutionsResponseBodyResult setComponentName(String componentName) {
            this.componentName = componentName;
            return this;
        }
        public String getComponentName() {
            return this.componentName;
        }

        public GetLinkeBahamutComponentexecutionsResponseBodyResult setComponentType(String componentType) {
            this.componentType = componentType;
            return this;
        }
        public String getComponentType() {
            return this.componentType;
        }

        public GetLinkeBahamutComponentexecutionsResponseBodyResult setData(String data) {
            this.data = data;
            return this;
        }
        public String getData() {
            return this.data;
        }

        public GetLinkeBahamutComponentexecutionsResponseBodyResult setDetailStatus(String detailStatus) {
            this.detailStatus = detailStatus;
            return this;
        }
        public String getDetailStatus() {
            return this.detailStatus;
        }

        public GetLinkeBahamutComponentexecutionsResponseBodyResult setErrorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }
        public String getErrorMsg() {
            return this.errorMsg;
        }

        public GetLinkeBahamutComponentexecutionsResponseBodyResult setExecutionResult(String executionResult) {
            this.executionResult = executionResult;
            return this;
        }
        public String getExecutionResult() {
            return this.executionResult;
        }

        public GetLinkeBahamutComponentexecutionsResponseBodyResult setExecutionTaskId(String executionTaskId) {
            this.executionTaskId = executionTaskId;
            return this;
        }
        public String getExecutionTaskId() {
            return this.executionTaskId;
        }

        public GetLinkeBahamutComponentexecutionsResponseBodyResult setExpressionData(String expressionData) {
            this.expressionData = expressionData;
            return this;
        }
        public String getExpressionData() {
            return this.expressionData;
        }

        public GetLinkeBahamutComponentexecutionsResponseBodyResult setExpressionDesc(String expressionDesc) {
            this.expressionDesc = expressionDesc;
            return this;
        }
        public String getExpressionDesc() {
            return this.expressionDesc;
        }

        public GetLinkeBahamutComponentexecutionsResponseBodyResult setExpressionRule(String expressionRule) {
            this.expressionRule = expressionRule;
            return this;
        }
        public String getExpressionRule() {
            return this.expressionRule;
        }

        public GetLinkeBahamutComponentexecutionsResponseBodyResult setFailReason(String failReason) {
            this.failReason = failReason;
            return this;
        }
        public String getFailReason() {
            return this.failReason;
        }

        public GetLinkeBahamutComponentexecutionsResponseBodyResult setHtmlText(String htmlText) {
            this.htmlText = htmlText;
            return this;
        }
        public String getHtmlText() {
            return this.htmlText;
        }

        public GetLinkeBahamutComponentexecutionsResponseBodyResult setLoggerUrl(String loggerUrl) {
            this.loggerUrl = loggerUrl;
            return this;
        }
        public String getLoggerUrl() {
            return this.loggerUrl;
        }

        public GetLinkeBahamutComponentexecutionsResponseBodyResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetLinkeBahamutComponentexecutionsResponseBodyResult setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public GetLinkeBahamutComponentexecutionsResponseBodyResult setTipHtml(String tipHtml) {
            this.tipHtml = tipHtml;
            return this;
        }
        public String getTipHtml() {
            return this.tipHtml;
        }

    }

}
