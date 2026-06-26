// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20180612.models;

import com.aliyun.tea.*;

public class ModifyUnrecognizingConfigRequest extends TeaModel {
    /**
     * <p>The rejection action performed after the final rejection prompt is played.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>TransferToAgent</p>
     */
    @NameInMap("FinalAction")
    public String finalAction;

    /**
     * <p>The action parameters for the rejection action, in JSON format.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("FinalActionParams")
    public String finalActionParams;

    /**
     * <p>The final rejection prompt. The service plays this prompt when the rejection threshold is met.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>再见</p>
     */
    @NameInMap("FinalPrompt")
    public String finalPrompt;

    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>12f407b22cbe4890ac595f09985848d5</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The rejection prompt played when the service fails to recognize user input.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>我不理解您的意思，请再说一遍</p>
     */
    @NameInMap("Prompt")
    public String prompt;

    /**
     * <p>The rejection threshold. The maximum number of consecutive rejections before the service triggers the rejection action.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("Threshold")
    public Integer threshold;

    public static ModifyUnrecognizingConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyUnrecognizingConfigRequest self = new ModifyUnrecognizingConfigRequest();
        return TeaModel.build(map, self);
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

    public ModifyUnrecognizingConfigRequest setFinalPrompt(String finalPrompt) {
        this.finalPrompt = finalPrompt;
        return this;
    }
    public String getFinalPrompt() {
        return this.finalPrompt;
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

}
