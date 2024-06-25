// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeClassListRequest extends TeaModel {
    /**
     * <p>The code of the commodity. Valid values:</p>
     * <ul>
     * <li>polardb_sub: the subscription cluster in regions in the Chinese mainland</li>
     * <li>polardb_sub _intl: the subscription cluster in regions outside the Chinese mainland</li>
     * <li>polardb_payg: the pay-as-you-go cluster in regions in the Chinese mainland</li>
     * <li>polardb_payg_intl: the pay-as-you-go cluster in regions outside the Chinese mainland</li>
     * <li>polardb_sub_jushita: the subscription cluster for CloudTmall</li>
     * <li>polardb_payg_jushita: the pay-as-you-go cluster for CloudTmall</li>
     * <li>polardb_sub_cainiao: the subscription cluster for Cainiao</li>
     * <li>polardb_payg_cainiao: the pay-as-you-go cluster for Cainiao</li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>If you use an Alibaba Cloud account on the China site, you can view only the codes of the commodities that are available in the Chinese mainland.</li>
     * <li>If you are using an Alibaba Cloud international account, you can view only the codes of the commodities that are available outside the Chinese mainland.</li>
     * <li>If you use a CloudTmall account, you can view only the codes of the commodities that are available in CloudTmall.</li>
     * <li>If you use a Cainiao account, you can view only the codes of the commodities that are available in Cainiao.</li>
     * </ul>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>polardb_sub</p>
     */
    @NameInMap("CommodityCode")
    public String commodityCode;

    /**
     * <p>The number of nodes. Valid values:</p>
     * <ul>
     * <li>single: Standalone Edition.</li>
     * <li>cluster: Cluster Edition.</li>
     * <li>all: both Standalone Edition and Cluster Edition.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cluster</p>
     */
    @NameInMap("MasterHa")
    public String masterHa;

    /**
     * <p>The type of the order. Valid values:</p>
     * <ul>
     * <li>BUY: The order is used to purchase a cluster.</li>
     * <li>UPGRADE: The order is used to change the specifications of a cluster.</li>
     * <li>RENEW: The order is used to renew a cluster.</li>
     * <li>CONVERT: The order is used to change the billing method of a cluster.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>BUY</p>
     */
    @NameInMap("OrderType")
    public String orderType;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID of the cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-************</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static DescribeClassListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeClassListRequest self = new DescribeClassListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeClassListRequest setCommodityCode(String commodityCode) {
        this.commodityCode = commodityCode;
        return this;
    }
    public String getCommodityCode() {
        return this.commodityCode;
    }

    public DescribeClassListRequest setMasterHa(String masterHa) {
        this.masterHa = masterHa;
        return this;
    }
    public String getMasterHa() {
        return this.masterHa;
    }

    public DescribeClassListRequest setOrderType(String orderType) {
        this.orderType = orderType;
        return this;
    }
    public String getOrderType() {
        return this.orderType;
    }

    public DescribeClassListRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeClassListRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeClassListRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeClassListRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeClassListRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeClassListRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
