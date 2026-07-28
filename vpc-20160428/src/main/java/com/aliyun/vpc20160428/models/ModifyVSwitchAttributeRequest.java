// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyVSwitchAttributeRequest extends TeaModel {
    /**
     * <p>The new description of the vSwitch.  </p>
     * <p>The description must be 1 to 256 characters in length and cannot start with <code>http://</code> or <code>https://</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>This is my vswitch.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Specifies whether to enable IPv6 for the vSwitch. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: enables IPv6. The VPC to which the vSwitch belongs must have IPv6 enabled. You must also specify Ipv6CidrBlock to assign an IPv6 CIDR block to the vSwitch.</li>
     * <li><strong>false</strong> (default): disables IPv6. When you disable IPv6 for the vSwitch, make sure that no IPv6 addresses are in use. You cannot specify Ipv6CidrBlock at the same time.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("EnableIPv6")
    public Boolean enableIPv6;

    /**
     * <p>The last 8 bits of the IPv6 CIDR block of the vSwitch. Valid values: <strong>0</strong> to <strong>255</strong>.</p>
     * <p>You can specify this parameter only when the VPC to which the vSwitch belongs has IPv6 enabled. This parameter is used to assign an IPv6 CIDR block to the vSwitch. After the IPv6 CIDR block is allocated, it cannot be changed to another CIDR block. Make sure that the CIDR block does not overlap with those of other vSwitches in the same VPC.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("Ipv6CidrBlock")
    public Integer ipv6CidrBlock;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID of the vSwitch. You can call <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> to query the most recent region list.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The ID of the vSwitch.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-25nacdfvue4****</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>The new name of the vSwitch.</p>
     * <p>The name must be 1 to 128 characters in length and cannot start with <code>http://</code> or <code>https://</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>VSwitch-1</p>
     */
    @NameInMap("VSwitchName")
    public String vSwitchName;

    /**
     * <p>The IPv6 CIDR block of the VPC to which the vSwitch belongs.
     * If the VPC has multiple IPv6 CIDR blocks, you can specify this parameter to indicate the IPv6 CIDR block range for the vSwitch. If you do not specify this parameter, the IPv6 CIDR block assigned when IPv6 was enabled for the VPC is used.</p>
     * 
     * <strong>example:</strong>
     * <p>2408:XXXX:312:3e00::/56</p>
     */
    @NameInMap("VpcIpv6CidrBlock")
    public String vpcIpv6CidrBlock;

    public static ModifyVSwitchAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyVSwitchAttributeRequest self = new ModifyVSwitchAttributeRequest();
        return TeaModel.build(map, self);
    }

    public ModifyVSwitchAttributeRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModifyVSwitchAttributeRequest setEnableIPv6(Boolean enableIPv6) {
        this.enableIPv6 = enableIPv6;
        return this;
    }
    public Boolean getEnableIPv6() {
        return this.enableIPv6;
    }

    public ModifyVSwitchAttributeRequest setIpv6CidrBlock(Integer ipv6CidrBlock) {
        this.ipv6CidrBlock = ipv6CidrBlock;
        return this;
    }
    public Integer getIpv6CidrBlock() {
        return this.ipv6CidrBlock;
    }

    public ModifyVSwitchAttributeRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyVSwitchAttributeRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyVSwitchAttributeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyVSwitchAttributeRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyVSwitchAttributeRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifyVSwitchAttributeRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public ModifyVSwitchAttributeRequest setVSwitchName(String vSwitchName) {
        this.vSwitchName = vSwitchName;
        return this;
    }
    public String getVSwitchName() {
        return this.vSwitchName;
    }

    public ModifyVSwitchAttributeRequest setVpcIpv6CidrBlock(String vpcIpv6CidrBlock) {
        this.vpcIpv6CidrBlock = vpcIpv6CidrBlock;
        return this;
    }
    public String getVpcIpv6CidrBlock() {
        return this.vpcIpv6CidrBlock;
    }

}
