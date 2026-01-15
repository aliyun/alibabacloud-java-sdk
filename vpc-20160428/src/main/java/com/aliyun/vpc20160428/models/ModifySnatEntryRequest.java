// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifySnatEntryRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The client token can contain only ASCII characters.</p>
     * <blockquote>
     * <p> If you do not specify this parameter, the system automatically uses the <strong>request ID</strong> as the <strong>client token</strong>. The <strong>request ID</strong> may be different for each request.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>02fb3da4-130e-11e9-8e44-001****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Whether to perform a dry run of this request, with values:</p>
     * <ul>
     * <li><strong>true</strong>: Sends a check request without modifying the SNAT entry. The checks include whether the required parameters are filled in, the request format, and business restrictions. If the check fails, the corresponding error is returned. If the check passes, an error code <code>DryRunOperation</code> is returned.</li>
     * <li><strong>false</strong> (default): Sends a normal request. After passing the check, it returns a 2xx HTTP status code and modifies the SNAT entry.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>Whether to enable IP affinity. Values:</p>
     * <ul>
     * <li><strong>0</strong>: Disable IP affinity.</li>
     * <li><strong>1</strong>: Enable IP affinity.<blockquote>
     * <p>After enabling the IP affinity switch, if an SNAT entry is bound to multiple EIPs or NAT IPs, the same client will use the same EIP or NAT IP for access; otherwise, the client will randomly select from the bound EIPs or NAT IPs for access.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("EipAffinity")
    public Integer eipAffinity;

    /**
     * <p>Elastic Network Interface ID. The IPv4 address set of the elastic network interface will be used as the SNAT address.</p>
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
     * <p>The region ID of the NAT gateway.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to obtain the region ID.</p>
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
     * <p>The ID of the SNAT entry that you want to modify.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>snat-bp1vcgcf8tm0plqcg****</p>
     */
    @NameInMap("SnatEntryId")
    public String snatEntryId;

    /**
     * <p>The name of the SNAT entry.</p>
     * <p>The name must be 2 to 128 characters in length. It must start with a letter but cannot start with <code>http://</code> or <code>https://</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>SnatEntry-1</p>
     */
    @NameInMap("SnatEntryName")
    public String snatEntryName;

    /**
     * <ul>
     * <li><p>The elastic IP addresses (EIPs) specified in the SNAT entry when you modify an SNAT entry of an Internet NAT gateway. Separate EIPs with commas (,).</p>
     * <p>If you select multiple EIPs to create an SNAT address pool, connections are hashed to these EIPs. Network traffic may not be evenly distributed to the EIPs because the amount of traffic passes through each connection varies. We recommend that you associate these EIPs with the same EIP bandwidth plan to prevent service interruptions due to the bandwidth limit of an individual EIP.</p>
     * </li>
     * <li><p>When you modify an SNAT entry of a VPC NAT gateway, this parameter specifies the NAT IP address in the SNAT entry.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>47.98.XX.XX</p>
     */
    @NameInMap("SnatIp")
    public String snatIp;

    /**
     * <p>The ID of the SNAT table to which the SNAT entry belongs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>stb-8vbczigrhop8x5u3t****</p>
     */
    @NameInMap("SnatTableId")
    public String snatTableId;

    public static ModifySnatEntryRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifySnatEntryRequest self = new ModifySnatEntryRequest();
        return TeaModel.build(map, self);
    }

    public ModifySnatEntryRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ModifySnatEntryRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public ModifySnatEntryRequest setEipAffinity(Integer eipAffinity) {
        this.eipAffinity = eipAffinity;
        return this;
    }
    public Integer getEipAffinity() {
        return this.eipAffinity;
    }

    public ModifySnatEntryRequest setNetworkInterfaceId(String networkInterfaceId) {
        this.networkInterfaceId = networkInterfaceId;
        return this;
    }
    public String getNetworkInterfaceId() {
        return this.networkInterfaceId;
    }

    public ModifySnatEntryRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifySnatEntryRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifySnatEntryRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifySnatEntryRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifySnatEntryRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifySnatEntryRequest setSnatEntryId(String snatEntryId) {
        this.snatEntryId = snatEntryId;
        return this;
    }
    public String getSnatEntryId() {
        return this.snatEntryId;
    }

    public ModifySnatEntryRequest setSnatEntryName(String snatEntryName) {
        this.snatEntryName = snatEntryName;
        return this;
    }
    public String getSnatEntryName() {
        return this.snatEntryName;
    }

    public ModifySnatEntryRequest setSnatIp(String snatIp) {
        this.snatIp = snatIp;
        return this;
    }
    public String getSnatIp() {
        return this.snatIp;
    }

    public ModifySnatEntryRequest setSnatTableId(String snatTableId) {
        this.snatTableId = snatTableId;
        return this;
    }
    public String getSnatTableId() {
        return this.snatTableId;
    }

}
