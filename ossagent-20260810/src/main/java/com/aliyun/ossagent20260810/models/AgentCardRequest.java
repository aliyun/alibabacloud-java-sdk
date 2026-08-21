// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ossagent20260810.models;

import com.aliyun.tea.*;

public class AgentCardRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>a2a</p>
     */
    @NameInMap("Env")
    public String env;

    public static AgentCardRequest build(java.util.Map<String, ?> map) throws Exception {
        AgentCardRequest self = new AgentCardRequest();
        return TeaModel.build(map, self);
    }

    public AgentCardRequest setEnv(String env) {
        this.env = env;
        return this;
    }
    public String getEnv() {
        return this.env;
    }

}
