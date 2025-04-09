// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class CreateIntentRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>361c8a53-0e29-42f3-8aa7-c7752d010399</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("IntentDescription")
    public String intentDescription;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("IntentName")
    public String intentName;

    @NameInMap("Keywords")
    public String keywords;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>b06fad9a-cc74-4ab6-b3a5-8d062adebf2c</p>
     */
    @NameInMap("ScriptId")
    public String scriptId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Utterances")
    public String utterances;

    public static CreateIntentRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateIntentRequest self = new CreateIntentRequest();
        return TeaModel.build(map, self);
    }

    public CreateIntentRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateIntentRequest setIntentDescription(String intentDescription) {
        this.intentDescription = intentDescription;
        return this;
    }
    public String getIntentDescription() {
        return this.intentDescription;
    }

    public CreateIntentRequest setIntentName(String intentName) {
        this.intentName = intentName;
        return this;
    }
    public String getIntentName() {
        return this.intentName;
    }

    public CreateIntentRequest setKeywords(String keywords) {
        this.keywords = keywords;
        return this;
    }
    public String getKeywords() {
        return this.keywords;
    }

    public CreateIntentRequest setScriptId(String scriptId) {
        this.scriptId = scriptId;
        return this;
    }
    public String getScriptId() {
        return this.scriptId;
    }

    public CreateIntentRequest setUtterances(String utterances) {
        this.utterances = utterances;
        return this;
    }
    public String getUtterances() {
        return this.utterances;
    }

}
