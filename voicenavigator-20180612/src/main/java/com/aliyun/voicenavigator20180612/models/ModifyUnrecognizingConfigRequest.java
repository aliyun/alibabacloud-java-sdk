// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20180612.models;

import com.aliyun.tea.*;

public class ModifyUnrecognizingConfigRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Prompt")
    public String prompt;

    @NameInMap("Threshold")
    public Integer threshold;

    @NameInMap("FinalPrompt")
    public String finalPrompt;

    @NameInMap("FinalAction")
    public String finalAction;

    @NameInMap("FinalActionParams")
    public String finalActionParams;

    public static ModifyUnrecognizingConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyUnrecognizingConfigRequest self = new ModifyUnrecognizingConfigRequest();
        return TeaModel.build(map, self);
    }

    public ModifyUnrecognizingConfigRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyUnrecognizingConfigRequest setPrompt(String prompt) {
        this.prompt = prompt;
        return this;
    }
    public String getPrompt() {
        return this.prompt;
    }

    public ModifyUnrecognizingConfigRequest setThreshold(Integer threshold) {
        this.threshold = threshold;
        return this;
    }
    public Integer getThreshold() {
        return this.threshold;
    }

    public ModifyUnrecognizingConfigRequest setFinalPrompt(String finalPrompt) {
        this.finalPrompt = finalPrompt;
        return this;
    }
    public String getFinalPrompt() {
        return this.finalPrompt;
    }

    public ModifyUnrecognizingConfigRequest setFinalAction(String finalAction) {
        this.finalAction = finalAction;
        return this;
    }
    public String getFinalAction() {
        return this.finalAction;
    }

    public ModifyUnrecognizingConfigRequest setFinalActionParams(String finalActionParams) {
        this.finalActionParams = finalActionParams;
        return this;
    }
    public String getFinalActionParams() {
        return this.finalActionParams;
    }

}
