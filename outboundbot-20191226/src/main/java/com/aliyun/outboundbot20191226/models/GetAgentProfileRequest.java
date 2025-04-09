// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class GetAgentProfileRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>37ca3ca1ac4b4e57adf3da5b5d939d04</p>
     */
    @NameInMap("AgentProfileId")
    public String agentProfileId;

    /**
     * <strong>example:</strong>
     * <p>127.0.0.1</p>
     */
    @NameInMap("AppIp")
    public String appIp;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0ec0c897-b92c-40e4-9ad7-e6e4f5ce13bb</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static GetAgentProfileRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAgentProfileRequest self = new GetAgentProfileRequest();
        return TeaModel.build(map, self);
    }

    public GetAgentProfileRequest setAgentProfileId(String agentProfileId) {
        this.agentProfileId = agentProfileId;
        return this;
    }
    public String getAgentProfileId() {
        return this.agentProfileId;
    }

    public GetAgentProfileRequest setAppIp(String appIp) {
        this.appIp = appIp;
        return this;
    }
    public String getAppIp() {
        return this.appIp;
    }

    public GetAgentProfileRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
