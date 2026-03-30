// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20251111.models;

import com.aliyun.tea.*;

public class PreviewVoiceRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>da37319b-6c83-4268-9f19-814aed62e401</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>Qwen</p>
     */
    @NameInMap("Model")
    public String model;

    /**
     * <strong>example:</strong>
     * <p>MANAGED</p>
     */
    @NameInMap("NlsAccessType")
    public String nlsAccessType;

    /**
     * <strong>example:</strong>
     * <p>BAILIAN</p>
     */
    @NameInMap("NlsEngine")
    public String nlsEngine;

    @NameInMap("Params")
    public PreviewVoiceRequestParams params;

    @NameInMap("Text")
    public String text;

    /**
     * <strong>example:</strong>
     * <p>Cherry</p>
     */
    @NameInMap("Voice")
    public String voice;

    public static PreviewVoiceRequest build(java.util.Map<String, ?> map) throws Exception {
        PreviewVoiceRequest self = new PreviewVoiceRequest();
        return TeaModel.build(map, self);
    }

    public PreviewVoiceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public PreviewVoiceRequest setModel(String model) {
        this.model = model;
        return this;
    }
    public String getModel() {
        return this.model;
    }

    public PreviewVoiceRequest setNlsAccessType(String nlsAccessType) {
        this.nlsAccessType = nlsAccessType;
        return this;
    }
    public String getNlsAccessType() {
        return this.nlsAccessType;
    }

    public PreviewVoiceRequest setNlsEngine(String nlsEngine) {
        this.nlsEngine = nlsEngine;
        return this;
    }
    public String getNlsEngine() {
        return this.nlsEngine;
    }

    public PreviewVoiceRequest setParams(PreviewVoiceRequestParams params) {
        this.params = params;
        return this;
    }
    public PreviewVoiceRequestParams getParams() {
        return this.params;
    }

    public PreviewVoiceRequest setText(String text) {
        this.text = text;
        return this;
    }
    public String getText() {
        return this.text;
    }

    public PreviewVoiceRequest setVoice(String voice) {
        this.voice = voice;
        return this;
    }
    public String getVoice() {
        return this.voice;
    }

    public static class PreviewVoiceRequestParams extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("PitchRate")
        public Float pitchRate;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("SpeechRate")
        public Float speechRate;

        /**
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("Volume")
        public Integer volume;

        public static PreviewVoiceRequestParams build(java.util.Map<String, ?> map) throws Exception {
            PreviewVoiceRequestParams self = new PreviewVoiceRequestParams();
            return TeaModel.build(map, self);
        }

        public PreviewVoiceRequestParams setPitchRate(Float pitchRate) {
            this.pitchRate = pitchRate;
            return this;
        }
        public Float getPitchRate() {
            return this.pitchRate;
        }

        public PreviewVoiceRequestParams setSpeechRate(Float speechRate) {
            this.speechRate = speechRate;
            return this;
        }
        public Float getSpeechRate() {
            return this.speechRate;
        }

        public PreviewVoiceRequestParams setVolume(Integer volume) {
            this.volume = volume;
            return this;
        }
        public Integer getVolume() {
            return this.volume;
        }

    }

}
