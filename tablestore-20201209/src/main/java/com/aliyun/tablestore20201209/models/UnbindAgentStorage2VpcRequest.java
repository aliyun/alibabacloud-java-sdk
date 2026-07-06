// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tablestore20201209.models;

import com.aliyun.tea.*;

public class UnbindAgentStorage2VpcRequest extends TeaModel {
    /**
     * <p>The agent storage name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>agent-test</p>
     */
    @NameInMap("AgentStorageName")
    public String agentStorageName;

    /**
     * <p>The VPC name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>remua</p>
     */
    @NameInMap("AgentStorageVpcName")
    public String agentStorageVpcName;

    public static UnbindAgentStorage2VpcRequest build(java.util.Map<String, ?> map) throws Exception {
        UnbindAgentStorage2VpcRequest self = new UnbindAgentStorage2VpcRequest();
        return TeaModel.build(map, self);
    }

    public UnbindAgentStorage2VpcRequest setAgentStorageName(String agentStorageName) {
        this.agentStorageName = agentStorageName;
        return this;
    }
    public String getAgentStorageName() {
        return this.agentStorageName;
    }

    public UnbindAgentStorage2VpcRequest setAgentStorageVpcName(String agentStorageVpcName) {
        this.agentStorageVpcName = agentStorageVpcName;
        return this;
    }
    public String getAgentStorageVpcName() {
        return this.agentStorageVpcName;
    }

}
