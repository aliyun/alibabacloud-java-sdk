// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20180612.models;

import com.aliyun.tea.*;

public class ModifyTTSConfigRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Voice")
    public String voice;

    @NameInMap("SpeechRate")
    public String speechRate;

    @NameInMap("Volume")
    public String volume;

    public static ModifyTTSConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyTTSConfigRequest self = new ModifyTTSConfigRequest();
        return TeaModel.build(map, self);
    }

    public ModifyTTSConfigRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyTTSConfigRequest setVoice(String voice) {
        this.voice = voice;
        return this;
    }
    public String getVoice() {
        return this.voice;
    }

    public ModifyTTSConfigRequest setSpeechRate(String speechRate) {
        this.speechRate = speechRate;
        return this;
    }
    public String getSpeechRate() {
        return this.speechRate;
    }

    public ModifyTTSConfigRequest setVolume(String volume) {
        this.volume = volume;
        return this;
    }
    public String getVolume() {
        return this.volume;
    }

}
