// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20251111.models;

import com.aliyun.tea.*;

public class CreateScriptVersionShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>abb4aa26-3a8e-43dd-82f8-0c3898c9c67f</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("InteractionConfig")
    public String interactionConfigShrink;

    @NameInMap("LabelConfig")
    public String labelConfigShrink;

    /**
     * <strong>example:</strong>
     * <p>64241e64-190c-45d1-af66-06f51c07b090</p>
     */
    @NameInMap("ScriptId")
    public String scriptId;

    @NameInMap("ScriptProfile")
    public String scriptProfileShrink;

    @NameInMap("SourceVersionId")
    public String sourceVersionId;

    @NameInMap("SynthesizerConfig")
    public String synthesizerConfigShrink;

    @NameInMap("TranscriberConfig")
    public String transcriberConfigShrink;

    public static CreateScriptVersionShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateScriptVersionShrinkRequest self = new CreateScriptVersionShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateScriptVersionShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateScriptVersionShrinkRequest setInteractionConfigShrink(String interactionConfigShrink) {
        this.interactionConfigShrink = interactionConfigShrink;
        return this;
    }
    public String getInteractionConfigShrink() {
        return this.interactionConfigShrink;
    }

    public CreateScriptVersionShrinkRequest setLabelConfigShrink(String labelConfigShrink) {
        this.labelConfigShrink = labelConfigShrink;
        return this;
    }
    public String getLabelConfigShrink() {
        return this.labelConfigShrink;
    }

    public CreateScriptVersionShrinkRequest setScriptId(String scriptId) {
        this.scriptId = scriptId;
        return this;
    }
    public String getScriptId() {
        return this.scriptId;
    }

    public CreateScriptVersionShrinkRequest setScriptProfileShrink(String scriptProfileShrink) {
        this.scriptProfileShrink = scriptProfileShrink;
        return this;
    }
    public String getScriptProfileShrink() {
        return this.scriptProfileShrink;
    }

    public CreateScriptVersionShrinkRequest setSourceVersionId(String sourceVersionId) {
        this.sourceVersionId = sourceVersionId;
        return this;
    }
    public String getSourceVersionId() {
        return this.sourceVersionId;
    }

    public CreateScriptVersionShrinkRequest setSynthesizerConfigShrink(String synthesizerConfigShrink) {
        this.synthesizerConfigShrink = synthesizerConfigShrink;
        return this;
    }
    public String getSynthesizerConfigShrink() {
        return this.synthesizerConfigShrink;
    }

    public CreateScriptVersionShrinkRequest setTranscriberConfigShrink(String transcriberConfigShrink) {
        this.transcriberConfigShrink = transcriberConfigShrink;
        return this;
    }
    public String getTranscriberConfigShrink() {
        return this.transcriberConfigShrink;
    }

}
