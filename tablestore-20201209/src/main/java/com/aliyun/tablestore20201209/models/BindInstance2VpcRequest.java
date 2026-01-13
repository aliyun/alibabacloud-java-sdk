// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tablestore20201209.models;

import com.aliyun.tea.*;

public class BindInstance2VpcRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>mkdd-test</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xu6666</p>
     */
    @NameInMap("InstanceVpcName")
    public String instanceVpcName;

    /**
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

    public static BindInstance2VpcRequest build(java.util.Map<String, ?> map) throws Exception {
        BindInstance2VpcRequest self = new BindInstance2VpcRequest();
        return TeaModel.build(map, self);
    }

    public BindInstance2VpcRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public BindInstance2VpcRequest setInstanceVpcName(String instanceVpcName) {
        this.instanceVpcName = instanceVpcName;
        return this;
    }
    public String getInstanceVpcName() {
        return this.instanceVpcName;
    }

    public BindInstance2VpcRequest setVirtualSwitchId(String virtualSwitchId) {
        this.virtualSwitchId = virtualSwitchId;
        return this;
    }
    public String getVirtualSwitchId() {
        return this.virtualSwitchId;
    }

    public BindInstance2VpcRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

}
