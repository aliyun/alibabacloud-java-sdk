// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openanalytics_open20180619.models;

import com.aliyun.tea.*;

public class UpgradeInstanceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ErrorInfo")
    public String errorInfo;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Result")
    public String result;

    public static UpgradeInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpgradeInstanceResponseBody self = new UpgradeInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public UpgradeInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpgradeInstanceResponseBody setErrorInfo(String errorInfo) {
        this.errorInfo = errorInfo;
        return this;
    }
    public String getErrorInfo() {
        return this.errorInfo;
    }

    public UpgradeInstanceResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public UpgradeInstanceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public UpgradeInstanceResponseBody setResult(String result) {
        this.result = result;
        return this;
    }
    public String getResult() {
        return this.result;
    }

}
