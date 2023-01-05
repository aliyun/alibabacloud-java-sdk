// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class ModifyTTSConfigResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("ScriptId")
        public String scriptId;

        @NameInMap("SpeechRate")
        public String speechRate;

        @NameInMap("TTSConfigId")
        public String TTSConfigId;

        @NameInMap("Voice")
        public String voice;

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
