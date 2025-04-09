// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class PublishScriptForDebugRequest extends TeaModel {
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
     * <p>0bfe34e5-a7fa-4aac-91d4-bd798518dffc</p>
     */
    @NameInMap("ScriptId")
    public String scriptId;

    public static PublishScriptForDebugRequest build(java.util.Map<String, ?> map) throws Exception {
        PublishScriptForDebugRequest self = new PublishScriptForDebugRequest();
        return TeaModel.build(map, self);
    }

    public PublishScriptForDebugRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public PublishScriptForDebugRequest setScriptId(String scriptId) {
        this.scriptId = scriptId;
        return this;
    }
    public String getScriptId() {
        return this.scriptId;
    }

}
