// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateHoneypotPresetResponseBody extends TeaModel {
    /**
     * <p>The status code returned. The status code **200** indicates that the request was successful. Other status codes indicate that the request failed. You can identify the cause of the failure based on the status code.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The creation result.</p>
     */
    @NameInMap("HoneypotPreset")
    public CreateHoneypotPresetResponseBodyHoneypotPreset honeypotPreset;

    /**
     * <p>The HTTP status code returned.</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The message returned.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <br>
     * <p>*   **true**: The request was successful.</p>
     * <p>*   **false**: The request failed.</p>
     */
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
        /**
         * <p>The ID of the honeypot template.</p>
         */
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
