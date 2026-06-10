// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class CreateIntentRequest extends TeaModel {
    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>361c8a53-0e29-42f3-8aa7-c7752d010399</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>A description of the intent.</p>
     * 
     * <strong>example:</strong>
     * <p>确定是本人的意图</p>
     */
    @NameInMap("IntentDescription")
    public String intentDescription;

    /**
     * <p>The name of the intent. This name must be unique within the script.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>是本人</p>
     */
    @NameInMap("IntentName")
    public String intentName;

    /**
     * <p>A JSON-formatted string containing an array of keywords that help identify the intent.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;是&quot;,&quot;是的&quot;]</p>
     */
    @NameInMap("Keywords")
    public String keywords;

    /**
     * <p>The script ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>c5c5d8c0-c0f1-48a7-be2b-dc46006d888a</p>
     */
    @NameInMap("ScriptId")
    public String scriptId;

    /**
     * <p>A JSON-formatted string containing an array of sample utterances that trigger this intent.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;是&quot;,&quot;是的&quot;,&quot;是啊&quot;,&quot;嗯嗯&quot;,&quot;是我&quot;,&quot;是我，有事吗&quot;,&quot;对，是&quot;,&quot;对的&quot;,&quot;对是我&quot;,&quot;&quot;]</p>
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
