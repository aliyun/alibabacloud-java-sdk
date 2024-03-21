// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20190902.models;

import com.aliyun.tea.*;

public class GetOrderConfirmUrlResponseBody extends TeaModel {
    @NameInMap("ConfirmUrl")
    public String confirmUrl;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetOrderConfirmUrlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetOrderConfirmUrlResponseBody self = new GetOrderConfirmUrlResponseBody();
        return TeaModel.build(map, self);
    }

    public GetOrderConfirmUrlResponseBody setConfirmUrl(String confirmUrl) {
        this.confirmUrl = confirmUrl;
        return this;
    }
    public String getConfirmUrl() {
        return this.confirmUrl;
    }

    public GetOrderConfirmUrlResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetOrderConfirmUrlResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetOrderConfirmUrlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetOrderConfirmUrlResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
