// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class DeleteAgentProfilesRequest extends TeaModel {
    @NameInMap("AgentProfileIds")
    public java.util.List<String> agentProfileIds;

    /**
     * <strong>example:</strong>
     * <p>127.0.0.1</p>
     */
    @NameInMap("AppIp")
    public String appIp;

    public static DeleteAgentProfilesRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAgentProfilesRequest self = new DeleteAgentProfilesRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAgentProfilesRequest setAgentProfileIds(java.util.List<String> agentProfileIds) {
        this.agentProfileIds = agentProfileIds;
        return this;
    }
    public java.util.List<String> getAgentProfileIds() {
        return this.agentProfileIds;
    }

    public DeleteAgentProfilesRequest setAppIp(String appIp) {
        this.appIp = appIp;
        return this;
    }
    public String getAppIp() {
        return this.appIp;
    }

}
