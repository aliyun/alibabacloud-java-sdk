// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class GetAgentProfileRequest extends TeaModel {
    /**
     * <p>The ID of the agent configuration.</p>
     * <blockquote>
     * <p>The agent configuration ID for a created scenario is available in the ChatbotId parameter returned by the DescribeScript operation.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>d31794e2a51f47d2901b4094d88311d7</p>
     */
    @NameInMap("AgentProfileId")
    public String agentProfileId;

    /**
     * <p>The IP address of the application. This is a system field and is optional.</p>
     * 
     * <strong>example:</strong>
     * <p>127.0.0.1</p>
     */
    @NameInMap("AppIp")
    public String appIp;

    /**
     * <p>The instance ID.</p>
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
