// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class DeleteBeebotIntentUserSayRequest extends TeaModel {
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
     * <p>10717802</p>
     */
    @NameInMap("IntentId")
    public String intentId;

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
     * 
     * <strong>example:</strong>
     * <p>17448458</p>
     */
    @NameInMap("UserSayId")
    public String userSayId;

    public static DeleteBeebotIntentUserSayRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteBeebotIntentUserSayRequest self = new DeleteBeebotIntentUserSayRequest();
        return TeaModel.build(map, self);
    }

    public DeleteBeebotIntentUserSayRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DeleteBeebotIntentUserSayRequest setIntentId(String intentId) {
        this.intentId = intentId;
        return this;
    }
    public String getIntentId() {
        return this.intentId;
    }

    public DeleteBeebotIntentUserSayRequest setScriptId(String scriptId) {
        this.scriptId = scriptId;
        return this;
    }
    public String getScriptId() {
        return this.scriptId;
    }

    public DeleteBeebotIntentUserSayRequest setUserSayId(String userSayId) {
        this.userSayId = userSayId;
        return this;
    }
    public String getUserSayId() {
        return this.userSayId;
    }

}
