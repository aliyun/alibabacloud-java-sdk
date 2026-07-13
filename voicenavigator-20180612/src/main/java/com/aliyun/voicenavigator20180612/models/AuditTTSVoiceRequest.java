// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20180612.models;

import com.aliyun.tea.*;

public class AuditTTSVoiceRequest extends TeaModel {
    /**
     * <p>The AccessKey ID of the namespace.</p>
     * 
     * <strong>example:</strong>
     * <p>b4331******a4640ce1f88e27ac8df0</p>
     */
    @NameInMap("AccessKey")
    public String accessKey;

    /**
     * <p>The AppKey of the third-party voice configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>be******</p>
     */
    @NameInMap("AppKey")
    public String appKey;

    /**
     * <p>The TTS engine.</p>
     * 
     * <strong>example:</strong>
     * <p>ali</p>
     */
    @NameInMap("Engine")
    public String engine;

    /**
     * <p>The extended parameters.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("ExtParams")
    public String extParams;

    /**
     * <p>The navigation instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>af81a389-91f0-4157-8d82-720edd02b66a</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("PitchRate")
    public String pitchRate;

    /**
     * <p>The AccessKey secret.</p>
     * 
     * <strong>example:</strong>
     * <p>ZDc3********DAzM2E0YjM5NTFkMDQ1</p>
     */
    @NameInMap("SecretKey")
    public String secretKey;

    /**
     * <p>The speech rate.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("SpeechRate")
    public String speechRate;

    /**
     * <p>The preview text.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>你好</p>
     */
    @NameInMap("Text")
    public String text;

    /**
     * <p>The voice.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>aixia</p>
     */
    @NameInMap("Voice")
    public String voice;

    /**
     * <p>The volume.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("Volume")
    public String volume;

    public static AuditTTSVoiceRequest build(java.util.Map<String, ?> map) throws Exception {
        AuditTTSVoiceRequest self = new AuditTTSVoiceRequest();
        return TeaModel.build(map, self);
    }

    public AuditTTSVoiceRequest setAccessKey(String accessKey) {
        this.accessKey = accessKey;
        return this;
    }
    public String getAccessKey() {
        return this.accessKey;
    }

    public AuditTTSVoiceRequest setAppKey(String appKey) {
        this.appKey = appKey;
        return this;
    }
    public String getAppKey() {
        return this.appKey;
    }

    public AuditTTSVoiceRequest setEngine(String engine) {
        this.engine = engine;
        return this;
    }
    public String getEngine() {
        return this.engine;
    }

    public AuditTTSVoiceRequest setExtParams(String extParams) {
        this.extParams = extParams;
        return this;
    }
    public String getExtParams() {
        return this.extParams;
    }

    public AuditTTSVoiceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public AuditTTSVoiceRequest setPitchRate(String pitchRate) {
        this.pitchRate = pitchRate;
        return this;
    }
    public String getPitchRate() {
        return this.pitchRate;
    }

    public AuditTTSVoiceRequest setSecretKey(String secretKey) {
        this.secretKey = secretKey;
        return this;
    }
    public String getSecretKey() {
        return this.secretKey;
    }

    public AuditTTSVoiceRequest setSpeechRate(String speechRate) {
        this.speechRate = speechRate;
        return this;
    }
    public String getSpeechRate() {
        return this.speechRate;
    }

    public AuditTTSVoiceRequest setText(String text) {
        this.text = text;
        return this;
    }
    public String getText() {
        return this.text;
    }

    public AuditTTSVoiceRequest setVoice(String voice) {
        this.voice = voice;
        return this;
    }
    public String getVoice() {
        return this.voice;
    }

    public AuditTTSVoiceRequest setVolume(String volume) {
        this.volume = volume;
        return this;
    }
    public String getVolume() {
        return this.volume;
    }

}
