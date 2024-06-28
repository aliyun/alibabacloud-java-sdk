// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeIPv6TranslatorsRequest extends TeaModel {
    /**
     * <p>The IPv4 address allocated to the IPv6 Translation Service instance.</p>
     * 
     * <strong>example:</strong>
     * <p>47.99.XX.XX</p>
     */
    @NameInMap("AllocateIpv4Addr")
    public String allocateIpv4Addr;

    /**
     * <p>The IPv6 address allocated to the IPv6 Translation Service instance.</p>
     * 
     * <strong>example:</strong>
     * <p>2400:3200:1600::XXXX</p>
     */
    @NameInMap("AllocateIpv6Addr")
    public String allocateIpv6Addr;

    /**
     * <p>The business status of the IPv6 Translation Service instance. Valid values:</p>
     * <ul>
     * <li><strong>Normal</strong></li>
     * <li><strong>FinancialLocked</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Normal</p>
     */
    @NameInMap("BusinessStatus")
    public String businessStatus;

    /**
     * <p>The ID of the IPv6 Translation Service instance.</p>
     * 
     * <strong>example:</strong>
     * <p>ipv6trans-bp1858ys****</p>
     */
    @NameInMap("Ipv6TranslatorId")
    public String ipv6TranslatorId;

    /**
     * <p>The name of the IPv6 Translation Service instance.</p>
     * 
     * <strong>example:</strong>
     * <p>ipv6_1</p>
     */
    @NameInMap("Name")
    public String name;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The number of the page to return. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page. Maximum value: <strong>50</strong>. Default value: <strong>10</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The billing method of the IPv6 Translation Service instance. Valid values:</p>
     * <ul>
     * <li><strong>Prepay</strong>: subscription</li>
     * <li><strong>Postpay</strong>: pay-as-you-go</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Prepay</p>
     */
    @NameInMap("PayType")
    public String payType;

    /**
     * <p>The region of the IPv6 Translation Service instance. You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to query the most recent region list.</p>
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
     * <p>The specification of the IPv6 Translation Service instance. Set the value to <strong>small</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>small</p>
     */
    @NameInMap("Spec")
    public String spec;

    /**
     * <p>The status of the IPv6 Translation Service instance. Valid values:</p>
     * <ul>
     * <li><strong>init</strong></li>
     * <li><strong>provisioning</strong></li>
     * <li><strong>active</strong></li>
     * <li><strong>updating</strong></li>
     * <li><strong>upgrading</strong></li>
     * <li><strong>deleting</strong></li>
     * <li><strong>deleted</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>active</p>
     */
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
