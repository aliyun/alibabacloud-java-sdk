// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc_white_board20201214.models;

import com.aliyun.tea.*;

public class CreateWhiteBoardResponseBody extends TeaModel {
    // 请求ID
    @NameInMap("RequestId")
    public String requestId;

    // 请求结果
    @NameInMap("ResponseSuccess")
    public Boolean responseSuccess;

    // 错误码
    @NameInMap("ErrorCode")
    public String errorCode;

    // 错误信息
    @NameInMap("ErrorMsg")
    public String errorMsg;

    // 返回结果体
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
        // 文档唯一标识符，由大小写字母和数字组成
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
