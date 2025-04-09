// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class DescribeTTSConfigRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0ec0c897-b92c-40e4-9ad7-e6e4f5ce13bb</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>d7fbd0a0-27bc-49c4-a456-ecb75e79122b</p>
     */
    @NameInMap("ScriptId")
    public String scriptId;

    public static DescribeTTSConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeTTSConfigRequest self = new DescribeTTSConfigRequest();
        return TeaModel.build(map, self);
    }

    public DescribeTTSConfigRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeTTSConfigRequest setScriptId(String scriptId) {
        this.scriptId = scriptId;
        return this;
    }
    public String getScriptId() {
        return this.scriptId;
    }

}
