// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutMiscgetreleaseResponseBody extends TeaModel {
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
    public GetLinkeBahamutMiscgetreleaseResponseBodyResult result;

    public static GetLinkeBahamutMiscgetreleaseResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutMiscgetreleaseResponseBody self = new GetLinkeBahamutMiscgetreleaseResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutMiscgetreleaseResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLinkeBahamutMiscgetreleaseResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetLinkeBahamutMiscgetreleaseResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public GetLinkeBahamutMiscgetreleaseResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetLinkeBahamutMiscgetreleaseResponseBody setErrorMsgParamsMap(String errorMsgParamsMap) {
        this.errorMsgParamsMap = errorMsgParamsMap;
        return this;
    }
    public String getErrorMsgParamsMap() {
        return this.errorMsgParamsMap;
    }

    public GetLinkeBahamutMiscgetreleaseResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetLinkeBahamutMiscgetreleaseResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public GetLinkeBahamutMiscgetreleaseResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetLinkeBahamutMiscgetreleaseResponseBody setResult(GetLinkeBahamutMiscgetreleaseResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetLinkeBahamutMiscgetreleaseResponseBodyResult getResult() {
        return this.result;
    }

    public static class GetLinkeBahamutMiscgetreleaseResponseBodyResult extends TeaModel {
        @NameInMap("ReleaseLink")
        public String releaseLink;

        @NameInMap("TicketLink")
        public String ticketLink;

        @NameInMap("AppNames")
        public java.util.List<String> appNames;

        public static GetLinkeBahamutMiscgetreleaseResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetLinkeBahamutMiscgetreleaseResponseBodyResult self = new GetLinkeBahamutMiscgetreleaseResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetLinkeBahamutMiscgetreleaseResponseBodyResult setReleaseLink(String releaseLink) {
            this.releaseLink = releaseLink;
            return this;
        }
        public String getReleaseLink() {
            return this.releaseLink;
        }

        public GetLinkeBahamutMiscgetreleaseResponseBodyResult setTicketLink(String ticketLink) {
            this.ticketLink = ticketLink;
            return this;
        }
        public String getTicketLink() {
            return this.ticketLink;
        }

        public GetLinkeBahamutMiscgetreleaseResponseBodyResult setAppNames(java.util.List<String> appNames) {
            this.appNames = appNames;
            return this;
        }
        public java.util.List<String> getAppNames() {
            return this.appNames;
        }

    }

}
