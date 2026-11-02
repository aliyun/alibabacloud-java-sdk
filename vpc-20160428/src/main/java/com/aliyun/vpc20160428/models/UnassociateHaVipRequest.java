// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class UnassociateHaVipRequest extends TeaModel {
    /**
     * <p>Specifies the client token that is used to ensure the idempotence of the request. You can use the client to generate the value, and you must make sure that the value is unique among different requests. The <code>ClientToken</code> parameter can contain only ASCII characters and cannot exceed 64 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>0c593ea1-3bea-11e9-b96b-88e9fe63****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to forcibly disassociate HaVip from the associated ECS instance or elastic network interface controller (NIC). Valid values:</p>
     * <ul>
     * <li><p><strong>True</strong>: forcibly disassociates the instance or elastic network interface controller (NIC).</p>
     * </li>
     * <li><p><strong>False</strong> (default): does not forcibly disassociate the instance or elastic network interface controller (NIC).</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>If this parameter is set to <strong>False</strong>, you cannot disassociate the primary instance attached to the HaVip.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Force")
    public String force;

    /**
     * <p>The ID of the HaVip to be disassociated.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>havip-2zeo05qre24nhrqpy****</p>
     */
    @NameInMap("HaVipId")
    public String haVipId;

    /**
     * <p>The ID of the ECS instance or the elastic network interface controller (NIC) from which the HaVip is disassociated.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>i-faf344422ffsfad****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The type of the instance from which you want to disassociate HaVip. Valid values:</p>
     * <ul>
     * <li><p><strong>EcsInstance</strong>: ECS instance.</p>
     * </li>
     * <li><p><strong>NetworkInterface</strong>: elastic network interface controller (NIC).</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>This parameter is required when the instance to be disassociated is an elastic network interface controller (NIC).</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>EcsInstance</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID of the HaVip.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static UnassociateHaVipRequest build(java.util.Map<String, ?> map) throws Exception {
        UnassociateHaVipRequest self = new UnassociateHaVipRequest();
        return TeaModel.build(map, self);
    }

    public UnassociateHaVipRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UnassociateHaVipRequest setForce(String force) {
        this.force = force;
        return this;
    }
    public String getForce() {
        return this.force;
    }

    public UnassociateHaVipRequest setHaVipId(String haVipId) {
        this.haVipId = haVipId;
        return this;
    }
    public String getHaVipId() {
        return this.haVipId;
    }

    public UnassociateHaVipRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UnassociateHaVipRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public UnassociateHaVipRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public UnassociateHaVipRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public UnassociateHaVipRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UnassociateHaVipRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public UnassociateHaVipRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
