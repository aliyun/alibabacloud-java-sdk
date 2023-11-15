// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class SbrainServiceHasRunningTaskBatchQueryResponseBody extends TeaModel {
    @NameInMap("Data")
    public Object data;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static SbrainServiceHasRunningTaskBatchQueryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SbrainServiceHasRunningTaskBatchQueryResponseBody self = new SbrainServiceHasRunningTaskBatchQueryResponseBody();
        return TeaModel.build(map, self);
    }

    public SbrainServiceHasRunningTaskBatchQueryResponseBody setData(Object data) {
        this.data = data;
        return this;
    }
    public Object getData() {
        return this.data;
    }

    public SbrainServiceHasRunningTaskBatchQueryResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public SbrainServiceHasRunningTaskBatchQueryResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public SbrainServiceHasRunningTaskBatchQueryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SbrainServiceHasRunningTaskBatchQueryResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
