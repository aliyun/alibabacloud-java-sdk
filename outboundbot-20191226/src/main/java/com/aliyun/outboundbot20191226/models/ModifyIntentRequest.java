// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class ModifyIntentRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>8fa1953f-4a84-46d8-b80c-8ce9cf684fb3</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("IntentDescription")
    public String intentDescription;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3b9a2b33-50d4-4576-8c68-22498f4bf731</p>
     */
    @NameInMap("IntentId")
    public String intentId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("IntentName")
    public String intentName;

    /**
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("Keywords")
    public String keywords;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>9b70486f-b1c2-429c-8a24-62798015ab1b</p>
     */
    @NameInMap("ScriptId")
    public String scriptId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Utterances")
    public String utterances;

    public static ModifyIntentRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyIntentRequest self = new ModifyIntentRequest();
        return TeaModel.build(map, self);
    }

    public ModifyIntentRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyIntentRequest setIntentDescription(String intentDescription) {
        this.intentDescription = intentDescription;
        return this;
    }
    public String getIntentDescription() {
        return this.intentDescription;
    }

    public ModifyIntentRequest setIntentId(String intentId) {
        this.intentId = intentId;
        return this;
    }
    public String getIntentId() {
        return this.intentId;
    }

    public ModifyIntentRequest setIntentName(String intentName) {
        this.intentName = intentName;
        return this;
    }
    public String getIntentName() {
        return this.intentName;
    }

    public ModifyIntentRequest setKeywords(String keywords) {
        this.keywords = keywords;
        return this;
    }
    public String getKeywords() {
        return this.keywords;
    }

    public ModifyIntentRequest setScriptId(String scriptId) {
        this.scriptId = scriptId;
        return this;
    }
    public String getScriptId() {
        return this.scriptId;
    }

    public ModifyIntentRequest setUtterances(String utterances) {
        this.utterances = utterances;
        return this;
    }
    public String getUtterances() {
        return this.utterances;
    }

}
