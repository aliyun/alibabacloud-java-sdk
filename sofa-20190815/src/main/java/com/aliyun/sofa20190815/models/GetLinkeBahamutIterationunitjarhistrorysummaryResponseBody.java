// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutIterationunitjarhistrorysummaryResponseBody extends TeaModel {
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
    public GetLinkeBahamutIterationunitjarhistrorysummaryResponseBodyResult result;

    public static GetLinkeBahamutIterationunitjarhistrorysummaryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutIterationunitjarhistrorysummaryResponseBody self = new GetLinkeBahamutIterationunitjarhistrorysummaryResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutIterationunitjarhistrorysummaryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLinkeBahamutIterationunitjarhistrorysummaryResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetLinkeBahamutIterationunitjarhistrorysummaryResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public GetLinkeBahamutIterationunitjarhistrorysummaryResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetLinkeBahamutIterationunitjarhistrorysummaryResponseBody setErrorMsgParamsMap(String errorMsgParamsMap) {
        this.errorMsgParamsMap = errorMsgParamsMap;
        return this;
    }
    public String getErrorMsgParamsMap() {
        return this.errorMsgParamsMap;
    }

    public GetLinkeBahamutIterationunitjarhistrorysummaryResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetLinkeBahamutIterationunitjarhistrorysummaryResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public GetLinkeBahamutIterationunitjarhistrorysummaryResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetLinkeBahamutIterationunitjarhistrorysummaryResponseBody setResult(GetLinkeBahamutIterationunitjarhistrorysummaryResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetLinkeBahamutIterationunitjarhistrorysummaryResponseBodyResult getResult() {
        return this.result;
    }

    public static class GetLinkeBahamutIterationunitjarhistrorysummaryResponseBodyResult extends TeaModel {
        @NameInMap("PassedCount")
        public Long passedCount;

        @NameInMap("Total")
        public Long total;

        @NameInMap("JarHistrories")
        public java.util.List<String> jarHistrories;

        public static GetLinkeBahamutIterationunitjarhistrorysummaryResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetLinkeBahamutIterationunitjarhistrorysummaryResponseBodyResult self = new GetLinkeBahamutIterationunitjarhistrorysummaryResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetLinkeBahamutIterationunitjarhistrorysummaryResponseBodyResult setPassedCount(Long passedCount) {
            this.passedCount = passedCount;
            return this;
        }
        public Long getPassedCount() {
            return this.passedCount;
        }

        public GetLinkeBahamutIterationunitjarhistrorysummaryResponseBodyResult setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

        public GetLinkeBahamutIterationunitjarhistrorysummaryResponseBodyResult setJarHistrories(java.util.List<String> jarHistrories) {
            this.jarHistrories = jarHistrories;
            return this;
        }
        public java.util.List<String> getJarHistrories() {
            return this.jarHistrories;
        }

    }

}
