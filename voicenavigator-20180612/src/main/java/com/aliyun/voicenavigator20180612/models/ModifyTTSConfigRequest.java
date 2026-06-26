// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20180612.models;

import com.aliyun.tea.*;

public class ModifyTTSConfigRequest extends TeaModel {
    /**
     * <p>The personalized custom voice ID.</p>
     * 
     * <strong>example:</strong>
     * <p>dc458bba-5a25-4cbc-b5c2</p>
     */
    @NameInMap("AliCustomizedVoice")
    public String aliCustomizedVoice;

    /**
     * <p>The AppKey of the third-party voice configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>5b358afc</p>
     */
    @NameInMap("AppKey")
    public String appKey;

    /**
     * <p>The TTS engine.</p>
     * 
     * <strong>example:</strong>
     * <p>bailian</p>
     */
    @NameInMap("Engine")
    public String engine;

    /**
     * <p>The iFLYTEK engine parameters.</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;Voice\&quot;:\&quot;aisjinger\&quot;}</p>
     */
    @NameInMap("EngineXunfei")
    public String engineXunfei;

    @NameInMap("ExtParams")
    public String extParams;

    /**
     * <p>The scenario ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>8a9bdaa895a748528a15b50c281e6474</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The TTS service invoke type.</p>
     * 
     * <strong>example:</strong>
     * <p>Managed</p>
     */
    @NameInMap("NlsServiceType")
    public String nlsServiceType;

    /**
     * <p>The pitch rate.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("PitchRate")
    public String pitchRate;

    /**
     * <p>The speech rate.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("SpeechRate")
    public String speechRate;

    /**
     * <p>The TTS error correction dictionary.</p>
     * 
     * <strong>example:</strong>
     * <p>[{\&quot;pronunciation\&quot;:\&quot;环钱\&quot;,\&quot;word\&quot;:\&quot;还钱\&quot;}]</p>
     */
    @NameInMap("TtsOverrides")
    public String ttsOverrides;

    /**
     * <p>The voice.</p>
     * 
     * <strong>example:</strong>
     * <p>aixia</p>
     */
    @NameInMap("Voice")
    public String voice;

    /**
     * <p>The volume.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("Volume")
    public String volume;

    public static ModifyTTSConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyTTSConfigRequest self = new ModifyTTSConfigRequest();
        return TeaModel.build(map, self);
    }

    public ModifyTTSConfigRequest setAliCustomizedVoice(String aliCustomizedVoice) {
        this.aliCustomizedVoice = aliCustomizedVoice;
        return this;
    }
    public String getAliCustomizedVoice() {
        return this.aliCustomizedVoice;
    }

    public ModifyTTSConfigRequest setAppKey(String appKey) {
        this.appKey = appKey;
        return this;
    }
    public String getAppKey() {
        return this.appKey;
    }

    public ModifyTTSConfigRequest setEngine(String engine) {
        this.engine = engine;
        return this;
    }
    public String getEngine() {
        return this.engine;
    }

    public ModifyTTSConfigRequest setEngineXunfei(String engineXunfei) {
        this.engineXunfei = engineXunfei;
        return this;
    }
    public String getEngineXunfei() {
        return this.engineXunfei;
    }

    public ModifyTTSConfigRequest setExtParams(String extParams) {
        this.extParams = extParams;
        return this;
    }
    public String getExtParams() {
        return this.extParams;
    }

    public ModifyTTSConfigRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyTTSConfigRequest setNlsServiceType(String nlsServiceType) {
        this.nlsServiceType = nlsServiceType;
        return this;
    }
    public String getNlsServiceType() {
        return this.nlsServiceType;
    }

    public ModifyTTSConfigRequest setPitchRate(String pitchRate) {
        this.pitchRate = pitchRate;
        return this;
    }
    public String getPitchRate() {
        return this.pitchRate;
    }

    public ModifyTTSConfigRequest setSpeechRate(String speechRate) {
        this.speechRate = speechRate;
        return this;
    }
    public String getSpeechRate() {
        return this.speechRate;
    }

    public ModifyTTSConfigRequest setTtsOverrides(String ttsOverrides) {
        this.ttsOverrides = ttsOverrides;
        return this;
    }
    public String getTtsOverrides() {
        return this.ttsOverrides;
    }

    public ModifyTTSConfigRequest setVoice(String voice) {
        this.voice = voice;
        return this;
    }
    public String getVoice() {
        return this.voice;
    }

    public ModifyTTSConfigRequest setVolume(String volume) {
        this.volume = volume;
        return this;
    }
    public String getVolume() {
        return this.volume;
    }

}
