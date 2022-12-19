// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateHoneypotProbeResponseBody extends TeaModel {
    // The status code returned. The status code **200** indicates that the request was successful. Other status codes indicate that the request failed. You can identify the cause of the failure based on the status code.
    @NameInMap("Code")
    public String code;

    @NameInMap("HoneypotProbe")
    public CreateHoneypotProbeResponseBodyHoneypotProbe honeypotProbe;

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

    public static CreateHoneypotProbeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateHoneypotProbeResponseBody self = new CreateHoneypotProbeResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateHoneypotProbeResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateHoneypotProbeResponseBody setHoneypotProbe(CreateHoneypotProbeResponseBodyHoneypotProbe honeypotProbe) {
        this.honeypotProbe = honeypotProbe;
        return this;
    }
    public CreateHoneypotProbeResponseBodyHoneypotProbe getHoneypotProbe() {
        return this.honeypotProbe;
    }

    public CreateHoneypotProbeResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public CreateHoneypotProbeResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateHoneypotProbeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateHoneypotProbeResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateHoneypotProbeResponseBodyHoneypotProbe extends TeaModel {
        @NameInMap("ProbeId")
        public String probeId;

        public static CreateHoneypotProbeResponseBodyHoneypotProbe build(java.util.Map<String, ?> map) throws Exception {
            CreateHoneypotProbeResponseBodyHoneypotProbe self = new CreateHoneypotProbeResponseBodyHoneypotProbe();
            return TeaModel.build(map, self);
        }

        public CreateHoneypotProbeResponseBodyHoneypotProbe setProbeId(String probeId) {
            this.probeId = probeId;
            return this;
        }
        public String getProbeId() {
            return this.probeId;
        }

    }

}
