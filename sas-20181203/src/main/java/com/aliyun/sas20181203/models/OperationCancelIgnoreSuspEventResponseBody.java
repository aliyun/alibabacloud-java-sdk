// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class OperationCancelIgnoreSuspEventResponseBody extends TeaModel {
    // The status code returned. The status code **200** indicates that the request was is successful. Other status codes indicate that the request fails. You can identify the cause of the failure based on the status code.
    @NameInMap("Code")
    public String code;

    // The HTTP status code.
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    // The error message returned.
    @NameInMap("Message")
    public String message;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // The handling result of an exception. Valid values:
    // 
    // *   **true**: successful
    // *   **false**: failed
    @NameInMap("Success")
    public Boolean success;

    // The time consumed for the request. Unit: seconds.
    @NameInMap("TimeCost")
    public Long timeCost;

    public static OperationCancelIgnoreSuspEventResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OperationCancelIgnoreSuspEventResponseBody self = new OperationCancelIgnoreSuspEventResponseBody();
        return TeaModel.build(map, self);
    }

    public OperationCancelIgnoreSuspEventResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public OperationCancelIgnoreSuspEventResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public OperationCancelIgnoreSuspEventResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public OperationCancelIgnoreSuspEventResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public OperationCancelIgnoreSuspEventResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public OperationCancelIgnoreSuspEventResponseBody setTimeCost(Long timeCost) {
        this.timeCost = timeCost;
        return this;
    }
    public Long getTimeCost() {
        return this.timeCost;
    }

}
