// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CheckLinkeBahamutReleasestatusResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Message")
    public String message;

    @NameInMap("ResponseStatusCode")
    public Long responseStatusCode;

    @NameInMap("ErrorMsgParamsMap")
    public String errorMsgParamsMap;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("Result")
    public CheckLinkeBahamutReleasestatusResponseBodyResult result;

    public static CheckLinkeBahamutReleasestatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckLinkeBahamutReleasestatusResponseBody self = new CheckLinkeBahamutReleasestatusResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckLinkeBahamutReleasestatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CheckLinkeBahamutReleasestatusResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CheckLinkeBahamutReleasestatusResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public CheckLinkeBahamutReleasestatusResponseBody setErrorMsgParamsMap(String errorMsgParamsMap) {
        this.errorMsgParamsMap = errorMsgParamsMap;
        return this;
    }
    public String getErrorMsgParamsMap() {
        return this.errorMsgParamsMap;
    }

    public CheckLinkeBahamutReleasestatusResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public CheckLinkeBahamutReleasestatusResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public CheckLinkeBahamutReleasestatusResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public CheckLinkeBahamutReleasestatusResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CheckLinkeBahamutReleasestatusResponseBody setResult(CheckLinkeBahamutReleasestatusResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public CheckLinkeBahamutReleasestatusResponseBodyResult getResult() {
        return this.result;
    }

    public static class CheckLinkeBahamutReleasestatusResponseBodyResult extends TeaModel {
        @NameInMap("ReleaseApplied")
        public Boolean releaseApplied;

        @NameInMap("Ready")
        public Boolean ready;

        @NameInMap("UnitsNotYetReady")
        public java.util.List<String> unitsNotYetReady;

        @NameInMap("AppsNotApplied")
        public java.util.List<String> appsNotApplied;

        public static CheckLinkeBahamutReleasestatusResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            CheckLinkeBahamutReleasestatusResponseBodyResult self = new CheckLinkeBahamutReleasestatusResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public CheckLinkeBahamutReleasestatusResponseBodyResult setReleaseApplied(Boolean releaseApplied) {
            this.releaseApplied = releaseApplied;
            return this;
        }
        public Boolean getReleaseApplied() {
            return this.releaseApplied;
        }

        public CheckLinkeBahamutReleasestatusResponseBodyResult setReady(Boolean ready) {
            this.ready = ready;
            return this;
        }
        public Boolean getReady() {
            return this.ready;
        }

        public CheckLinkeBahamutReleasestatusResponseBodyResult setUnitsNotYetReady(java.util.List<String> unitsNotYetReady) {
            this.unitsNotYetReady = unitsNotYetReady;
            return this;
        }
        public java.util.List<String> getUnitsNotYetReady() {
            return this.unitsNotYetReady;
        }

        public CheckLinkeBahamutReleasestatusResponseBodyResult setAppsNotApplied(java.util.List<String> appsNotApplied) {
            this.appsNotApplied = appsNotApplied;
            return this;
        }
        public java.util.List<String> getAppsNotApplied() {
            return this.appsNotApplied;
        }

    }

}
