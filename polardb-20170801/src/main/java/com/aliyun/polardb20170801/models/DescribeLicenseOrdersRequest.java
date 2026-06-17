// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeLicenseOrdersRequest extends TeaModel {
    /**
     * <p>The Alibaba Cloud order ID. This can be a virtual order ID.</p>
     * 
     * <strong>example:</strong>
     * <p>239618016570503</p>
     */
    @NameInMap("AliyunOrderId")
    public String aliyunOrderId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The package type. Valid values:</p>
     * <ul>
     * <li><p>single_node_subscribe: single node (subscription)</p>
     * </li>
     * <li><p>single_node_long_term: single node (long-term)</p>
     * </li>
     * <li><p>primary_backup_subscribe: primary/standby (subscription)</p>
     * </li>
     * <li><p>primary_backup_long_term: primary/standby (long-term)</p>
     * </li>
     * <li><p>pre_generation_long_term: pre-generated (long-term)</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>single_node_subscribe</p>
     */
    @NameInMap("PackageType")
    public String packageType;

    /**
     * <p>The page number to query.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of records to return on each page.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The purchase channel. Valid values: \<code>aliyun_market\\</code> (Alibaba Cloud Marketplace) and \<code>aliyun_public\\</code> (standard purchase page).</p>
     * 
     * <strong>example:</strong>
     * <p>aliyun_market</p>
     */
    @NameInMap("PurchaseChannel")
    public String purchaseChannel;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>Specifies whether to query only virtual orders.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("VirtualOrder")
    public Boolean virtualOrder;

    public static DescribeLicenseOrdersRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeLicenseOrdersRequest self = new DescribeLicenseOrdersRequest();
        return TeaModel.build(map, self);
    }

    public DescribeLicenseOrdersRequest setAliyunOrderId(String aliyunOrderId) {
        this.aliyunOrderId = aliyunOrderId;
        return this;
    }
    public String getAliyunOrderId() {
        return this.aliyunOrderId;
    }

    public DescribeLicenseOrdersRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeLicenseOrdersRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeLicenseOrdersRequest setPackageType(String packageType) {
        this.packageType = packageType;
        return this;
    }
    public String getPackageType() {
        return this.packageType;
    }

    public DescribeLicenseOrdersRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeLicenseOrdersRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeLicenseOrdersRequest setPurchaseChannel(String purchaseChannel) {
        this.purchaseChannel = purchaseChannel;
        return this;
    }
    public String getPurchaseChannel() {
        return this.purchaseChannel;
    }

    public DescribeLicenseOrdersRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeLicenseOrdersRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeLicenseOrdersRequest setVirtualOrder(Boolean virtualOrder) {
        this.virtualOrder = virtualOrder;
        return this;
    }
    public Boolean getVirtualOrder() {
        return this.virtualOrder;
    }

}
