// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeForwardTableEntriesRequest extends TeaModel {
    @NameInMap("ExternalIp")
    public String externalIp;

    @NameInMap("ExternalPort")
    public String externalPort;

    @NameInMap("ForwardEntryId")
    public String forwardEntryId;

    @NameInMap("ForwardEntryName")
    public String forwardEntryName;

    @NameInMap("ForwardTableId")
    public String forwardTableId;

    @NameInMap("InternalIp")
    public String internalIp;

    @NameInMap("InternalPort")
    public String internalPort;

    @NameInMap("IpProtocol")
    public String ipProtocol;

    @NameInMap("NatGatewayId")
    public String natGatewayId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static DescribeForwardTableEntriesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeForwardTableEntriesRequest self = new DescribeForwardTableEntriesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeForwardTableEntriesRequest setExternalIp(String externalIp) {
        this.externalIp = externalIp;
        return this;
    }
    public String getExternalIp() {
        return this.externalIp;
    }

    public DescribeForwardTableEntriesRequest setExternalPort(String externalPort) {
        this.externalPort = externalPort;
        return this;
    }
    public String getExternalPort() {
        return this.externalPort;
    }

    public DescribeForwardTableEntriesRequest setForwardEntryId(String forwardEntryId) {
        this.forwardEntryId = forwardEntryId;
        return this;
    }
    public String getForwardEntryId() {
        return this.forwardEntryId;
    }

    public DescribeForwardTableEntriesRequest setForwardEntryName(String forwardEntryName) {
        this.forwardEntryName = forwardEntryName;
        return this;
    }
    public String getForwardEntryName() {
        return this.forwardEntryName;
    }

    public DescribeForwardTableEntriesRequest setForwardTableId(String forwardTableId) {
        this.forwardTableId = forwardTableId;
        return this;
    }
    public String getForwardTableId() {
        return this.forwardTableId;
    }

    public DescribeForwardTableEntriesRequest setInternalIp(String internalIp) {
        this.internalIp = internalIp;
        return this;
    }
    public String getInternalIp() {
        return this.internalIp;
    }

    public DescribeForwardTableEntriesRequest setInternalPort(String internalPort) {
        this.internalPort = internalPort;
        return this;
    }
    public String getInternalPort() {
        return this.internalPort;
    }

    public DescribeForwardTableEntriesRequest setIpProtocol(String ipProtocol) {
        this.ipProtocol = ipProtocol;
        return this;
    }
    public String getIpProtocol() {
        return this.ipProtocol;
    }

    public DescribeForwardTableEntriesRequest setNatGatewayId(String natGatewayId) {
        this.natGatewayId = natGatewayId;
        return this;
    }
    public String getNatGatewayId() {
        return this.natGatewayId;
    }

    public DescribeForwardTableEntriesRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeForwardTableEntriesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeForwardTableEntriesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeForwardTableEntriesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeForwardTableEntriesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeForwardTableEntriesRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeForwardTableEntriesRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
