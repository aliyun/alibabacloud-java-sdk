// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeIPv6TranslatorsRequest extends TeaModel {
    @NameInMap("AllocateIpv4Addr")
    public String allocateIpv4Addr;

    @NameInMap("AllocateIpv6Addr")
    public String allocateIpv6Addr;

    @NameInMap("BusinessStatus")
    public String businessStatus;

    @NameInMap("Ipv6TranslatorId")
    public String ipv6TranslatorId;

    @NameInMap("Name")
    public String name;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PayType")
    public String payType;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("Spec")
    public String spec;

    @NameInMap("Status")
    public String status;

    public static DescribeIPv6TranslatorsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeIPv6TranslatorsRequest self = new DescribeIPv6TranslatorsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeIPv6TranslatorsRequest setAllocateIpv4Addr(String allocateIpv4Addr) {
        this.allocateIpv4Addr = allocateIpv4Addr;
        return this;
    }
    public String getAllocateIpv4Addr() {
        return this.allocateIpv4Addr;
    }

    public DescribeIPv6TranslatorsRequest setAllocateIpv6Addr(String allocateIpv6Addr) {
        this.allocateIpv6Addr = allocateIpv6Addr;
        return this;
    }
    public String getAllocateIpv6Addr() {
        return this.allocateIpv6Addr;
    }

    public DescribeIPv6TranslatorsRequest setBusinessStatus(String businessStatus) {
        this.businessStatus = businessStatus;
        return this;
    }
    public String getBusinessStatus() {
        return this.businessStatus;
    }

    public DescribeIPv6TranslatorsRequest setIpv6TranslatorId(String ipv6TranslatorId) {
        this.ipv6TranslatorId = ipv6TranslatorId;
        return this;
    }
    public String getIpv6TranslatorId() {
        return this.ipv6TranslatorId;
    }

    public DescribeIPv6TranslatorsRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribeIPv6TranslatorsRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeIPv6TranslatorsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeIPv6TranslatorsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeIPv6TranslatorsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeIPv6TranslatorsRequest setPayType(String payType) {
        this.payType = payType;
        return this;
    }
    public String getPayType() {
        return this.payType;
    }

    public DescribeIPv6TranslatorsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeIPv6TranslatorsRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeIPv6TranslatorsRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeIPv6TranslatorsRequest setSpec(String spec) {
        this.spec = spec;
        return this;
    }
    public String getSpec() {
        return this.spec;
    }

    public DescribeIPv6TranslatorsRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
