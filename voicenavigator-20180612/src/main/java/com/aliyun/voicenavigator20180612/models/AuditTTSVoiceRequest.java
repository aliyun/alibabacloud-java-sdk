// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20180612.models;

import com.aliyun.tea.*;

public class AuditTTSVoiceRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Voice")
    public String voice;

    @NameInMap("Text")
    public String text;

    @NameInMap("SpeechRate")
    public String speechRate;

    @NameInMap("Volume")
    public String volume;

    public static AuditTTSVoiceRequest build(java.util.Map<String, ?> map) throws Exception {
        AuditTTSVoiceRequest self = new AuditTTSVoiceRequest();
        return TeaModel.build(map, self);
    }

    public AuditTTSVoiceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public AuditTTSVoiceRequest setVoice(String voice) {
        this.voice = voice;
        return this;
    }
    public String getVoice() {
        return this.voice;
    }

    public AuditTTSVoiceRequest setText(String text) {
        this.text = text;
        return this;
    }
    public String getText() {
        return this.text;
    }

    public AuditTTSVoiceRequest setSpeechRate(String speechRate) {
        this.speechRate = speechRate;
        return this;
    }
    public String getSpeechRate() {
        return this.speechRate;
    }

    public AuditTTSVoiceRequest setVolume(String volume) {
        this.volume = volume;
        return this;
    }
    public String getVolume() {
        return this.volume;
    }

}
