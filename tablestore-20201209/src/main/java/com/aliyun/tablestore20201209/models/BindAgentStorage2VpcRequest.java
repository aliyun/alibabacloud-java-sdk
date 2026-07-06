// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tablestore20201209.models;

import com.aliyun.tea.*;

public class BindAgentStorage2VpcRequest extends TeaModel {
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

    /**
     * <p>The vSwitch ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-uf6***********ez6ge</p>
     */
    @NameInMap("VirtualSwitchId")
    public String virtualSwitchId;

    /**
     * <p>VPC ID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-2ze***********g31n7</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    public static BindAgentStorage2VpcRequest build(java.util.Map<String, ?> map) throws Exception {
        BindAgentStorage2VpcRequest self = new BindAgentStorage2VpcRequest();
        return TeaModel.build(map, self);
    }

    public BindAgentStorage2VpcRequest setAgentStorageName(String agentStorageName) {
        this.agentStorageName = agentStorageName;
        return this;
    }
    public String getAgentStorageName() {
        return this.agentStorageName;
    }

    public BindAgentStorage2VpcRequest setAgentStorageVpcName(String agentStorageVpcName) {
        this.agentStorageVpcName = agentStorageVpcName;
        return this;
    }
    public String getAgentStorageVpcName() {
        return this.agentStorageVpcName;
    }

    public BindAgentStorage2VpcRequest setVirtualSwitchId(String virtualSwitchId) {
        this.virtualSwitchId = virtualSwitchId;
        return this;
    }
    public String getVirtualSwitchId() {
        return this.virtualSwitchId;
    }

    public BindAgentStorage2VpcRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

}
