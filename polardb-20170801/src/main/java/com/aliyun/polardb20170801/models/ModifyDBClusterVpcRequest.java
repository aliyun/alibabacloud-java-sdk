// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyDBClusterVpcRequest extends TeaModel {
    /**
     * <p>The cluster ID. This operation is supported only for clusters of specific categories. MySQL Normal and Exclusive clusters are not supported. You can call the DescribeDBClusters operation to query the cluster category before you call this operation. Note: This operation is supported only for clusters of specific categories. MySQL Normal and Exclusive clusters are not supported. Before calling this operation, call DescribeDBClusters to confirm the cluster category.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-*************</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>Specifies whether to switch existing endpoints. Valid values:</p>
     * <ul>
     * <li><strong>NONE</strong>: Does not switch existing endpoints.</li>
     * <li><strong>ALL</strong>: Switches existing endpoints.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>NONE</p>
     */
    @NameInMap("ExistedEndpointSwitchType")
    public String existedEndpointSwitchType;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The specified VPC ID.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-*******************</p>
     */
    @NameInMap("VPCId")
    public String VPCId;

    /**
     * <p>The specified vSwitch ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-**********</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    public static ModifyDBClusterVpcRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBClusterVpcRequest self = new ModifyDBClusterVpcRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDBClusterVpcRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public ModifyDBClusterVpcRequest setExistedEndpointSwitchType(String existedEndpointSwitchType) {
        this.existedEndpointSwitchType = existedEndpointSwitchType;
        return this;
    }
    public String getExistedEndpointSwitchType() {
        return this.existedEndpointSwitchType;
    }

    public ModifyDBClusterVpcRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyDBClusterVpcRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyDBClusterVpcRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyDBClusterVpcRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifyDBClusterVpcRequest setVPCId(String VPCId) {
        this.VPCId = VPCId;
        return this;
    }
    public String getVPCId() {
        return this.VPCId;
    }

    public ModifyDBClusterVpcRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

}
