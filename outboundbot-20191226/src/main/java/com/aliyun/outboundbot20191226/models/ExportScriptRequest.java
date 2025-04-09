// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class ExportScriptRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>12f3dd08-0c55-44ce-9b64-e69d35ed3a76</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>d004cfd2-6a81-491c-83c6-cbe186620c95</p>
     */
    @NameInMap("ScriptId")
    public String scriptId;

    public static ExportScriptRequest build(java.util.Map<String, ?> map) throws Exception {
        ExportScriptRequest self = new ExportScriptRequest();
        return TeaModel.build(map, self);
    }

    public ExportScriptRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ExportScriptRequest setScriptId(String scriptId) {
        this.scriptId = scriptId;
        return this;
    }
    public String getScriptId() {
        return this.scriptId;
    }

}
