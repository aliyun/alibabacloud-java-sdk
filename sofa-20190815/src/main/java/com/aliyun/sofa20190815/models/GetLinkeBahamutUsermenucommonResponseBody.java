// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutUsermenucommonResponseBody extends TeaModel {
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
    public java.util.List<GetLinkeBahamutUsermenucommonResponseBodyResult> result;

    public static GetLinkeBahamutUsermenucommonResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutUsermenucommonResponseBody self = new GetLinkeBahamutUsermenucommonResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutUsermenucommonResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLinkeBahamutUsermenucommonResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetLinkeBahamutUsermenucommonResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public GetLinkeBahamutUsermenucommonResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetLinkeBahamutUsermenucommonResponseBody setErrorMsgParamsMap(String errorMsgParamsMap) {
        this.errorMsgParamsMap = errorMsgParamsMap;
        return this;
    }
    public String getErrorMsgParamsMap() {
        return this.errorMsgParamsMap;
    }

    public GetLinkeBahamutUsermenucommonResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetLinkeBahamutUsermenucommonResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public GetLinkeBahamutUsermenucommonResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetLinkeBahamutUsermenucommonResponseBody setResult(java.util.List<GetLinkeBahamutUsermenucommonResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<GetLinkeBahamutUsermenucommonResponseBodyResult> getResult() {
        return this.result;
    }

    public static class GetLinkeBahamutUsermenucommonResponseBodyResult extends TeaModel {
        @NameInMap("DisplayName")
        public String displayName;

        @NameInMap("Href")
        public String href;

        @NameInMap("VisitCount")
        public Long visitCount;

        public static GetLinkeBahamutUsermenucommonResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetLinkeBahamutUsermenucommonResponseBodyResult self = new GetLinkeBahamutUsermenucommonResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetLinkeBahamutUsermenucommonResponseBodyResult setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public GetLinkeBahamutUsermenucommonResponseBodyResult setHref(String href) {
            this.href = href;
            return this;
        }
        public String getHref() {
            return this.href;
        }

        public GetLinkeBahamutUsermenucommonResponseBodyResult setVisitCount(Long visitCount) {
            this.visitCount = visitCount;
            return this;
        }
        public Long getVisitCount() {
            return this.visitCount;
        }

    }

}
