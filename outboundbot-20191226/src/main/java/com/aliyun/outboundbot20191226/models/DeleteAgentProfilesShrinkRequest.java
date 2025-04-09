// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class DeleteAgentProfilesShrinkRequest extends TeaModel {
    @NameInMap("AgentProfileIds")
    public String agentProfileIdsShrink;

    /**
     * <strong>example:</strong>
     * <p>127.0.0.1</p>
     */
    @NameInMap("AppIp")
    public String appIp;

    public static DeleteAgentProfilesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAgentProfilesShrinkRequest self = new DeleteAgentProfilesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAgentProfilesShrinkRequest setAgentProfileIdsShrink(String agentProfileIdsShrink) {
        this.agentProfileIdsShrink = agentProfileIdsShrink;
        return this;
    }
    public String getAgentProfileIdsShrink() {
        return this.agentProfileIdsShrink;
    }

    public DeleteAgentProfilesShrinkRequest setAppIp(String appIp) {
        this.appIp = appIp;
        return this;
    }
    public String getAppIp() {
        return this.appIp;
    }

}
