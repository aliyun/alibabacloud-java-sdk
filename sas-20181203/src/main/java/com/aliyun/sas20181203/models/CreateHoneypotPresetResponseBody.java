// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateHoneypotPresetResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("HoneypotPreset")
    public CreateHoneypotPresetResponseBodyHoneypotPreset honeypotPreset;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static CreateHoneypotPresetResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateHoneypotPresetResponseBody self = new CreateHoneypotPresetResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateHoneypotPresetResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateHoneypotPresetResponseBody setHoneypotPreset(CreateHoneypotPresetResponseBodyHoneypotPreset honeypotPreset) {
        this.honeypotPreset = honeypotPreset;
        return this;
    }
    public CreateHoneypotPresetResponseBodyHoneypotPreset getHoneypotPreset() {
        return this.honeypotPreset;
    }

    public CreateHoneypotPresetResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public CreateHoneypotPresetResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateHoneypotPresetResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateHoneypotPresetResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateHoneypotPresetResponseBodyHoneypotPreset extends TeaModel {
        @NameInMap("HoneypotPresetId")
        public String honeypotPresetId;

        public static CreateHoneypotPresetResponseBodyHoneypotPreset build(java.util.Map<String, ?> map) throws Exception {
            CreateHoneypotPresetResponseBodyHoneypotPreset self = new CreateHoneypotPresetResponseBodyHoneypotPreset();
            return TeaModel.build(map, self);
        }

        public CreateHoneypotPresetResponseBodyHoneypotPreset setHoneypotPresetId(String honeypotPresetId) {
            this.honeypotPresetId = honeypotPresetId;
            return this;
        }
        public String getHoneypotPresetId() {
            return this.honeypotPresetId;
        }

    }

}
