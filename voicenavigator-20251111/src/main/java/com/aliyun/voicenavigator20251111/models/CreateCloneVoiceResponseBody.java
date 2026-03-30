// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20251111.models;

import com.aliyun.tea.*;

public class CreateCloneVoiceResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public CreateCloneVoiceResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>Instance af81a389-91f0-4157-8d82-720edd02b66a
     *  does not exist.</p>
     */
    @NameInMap("Message")
    public String message;

    @NameInMap("Params")
    public java.util.List<String> params;

    /**
     * <strong>example:</strong>
     * <p>F132DDBA-66C4-5BD3-BF7E-9642FE877158</p>
     */
    @NameInMap("RequestId")
    public String requestId;

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

    public static class CreateCloneVoiceResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>8ee1160a-6999-478f-8df6-f33ef21f27d5</p>
         */
        @NameInMap("CloneVoiceId")
        public String cloneVoiceId;

        /**
         * <strong>example:</strong>
         * <p>cosyvoice-v3-plus-voicebot2-3666e4bbb2b94832ac4f4107b5804c34</p>
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
