// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateHoneypotProbeResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("HoneypotProbe")
    public CreateHoneypotProbeResponseBodyHoneypotProbe honeypotProbe;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

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
