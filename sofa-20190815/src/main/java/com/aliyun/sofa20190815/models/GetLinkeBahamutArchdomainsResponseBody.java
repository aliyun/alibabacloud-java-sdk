// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutArchdomainsResponseBody extends TeaModel {
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
    public GetLinkeBahamutArchdomainsResponseBodyResult result;

    public static GetLinkeBahamutArchdomainsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutArchdomainsResponseBody self = new GetLinkeBahamutArchdomainsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutArchdomainsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLinkeBahamutArchdomainsResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetLinkeBahamutArchdomainsResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public GetLinkeBahamutArchdomainsResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetLinkeBahamutArchdomainsResponseBody setErrorMsgParamsMap(String errorMsgParamsMap) {
        this.errorMsgParamsMap = errorMsgParamsMap;
        return this;
    }
    public String getErrorMsgParamsMap() {
        return this.errorMsgParamsMap;
    }

    public GetLinkeBahamutArchdomainsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetLinkeBahamutArchdomainsResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public GetLinkeBahamutArchdomainsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetLinkeBahamutArchdomainsResponseBody setResult(GetLinkeBahamutArchdomainsResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetLinkeBahamutArchdomainsResponseBodyResult getResult() {
        return this.result;
    }

    public static class GetLinkeBahamutArchdomainsResponseBodyResult extends TeaModel {
        @NameInMap("AppNum")
        public String appNum;

        @NameInMap("Description")
        public String description;

        @NameInMap("ExternalId")
        public String externalId;

        @NameInMap("IterationNum")
        public String iterationNum;

        @NameInMap("Name")
        public String name;

        public static GetLinkeBahamutArchdomainsResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetLinkeBahamutArchdomainsResponseBodyResult self = new GetLinkeBahamutArchdomainsResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetLinkeBahamutArchdomainsResponseBodyResult setAppNum(String appNum) {
            this.appNum = appNum;
            return this;
        }
        public String getAppNum() {
            return this.appNum;
        }

        public GetLinkeBahamutArchdomainsResponseBodyResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetLinkeBahamutArchdomainsResponseBodyResult setExternalId(String externalId) {
            this.externalId = externalId;
            return this;
        }
        public String getExternalId() {
            return this.externalId;
        }

        public GetLinkeBahamutArchdomainsResponseBodyResult setIterationNum(String iterationNum) {
            this.iterationNum = iterationNum;
            return this;
        }
        public String getIterationNum() {
            return this.iterationNum;
        }

        public GetLinkeBahamutArchdomainsResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
