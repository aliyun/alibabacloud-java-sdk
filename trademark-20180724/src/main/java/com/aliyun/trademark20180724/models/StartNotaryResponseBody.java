// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class StartNotaryResponseBody extends TeaModel {
    @NameInMap("ErrorMsg")
    public String errorMsg;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("NotaryUrl")
    public String notaryUrl;

    @NameInMap("ErrorCode")
    public String errorCode;

    public static StartNotaryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StartNotaryResponseBody self = new StartNotaryResponseBody();
        return TeaModel.build(map, self);
    }

    public StartNotaryResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public StartNotaryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public StartNotaryResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public StartNotaryResponseBody setNotaryUrl(String notaryUrl) {
        this.notaryUrl = notaryUrl;
        return this;
    }
    public String getNotaryUrl() {
        return this.notaryUrl;
    }

    public StartNotaryResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

}
