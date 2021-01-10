// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutExternalreleaseappResponseBody extends TeaModel {
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
    public java.util.List<GetLinkeBahamutExternalreleaseappResponseBodyResult> result;

    public static GetLinkeBahamutExternalreleaseappResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutExternalreleaseappResponseBody self = new GetLinkeBahamutExternalreleaseappResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutExternalreleaseappResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLinkeBahamutExternalreleaseappResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetLinkeBahamutExternalreleaseappResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public GetLinkeBahamutExternalreleaseappResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetLinkeBahamutExternalreleaseappResponseBody setErrorMsgParamsMap(String errorMsgParamsMap) {
        this.errorMsgParamsMap = errorMsgParamsMap;
        return this;
    }
    public String getErrorMsgParamsMap() {
        return this.errorMsgParamsMap;
    }

    public GetLinkeBahamutExternalreleaseappResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetLinkeBahamutExternalreleaseappResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public GetLinkeBahamutExternalreleaseappResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetLinkeBahamutExternalreleaseappResponseBody setResult(java.util.List<GetLinkeBahamutExternalreleaseappResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<GetLinkeBahamutExternalreleaseappResponseBodyResult> getResult() {
        return this.result;
    }

    public static class GetLinkeBahamutExternalreleaseappResponseBodyResult extends TeaModel {
        @NameInMap("ReleaseId")
        public String releaseId;

        @NameInMap("ReleaseRepos")
        public java.util.List<String> releaseRepos;

        public static GetLinkeBahamutExternalreleaseappResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetLinkeBahamutExternalreleaseappResponseBodyResult self = new GetLinkeBahamutExternalreleaseappResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetLinkeBahamutExternalreleaseappResponseBodyResult setReleaseId(String releaseId) {
            this.releaseId = releaseId;
            return this;
        }
        public String getReleaseId() {
            return this.releaseId;
        }

        public GetLinkeBahamutExternalreleaseappResponseBodyResult setReleaseRepos(java.util.List<String> releaseRepos) {
            this.releaseRepos = releaseRepos;
            return this;
        }
        public java.util.List<String> getReleaseRepos() {
            return this.releaseRepos;
        }

    }

}
