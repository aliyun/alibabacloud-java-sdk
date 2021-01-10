// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutIterationunitResponseBody extends TeaModel {
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
    public GetLinkeBahamutIterationunitResponseBodyResult result;

    public static GetLinkeBahamutIterationunitResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutIterationunitResponseBody self = new GetLinkeBahamutIterationunitResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutIterationunitResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLinkeBahamutIterationunitResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetLinkeBahamutIterationunitResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public GetLinkeBahamutIterationunitResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetLinkeBahamutIterationunitResponseBody setErrorMsgParamsMap(String errorMsgParamsMap) {
        this.errorMsgParamsMap = errorMsgParamsMap;
        return this;
    }
    public String getErrorMsgParamsMap() {
        return this.errorMsgParamsMap;
    }

    public GetLinkeBahamutIterationunitResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetLinkeBahamutIterationunitResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public GetLinkeBahamutIterationunitResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetLinkeBahamutIterationunitResponseBody setResult(GetLinkeBahamutIterationunitResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetLinkeBahamutIterationunitResponseBodyResult getResult() {
        return this.result;
    }

    public static class GetLinkeBahamutIterationunitResponseBodyResult extends TeaModel {
        @NameInMap("AppName")
        public String appName;

        @NameInMap("ArchDomainName")
        public String archDomainName;

        @NameInMap("Branch")
        public String branch;

        @NameInMap("GrayRelease")
        public Boolean grayRelease;

        @NameInMap("Stage")
        public String stage;

        public static GetLinkeBahamutIterationunitResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetLinkeBahamutIterationunitResponseBodyResult self = new GetLinkeBahamutIterationunitResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetLinkeBahamutIterationunitResponseBodyResult setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public GetLinkeBahamutIterationunitResponseBodyResult setArchDomainName(String archDomainName) {
            this.archDomainName = archDomainName;
            return this;
        }
        public String getArchDomainName() {
            return this.archDomainName;
        }

        public GetLinkeBahamutIterationunitResponseBodyResult setBranch(String branch) {
            this.branch = branch;
            return this;
        }
        public String getBranch() {
            return this.branch;
        }

        public GetLinkeBahamutIterationunitResponseBodyResult setGrayRelease(Boolean grayRelease) {
            this.grayRelease = grayRelease;
            return this;
        }
        public Boolean getGrayRelease() {
            return this.grayRelease;
        }

        public GetLinkeBahamutIterationunitResponseBodyResult setStage(String stage) {
            this.stage = stage;
            return this;
        }
        public String getStage() {
            return this.stage;
        }

    }

}
