// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeSnatTableEntriesRequest extends TeaModel {
    /**
     * <p>The ID of the NAT gateway.</p>
     * <br>
     * <p>>  You must set at least one of the **SnatTableId** and **NatGatewayId** parameters.</p>
     */
    @NameInMap("NatGatewayId")
    public String natGatewayId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The number of the page to return. Default value: **1**.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page. Maximum value: **50**. Default value: **10**.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The region ID of the NAT gateway.</p>
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
     * <p>The ID of the SNAT entry.</p>
     */
    @NameInMap("SnatEntryId")
    public String snatEntryId;

    /**
     * <p>The name of the SNAT entry.</p>
     * <br>
     * <p>The name must be 2 to 128 characters in length, and can contain digits, underscores (\_), and hyphens (-). The name must start with a letter.</p>
     */
    @NameInMap("SnatEntryName")
    public String snatEntryName;

    /**
     * <p>*   When you query SNAT entries of Internet NAT gateways, this parameter specifies the EIP in an SNAT entry.</p>
     * <p>*   When you query SNAT entries of VPC NAT gateways, this parameter specifies the NAT IP address in an SNAT entry.</p>
     */
    @NameInMap("SnatIp")
    public String snatIp;

    /**
     * <p>The ID of the SNAT table.</p>
     * <br>
     * <p>>  You must set at least one of the **SnatTableId** and **NatGatewayId** parameters.</p>
     */
    @NameInMap("SnatTableId")
    public String snatTableId;

    /**
     * <p>The source CIDR block specified in the SNAT entry.</p>
     */
    @NameInMap("SourceCIDR")
    public String sourceCIDR;

    /**
     * <p>The ID of the vSwitch.</p>
     * <br>
     * <p>*   When you query SNAT entries of Internet NAT gateways, this parameter specifies that Elastic Compute Service (ECS) instances in the vSwitch can use SNAT entries to access the Internet.</p>
     * <p>*   When you query SNAT entries of virtual private cloud (VPC) NAT gateways, this parameter specifies that ECS instances in the vSwitch can use SNAT entries to access external networks.</p>
     */
    @NameInMap("SourceVSwitchId")
    public String sourceVSwitchId;

    public static DescribeSnatTableEntriesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSnatTableEntriesRequest self = new DescribeSnatTableEntriesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSnatTableEntriesRequest setNatGatewayId(String natGatewayId) {
        this.natGatewayId = natGatewayId;
        return this;
    }
    public String getNatGatewayId() {
        return this.natGatewayId;
    }

    public DescribeSnatTableEntriesRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeSnatTableEntriesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeSnatTableEntriesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeSnatTableEntriesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeSnatTableEntriesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeSnatTableEntriesRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeSnatTableEntriesRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeSnatTableEntriesRequest setSnatEntryId(String snatEntryId) {
        this.snatEntryId = snatEntryId;
        return this;
    }
    public String getSnatEntryId() {
        return this.snatEntryId;
    }

    public DescribeSnatTableEntriesRequest setSnatEntryName(String snatEntryName) {
        this.snatEntryName = snatEntryName;
        return this;
    }
    public String getSnatEntryName() {
        return this.snatEntryName;
    }

    public DescribeSnatTableEntriesRequest setSnatIp(String snatIp) {
        this.snatIp = snatIp;
        return this;
    }
    public String getSnatIp() {
        return this.snatIp;
    }

    public DescribeSnatTableEntriesRequest setSnatTableId(String snatTableId) {
        this.snatTableId = snatTableId;
        return this;
    }
    public String getSnatTableId() {
        return this.snatTableId;
    }

    public DescribeSnatTableEntriesRequest setSourceCIDR(String sourceCIDR) {
        this.sourceCIDR = sourceCIDR;
        return this;
    }
    public String getSourceCIDR() {
        return this.sourceCIDR;
    }

    public DescribeSnatTableEntriesRequest setSourceVSwitchId(String sourceVSwitchId) {
        this.sourceVSwitchId = sourceVSwitchId;
        return this;
    }
    public String getSourceVSwitchId() {
        return this.sourceVSwitchId;
    }

}
