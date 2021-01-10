// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutPaasgetiterationunitResponseBody extends TeaModel {
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
    public java.util.List<GetLinkeBahamutPaasgetiterationunitResponseBodyResult> result;

    public static GetLinkeBahamutPaasgetiterationunitResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutPaasgetiterationunitResponseBody self = new GetLinkeBahamutPaasgetiterationunitResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutPaasgetiterationunitResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLinkeBahamutPaasgetiterationunitResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetLinkeBahamutPaasgetiterationunitResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public GetLinkeBahamutPaasgetiterationunitResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetLinkeBahamutPaasgetiterationunitResponseBody setErrorMsgParamsMap(String errorMsgParamsMap) {
        this.errorMsgParamsMap = errorMsgParamsMap;
        return this;
    }
    public String getErrorMsgParamsMap() {
        return this.errorMsgParamsMap;
    }

    public GetLinkeBahamutPaasgetiterationunitResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetLinkeBahamutPaasgetiterationunitResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public GetLinkeBahamutPaasgetiterationunitResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetLinkeBahamutPaasgetiterationunitResponseBody setResult(java.util.List<GetLinkeBahamutPaasgetiterationunitResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<GetLinkeBahamutPaasgetiterationunitResponseBodyResult> getResult() {
        return this.result;
    }

    public static class GetLinkeBahamutPaasgetiterationunitResponseBodyResult extends TeaModel {
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

        public static GetLinkeBahamutPaasgetiterationunitResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetLinkeBahamutPaasgetiterationunitResponseBodyResult self = new GetLinkeBahamutPaasgetiterationunitResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetLinkeBahamutPaasgetiterationunitResponseBodyResult setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public GetLinkeBahamutPaasgetiterationunitResponseBodyResult setArchDomainName(String archDomainName) {
            this.archDomainName = archDomainName;
            return this;
        }
        public String getArchDomainName() {
            return this.archDomainName;
        }

        public GetLinkeBahamutPaasgetiterationunitResponseBodyResult setBranch(String branch) {
            this.branch = branch;
            return this;
        }
        public String getBranch() {
            return this.branch;
        }

        public GetLinkeBahamutPaasgetiterationunitResponseBodyResult setGrayRelease(Boolean grayRelease) {
            this.grayRelease = grayRelease;
            return this;
        }
        public Boolean getGrayRelease() {
            return this.grayRelease;
        }

        public GetLinkeBahamutPaasgetiterationunitResponseBodyResult setStage(String stage) {
            this.stage = stage;
            return this;
        }
        public String getStage() {
            return this.stage;
        }

    }

}
