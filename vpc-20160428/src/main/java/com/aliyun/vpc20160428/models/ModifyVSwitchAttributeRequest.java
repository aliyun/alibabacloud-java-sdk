// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyVSwitchAttributeRequest extends TeaModel {
    /**
     * <p>The new description for the vSwitch.</p>
     * <p>The description must be 1 to 256 characters in length and cannot start with <code>http://</code> or <code>https://</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>This is my vswitch.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Specifies whether to enable the IPv6 feature for the vSwitch. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: enables the IPv6 feature.</li>
     * <li><strong>false</strong>: disables the IPv6 feature. This is the default value.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("EnableIPv6")
    public Boolean enableIPv6;

    /**
     * <p>The last eight bits of the IPv6 CIDR block of the vSwitch. Valid values: <strong>0</strong> to <strong>255</strong>.</p>
     * <p>You can set this parameter only when the IPv6 feature is enabled for the virtual private cloud (VPC) to which the vSwitch belongs.</p>
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
     * <p>The ID of the region where the vSwitch is deployed. You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to query the most recent region list.</p>
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
     * <p>The new name for the vSwitch.</p>
     * <p>The name must be 1 to 128 characters in length, and cannot start with <code>http://</code> or <code>https://</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>VSwitch-1</p>
     */
    @NameInMap("VSwitchName")
    public String vSwitchName;

    /**
     * <p>The IPv6 CIDR block of the VPC to which the vSwitch belongs.</p>
     * <p>You can set this parameter only when the IPv6 feature is enabled for the VPC.</p>
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
