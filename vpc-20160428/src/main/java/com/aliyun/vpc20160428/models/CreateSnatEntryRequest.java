// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateSnatEntryRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can use the client to generate the value, but you must make sure that the value is unique among different requests. The ClientToken parameter can contain only ASCII characters.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the system automatically uses the <strong>RequestId</strong> of the API request as the <strong>ClientToken</strong>. The <strong>RequestId</strong> of each API request may be different.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>02fb3da4-130e-11e9-8e44****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to only perform a dry run on the request. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: The system performs a dry run on the request without creating the SNAT entry. The system checks whether your AccessKey pair is valid, whether the Resource Access Management (RAM) user has the required authorization, and whether the required parameters are specified. If the request fails the dry run, an error message is returned. If the request passes the dry run, the DryRunOperation error code is returned.</p>
     * </li>
     * <li><p><strong>false</strong> (default): The system sends a normal request. If the request passes the dry run, a 2xx HTTP status code is returned and the SNAT entry is created.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>Specifies whether to enable EIP affinity. Valid values:</p>
     * <ul>
     * <li><p><strong>0</strong> (default): EIP affinity is disabled.</p>
     * </li>
     * <li><p><strong>1</strong>: EIP affinity is enabled.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>After you enable EIP affinity, if the SNAT entry is associated with multiple EIPs or NAT IP addresses, the same client uses the same EIP or NAT IP address to access the same destination IP address. Otherwise, the client randomly selects an EIP or NAT IP address from the associated EIPs or NAT IP addresses.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("EipAffinity")
    public Integer eipAffinity;

    /**
     * <p>The source matching type of the SNAT entry. Valid values:</p>
     * <ul>
     * <li>CIDR: matches the source CIDR block. This is the default value.</li>
     * <li>TUNNEL: matches the tunnel. When this value is specified, both SourceVSwitchId and SourceCIDR can be left empty.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>CIDR</p>
     */
    @NameInMap("MatchType")
    public String matchType;

    /**
     * <p>The ID of the elastic network interface (ENI).</p>
     * <blockquote>
     * <p>The IPv4 addresses of the elastic network interface (ENI) are used as the SNAT IP addresses.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>eni-gw8g131ef2dnbu3k****</p>
     */
    @NameInMap("NetworkInterfaceId")
    public String networkInterfaceId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID of the NAT gateway. </p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to query region IDs.</p>
     * <p>This parameter is required.</p>
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
     * <p>The name of the SNAT entry.</p>
     * <p>The name must be 2 to 128 characters in length, and must start with a letter or Chinese character. It cannot start with <code>http://</code> or <code>https://</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>SnatEntry-1</p>
     */
    @NameInMap("SnatEntryName")
    public String snatEntryName;

    /**
     * <p>When you create an SNAT entry for an Internet NAT gateway:</p>
     * <ul>
     * <li><p>The SnatIp parameter is required.</p>
     * </li>
     * <li><p>This parameter specifies the EIPs in the SNAT entry. Separate multiple EIPs with commas (,).</p>
     * </li>
     * <li><p>If SnatIp specifies only one public IP address, the ECS instance uses the specified public IP address to access the Internet.</p>
     * </li>
     * <li><p>If SnatIp specifies multiple public IP addresses, the ECS instance randomly uses one of the public IP addresses in SnatIp to access the Internet.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>If you specify multiple EIPs to configure an SNAT IPAM pool, service connections are allocated to the EIPs through a hash algorithm. Because service traffic of each connection varies, service traffic of the EIPs may be unbalanced. We recommend that you add all EIPs to the same Internet Shared Bandwidth to prevent service interruptions caused by the bandwidth limit of a single EIP.</p>
     * </blockquote>
     * <p>When you create an SNAT entry for a VPC NAT gateway:</p>
     * <ul>
     * <li><p>This parameter specifies the NAT IP addresses in the SNAT entry. Separate multiple NAT IP addresses with commas (,).</p>
     * </li>
     * <li><p>You must specify either the SnatIp parameter or the NetworkInterfaceId parameter.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>47.98.XX.XX</p>
     */
    @NameInMap("SnatIp")
    public String snatIp;

    /**
     * <p>The ID of the SNAT table.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>stb-bp190wu8io1vgev****</p>
     */
    @NameInMap("SnatTableId")
    public String snatTableId;

    /**
     * <p>The CIDR block of a VPC, vSwitch, or ECS instance. You can also specify any custom CIDR block.</p>
     * <p>SNAT entries support the following granularities: </p>
     * <ul>
     * <li><p>VPC granularity: The CIDR block of the VPC where the NAT gateway is deployed. All ECS instances in the VPC can access the Internet or external networks through SNAT rules.</p>
     * </li>
     * <li><p>vSwitch granularity: The CIDR block of a specified vSwitch (such as 192.168.1.0/24). All ECS instances in the vSwitch can access the Internet or external networks through SNAT rules.</p>
     * </li>
     * <li><p>ECS instance granularity: The IP address of a specified ECS instance (such as 192.168.1.1/32). The ECS instance can access the Internet or external networks through SNAT rules.</p>
     * </li>
     * <li><p>Custom CIDR block: Any specified CIDR block. All ECS instances within the CIDR block can access the Internet or external networks through the SNAT feature.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>You must specify either the <strong>SourceCIDR</strong> parameter or the <strong>SourceVSwtichId</strong> parameter, but not both.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>10.1.1.0/24</p>
     */
    @NameInMap("SourceCIDR")
    public String sourceCIDR;

    /**
     * <p>The ID of the vSwitch.</p>
     * <ul>
     * <li><p>When you create an SNAT entry for an Internet NAT gateway, this parameter specifies that all ECS instances in the vSwitch can access the Internet through the SNAT rule. If you specify multiple EIPs to configure an SNAT IPAM pool, service connections are allocated to the EIPs through a hash algorithm. Because service traffic of each connection varies, service traffic of the EIPs may be unbalanced. We recommend that you add all EIPs to the same Internet Shared Bandwidth to prevent service interruptions caused by the bandwidth limit of a single EIP.</p>
     * </li>
     * <li><p>When you create an SNAT entry for a VPC NAT gateway, this parameter specifies that all ECS instances in the vSwitch can access external networks through the SNAT rule.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>You must specify either the <strong>SourceCIDR</strong> parameter or the <strong>SourceVSwitchId</strong> parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>vsw-bp1nhx2s9ui5o****</p>
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

    public CreateSnatEntryRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public CreateSnatEntryRequest setEipAffinity(Integer eipAffinity) {
        this.eipAffinity = eipAffinity;
        return this;
    }
    public Integer getEipAffinity() {
        return this.eipAffinity;
    }

    public CreateSnatEntryRequest setMatchType(String matchType) {
        this.matchType = matchType;
        return this;
    }
    public String getMatchType() {
        return this.matchType;
    }

    public CreateSnatEntryRequest setNetworkInterfaceId(String networkInterfaceId) {
        this.networkInterfaceId = networkInterfaceId;
        return this;
    }
    public String getNetworkInterfaceId() {
        return this.networkInterfaceId;
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
