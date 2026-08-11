// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20251111.models;

import com.aliyun.tea.*;

public class UpdateScriptVersionShrinkRequest extends TeaModel {
    /**
     * <p>实例ID</p>
     * 
     * <strong>example:</strong>
     * <p>4f9a8e2b-6c1d-4a7e-9b3f-2d5c8a1e7b04</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>交互配置</p>
     */
    @NameInMap("InteractionConfig")
    public String interactionConfigShrink;

    /**
     * <p>草稿版本的标签配置（JSON字符串）</p>
     */
    @NameInMap("LabelConfigs")
    public String labelConfigsShrink;

    /**
     * <p>场景ID</p>
     * 
     * <strong>example:</strong>
     * <p>4f9a8e2b-6c1d-4a7e-9b3f-2d5c8a1e7b15</p>
     */
    @NameInMap("ScriptId")
    public String scriptId;

    /**
     * <p>话术配置</p>
     */
    @NameInMap("ScriptProfile")
    public String scriptProfileShrink;

    /**
     * <p>语音合成配置</p>
     */
    @NameInMap("SynthesizerConfig")
    public String synthesizerConfigShrink;

    /**
     * <p>语音识别配置</p>
     */
    @NameInMap("TranscriberConfig")
    public String transcriberConfigShrink;

    /**
     * <p>版本ID</p>
     * 
     * <strong>example:</strong>
     * <p>4f9a8e2b-6c1d-4a7e-9b3f-2d5c8a1e7b26</p>
     */
    @NameInMap("VersionId")
    public String versionId;

    public static UpdateScriptVersionShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateScriptVersionShrinkRequest self = new UpdateScriptVersionShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateScriptVersionShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateScriptVersionShrinkRequest setInteractionConfigShrink(String interactionConfigShrink) {
        this.interactionConfigShrink = interactionConfigShrink;
        return this;
    }
    public String getInteractionConfigShrink() {
        return this.interactionConfigShrink;
    }

    public UpdateScriptVersionShrinkRequest setLabelConfigsShrink(String labelConfigsShrink) {
        this.labelConfigsShrink = labelConfigsShrink;
        return this;
    }
    public String getLabelConfigsShrink() {
        return this.labelConfigsShrink;
    }

    public UpdateScriptVersionShrinkRequest setScriptId(String scriptId) {
        this.scriptId = scriptId;
        return this;
    }
    public String getScriptId() {
        return this.scriptId;
    }

    public UpdateScriptVersionShrinkRequest setScriptProfileShrink(String scriptProfileShrink) {
        this.scriptProfileShrink = scriptProfileShrink;
        return this;
    }
    public String getScriptProfileShrink() {
        return this.scriptProfileShrink;
    }

    public UpdateScriptVersionShrinkRequest setSynthesizerConfigShrink(String synthesizerConfigShrink) {
        this.synthesizerConfigShrink = synthesizerConfigShrink;
        return this;
    }
    public String getSynthesizerConfigShrink() {
        return this.synthesizerConfigShrink;
    }

    public UpdateScriptVersionShrinkRequest setTranscriberConfigShrink(String transcriberConfigShrink) {
        this.transcriberConfigShrink = transcriberConfigShrink;
        return this;
    }
    public String getTranscriberConfigShrink() {
        return this.transcriberConfigShrink;
    }

    public UpdateScriptVersionShrinkRequest setVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }
    public String getVersionId() {
        return this.versionId;
    }

}
