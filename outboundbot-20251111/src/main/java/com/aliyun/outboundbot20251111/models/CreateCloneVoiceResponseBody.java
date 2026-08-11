// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20251111.models;

import com.aliyun.tea.*;

public class CreateCloneVoiceResponseBody extends TeaModel {
    /**
     * <p>The return code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The response data.</p>
     */
    @NameInMap("Data")
    public CreateCloneVoiceResponseBodyData data;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>Instance does not exist. Instance=outb003.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The list of variable values in the error message.</p>
     */
    @NameInMap("Params")
    public java.util.List<String> params;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>019FDAC7-13C5-1B64-A853-999DF105B9EF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static CreateCloneVoiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateCloneVoiceResponseBody self = new CreateCloneVoiceResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateCloneVoiceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateCloneVoiceResponseBody setData(CreateCloneVoiceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateCloneVoiceResponseBodyData getData() {
        return this.data;
    }

    public CreateCloneVoiceResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public CreateCloneVoiceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateCloneVoiceResponseBody setParams(java.util.List<String> params) {
        this.params = params;
        return this;
    }
    public java.util.List<String> getParams() {
        return this.params;
    }

    public CreateCloneVoiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateCloneVoiceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateCloneVoiceResponseBodyData extends TeaModel {
        /**
         * <p>The UUID of the cloned voice.</p>
         * 
         * <strong>example:</strong>
         * <p>4f9a8e2b-6c1d-4a7e-9b3f-2d5c8a1e7b15</p>
         */
        @NameInMap("CloneVoiceId")
        public String cloneVoiceId;

        /**
         * <p>The voice ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cosyvoice-v3-flash-voicebot2-8aa485413eba42089c873eec1f901d64</p>
         */
        @NameInMap("Voice")
        public String voice;

        public static CreateCloneVoiceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateCloneVoiceResponseBodyData self = new CreateCloneVoiceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateCloneVoiceResponseBodyData setCloneVoiceId(String cloneVoiceId) {
            this.cloneVoiceId = cloneVoiceId;
            return this;
        }
        public String getCloneVoiceId() {
            return this.cloneVoiceId;
        }

        public CreateCloneVoiceResponseBodyData setVoice(String voice) {
            this.voice = voice;
            return this;
        }
        public String getVoice() {
            return this.voice;
        }

    }

}
