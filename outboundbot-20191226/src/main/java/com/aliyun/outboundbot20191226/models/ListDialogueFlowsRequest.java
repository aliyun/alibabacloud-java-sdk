// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class ListDialogueFlowsRequest extends TeaModel {
    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>b5b0a30f-69e7-4147-98b5-553fc526361d</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The script ID.</p>
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
