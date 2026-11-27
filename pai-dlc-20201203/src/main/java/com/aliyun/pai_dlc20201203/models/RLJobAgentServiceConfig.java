// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class RLJobAgentServiceConfig extends TeaModel {
    /**
     * <p>Specifies whether to enable the companion AgentService for the job. Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Enable")
    public Boolean enable;

    /**
     * <p>The list of name-value environment variables for AgentService. You cannot overwrite platform-reserved variables. The GetRLJob operation returns an asterisk (*) for the values of E2B_API_KEY and platform-specified credentials, and keeps other values unchanged. Automatic masking is not guaranteed for all custom sensitive values.</p>
     */
    @NameInMap("Env")
    public java.util.List<RLJobAgentServiceEnvVar> env;

    public static RLJobAgentServiceConfig build(java.util.Map<String, ?> map) throws Exception {
        RLJobAgentServiceConfig self = new RLJobAgentServiceConfig();
        return TeaModel.build(map, self);
    }

    public RLJobAgentServiceConfig setEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }
    public Boolean getEnable() {
        return this.enable;
    }

    public RLJobAgentServiceConfig setEnv(java.util.List<RLJobAgentServiceEnvVar> env) {
        this.env = env;
        return this;
    }
    public java.util.List<RLJobAgentServiceEnvVar> getEnv() {
        return this.env;
    }

}
