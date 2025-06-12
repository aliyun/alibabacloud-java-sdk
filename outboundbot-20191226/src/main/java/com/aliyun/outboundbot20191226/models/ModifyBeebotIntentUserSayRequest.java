// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class ModifyBeebotIntentUserSayRequest extends TeaModel {
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
     * 
     * <strong>example:</strong>
     * <p>c5c5d8c0-c0f1-48a7-be2b-dc46006d888a</p>
     */
    @NameInMap("ScriptId")
    public String scriptId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("UserSayDefinition")
    public ModifyBeebotIntentUserSayRequestUserSayDefinition userSayDefinition;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>17448458</p>
     */
    @NameInMap("UserSayId")
    public String userSayId;

    public static ModifyBeebotIntentUserSayRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyBeebotIntentUserSayRequest self = new ModifyBeebotIntentUserSayRequest();
        return TeaModel.build(map, self);
    }

    public ModifyBeebotIntentUserSayRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyBeebotIntentUserSayRequest setScriptId(String scriptId) {
        this.scriptId = scriptId;
        return this;
    }
    public String getScriptId() {
        return this.scriptId;
    }

    public ModifyBeebotIntentUserSayRequest setUserSayDefinition(ModifyBeebotIntentUserSayRequestUserSayDefinition userSayDefinition) {
        this.userSayDefinition = userSayDefinition;
        return this;
    }
    public ModifyBeebotIntentUserSayRequestUserSayDefinition getUserSayDefinition() {
        return this.userSayDefinition;
    }

    public ModifyBeebotIntentUserSayRequest setUserSayId(String userSayId) {
        this.userSayId = userSayId;
        return this;
    }
    public String getUserSayId() {
        return this.userSayId;
    }

    public static class ModifyBeebotIntentUserSayRequestUserSayDefinition extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10717802</p>
         */
        @NameInMap("IntentId")
        public Long intentId;

        public static ModifyBeebotIntentUserSayRequestUserSayDefinition build(java.util.Map<String, ?> map) throws Exception {
            ModifyBeebotIntentUserSayRequestUserSayDefinition self = new ModifyBeebotIntentUserSayRequestUserSayDefinition();
            return TeaModel.build(map, self);
        }

        public ModifyBeebotIntentUserSayRequestUserSayDefinition setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public ModifyBeebotIntentUserSayRequestUserSayDefinition setIntentId(Long intentId) {
            this.intentId = intentId;
            return this;
        }
        public Long getIntentId() {
            return this.intentId;
        }

    }

}
