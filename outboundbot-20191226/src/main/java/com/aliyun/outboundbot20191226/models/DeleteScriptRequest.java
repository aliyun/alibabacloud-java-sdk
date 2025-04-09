// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class DeleteScriptRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>b3d5ac22-9643-49c6-aa84-777f6656f9f5</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>5c589560-6b9d-4415-a3e0-049c4ff05f56</p>
     */
    @NameInMap("ScriptId")
    public String scriptId;

    public static DeleteScriptRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteScriptRequest self = new DeleteScriptRequest();
        return TeaModel.build(map, self);
    }

    public DeleteScriptRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DeleteScriptRequest setScriptId(String scriptId) {
        this.scriptId = scriptId;
        return this;
    }
    public String getScriptId() {
        return this.scriptId;
    }

}
