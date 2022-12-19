// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class OpenSensitiveFileScanResponseBody extends TeaModel {
    // The status code returned. The status code **200** indicates that the request was successful. Other status codes indicate that the request failed. You can identify the cause of the failure based on the status code.
    @NameInMap("Code")
    public String code;

    // The data.
    @NameInMap("Data")
    public OpenSensitiveFileScanResponseBodyData data;

    // The HTTP status code returned.
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    // The error message returned.
    @NameInMap("Message")
    public String message;

    // The ID of the request, which is used to locate and troubleshoot issues.
    @NameInMap("RequestId")
    public String requestId;

    // Indicates whether the request was successful. Valid values:
    // 
    // *   **true**: The request was successful.
    // *   **false**: The request failed.
    @NameInMap("Success")
    public Boolean success;

    public static OpenSensitiveFileScanResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OpenSensitiveFileScanResponseBody self = new OpenSensitiveFileScanResponseBody();
        return TeaModel.build(map, self);
    }

    public OpenSensitiveFileScanResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public OpenSensitiveFileScanResponseBody setData(OpenSensitiveFileScanResponseBodyData data) {
        this.data = data;
        return this;
    }
    public OpenSensitiveFileScanResponseBodyData getData() {
        return this.data;
    }

    public OpenSensitiveFileScanResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public OpenSensitiveFileScanResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public OpenSensitiveFileScanResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public OpenSensitiveFileScanResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class OpenSensitiveFileScanResponseBodyData extends TeaModel {
        // Indicates whether sensitive file scan is enabled or disabled. Valid values:
        // 
        // *   **on**: enabled
        // *   **off**: disabled
        @NameInMap("SwitchOn")
        public String switchOn;

        public static OpenSensitiveFileScanResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            OpenSensitiveFileScanResponseBodyData self = new OpenSensitiveFileScanResponseBodyData();
            return TeaModel.build(map, self);
        }

        public OpenSensitiveFileScanResponseBodyData setSwitchOn(String switchOn) {
            this.switchOn = switchOn;
            return this;
        }
        public String getSwitchOn() {
            return this.switchOn;
        }

    }

}
