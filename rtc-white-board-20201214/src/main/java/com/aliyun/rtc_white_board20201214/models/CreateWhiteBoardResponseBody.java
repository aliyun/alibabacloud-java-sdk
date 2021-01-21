// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc_white_board20201214.models;

import com.aliyun.tea.*;

public class CreateWhiteBoardResponseBody extends TeaModel {
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
    public CreateWhiteBoardResponseBodyResult result;

    public static CreateWhiteBoardResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateWhiteBoardResponseBody self = new CreateWhiteBoardResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateWhiteBoardResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateWhiteBoardResponseBody setResponseSuccess(Boolean responseSuccess) {
        this.responseSuccess = responseSuccess;
        return this;
    }
    public Boolean getResponseSuccess() {
        return this.responseSuccess;
    }

    public CreateWhiteBoardResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public CreateWhiteBoardResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public CreateWhiteBoardResponseBody setResult(CreateWhiteBoardResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public CreateWhiteBoardResponseBodyResult getResult() {
        return this.result;
    }

    public static class CreateWhiteBoardResponseBodyResult extends TeaModel {
        @NameInMap("DocKey")
        public String docKey;

        public static CreateWhiteBoardResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            CreateWhiteBoardResponseBodyResult self = new CreateWhiteBoardResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public CreateWhiteBoardResponseBodyResult setDocKey(String docKey) {
            this.docKey = docKey;
            return this;
        }
        public String getDocKey() {
            return this.docKey;
        }

    }

}
