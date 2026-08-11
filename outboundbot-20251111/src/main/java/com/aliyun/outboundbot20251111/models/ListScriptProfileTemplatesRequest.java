// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20251111.models;

import com.aliyun.tea.*;

public class ListScriptProfileTemplatesRequest extends TeaModel {
    /**
     * <p>The instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>4f9a8e2b-6c1d-4a7e-9b3f-2d5c8a1e7b04</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The NLU engine type.</p>
     * 
     * <strong>example:</strong>
     * <p>BEEBOT</p>
     */
    @NameInMap("NluEngine")
    public String nluEngine;

    public static ListScriptProfileTemplatesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListScriptProfileTemplatesRequest self = new ListScriptProfileTemplatesRequest();
        return TeaModel.build(map, self);
    }

    public ListScriptProfileTemplatesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListScriptProfileTemplatesRequest setNluEngine(String nluEngine) {
        this.nluEngine = nluEngine;
        return this;
    }
    public String getNluEngine() {
        return this.nluEngine;
    }

}
