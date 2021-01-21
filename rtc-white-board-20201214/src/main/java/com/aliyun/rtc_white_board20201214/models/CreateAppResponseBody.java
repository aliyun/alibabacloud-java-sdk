// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc_white_board20201214.models;

import com.aliyun.tea.*;

public class CreateAppResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResponseSuccess")
    public Boolean responseSuccess;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMsg")
    public String errorMsg;

    @NameInMap("Result")
    public CreateAppResponseBodyResult result;

    public static CreateAppResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAppResponseBody self = new CreateAppResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAppResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateAppResponseBody setResponseSuccess(Boolean responseSuccess) {
        this.responseSuccess = responseSuccess;
        return this;
    }
    public Boolean getResponseSuccess() {
        return this.responseSuccess;
    }

    public CreateAppResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public CreateAppResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public CreateAppResponseBody setResult(CreateAppResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public CreateAppResponseBodyResult getResult() {
        return this.result;
    }

    public static class CreateAppResponseBodyResult extends TeaModel {
        @NameInMap("AppID")
        public String appID;

        public static CreateAppResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            CreateAppResponseBodyResult self = new CreateAppResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public CreateAppResponseBodyResult setAppID(String appID) {
            this.appID = appID;
            return this;
        }
        public String getAppID() {
            return this.appID;
        }

    }

}
