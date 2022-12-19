// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class InstallCloudMonitorResponseBody extends TeaModel {
    // The error code returned if the request fails.
    @NameInMap("Code")
    public String code;

    // The HTTP status code returned.
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    // The error message returned.
    @NameInMap("Message")
    public String message;

    // The ID of the request, which is used to locate and troubleshoot issues.
    @NameInMap("RequestId")
    public String requestId;

    // Indicates whether the request is successful. Valid values:
    // 
    // *   **true**: yes
    // *   **false**: no
    @NameInMap("Success")
    public Boolean success;

    public static InstallCloudMonitorResponseBody build(java.util.Map<String, ?> map) throws Exception {
        InstallCloudMonitorResponseBody self = new InstallCloudMonitorResponseBody();
        return TeaModel.build(map, self);
    }

    public InstallCloudMonitorResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public InstallCloudMonitorResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public InstallCloudMonitorResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public InstallCloudMonitorResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public InstallCloudMonitorResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
