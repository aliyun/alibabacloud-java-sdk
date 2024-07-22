// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20180612.models;

import com.aliyun.tea.*;

public class ModifyGreetingConfigRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("GreetingWords")
    public String greetingWords;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>12f407b22cbe4890ac595f09985848d5</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("IntentTrigger")
    public String intentTrigger;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>chatbotIntent</p>
     */
    @NameInMap("SourceType")
    public String sourceType;

    public static ModifyGreetingConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyGreetingConfigRequest self = new ModifyGreetingConfigRequest();
        return TeaModel.build(map, self);
    }

    public ModifyGreetingConfigRequest setGreetingWords(String greetingWords) {
        this.greetingWords = greetingWords;
        return this;
    }
    public String getGreetingWords() {
        return this.greetingWords;
    }

    public ModifyGreetingConfigRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyGreetingConfigRequest setIntentTrigger(String intentTrigger) {
        this.intentTrigger = intentTrigger;
        return this;
    }
    public String getIntentTrigger() {
        return this.intentTrigger;
    }

    public ModifyGreetingConfigRequest setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

}
