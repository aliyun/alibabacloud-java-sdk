// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tablestore20201209.models;

import com.aliyun.tea.*;

public class DeleteAgentStoragePolicyRequest extends TeaModel {
    /**
     * <p>The name of the agent storage.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>first-agent</p>
     */
    @NameInMap("AgentStorageName")
    public String agentStorageName;

    /**
     * <p>The version of the access control policy for agent storage.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("PolicyVersion")
    public Long policyVersion;

    public static DeleteAgentStoragePolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAgentStoragePolicyRequest self = new DeleteAgentStoragePolicyRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAgentStoragePolicyRequest setAgentStorageName(String agentStorageName) {
        this.agentStorageName = agentStorageName;
        return this;
    }
    public String getAgentStorageName() {
        return this.agentStorageName;
    }

    public DeleteAgentStoragePolicyRequest setPolicyVersion(Long policyVersion) {
        this.policyVersion = policyVersion;
        return this;
    }
    public Long getPolicyVersion() {
        return this.policyVersion;
    }

}
