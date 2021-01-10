// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutSearchcountResponseBody extends TeaModel {
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
    public GetLinkeBahamutSearchcountResponseBodyResult result;

    public static GetLinkeBahamutSearchcountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutSearchcountResponseBody self = new GetLinkeBahamutSearchcountResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutSearchcountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLinkeBahamutSearchcountResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetLinkeBahamutSearchcountResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public GetLinkeBahamutSearchcountResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetLinkeBahamutSearchcountResponseBody setErrorMsgParamsMap(String errorMsgParamsMap) {
        this.errorMsgParamsMap = errorMsgParamsMap;
        return this;
    }
    public String getErrorMsgParamsMap() {
        return this.errorMsgParamsMap;
    }

    public GetLinkeBahamutSearchcountResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetLinkeBahamutSearchcountResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public GetLinkeBahamutSearchcountResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetLinkeBahamutSearchcountResponseBody setResult(GetLinkeBahamutSearchcountResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetLinkeBahamutSearchcountResponseBodyResult getResult() {
        return this.result;
    }

    public static class GetLinkeBahamutSearchcountResponseBodyResult extends TeaModel {
        @NameInMap("Apps")
        public Long apps;

        @NameInMap("Iterations")
        public Long iterations;

        @NameInMap("IterationUnits")
        public Long iterationUnits;

        @NameInMap("Releases")
        public Long releases;

        public static GetLinkeBahamutSearchcountResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetLinkeBahamutSearchcountResponseBodyResult self = new GetLinkeBahamutSearchcountResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetLinkeBahamutSearchcountResponseBodyResult setApps(Long apps) {
            this.apps = apps;
            return this;
        }
        public Long getApps() {
            return this.apps;
        }

        public GetLinkeBahamutSearchcountResponseBodyResult setIterations(Long iterations) {
            this.iterations = iterations;
            return this;
        }
        public Long getIterations() {
            return this.iterations;
        }

        public GetLinkeBahamutSearchcountResponseBodyResult setIterationUnits(Long iterationUnits) {
            this.iterationUnits = iterationUnits;
            return this;
        }
        public Long getIterationUnits() {
            return this.iterationUnits;
        }

        public GetLinkeBahamutSearchcountResponseBodyResult setReleases(Long releases) {
            this.releases = releases;
            return this;
        }
        public Long getReleases() {
            return this.releases;
        }

    }

}
