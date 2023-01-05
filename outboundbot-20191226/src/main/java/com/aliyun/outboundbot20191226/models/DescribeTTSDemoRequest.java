// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class DescribeTTSDemoRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("PitchRate")
    public Integer pitchRate;

    @NameInMap("ScriptId")
    public String scriptId;

    @NameInMap("SpeechRate")
    public Integer speechRate;

    @NameInMap("Text")
    public String text;

    @NameInMap("Voice")
    public String voice;

    @NameInMap("Volume")
    public Integer volume;

    public static DescribeTTSDemoRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeTTSDemoRequest self = new DescribeTTSDemoRequest();
        return TeaModel.build(map, self);
    }

    public DescribeTTSDemoRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
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
