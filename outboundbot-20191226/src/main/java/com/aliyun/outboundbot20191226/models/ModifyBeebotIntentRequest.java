// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class ModifyBeebotIntentRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>e5035654-1745-484a-8c5b-165f7c7bcd79</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("IntentDefinition")
    public ModifyBeebotIntentRequestIntentDefinition intentDefinition;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10717802</p>
     */
    @NameInMap("IntentId")
    public Long intentId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>c5c5d8c0-c0f1-48a7-be2b-dc46006d888a</p>
     */
    @NameInMap("ScriptId")
    public String scriptId;

    public static ModifyBeebotIntentRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyBeebotIntentRequest self = new ModifyBeebotIntentRequest();
        return TeaModel.build(map, self);
    }

    public ModifyBeebotIntentRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyBeebotIntentRequest setIntentDefinition(ModifyBeebotIntentRequestIntentDefinition intentDefinition) {
        this.intentDefinition = intentDefinition;
        return this;
    }
    public ModifyBeebotIntentRequestIntentDefinition getIntentDefinition() {
        return this.intentDefinition;
    }

    public ModifyBeebotIntentRequest setIntentId(Long intentId) {
        this.intentId = intentId;
        return this;
    }
    public Long getIntentId() {
        return this.intentId;
    }

    public ModifyBeebotIntentRequest setScriptId(String scriptId) {
        this.scriptId = scriptId;
        return this;
    }
    public String getScriptId() {
        return this.scriptId;
    }

    public static class ModifyBeebotIntentRequestIntentDefinition extends TeaModel {
        @NameInMap("AliasName")
        public String aliasName;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("IntentName")
        public String intentName;

        public static ModifyBeebotIntentRequestIntentDefinition build(java.util.Map<String, ?> map) throws Exception {
            ModifyBeebotIntentRequestIntentDefinition self = new ModifyBeebotIntentRequestIntentDefinition();
            return TeaModel.build(map, self);
        }

        public ModifyBeebotIntentRequestIntentDefinition setAliasName(String aliasName) {
            this.aliasName = aliasName;
            return this;
        }
        public String getAliasName() {
            return this.aliasName;
        }

        public ModifyBeebotIntentRequestIntentDefinition setIntentName(String intentName) {
            this.intentName = intentName;
            return this;
        }
        public String getIntentName() {
            return this.intentName;
        }

    }

}
