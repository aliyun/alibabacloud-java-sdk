// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class DeleteCustomScriptTemplateRequest extends TeaModel {
    /**
     * <p>The ID of the custom scenario template.</p>
     * 
     * <strong>example:</strong>
     * <p>d31794e2a51f47d2901b4094d88311d7</p>
     */
    @NameInMap("AgentProfileId")
    public String agentProfileId;

    /**
     * <p>The instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0ec0c897-b92c-40e4-9ad7-e6e4f5ce13bb</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static DeleteCustomScriptTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteCustomScriptTemplateRequest self = new DeleteCustomScriptTemplateRequest();
        return TeaModel.build(map, self);
    }

    public DeleteCustomScriptTemplateRequest setAgentProfileId(String agentProfileId) {
        this.agentProfileId = agentProfileId;
        return this;
    }
    public String getAgentProfileId() {
        return this.agentProfileId;
    }

    public DeleteCustomScriptTemplateRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
