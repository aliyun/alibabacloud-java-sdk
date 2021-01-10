// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutPipelinegetcomponentresultvResponseBody extends TeaModel {
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
    public GetLinkeBahamutPipelinegetcomponentresultvResponseBodyResult result;

    public static GetLinkeBahamutPipelinegetcomponentresultvResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutPipelinegetcomponentresultvResponseBody self = new GetLinkeBahamutPipelinegetcomponentresultvResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutPipelinegetcomponentresultvResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLinkeBahamutPipelinegetcomponentresultvResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetLinkeBahamutPipelinegetcomponentresultvResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public GetLinkeBahamutPipelinegetcomponentresultvResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetLinkeBahamutPipelinegetcomponentresultvResponseBody setErrorMsgParamsMap(String errorMsgParamsMap) {
        this.errorMsgParamsMap = errorMsgParamsMap;
        return this;
    }
    public String getErrorMsgParamsMap() {
        return this.errorMsgParamsMap;
    }

    public GetLinkeBahamutPipelinegetcomponentresultvResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetLinkeBahamutPipelinegetcomponentresultvResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public GetLinkeBahamutPipelinegetcomponentresultvResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetLinkeBahamutPipelinegetcomponentresultvResponseBody setResult(GetLinkeBahamutPipelinegetcomponentresultvResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetLinkeBahamutPipelinegetcomponentresultvResponseBodyResult getResult() {
        return this.result;
    }

    public static class GetLinkeBahamutPipelinegetcomponentresultvResponseBodyResult extends TeaModel {
        @NameInMap("Data")
        public String data;

        @NameInMap("DisplayName")
        public String displayName;

        @NameInMap("ErrorMsg")
        public String errorMsg;

        @NameInMap("ExecutingData")
        public String executingData;

        @NameInMap("FailedData")
        public String failedData;

        @NameInMap("Html")
        public String html;

        @NameInMap("Id")
        public String id;

        @NameInMap("Name")
        public String name;

        @NameInMap("PassedData")
        public String passedData;

        @NameInMap("Status")
        public String status;

        @NameInMap("Type")
        public String type;

        @NameInMap("WarnData")
        public String warnData;

        @NameInMap("OutPutList")
        public java.util.List<String> outPutList;

        public static GetLinkeBahamutPipelinegetcomponentresultvResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetLinkeBahamutPipelinegetcomponentresultvResponseBodyResult self = new GetLinkeBahamutPipelinegetcomponentresultvResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetLinkeBahamutPipelinegetcomponentresultvResponseBodyResult setData(String data) {
            this.data = data;
            return this;
        }
        public String getData() {
            return this.data;
        }

        public GetLinkeBahamutPipelinegetcomponentresultvResponseBodyResult setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public GetLinkeBahamutPipelinegetcomponentresultvResponseBodyResult setErrorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }
        public String getErrorMsg() {
            return this.errorMsg;
        }

        public GetLinkeBahamutPipelinegetcomponentresultvResponseBodyResult setExecutingData(String executingData) {
            this.executingData = executingData;
            return this;
        }
        public String getExecutingData() {
            return this.executingData;
        }

        public GetLinkeBahamutPipelinegetcomponentresultvResponseBodyResult setFailedData(String failedData) {
            this.failedData = failedData;
            return this;
        }
        public String getFailedData() {
            return this.failedData;
        }

        public GetLinkeBahamutPipelinegetcomponentresultvResponseBodyResult setHtml(String html) {
            this.html = html;
            return this;
        }
        public String getHtml() {
            return this.html;
        }

        public GetLinkeBahamutPipelinegetcomponentresultvResponseBodyResult setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetLinkeBahamutPipelinegetcomponentresultvResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetLinkeBahamutPipelinegetcomponentresultvResponseBodyResult setPassedData(String passedData) {
            this.passedData = passedData;
            return this;
        }
        public String getPassedData() {
            return this.passedData;
        }

        public GetLinkeBahamutPipelinegetcomponentresultvResponseBodyResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetLinkeBahamutPipelinegetcomponentresultvResponseBodyResult setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetLinkeBahamutPipelinegetcomponentresultvResponseBodyResult setWarnData(String warnData) {
            this.warnData = warnData;
            return this;
        }
        public String getWarnData() {
            return this.warnData;
        }

        public GetLinkeBahamutPipelinegetcomponentresultvResponseBodyResult setOutPutList(java.util.List<String> outPutList) {
            this.outPutList = outPutList;
            return this;
        }
        public java.util.List<String> getOutPutList() {
            return this.outPutList;
        }

    }

}
