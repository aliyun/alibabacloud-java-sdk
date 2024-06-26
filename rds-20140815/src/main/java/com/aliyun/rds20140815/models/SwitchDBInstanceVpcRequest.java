// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class SwitchDBInstanceVpcRequest extends TeaModel {
    /**
     * <p>The instance ID. You can call the DescribeDBInstances operation to query the instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-uf6wjk5*****</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The private IP address of the instance. The private IP address must be within the CIDR block of the vSwitch that is specified by the <strong>VSwitchId</strong> parameter.</p>
     * <blockquote>
     * <p> You can call the DescribeVSwitches operation to query the CIDR block of the vSwitch.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>10.23.XX.XX</p>
     */
    @NameInMap("PrivateIpAddress")
    public String privateIpAddress;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The VPC ID.</p>
     * <blockquote>
     * <p>The VPC must reside in the same region as the instance.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-uf6f7l4fg90*****</p>
     */
    @NameInMap("VPCId")
    public String VPCId;

    /**
     * <p>The vSwitch ID of the instance.</p>
     * <blockquote>
     * <p>The vSwitch must belong to the same zone as the instance.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-uf6adz52c2p*****</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    public static SwitchDBInstanceVpcRequest build(java.util.Map<String, ?> map) throws Exception {
        SwitchDBInstanceVpcRequest self = new SwitchDBInstanceVpcRequest();
        return TeaModel.build(map, self);
    }

    public SwitchDBInstanceVpcRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public SwitchDBInstanceVpcRequest setPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
        return this;
    }
    public String getPrivateIpAddress() {
        return this.privateIpAddress;
    }

    public SwitchDBInstanceVpcRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public SwitchDBInstanceVpcRequest setVPCId(String VPCId) {
        this.VPCId = VPCId;
        return this;
    }
    public String getVPCId() {
        return this.VPCId;
    }

    public SwitchDBInstanceVpcRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

}
