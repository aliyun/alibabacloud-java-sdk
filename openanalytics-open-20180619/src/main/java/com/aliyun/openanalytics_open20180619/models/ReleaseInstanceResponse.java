// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openanalytics_open20180619.models;

import com.aliyun.tea.*;

public class ReleaseInstanceResponse extends TeaModel {
    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("ErrorCode")
    @Validation(required = true)
    public String errorCode;

    @NameInMap("ErrorInfo")
    @Validation(required = true)
    public String errorInfo;

    @NameInMap("Result")
    @Validation(required = true)
    public String result;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static ReleaseInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        ReleaseInstanceResponse self = new ReleaseInstanceResponse();
        return TeaModel.build(map, self);
    }

    public ReleaseInstanceResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ReleaseInstanceResponse setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ReleaseInstanceResponse setErrorInfo(String errorInfo) {
        this.errorInfo = errorInfo;
        return this;
    }
    public String getErrorInfo() {
        return this.errorInfo;
    }

    public ReleaseInstanceResponse setResult(String result) {
        this.result = result;
        return this;
    }
    public String getResult() {
        return this.result;
    }

    public ReleaseInstanceResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
