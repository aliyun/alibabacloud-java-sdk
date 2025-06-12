// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class ModifyBeebotIntentLgfRequest extends TeaModel {
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
    public ModifyBeebotIntentLgfRequestLgfDefinition lgfDefinition;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>5666117</p>
     */
    @NameInMap("LgfId")
    public Long lgfId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>c5c5d8c0-c0f1-48a7-be2b-dc46006d888a</p>
     */
    @NameInMap("ScriptId")
    public String scriptId;

    public static ModifyBeebotIntentLgfRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyBeebotIntentLgfRequest self = new ModifyBeebotIntentLgfRequest();
        return TeaModel.build(map, self);
    }

    public ModifyBeebotIntentLgfRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyBeebotIntentLgfRequest setLgfDefinition(ModifyBeebotIntentLgfRequestLgfDefinition lgfDefinition) {
        this.lgfDefinition = lgfDefinition;
        return this;
    }
    public ModifyBeebotIntentLgfRequestLgfDefinition getLgfDefinition() {
        return this.lgfDefinition;
    }

    public ModifyBeebotIntentLgfRequest setLgfId(Long lgfId) {
        this.lgfId = lgfId;
        return this;
    }
    public Long getLgfId() {
        return this.lgfId;
    }

    public ModifyBeebotIntentLgfRequest setScriptId(String scriptId) {
        this.scriptId = scriptId;
        return this;
    }
    public String getScriptId() {
        return this.scriptId;
    }

    public static class ModifyBeebotIntentLgfRequestLgfDefinition extends TeaModel {
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

        public static ModifyBeebotIntentLgfRequestLgfDefinition build(java.util.Map<String, ?> map) throws Exception {
            ModifyBeebotIntentLgfRequestLgfDefinition self = new ModifyBeebotIntentLgfRequestLgfDefinition();
            return TeaModel.build(map, self);
        }

        public ModifyBeebotIntentLgfRequestLgfDefinition setIntentId(Long intentId) {
            this.intentId = intentId;
            return this;
        }
        public Long getIntentId() {
            return this.intentId;
        }

        public ModifyBeebotIntentLgfRequestLgfDefinition setRuleText(String ruleText) {
            this.ruleText = ruleText;
            return this;
        }
        public String getRuleText() {
            return this.ruleText;
        }

    }

}
