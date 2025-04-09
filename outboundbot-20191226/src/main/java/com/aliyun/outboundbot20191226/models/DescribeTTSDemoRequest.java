// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class DescribeTTSDemoRequest extends TeaModel {
    @NameInMap("AccessKey")
    public String accessKey;

    @NameInMap("AliCustomizedVoice")
    public String aliCustomizedVoice;

    @NameInMap("AppKey")
    public String appKey;

    @NameInMap("Engine")
    public String engine;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>a8eccb3c-2b26-4b6d-a54f-696b953e33a6</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("NlsServiceType")
    public String nlsServiceType;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("PitchRate")
    public Integer pitchRate;

    /**
     * <strong>example:</strong>
     * <p>5ab2d935-306c-478a-88bf-d08e4e25c1b7</p>
     */
    @NameInMap("ScriptId")
    public String scriptId;

    @NameInMap("SecretKey")
    public String secretKey;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("SpeechRate")
    public Integer speechRate;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Text")
    public String text;

    /**
     * <strong>example:</strong>
     * <p>aixia</p>
     */
    @NameInMap("Voice")
    public String voice;

    /**
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("Volume")
    public Integer volume;

    public static DescribeTTSDemoRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeTTSDemoRequest self = new DescribeTTSDemoRequest();
        return TeaModel.build(map, self);
    }

    public DescribeTTSDemoRequest setAccessKey(String accessKey) {
        this.accessKey = accessKey;
        return this;
    }
    public String getAccessKey() {
        return this.accessKey;
    }

    public DescribeTTSDemoRequest setAliCustomizedVoice(String aliCustomizedVoice) {
        this.aliCustomizedVoice = aliCustomizedVoice;
        return this;
    }
    public String getAliCustomizedVoice() {
        return this.aliCustomizedVoice;
    }

    public DescribeTTSDemoRequest setAppKey(String appKey) {
        this.appKey = appKey;
        return this;
    }
    public String getAppKey() {
        return this.appKey;
    }

    public DescribeTTSDemoRequest setEngine(String engine) {
        this.engine = engine;
        return this;
    }
    public String getEngine() {
        return this.engine;
    }

    public DescribeTTSDemoRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeTTSDemoRequest setNlsServiceType(String nlsServiceType) {
        this.nlsServiceType = nlsServiceType;
        return this;
    }
    public String getNlsServiceType() {
        return this.nlsServiceType;
    }

    public DescribeTTSDemoRequest setPitchRate(Integer pitchRate) {
        this.pitchRate = pitchRate;
        return this;
    }
    public Integer getPitchRate() {
        return this.pitchRate;
    }

    public DescribeTTSDemoRequest setScriptId(String scriptId) {
        this.scriptId = scriptId;
        return this;
    }
    public String getScriptId() {
        return this.scriptId;
    }

    public DescribeTTSDemoRequest setSecretKey(String secretKey) {
        this.secretKey = secretKey;
        return this;
    }
    public String getSecretKey() {
        return this.secretKey;
    }

    public DescribeTTSDemoRequest setSpeechRate(Integer speechRate) {
        this.speechRate = speechRate;
        return this;
    }
    public Integer getSpeechRate() {
        return this.speechRate;
    }

    public DescribeTTSDemoRequest setText(String text) {
        this.text = text;
        return this;
    }
    public String getText() {
        return this.text;
    }

    public DescribeTTSDemoRequest setVoice(String voice) {
        this.voice = voice;
        return this;
    }
    public String getVoice() {
        return this.voice;
    }

    public DescribeTTSDemoRequest setVolume(Integer volume) {
        this.volume = volume;
        return this;
    }
    public Integer getVolume() {
        return this.volume;
    }

}
