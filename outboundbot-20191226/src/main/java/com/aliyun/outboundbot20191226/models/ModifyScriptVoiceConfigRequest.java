// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class ModifyScriptVoiceConfigRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>bdd49242-114c-4045-b1d1-25ccc1756c75</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1d7a26e0-628b-4c3c-9918-7f2e23273f54</p>
     */
    @NameInMap("ScriptId")
    public String scriptId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>e15cc646-50e5-4bc0-87ec-e4f2d1063b90</p>
     */
    @NameInMap("ScriptVoiceConfigId")
    public String scriptVoiceConfigId;

    @NameInMap("ScriptWaveformRelation")
    public String scriptWaveformRelation;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>WAVEFORM</p>
     */
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
