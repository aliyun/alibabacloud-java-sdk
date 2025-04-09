// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class RollbackScriptRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>af81a389-91f0-4157-8d82-720edd02b66a</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1579055782000</p>
     */
    @NameInMap("RollbackVersion")
    public String rollbackVersion;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>303523b1-0094-4ebe-b9ed-c23d11c91d61</p>
     */
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
