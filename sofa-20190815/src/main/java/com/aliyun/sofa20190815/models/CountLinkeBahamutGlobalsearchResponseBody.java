// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CountLinkeBahamutGlobalsearchResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Message")
    public String message;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("Result")
    public CountLinkeBahamutGlobalsearchResponseBodyResult result;

    public static CountLinkeBahamutGlobalsearchResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CountLinkeBahamutGlobalsearchResponseBody self = new CountLinkeBahamutGlobalsearchResponseBody();
        return TeaModel.build(map, self);
    }

    public CountLinkeBahamutGlobalsearchResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CountLinkeBahamutGlobalsearchResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CountLinkeBahamutGlobalsearchResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public CountLinkeBahamutGlobalsearchResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public CountLinkeBahamutGlobalsearchResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public CountLinkeBahamutGlobalsearchResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CountLinkeBahamutGlobalsearchResponseBody setResult(CountLinkeBahamutGlobalsearchResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public CountLinkeBahamutGlobalsearchResponseBodyResult getResult() {
        return this.result;
    }

    public static class CountLinkeBahamutGlobalsearchResponseBodyResult extends TeaModel {
        @NameInMap("Apps")
        public Long apps;

        @NameInMap("Iterations")
        public Long iterations;

        @NameInMap("Releases")
        public Long releases;

        @NameInMap("IterationUnits")
        public Long iterationUnits;

        public static CountLinkeBahamutGlobalsearchResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            CountLinkeBahamutGlobalsearchResponseBodyResult self = new CountLinkeBahamutGlobalsearchResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public CountLinkeBahamutGlobalsearchResponseBodyResult setApps(Long apps) {
            this.apps = apps;
            return this;
        }
        public Long getApps() {
            return this.apps;
        }

        public CountLinkeBahamutGlobalsearchResponseBodyResult setIterations(Long iterations) {
            this.iterations = iterations;
            return this;
        }
        public Long getIterations() {
            return this.iterations;
        }

        public CountLinkeBahamutGlobalsearchResponseBodyResult setReleases(Long releases) {
            this.releases = releases;
            return this;
        }
        public Long getReleases() {
            return this.releases;
        }

        public CountLinkeBahamutGlobalsearchResponseBodyResult setIterationUnits(Long iterationUnits) {
            this.iterationUnits = iterationUnits;
            return this;
        }
        public Long getIterationUnits() {
            return this.iterationUnits;
        }

    }

}
