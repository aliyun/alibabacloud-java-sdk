// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class ModifyTTSConfigRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>99****Aw</p>
     */
    @NameInMap("AppKey")
    public String appKey;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>27244bae-e446-4811-bb1d-f8a07b525af0</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>Managed</p>
     */
    @NameInMap("NlsServiceType")
    public String nlsServiceType;

    /**
     * <p>语调 [-500,500]之间整数。默认值为0。</p>
     * <p>大于0表示升高音高。</p>
     * <p>小于0表示降低音高。</p>
     */
    @NameInMap("PitchRate")
    public String pitchRate;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1f1a2ba0-b3e7-4ff9-baf1-6dc8aeac0791</p>
     */
    @NameInMap("ScriptId")
    public String scriptId;

    @NameInMap("SpeechRate")
    public String speechRate;

    @NameInMap("Voice")
    public String voice;

    /**
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
