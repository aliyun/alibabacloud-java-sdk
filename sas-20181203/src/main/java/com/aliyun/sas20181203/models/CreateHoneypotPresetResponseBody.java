// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateHoneypotPresetResponseBody extends TeaModel {
    /**
     * <p>The status code returned. The status code <strong>200</strong> indicates that the request was successful. Other status codes indicate that the request failed. You can identify the cause of the failure based on the status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
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
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The message returned.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>7C1C6E65-C8B9-54C9-9F92-2F5E51C4E16D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The request was successful.</li>
     * <li><strong>false</strong>: The request failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
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
         * 
         * <strong>example:</strong>
         * <p>d6ece172-34d9-4942-99a4-b309cb55xxxx</p>
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
