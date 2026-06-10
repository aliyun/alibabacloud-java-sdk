// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class ModifyTTSConfigRequest extends TeaModel {
    /**
     * <p>AppKey for your Intelligent Speech Interaction project. Required only when NlsServiceType is Authorized.</p>
     * 
     * <strong>example:</strong>
     * <p>99****Aw</p>
     */
    @NameInMap("AppKey")
    public String appKey;

    /**
     * <p>Instance ID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>27244bae-e446-4811-bb1d-f8a07b525af0</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The service type.
     * Managed: The default public Intelligent Speech Interaction service for Outbound Bot.
     * Authorized: A private Intelligent Speech Interaction service that you have purchased. To grant authorization, navigate to Scenario Management &gt; Edit &gt; Call Service &gt; Custom Service.</p>
     * 
     * <strong>example:</strong>
     * <p>Managed</p>
     */
    @NameInMap("NlsServiceType")
    public String nlsServiceType;

    /**
     * <p>Pitch. An integer between -500 and 500. Default is 0.</p>
     * <p>A value greater than 0 raises pitch.</p>
     * <p>A value less than 0 lowers pitch.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("PitchRate")
    public String pitchRate;

    /**
     * <p>Scenario ID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1f1a2ba0-b3e7-4ff9-baf1-6dc8aeac0791</p>
     */
    @NameInMap("ScriptId")
    public String scriptId;

    /**
     * <p>Speech rate. An integer between -500 and 500. Default is 0.</p>
     * <p>A value greater than 0 increases speech speed.</p>
     * <p>A value less than 0 decreases speech speed.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("SpeechRate")
    public String speechRate;

    /**
     * <p>Voice model, such as aixia, siyue, or xiaoyun</p>
     * 
     * <strong>example:</strong>
     * <p>aixia</p>
     */
    @NameInMap("Voice")
    public String voice;

    /**
     * <p>Volume. An integer between 0 and 100. Default is 50.</p>
     * <p>A value greater than 50 increases volume.</p>
     * <p>A value less than 50 decreases volume.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("Volume")
    public String volume;

    public static ModifyTTSConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyTTSConfigRequest self = new ModifyTTSConfigRequest();
        return TeaModel.build(map, self);
    }

    public ModifyTTSConfigRequest setAppKey(String appKey) {
        this.appKey = appKey;
        return this;
    }
    public String getAppKey() {
        return this.appKey;
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

    public ModifyTTSConfigRequest setScriptId(String scriptId) {
        this.scriptId = scriptId;
        return this;
    }
    public String getScriptId() {
        return this.scriptId;
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
