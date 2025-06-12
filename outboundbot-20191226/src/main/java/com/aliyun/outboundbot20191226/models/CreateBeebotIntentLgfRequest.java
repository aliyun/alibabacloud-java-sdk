// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class CreateBeebotIntentLgfRequest extends TeaModel {
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
    @NameInMap("LgfDefinition")
    public CreateBeebotIntentLgfRequestLgfDefinition lgfDefinition;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>c5c5d8c0-c0f1-48a7-be2b-dc46006d888a</p>
     */
    @NameInMap("ScriptId")
    public String scriptId;

    public static CreateBeebotIntentLgfRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateBeebotIntentLgfRequest self = new CreateBeebotIntentLgfRequest();
        return TeaModel.build(map, self);
    }

    public CreateBeebotIntentLgfRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateBeebotIntentLgfRequest setLgfDefinition(CreateBeebotIntentLgfRequestLgfDefinition lgfDefinition) {
        this.lgfDefinition = lgfDefinition;
        return this;
    }
    public CreateBeebotIntentLgfRequestLgfDefinition getLgfDefinition() {
        return this.lgfDefinition;
    }

    public CreateBeebotIntentLgfRequest setScriptId(String scriptId) {
        this.scriptId = scriptId;
        return this;
    }
    public String getScriptId() {
        return this.scriptId;
    }

    public static class CreateBeebotIntentLgfRequestLgfDefinition extends TeaModel {
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
         */
        @NameInMap("RuleText")
        public String ruleText;

        public static CreateBeebotIntentLgfRequestLgfDefinition build(java.util.Map<String, ?> map) throws Exception {
            CreateBeebotIntentLgfRequestLgfDefinition self = new CreateBeebotIntentLgfRequestLgfDefinition();
            return TeaModel.build(map, self);
        }

        public CreateBeebotIntentLgfRequestLgfDefinition setIntentId(Long intentId) {
            this.intentId = intentId;
            return this;
        }
        public Long getIntentId() {
            return this.intentId;
        }

        public CreateBeebotIntentLgfRequestLgfDefinition setRuleText(String ruleText) {
            this.ruleText = ruleText;
            return this;
        }
        public String getRuleText() {
            return this.ruleText;
        }

    }

}
