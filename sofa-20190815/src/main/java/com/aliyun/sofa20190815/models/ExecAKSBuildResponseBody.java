// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExecAKSBuildResponseBody extends TeaModel {
    @NameInMap("Status")
    public String status;

    @NameInMap("BuildNumber")
    public Long buildNumber;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("AppId")
    public String appId;

    @NameInMap("Message")
    public String message;

    @NameInMap("Token")
    public String token;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultCode")
    public String resultCode;

    public static ExecAKSBuildResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExecAKSBuildResponseBody self = new ExecAKSBuildResponseBody();
        return TeaModel.build(map, self);
    }

    public ExecAKSBuildResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ExecAKSBuildResponseBody setBuildNumber(Long buildNumber) {
        this.buildNumber = buildNumber;
        return this;
    }
    public Long getBuildNumber() {
        return this.buildNumber;
    }

    public ExecAKSBuildResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ExecAKSBuildResponseBody setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public ExecAKSBuildResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ExecAKSBuildResponseBody setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

    public ExecAKSBuildResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public ExecAKSBuildResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

}
