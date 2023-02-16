// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.viapi20230117.models;

import com.aliyun.tea.*;

public class CancelWaitingAsyncJobResponseBody extends TeaModel {
    @NameInMap("HttpCode")
    public String httpCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static CancelWaitingAsyncJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CancelWaitingAsyncJobResponseBody self = new CancelWaitingAsyncJobResponseBody();
        return TeaModel.build(map, self);
    }

    public CancelWaitingAsyncJobResponseBody setHttpCode(String httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public String getHttpCode() {
        return this.httpCode;
    }

    public CancelWaitingAsyncJobResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CancelWaitingAsyncJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CancelWaitingAsyncJobResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
