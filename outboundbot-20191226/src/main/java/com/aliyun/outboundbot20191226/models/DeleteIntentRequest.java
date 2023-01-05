// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class DeleteIntentRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("IntentId")
    public String intentId;

    @NameInMap("ScriptId")
    public String scriptId;

    public static DeleteIntentRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteIntentRequest self = new DeleteIntentRequest();
        return TeaModel.build(map, self);
    }

    public DeleteIntentRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DeleteIntentRequest setIntentId(String intentId) {
        this.intentId = intentId;
        return this;
    }
    public String getIntentId() {
        return this.intentId;
    }

    public DeleteIntentRequest setScriptId(String scriptId) {
        this.scriptId = scriptId;
        return this;
    }
    public String getScriptId() {
        return this.scriptId;
    }

}
