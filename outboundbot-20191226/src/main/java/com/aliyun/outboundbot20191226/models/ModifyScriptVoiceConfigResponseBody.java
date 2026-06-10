// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class ModifyScriptVoiceConfigResponseBody extends TeaModel {
    /**
     * <p>The API status code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The API message.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>254EB995-DEDF-48A4-9101-9CA5B72FFBCC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The voice configuration for the script.</p>
     */
    @NameInMap("ScriptVoiceConfig")
    public ModifyScriptVoiceConfigResponseBodyScriptVoiceConfig scriptVoiceConfig;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ModifyScriptVoiceConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyScriptVoiceConfigResponseBody self = new ModifyScriptVoiceConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyScriptVoiceConfigResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ModifyScriptVoiceConfigResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ModifyScriptVoiceConfigResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ModifyScriptVoiceConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyScriptVoiceConfigResponseBody setScriptVoiceConfig(ModifyScriptVoiceConfigResponseBodyScriptVoiceConfig scriptVoiceConfig) {
        this.scriptVoiceConfig = scriptVoiceConfig;
        return this;
    }
    public ModifyScriptVoiceConfigResponseBodyScriptVoiceConfig getScriptVoiceConfig() {
        return this.scriptVoiceConfig;
    }

    public ModifyScriptVoiceConfigResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ModifyScriptVoiceConfigResponseBodyScriptVoiceConfig extends TeaModel {
        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>bdd49242-114c-4045-b1d1-25ccc1756c75</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The text that corresponds to the audio.</p>
         * 
         * <strong>example:</strong>
         * <p>你好</p>
         */
        @NameInMap("ScriptContent")
        public String scriptContent;

        /**
         * <p>The script ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1d7a26e0-628b-4c3c-9918-7f2e23273f54</p>
         */
        @NameInMap("ScriptId")
        public String scriptId;

        /**
         * <p>The script voice configuration ID.</p>
         * 
         * <strong>example:</strong>
         * <p>4ddea690-6534-4c88-9cbd-0b5882ec64c0</p>
         */
        @NameInMap("ScriptVoiceConfigId")
        public String scriptVoiceConfigId;

        /**
         * <p>Maps script segments to audio recordings.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;ScriptContent&quot;:&quot;你好&quot;,&quot;ScriptWaveformId&quot;:&quot;6facc560-9f25-420f-bb0b-99f4299ad0d5&quot;},{&quot;ScriptContent&quot;:&quot;吗&quot;,&quot;ScriptWaveformId&quot;:&quot;76f48266-e253-4f44-ab4f-f64f7d38f1b4&quot;}]</p>
         */
        @NameInMap("ScriptWaveformRelation")
        public String scriptWaveformRelation;

        /**
         * <p>The script source.</p>
         * 
         * <strong>example:</strong>
         * <p>DIALOGUE_FLOW</p>
         */
        @NameInMap("Source")
        public String source;

        /**
         * <p>The audio source type.</p>
         * 
         * <strong>example:</strong>
         * <p>WAVEFORM</p>
         */
        @NameInMap("Type")
        public String type;

        public static ModifyScriptVoiceConfigResponseBodyScriptVoiceConfig build(java.util.Map<String, ?> map) throws Exception {
            ModifyScriptVoiceConfigResponseBodyScriptVoiceConfig self = new ModifyScriptVoiceConfigResponseBodyScriptVoiceConfig();
            return TeaModel.build(map, self);
        }

        public ModifyScriptVoiceConfigResponseBodyScriptVoiceConfig setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ModifyScriptVoiceConfigResponseBodyScriptVoiceConfig setScriptContent(String scriptContent) {
            this.scriptContent = scriptContent;
            return this;
        }
        public String getScriptContent() {
            return this.scriptContent;
        }

        public ModifyScriptVoiceConfigResponseBodyScriptVoiceConfig setScriptId(String scriptId) {
            this.scriptId = scriptId;
            return this;
        }
        public String getScriptId() {
            return this.scriptId;
        }

        public ModifyScriptVoiceConfigResponseBodyScriptVoiceConfig setScriptVoiceConfigId(String scriptVoiceConfigId) {
            this.scriptVoiceConfigId = scriptVoiceConfigId;
            return this;
        }
        public String getScriptVoiceConfigId() {
            return this.scriptVoiceConfigId;
        }

        public ModifyScriptVoiceConfigResponseBodyScriptVoiceConfig setScriptWaveformRelation(String scriptWaveformRelation) {
            this.scriptWaveformRelation = scriptWaveformRelation;
            return this;
        }
        public String getScriptWaveformRelation() {
            return this.scriptWaveformRelation;
        }

        public ModifyScriptVoiceConfigResponseBodyScriptVoiceConfig setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public ModifyScriptVoiceConfigResponseBodyScriptVoiceConfig setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
