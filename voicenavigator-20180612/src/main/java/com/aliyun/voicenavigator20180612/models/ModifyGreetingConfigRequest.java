// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20180612.models;

import com.aliyun.tea.*;

public class ModifyGreetingConfigRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("GreetingWords")
    public String greetingWords;

    @NameInMap("SourceType")
    public String sourceType;

    @NameInMap("IntentTrigger")
    public String intentTrigger;

    public static ModifyGreetingConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyGreetingConfigRequest self = new ModifyGreetingConfigRequest();
        return TeaModel.build(map, self);
    }

    public ModifyGreetingConfigRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyGreetingConfigRequest setGreetingWords(String greetingWords) {
        this.greetingWords = greetingWords;
        return this;
    }
    public String getGreetingWords() {
        return this.greetingWords;
    }

    public ModifyGreetingConfigRequest setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

    public ModifyGreetingConfigRequest setIntentTrigger(String intentTrigger) {
        this.intentTrigger = intentTrigger;
        return this;
    }
    public String getIntentTrigger() {
        return this.intentTrigger;
    }

}
