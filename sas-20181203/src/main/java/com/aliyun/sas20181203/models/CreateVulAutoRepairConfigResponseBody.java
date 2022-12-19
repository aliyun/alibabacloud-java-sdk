// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateVulAutoRepairConfigResponseBody extends TeaModel {
    // The status code returned. The status code **200** indicates that the request was is successful. Other status codes indicate that the request fails. You can identify the cause of the failure based on the status code.
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

    public static CreateVulAutoRepairConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateVulAutoRepairConfigResponseBody self = new CreateVulAutoRepairConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateVulAutoRepairConfigResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateVulAutoRepairConfigResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public CreateVulAutoRepairConfigResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateVulAutoRepairConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateVulAutoRepairConfigResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
