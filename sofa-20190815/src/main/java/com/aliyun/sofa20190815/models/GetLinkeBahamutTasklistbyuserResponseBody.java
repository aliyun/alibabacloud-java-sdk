// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutTasklistbyuserResponseBody extends TeaModel {
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
    public GetLinkeBahamutTasklistbyuserResponseBodyResult result;

    public static GetLinkeBahamutTasklistbyuserResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutTasklistbyuserResponseBody self = new GetLinkeBahamutTasklistbyuserResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutTasklistbyuserResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLinkeBahamutTasklistbyuserResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetLinkeBahamutTasklistbyuserResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public GetLinkeBahamutTasklistbyuserResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetLinkeBahamutTasklistbyuserResponseBody setErrorMsgParamsMap(String errorMsgParamsMap) {
        this.errorMsgParamsMap = errorMsgParamsMap;
        return this;
    }
    public String getErrorMsgParamsMap() {
        return this.errorMsgParamsMap;
    }

    public GetLinkeBahamutTasklistbyuserResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetLinkeBahamutTasklistbyuserResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public GetLinkeBahamutTasklistbyuserResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetLinkeBahamutTasklistbyuserResponseBody setResult(GetLinkeBahamutTasklistbyuserResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetLinkeBahamutTasklistbyuserResponseBodyResult getResult() {
        return this.result;
    }

    public static class GetLinkeBahamutTasklistbyuserResponseBodyResult extends TeaModel {
        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("Pager")
        public String pager;

        @NameInMap("Success")
        public Boolean success;

        @NameInMap("Data")
        public java.util.List<String> data;

        public static GetLinkeBahamutTasklistbyuserResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetLinkeBahamutTasklistbyuserResponseBodyResult self = new GetLinkeBahamutTasklistbyuserResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetLinkeBahamutTasklistbyuserResponseBodyResult setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public GetLinkeBahamutTasklistbyuserResponseBodyResult setPager(String pager) {
            this.pager = pager;
            return this;
        }
        public String getPager() {
            return this.pager;
        }

        public GetLinkeBahamutTasklistbyuserResponseBodyResult setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public GetLinkeBahamutTasklistbyuserResponseBodyResult setData(java.util.List<String> data) {
            this.data = data;
            return this;
        }
        public java.util.List<String> getData() {
            return this.data;
        }

    }

}
