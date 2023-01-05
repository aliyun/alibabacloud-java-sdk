// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class ModifyScriptVoiceConfigRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("ScriptId")
    public String scriptId;

    @NameInMap("ScriptVoiceConfigId")
    public String scriptVoiceConfigId;

    @NameInMap("ScriptWaveformRelation")
    public String scriptWaveformRelation;

    @NameInMap("Type")
    public String type;

    public static ModifyScriptVoiceConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyScriptVoiceConfigRequest self = new ModifyScriptVoiceConfigRequest();
        return TeaModel.build(map, self);
    }

    public ModifyScriptVoiceConfigRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyScriptVoiceConfigRequest setScriptId(String scriptId) {
        this.scriptId = scriptId;
        return this;
    }
    public String getScriptId() {
        return this.scriptId;
    }

    public ModifyScriptVoiceConfigRequest setScriptVoiceConfigId(String scriptVoiceConfigId) {
        this.scriptVoiceConfigId = scriptVoiceConfigId;
        return this;
    }
    public String getScriptVoiceConfigId() {
        return this.scriptVoiceConfigId;
    }

    public ModifyScriptVoiceConfigRequest setScriptWaveformRelation(String scriptWaveformRelation) {
        this.scriptWaveformRelation = scriptWaveformRelation;
        return this;
    }
    public String getScriptWaveformRelation() {
        return this.scriptWaveformRelation;
    }

    public ModifyScriptVoiceConfigRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
