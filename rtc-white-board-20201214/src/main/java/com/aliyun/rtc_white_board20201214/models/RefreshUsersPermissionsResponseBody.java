// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc_white_board20201214.models;

import com.aliyun.tea.*;

public class RefreshUsersPermissionsResponseBody extends TeaModel {
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
    public RefreshUsersPermissionsResponseBodyResult result;

    public static RefreshUsersPermissionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RefreshUsersPermissionsResponseBody self = new RefreshUsersPermissionsResponseBody();
        return TeaModel.build(map, self);
    }

    public RefreshUsersPermissionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RefreshUsersPermissionsResponseBody setResponseSuccess(Boolean responseSuccess) {
        this.responseSuccess = responseSuccess;
        return this;
    }
    public Boolean getResponseSuccess() {
        return this.responseSuccess;
    }

    public RefreshUsersPermissionsResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public RefreshUsersPermissionsResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public RefreshUsersPermissionsResponseBody setResult(RefreshUsersPermissionsResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public RefreshUsersPermissionsResponseBodyResult getResult() {
        return this.result;
    }

    public static class RefreshUsersPermissionsResponseBodyResult extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Message")
        public String message;

        public static RefreshUsersPermissionsResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            RefreshUsersPermissionsResponseBodyResult self = new RefreshUsersPermissionsResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public RefreshUsersPermissionsResponseBodyResult setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public RefreshUsersPermissionsResponseBodyResult setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

}
