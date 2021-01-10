// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutSamecodereporecommendResponseBody extends TeaModel {
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
    public java.util.List<GetLinkeBahamutSamecodereporecommendResponseBodyResult> result;

    public static GetLinkeBahamutSamecodereporecommendResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutSamecodereporecommendResponseBody self = new GetLinkeBahamutSamecodereporecommendResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutSamecodereporecommendResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLinkeBahamutSamecodereporecommendResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetLinkeBahamutSamecodereporecommendResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public GetLinkeBahamutSamecodereporecommendResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetLinkeBahamutSamecodereporecommendResponseBody setErrorMsgParamsMap(String errorMsgParamsMap) {
        this.errorMsgParamsMap = errorMsgParamsMap;
        return this;
    }
    public String getErrorMsgParamsMap() {
        return this.errorMsgParamsMap;
    }

    public GetLinkeBahamutSamecodereporecommendResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetLinkeBahamutSamecodereporecommendResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public GetLinkeBahamutSamecodereporecommendResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetLinkeBahamutSamecodereporecommendResponseBody setResult(java.util.List<GetLinkeBahamutSamecodereporecommendResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<GetLinkeBahamutSamecodereporecommendResponseBodyResult> getResult() {
        return this.result;
    }

    public static class GetLinkeBahamutSamecodereporecommendResponseBodyResult extends TeaModel {
        @NameInMap("AppName")
        public String appName;

        @NameInMap("CodeName")
        public String codeName;

        @NameInMap("CouldPushStage")
        public Boolean couldPushStage;

        @NameInMap("CurrentStageName")
        public String currentStageName;

        @NameInMap("Unit")
        public String unit;

        @NameInMap("Reason")
        public java.util.List<String> reason;

        public static GetLinkeBahamutSamecodereporecommendResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetLinkeBahamutSamecodereporecommendResponseBodyResult self = new GetLinkeBahamutSamecodereporecommendResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetLinkeBahamutSamecodereporecommendResponseBodyResult setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public GetLinkeBahamutSamecodereporecommendResponseBodyResult setCodeName(String codeName) {
            this.codeName = codeName;
            return this;
        }
        public String getCodeName() {
            return this.codeName;
        }

        public GetLinkeBahamutSamecodereporecommendResponseBodyResult setCouldPushStage(Boolean couldPushStage) {
            this.couldPushStage = couldPushStage;
            return this;
        }
        public Boolean getCouldPushStage() {
            return this.couldPushStage;
        }

        public GetLinkeBahamutSamecodereporecommendResponseBodyResult setCurrentStageName(String currentStageName) {
            this.currentStageName = currentStageName;
            return this;
        }
        public String getCurrentStageName() {
            return this.currentStageName;
        }

        public GetLinkeBahamutSamecodereporecommendResponseBodyResult setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

        public GetLinkeBahamutSamecodereporecommendResponseBodyResult setReason(java.util.List<String> reason) {
            this.reason = reason;
            return this;
        }
        public java.util.List<String> getReason() {
            return this.reason;
        }

    }

}
