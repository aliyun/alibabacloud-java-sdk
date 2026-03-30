// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20251111.models;

import com.aliyun.tea.*;

public class ListScriptProfileTemplatesRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>c28fc549-d88f-4f6e-85ad-a0806e5e39c0</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

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

}
