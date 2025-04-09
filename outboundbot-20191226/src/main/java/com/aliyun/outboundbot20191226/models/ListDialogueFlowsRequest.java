// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class ListDialogueFlowsRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>361c8a53-0e29-42f3-8aa7-c7752d010399</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>d7c28efb-47f7-4a85-a522-5038e30a0b98</p>
     */
    @NameInMap("ScriptId")
    public String scriptId;

    public static ListDialogueFlowsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDialogueFlowsRequest self = new ListDialogueFlowsRequest();
        return TeaModel.build(map, self);
    }

    public ListDialogueFlowsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListDialogueFlowsRequest setScriptId(String scriptId) {
        this.scriptId = scriptId;
        return this;
    }
    public String getScriptId() {
        return this.scriptId;
    }

}
