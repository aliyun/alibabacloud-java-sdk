// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class ModifyTTSConfigResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>f765d3ee-ec03-4765-b235-6877501d99d1</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TTSConfig")
    public ModifyTTSConfigResponseBodyTTSConfig TTSConfig;

    public static ModifyTTSConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyTTSConfigResponseBody self = new ModifyTTSConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyTTSConfigResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ModifyTTSConfigResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ModifyTTSConfigResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ModifyTTSConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyTTSConfigResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ModifyTTSConfigResponseBody setTTSConfig(ModifyTTSConfigResponseBodyTTSConfig TTSConfig) {
        this.TTSConfig = TTSConfig;
        return this;
    }
    public ModifyTTSConfigResponseBodyTTSConfig getTTSConfig() {
        return this.TTSConfig;
    }

    public static class ModifyTTSConfigResponseBodyTTSConfig extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>291cfc6a-8703-4bdd-a99d-9cba32d5288a</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>语调
         * [-500,500]之间整数。默认值为0。</p>
         * <p>大于0表示升高音高。</p>
         * <p>小于0表示降低音高。</p>
         */
        @NameInMap("PitchRate")
        public String pitchRate;

        /**
         * <strong>example:</strong>
         * <p>947e0875-b5d4-4b33-b18c-7b2cf85bcb4f</p>
         */
        @NameInMap("ScriptId")
        public String scriptId;

        /**
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("SpeechRate")
        public String speechRate;

        /**
         * <strong>example:</strong>
         * <p>2a07b634-e15d-445f-bbcb-fc4ea2df7b87</p>
         */
        @NameInMap("TTSConfigId")
        public String TTSConfigId;

        /**
         * <strong>example:</strong>
         * <p>xiaoyun</p>
         */
        @NameInMap("Voice")
        public String voice;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Volume")
        public String volume;

        public static ModifyTTSConfigResponseBodyTTSConfig build(java.util.Map<String, ?> map) throws Exception {
            ModifyTTSConfigResponseBodyTTSConfig self = new ModifyTTSConfigResponseBodyTTSConfig();
            return TeaModel.build(map, self);
        }

        public ModifyTTSConfigResponseBodyTTSConfig setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ModifyTTSConfigResponseBodyTTSConfig setPitchRate(String pitchRate) {
            this.pitchRate = pitchRate;
            return this;
        }
        public String getPitchRate() {
            return this.pitchRate;
        }

        public ModifyTTSConfigResponseBodyTTSConfig setScriptId(String scriptId) {
            this.scriptId = scriptId;
            return this;
        }
        public String getScriptId() {
            return this.scriptId;
        }

        public ModifyTTSConfigResponseBodyTTSConfig setSpeechRate(String speechRate) {
            this.speechRate = speechRate;
            return this;
        }
        public String getSpeechRate() {
            return this.speechRate;
        }

        public ModifyTTSConfigResponseBodyTTSConfig setTTSConfigId(String TTSConfigId) {
            this.TTSConfigId = TTSConfigId;
            return this;
        }
        public String getTTSConfigId() {
            return this.TTSConfigId;
        }

        public ModifyTTSConfigResponseBodyTTSConfig setVoice(String voice) {
            this.voice = voice;
            return this;
        }
        public String getVoice() {
            return this.voice;
        }

        public ModifyTTSConfigResponseBodyTTSConfig setVolume(String volume) {
            this.volume = volume;
            return this;
        }
        public String getVolume() {
            return this.volume;
        }

    }

}
