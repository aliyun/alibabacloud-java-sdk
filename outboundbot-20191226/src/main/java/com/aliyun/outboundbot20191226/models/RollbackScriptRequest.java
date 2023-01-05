// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class RollbackScriptRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("RollbackVersion")
    public String rollbackVersion;

    @NameInMap("ScriptId")
    public String scriptId;

    public static RollbackScriptRequest build(java.util.Map<String, ?> map) throws Exception {
        RollbackScriptRequest self = new RollbackScriptRequest();
        return TeaModel.build(map, self);
    }

    public RollbackScriptRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public RollbackScriptRequest setRollbackVersion(String rollbackVersion) {
        this.rollbackVersion = rollbackVersion;
        return this;
    }
    public String getRollbackVersion() {
        return this.rollbackVersion;
    }

    public RollbackScriptRequest setScriptId(String scriptId) {
        this.scriptId = scriptId;
        return this;
    }
    public String getScriptId() {
        return this.scriptId;
    }

}
