// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20180612.models;

import com.aliyun.tea.*;

public class DescribeTTSConfigResponseBody extends TeaModel {
    /**
     * <p>The custom voice ID.</p>
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
     * <p>0</p>
     */
    @NameInMap("PitchRate")
    public Integer pitchRate;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>F132DDBA-66C4-5BD3-BF7E-9642FE877158</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The speech rate.</p>
     * 
     * <strong>example:</strong>
     * <p>-150</p>
     */
    @NameInMap("SpeechRate")
    public Integer speechRate;

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
    public Integer volume;

    public static DescribeTTSConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeTTSConfigResponseBody self = new DescribeTTSConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeTTSConfigResponseBody setAliCustomizedVoice(String aliCustomizedVoice) {
        this.aliCustomizedVoice = aliCustomizedVoice;
        return this;
    }
    public String getAliCustomizedVoice() {
        return this.aliCustomizedVoice;
    }

    public DescribeTTSConfigResponseBody setAppKey(String appKey) {
        this.appKey = appKey;
        return this;
    }
    public String getAppKey() {
        return this.appKey;
    }

    public DescribeTTSConfigResponseBody setEngine(String engine) {
        this.engine = engine;
        return this;
    }
    public String getEngine() {
        return this.engine;
    }

    public DescribeTTSConfigResponseBody setEngineXunfei(String engineXunfei) {
        this.engineXunfei = engineXunfei;
        return this;
    }
    public String getEngineXunfei() {
        return this.engineXunfei;
    }

    public DescribeTTSConfigResponseBody setExtParams(String extParams) {
        this.extParams = extParams;
        return this;
    }
    public String getExtParams() {
        return this.extParams;
    }

    public DescribeTTSConfigResponseBody setNlsServiceType(String nlsServiceType) {
        this.nlsServiceType = nlsServiceType;
        return this;
    }
    public String getNlsServiceType() {
        return this.nlsServiceType;
    }

    public DescribeTTSConfigResponseBody setPitchRate(Integer pitchRate) {
        this.pitchRate = pitchRate;
        return this;
    }
    public Integer getPitchRate() {
        return this.pitchRate;
    }

    public DescribeTTSConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeTTSConfigResponseBody setSpeechRate(Integer speechRate) {
        this.speechRate = speechRate;
        return this;
    }
    public Integer getSpeechRate() {
        return this.speechRate;
    }

    public DescribeTTSConfigResponseBody setTtsOverrides(String ttsOverrides) {
        this.ttsOverrides = ttsOverrides;
        return this;
    }
    public String getTtsOverrides() {
        return this.ttsOverrides;
    }

    public DescribeTTSConfigResponseBody setVoice(String voice) {
        this.voice = voice;
        return this;
    }
    public String getVoice() {
        return this.voice;
    }

    public DescribeTTSConfigResponseBody setVolume(Integer volume) {
        this.volume = volume;
        return this;
    }
    public Integer getVolume() {
        return this.volume;
    }

}
