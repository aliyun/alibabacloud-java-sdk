// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CheckUserHasEcsResponseBody extends TeaModel {
    // The status code returned. The status code **200** indicates that the request is successful. Other status codes indicate that the request fails. You can identify the cause of the failure based on the status code.
    @NameInMap("Code")
    public String code;

    // Indicates whether ECS instances exist. Valid values:
    // 
    // *   **true**: yes
    // *   **false**: no
    @NameInMap("Data")
    public Boolean data;

    // The error message returned.
    @NameInMap("Message")
    public String message;

    // The ID of the request, which is used to locate and troubleshoot issues.
    @NameInMap("RequestId")
    public String requestId;

    // The status of the request. Valid values:
    // 
    // *   **true**: The request is successful.
    // *   **false**: The request fails.
    @NameInMap("Success")
    public Boolean success;

    public static CheckUserHasEcsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckUserHasEcsResponseBody self = new CheckUserHasEcsResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckUserHasEcsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CheckUserHasEcsResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

    public CheckUserHasEcsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CheckUserHasEcsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CheckUserHasEcsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
