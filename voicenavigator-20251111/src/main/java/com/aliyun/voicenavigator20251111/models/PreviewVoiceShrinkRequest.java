// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20251111.models;

import com.aliyun.tea.*;

public class PreviewVoiceShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>da37319b-6c83-4268-9f19-814aed62e401</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>Qwen</p>
     */
    @NameInMap("Model")
    public String model;

    /**
     * <strong>example:</strong>
     * <p>MANAGED</p>
     */
    @NameInMap("NlsAccessType")
    public String nlsAccessType;

    /**
     * <strong>example:</strong>
     * <p>BAILIAN</p>
     */
    @NameInMap("NlsEngine")
    public String nlsEngine;

    @NameInMap("Params")
    public String paramsShrink;

    @NameInMap("Text")
    public String text;

    /**
     * <strong>example:</strong>
     * <p>Cherry</p>
     */
    @NameInMap("Voice")
    public String voice;

    public static PreviewVoiceShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        PreviewVoiceShrinkRequest self = new PreviewVoiceShrinkRequest();
        return TeaModel.build(map, self);
    }

    public PreviewVoiceShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public PreviewVoiceShrinkRequest setModel(String model) {
        this.model = model;
        return this;
    }
    public String getModel() {
        return this.model;
    }

    public PreviewVoiceShrinkRequest setNlsAccessType(String nlsAccessType) {
        this.nlsAccessType = nlsAccessType;
        return this;
    }
    public String getNlsAccessType() {
        return this.nlsAccessType;
    }

    public PreviewVoiceShrinkRequest setNlsEngine(String nlsEngine) {
        this.nlsEngine = nlsEngine;
        return this;
    }
    public String getNlsEngine() {
        return this.nlsEngine;
    }

    public PreviewVoiceShrinkRequest setParamsShrink(String paramsShrink) {
        this.paramsShrink = paramsShrink;
        return this;
    }
    public String getParamsShrink() {
        return this.paramsShrink;
    }

    public PreviewVoiceShrinkRequest setText(String text) {
        this.text = text;
        return this;
    }
    public String getText() {
        return this.text;
    }

    public PreviewVoiceShrinkRequest setVoice(String voice) {
        this.voice = voice;
        return this;
    }
    public String getVoice() {
        return this.voice;
    }

}
