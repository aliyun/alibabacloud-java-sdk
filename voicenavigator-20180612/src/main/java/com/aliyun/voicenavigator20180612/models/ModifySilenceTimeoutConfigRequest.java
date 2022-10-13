// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20180612.models;

import com.aliyun.tea.*;

public class ModifySilenceTimeoutConfigRequest extends TeaModel {
    @NameInMap("FinalAction")
    public String finalAction;

    @NameInMap("FinalActionParams")
    public String finalActionParams;

    @NameInMap("FinalPrompt")
    public String finalPrompt;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("IntentTrigger")
    public String intentTrigger;

    @NameInMap("Prompt")
    public String prompt;

    @NameInMap("SourceType")
    public String sourceType;

    @NameInMap("Threshold")
    public Integer threshold;

    @NameInMap("Timeout")
    public Long timeout;

    public static ModifySilenceTimeoutConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifySilenceTimeoutConfigRequest self = new ModifySilenceTimeoutConfigRequest();
        return TeaModel.build(map, self);
    }

    public ModifySilenceTimeoutConfigRequest setFinalAction(String finalAction) {
        this.finalAction = finalAction;
        return this;
    }
    public String getFinalAction() {
        return this.finalAction;
    }

    public ModifySilenceTimeoutConfigRequest setFinalActionParams(String finalActionParams) {
        this.finalActionParams = finalActionParams;
        return this;
    }
    public String getFinalActionParams() {
        return this.finalActionParams;
    }

    public ModifySilenceTimeoutConfigRequest setFinalPrompt(String finalPrompt) {
        this.finalPrompt = finalPrompt;
        return this;
    }
    public String getFinalPrompt() {
        return this.finalPrompt;
    }

    public ModifySilenceTimeoutConfigRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifySilenceTimeoutConfigRequest setIntentTrigger(String intentTrigger) {
        this.intentTrigger = intentTrigger;
        return this;
    }
    public String getIntentTrigger() {
        return this.intentTrigger;
    }

    public ModifySilenceTimeoutConfigRequest setPrompt(String prompt) {
        this.prompt = prompt;
        return this;
    }
    public String getPrompt() {
        return this.prompt;
    }

    public ModifySilenceTimeoutConfigRequest setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

    public ModifySilenceTimeoutConfigRequest setThreshold(Integer threshold) {
        this.threshold = threshold;
        return this;
    }
    public Integer getThreshold() {
        return this.threshold;
    }

    public ModifySilenceTimeoutConfigRequest setTimeout(Long timeout) {
        this.timeout = timeout;
        return this;
    }
    public Long getTimeout() {
        return this.timeout;
    }

}
