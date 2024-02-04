// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20180612.models;

import com.aliyun.tea.*;

public class DescribeTTSConfigResponseBody extends TeaModel {
    @NameInMap("AppKey")
    public String appKey;

    @NameInMap("Engine")
    public String engine;

    @NameInMap("EngineXunfei")
    public String engineXunfei;

    @NameInMap("NlsServiceType")
    public String nlsServiceType;

    @NameInMap("PitchRate")
    public Integer pitchRate;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SpeechRate")
    public Integer speechRate;

    @NameInMap("Voice")
    public String voice;

    @NameInMap("Volume")
    public Integer volume;

    public static DescribeTTSConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeTTSConfigResponseBody self = new DescribeTTSConfigResponseBody();
        return TeaModel.build(map, self);
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
