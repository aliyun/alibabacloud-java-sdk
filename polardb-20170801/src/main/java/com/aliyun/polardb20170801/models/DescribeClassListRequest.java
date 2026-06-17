// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeClassListRequest extends TeaModel {
    /**
     * <p>The commodity code. Valid values:</p>
     * <ul>
     * <li><p>polardb_sub: subscription for the Chinese mainland.</p>
     * </li>
     * <li><p>polardb_sub_intl: subscription for regions in Hong Kong (China) and outside the Chinese mainland.</p>
     * </li>
     * <li><p>polardb_payg: pay-as-you-go for the Chinese mainland.</p>
     * </li>
     * <li><p>polardb_payg_intl: pay-as-you-go for regions in Hong Kong (China) and outside the Chinese mainland.</p>
     * </li>
     * <li><p>polardb_sub_jushita: Jushita subscription.</p>
     * </li>
     * <li><p>polardb_payg_jushita: Jushita pay-as-you-go.</p>
     * </li>
     * <li><p>polardb_sub_cainiao: Cainiao subscription.</p>
     * </li>
     * <li><p>polardb_payg_cainiao: Cainiao pay-as-you-go.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li><p>If you use an Alibaba Cloud China site account, you can view only the commodity codes for the Chinese mainland.</p>
     * </li>
     * <li><p>If you use an Alibaba Cloud international site account, you can view only the commodity codes for regions outside the Chinese mainland.</p>
     * </li>
     * <li><p>If you use a Jushita account, you can view only the commodity codes for Jushita.</p>
     * </li>
     * <li><p>If you use a Cainiao account, you can view only the commodity codes for Cainiao.</p>
     * </li>
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
     * <li><p>single: single node.</p>
     * </li>
     * <li><p>cluster: cluster.</p>
     * </li>
     * <li><p>all: single node and cluster.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cluster</p>
     */
    @NameInMap("MasterHa")
    public String masterHa;

    /**
     * <p>The order type. Valid values:</p>
     * <ul>
     * <li><p>BUY: new purchase.</p>
     * </li>
     * <li><p>UPGRADE: changes the configuration.</p>
     * </li>
     * <li><p>RENEW: renews the instance.</p>
     * </li>
     * <li><p>CONVERT: changes the billing method.</p>
     * </li>
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
     * <p>The region ID.</p>
     * <blockquote>
     * <p>This parameter is required if you use an Alibaba Cloud international site account.</p>
     * </blockquote>
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
