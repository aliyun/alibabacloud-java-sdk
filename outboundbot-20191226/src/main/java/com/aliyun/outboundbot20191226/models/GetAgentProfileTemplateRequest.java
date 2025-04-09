// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class GetAgentProfileTemplateRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>default-survey</p>
     */
    @NameInMap("AgentProfileTemplateId")
    public String agentProfileTemplateId;

    /**
     * <strong>example:</strong>
     * <p>127.0.0.1</p>
     */
    @NameInMap("AppIp")
    public String appIp;

    public static GetAgentProfileTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAgentProfileTemplateRequest self = new GetAgentProfileTemplateRequest();
        return TeaModel.build(map, self);
    }

    public GetAgentProfileTemplateRequest setAgentProfileTemplateId(String agentProfileTemplateId) {
        this.agentProfileTemplateId = agentProfileTemplateId;
        return this;
    }
    public String getAgentProfileTemplateId() {
        return this.agentProfileTemplateId;
    }

    public GetAgentProfileTemplateRequest setAppIp(String appIp) {
        this.appIp = appIp;
        return this;
    }
    public String getAppIp() {
        return this.appIp;
    }

}
