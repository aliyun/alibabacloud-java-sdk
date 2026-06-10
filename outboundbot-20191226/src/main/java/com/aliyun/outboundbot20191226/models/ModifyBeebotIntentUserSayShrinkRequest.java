// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class ModifyBeebotIntentUserSayShrinkRequest extends TeaModel {
    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>e5035654-1745-484a-8c5b-165f7c7bcd79</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The scenario ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>c5c5d8c0-c0f1-48a7-be2b-dc46006d888a</p>
     */
    @NameInMap("ScriptId")
    public String scriptId;

    /**
     * <p>The definition of the user utterance.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("UserSayDefinition")
    public String userSayDefinitionShrink;

    /**
     * <p>The user utterance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>17448458</p>
     */
    @NameInMap("UserSayId")
    public String userSayId;

    public static ModifyBeebotIntentUserSayShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyBeebotIntentUserSayShrinkRequest self = new ModifyBeebotIntentUserSayShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ModifyBeebotIntentUserSayShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyBeebotIntentUserSayShrinkRequest setScriptId(String scriptId) {
        this.scriptId = scriptId;
        return this;
    }
    public String getScriptId() {
        return this.scriptId;
    }

    public ModifyBeebotIntentUserSayShrinkRequest setUserSayDefinitionShrink(String userSayDefinitionShrink) {
        this.userSayDefinitionShrink = userSayDefinitionShrink;
        return this;
    }
    public String getUserSayDefinitionShrink() {
        return this.userSayDefinitionShrink;
    }

    public ModifyBeebotIntentUserSayShrinkRequest setUserSayId(String userSayId) {
        this.userSayId = userSayId;
        return this;
    }
    public String getUserSayId() {
        return this.userSayId;
    }

}
