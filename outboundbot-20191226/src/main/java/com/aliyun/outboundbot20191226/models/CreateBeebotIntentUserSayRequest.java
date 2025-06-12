// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class CreateBeebotIntentUserSayRequest extends TeaModel {
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
    public CreateBeebotIntentUserSayRequestUserSayDefinition userSayDefinition;

    public static CreateBeebotIntentUserSayRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateBeebotIntentUserSayRequest self = new CreateBeebotIntentUserSayRequest();
        return TeaModel.build(map, self);
    }

    public CreateBeebotIntentUserSayRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateBeebotIntentUserSayRequest setScriptId(String scriptId) {
        this.scriptId = scriptId;
        return this;
    }
    public String getScriptId() {
        return this.scriptId;
    }

    public CreateBeebotIntentUserSayRequest setUserSayDefinition(CreateBeebotIntentUserSayRequestUserSayDefinition userSayDefinition) {
        this.userSayDefinition = userSayDefinition;
        return this;
    }
    public CreateBeebotIntentUserSayRequestUserSayDefinition getUserSayDefinition() {
        return this.userSayDefinition;
    }

    public static class CreateBeebotIntentUserSayRequestUserSayDefinition extends TeaModel {
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

        public static CreateBeebotIntentUserSayRequestUserSayDefinition build(java.util.Map<String, ?> map) throws Exception {
            CreateBeebotIntentUserSayRequestUserSayDefinition self = new CreateBeebotIntentUserSayRequestUserSayDefinition();
            return TeaModel.build(map, self);
        }

        public CreateBeebotIntentUserSayRequestUserSayDefinition setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public CreateBeebotIntentUserSayRequestUserSayDefinition setIntentId(Long intentId) {
            this.intentId = intentId;
            return this;
        }
        public Long getIntentId() {
            return this.intentId;
        }

    }

}
