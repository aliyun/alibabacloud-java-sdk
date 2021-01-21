// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc_white_board20201214.models;

import com.aliyun.tea.*;

public class GetWhiteBoardProfileCallbackResponseBody extends TeaModel {
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
    public GetWhiteBoardProfileCallbackResponseBodyResult result;

    public static GetWhiteBoardProfileCallbackResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetWhiteBoardProfileCallbackResponseBody self = new GetWhiteBoardProfileCallbackResponseBody();
        return TeaModel.build(map, self);
    }

    public GetWhiteBoardProfileCallbackResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetWhiteBoardProfileCallbackResponseBody setResponseSuccess(Boolean responseSuccess) {
        this.responseSuccess = responseSuccess;
        return this;
    }
    public Boolean getResponseSuccess() {
        return this.responseSuccess;
    }

    public GetWhiteBoardProfileCallbackResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetWhiteBoardProfileCallbackResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public GetWhiteBoardProfileCallbackResponseBody setResult(GetWhiteBoardProfileCallbackResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetWhiteBoardProfileCallbackResponseBodyResult getResult() {
        return this.result;
    }

    public static class GetWhiteBoardProfileCallbackResponseBodyResult extends TeaModel {
        @NameInMap("Name")
        public String name;

        public static GetWhiteBoardProfileCallbackResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetWhiteBoardProfileCallbackResponseBodyResult self = new GetWhiteBoardProfileCallbackResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetWhiteBoardProfileCallbackResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
