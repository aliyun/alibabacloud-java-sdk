// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class CreateBeebotIntentRequest extends TeaModel {
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
    public CreateBeebotIntentRequestIntentDefinition intentDefinition;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>c5c5d8c0-c0f1-48a7-be2b-dc46006d888a</p>
     */
    @NameInMap("ScriptId")
    public String scriptId;

    public static CreateBeebotIntentRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateBeebotIntentRequest self = new CreateBeebotIntentRequest();
        return TeaModel.build(map, self);
    }

    public CreateBeebotIntentRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateBeebotIntentRequest setIntentDefinition(CreateBeebotIntentRequestIntentDefinition intentDefinition) {
        this.intentDefinition = intentDefinition;
        return this;
    }
    public CreateBeebotIntentRequestIntentDefinition getIntentDefinition() {
        return this.intentDefinition;
    }

    public CreateBeebotIntentRequest setScriptId(String scriptId) {
        this.scriptId = scriptId;
        return this;
    }
    public String getScriptId() {
        return this.scriptId;
    }

    public static class CreateBeebotIntentRequestIntentDefinition extends TeaModel {
        @NameInMap("AliasName")
        public String aliasName;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("IntentName")
        public String intentName;

        public static CreateBeebotIntentRequestIntentDefinition build(java.util.Map<String, ?> map) throws Exception {
            CreateBeebotIntentRequestIntentDefinition self = new CreateBeebotIntentRequestIntentDefinition();
            return TeaModel.build(map, self);
        }

        public CreateBeebotIntentRequestIntentDefinition setAliasName(String aliasName) {
            this.aliasName = aliasName;
            return this;
        }
        public String getAliasName() {
            return this.aliasName;
        }

        public CreateBeebotIntentRequestIntentDefinition setIntentName(String intentName) {
            this.intentName = intentName;
            return this;
        }
        public String getIntentName() {
            return this.intentName;
        }

    }

}
