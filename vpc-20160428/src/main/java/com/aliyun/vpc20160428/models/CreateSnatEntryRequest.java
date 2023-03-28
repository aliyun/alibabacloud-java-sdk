// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateSnatEntryRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <br>
     * <p>You can use the client to generate the value, but you must make sure that it is unique among different requests. `The token can contain only ASCII characters.`</p>
     * <br>
     * <p>>  If you do not set this parameter, **ClientToken** is set to the value of **RequestId**. The value of **RequestId** for each API request may be different.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to enable EIP affinity. Valid values:</p>
     * <br>
     * <p>*   **0**: no</p>
     * <p>*   **1**: yes</p>
     * <br>
     * <p>>  If EIP affinity is enabled and the SNAT entry is associated with multiple EIPs, a client uses the same EIP to access the Internet. Otherwise, the client uses an EIP selected from the associated EIPs to access the Internet.</p>
     */
    @NameInMap("EipAffinity")
    public Integer eipAffinity;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The ID of the region where the NAT gateway is deployed.</p>
     * <br>
     * <p>You can call the [DescribeRegions](~~36063~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>Enter a name for the SNAT entry.</p>
     * <br>
     * <p>The name must be 2 to 128 characters in length. It must start with a letter but cannot start with `http://` or `https://`.</p>
     */
    @NameInMap("SnatEntryName")
    public String snatEntryName;

    /**
     * <p>*   The EIPs in the SNAT entry when you add an SNAT entry to an Internet NAT gateway. Separate EIPs with commas (,).</p>
     * <br>
     * <p>>  If you select multiple EIPs to create an SNAT address pool, connections are hashed to these EIPs. Network traffic may not be evenly distributed to the EIPs because the amount of traffic that passes through each connection varies. We recommend that you associate these EIPs with the same EIP bandwidth plan to prevent service interruptions due to the bandwidth limit of an individual EIP.</p>
     * <br>
     * <p>*   When you add an SNAT entry to a VPC NAT gateway, this parameter specifies the NAT IP address in the SNAT entry.</p>
     */
    @NameInMap("SnatIp")
    public String snatIp;

    /**
     * <p>The ID of the SNAT table.</p>
     */
    @NameInMap("SnatTableId")
    public String snatTableId;

    /**
     * <p>You can specify the CIDR block of a VPC, a vSwitch, or an ECS instance or enter a custom CIDR block.</p>
     * <br>
     * <p>You can specify an SNAT entry in the following ways:</p>
     * <br>
     * <p>*   You can specify the CIDR block of the VPC where the NAT gateway is deployed. Then, all ECS instances in the VPC can access the Internet or external networks by using SNAT.</p>
     * <p>*   You can specify the CIDR block of a vSwitch, for example, 192.168.1.0/24. Then, the ECS instances in the vSwitch can access the Internet or external networks by using SNAT.</p>
     * <p>*   You can specify the IP address of an ECS instance, for example, 192.168.1.1/32. Then, the ECS instance can access the Internet or external networks by using SNAT.</p>
     * <p>*   You can specify a custom CIDR block. Then, all ECS instances within the specified CIDR block can access the Internet or external networks by using SNAT.</p>
     * <br>
     * <p>When you add an SNAT entry to an Internet NAT gateway, if **SnatIp** is set to an EIP, the ECS instance uses the specified EIP to access the Internet.</p>
     * <br>
     * <p>If **SnatIp** is set to multiple EIPs, the ECS instance randomly selects an EIP specified in the **SnatIp** parameter to access the Internet.</p>
     * <br>
     * <p>You cannot set this parameter and **SourceVSwtichId** at the same time. If the **SourceVSwitchId** parameter is set, you cannot set the **SourceCIDR** parameter. If the **SourceCIDR** parameter is set, you cannot set the **SourceVSwitchId** parameter.</p>
     */
    @NameInMap("SourceCIDR")
    public String sourceCIDR;

    /**
     * <p>The ID of the vSwitch.</p>
     * <br>
     * <p>*   When you add an SNAT entry to an Internet NAT gateway, this parameter specifies that ECS instances in the vSwitch can use the SNAT entry to access the Internet. If you select multiple elastic IP addresses (EIPs) to create an SNAT address pool, connections are hashed to these EIPs. Network traffic may not be evenly distributed to the EIPs because the amount of traffic that passes through each connection varies. We recommend that you associate these EIPs with the same EIP bandwidth plan to prevent service interruptions due to the bandwidth limits on individual EIPs.</p>
     * <p>*   When you add an SNAT entry to a VPC NAT gateway, this parameter specifies that ECS instances in the vSwitch can use the SNAT entry to access external networks.</p>
     */
    @NameInMap("SourceVSwitchId")
    public String sourceVSwitchId;

    public static CreateSnatEntryRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSnatEntryRequest self = new CreateSnatEntryRequest();
        return TeaModel.build(map, self);
    }

    public CreateSnatEntryRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateSnatEntryRequest setEipAffinity(Integer eipAffinity) {
        this.eipAffinity = eipAffinity;
        return this;
    }
    public Integer getEipAffinity() {
        return this.eipAffinity;
    }

    public CreateSnatEntryRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateSnatEntryRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateSnatEntryRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateSnatEntryRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateSnatEntryRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateSnatEntryRequest setSnatEntryName(String snatEntryName) {
        this.snatEntryName = snatEntryName;
        return this;
    }
    public String getSnatEntryName() {
        return this.snatEntryName;
    }

    public CreateSnatEntryRequest setSnatIp(String snatIp) {
        this.snatIp = snatIp;
        return this;
    }
    public String getSnatIp() {
        return this.snatIp;
    }

    public CreateSnatEntryRequest setSnatTableId(String snatTableId) {
        this.snatTableId = snatTableId;
        return this;
    }
    public String getSnatTableId() {
        return this.snatTableId;
    }

    public CreateSnatEntryRequest setSourceCIDR(String sourceCIDR) {
        this.sourceCIDR = sourceCIDR;
        return this;
    }
    public String getSourceCIDR() {
        return this.sourceCIDR;
    }

    public CreateSnatEntryRequest setSourceVSwitchId(String sourceVSwitchId) {
        this.sourceVSwitchId = sourceVSwitchId;
        return this;
    }
    public String getSourceVSwitchId() {
        return this.sourceVSwitchId;
    }

}
