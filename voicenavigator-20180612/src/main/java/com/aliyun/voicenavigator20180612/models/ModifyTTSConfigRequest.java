// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20180612.models;

import com.aliyun.tea.*;

public class ModifyTTSConfigRequest extends TeaModel {
    @NameInMap("AliCustomizedVoice")
    public String aliCustomizedVoice;

    @NameInMap("AppKey")
    public String appKey;

    @NameInMap("Engine")
    public String engine;

    @NameInMap("EngineXunfei")
    public String engineXunfei;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>12f407b22cbe4890ac595f09985848d5</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("NlsServiceType")
    public String nlsServiceType;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("SpeechRate")
    public String speechRate;

    /**
     * <strong>example:</strong>
     * <p>aixia</p>
     */
    @NameInMap("Voice")
    public String voice;

    /**
     * <strong>example:</strong>
     * <p>10</p>
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

    public ModifyTTSConfigRequest setSpeechRate(String speechRate) {
        this.speechRate = speechRate;
        return this;
    }
    public String getSpeechRate() {
        return this.speechRate;
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
