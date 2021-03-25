// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc_white_board20201214.models;

import com.aliyun.tea.*;

public class SetAppDomainNamesResponseBody extends TeaModel {
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

    // 返回结果
    @NameInMap("Result")
    public Boolean result;

    public static SetAppDomainNamesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetAppDomainNamesResponseBody self = new SetAppDomainNamesResponseBody();
        return TeaModel.build(map, self);
    }

    public SetAppDomainNamesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SetAppDomainNamesResponseBody setResponseSuccess(Boolean responseSuccess) {
        this.responseSuccess = responseSuccess;
        return this;
    }
    public Boolean getResponseSuccess() {
        return this.responseSuccess;
    }

    public SetAppDomainNamesResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public SetAppDomainNamesResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public SetAppDomainNamesResponseBody setResult(Boolean result) {
        this.result = result;
        return this;
    }
    public Boolean getResult() {
        return this.result;
    }

}
