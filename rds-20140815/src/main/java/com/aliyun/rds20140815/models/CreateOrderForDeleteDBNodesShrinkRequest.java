// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CreateOrderForDeleteDBNodesShrinkRequest extends TeaModel {
    /**
     * <p>Specifies whether to automatically complete the payment. Valid values:</p>
     * <br>
     * <p>1.  **true**: You must make sure that your account balance is sufficient.</p>
     * <p>2.  **false**: An unpaid order is generated.</p>
     * <br>
     * <p>>  Default value: true. If your account balance is insufficient, you can set the AutoPay parameter to false to generate an unpaid order. Then, you can log on to the ApsaraDB RDS console to complete the payment.</p>
     */
    @NameInMap("AutoPay")
    public Boolean autoPay;

    /**
     * <p>The additional business information about the instance.</p>
     */
    @NameInMap("BusinessInfo")
    public String businessInfo;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The commodity code. Valid values:</p>
     * <br>
     * <p>*   **bards**: The instance is a pay-as-you-go primary instance.</p>
     * <p>*   **rds**: The instance is a subscription primary instance.</p>
     * <p>*   **rords**: The instance is a pay-as-you-go read-only instance.</p>
     * <p>*   **rds_rordspre_public_cn**: The instance is a subscription read-only instance.</p>
     * <p>*   **bards_intl**: The instance is a pay-as-you-go primary instance.</p>
     * <p>*   **rds_intl**: The instance is a subscription primary instance.</p>
     * <p>*   **rords_intl**: The instance is a pay-as-you-go read-only instance.</p>
     * <p>*   **rds_rordspre_public_intl**: The instance is a subscription read-only instance.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("CommodityCode")
    public String commodityCode;

    /**
     * <p>The instance ID. You can call the [DescribeDBInstances](https://help.aliyun.com/document_detail/610396.html) operation to query the ID of the instance.</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>An array that consists of information about the ID of the node.</p>
     */
    @NameInMap("DBNodeId")
    public String DBNodeIdShrink;

    /**
     * <p>The database engine version of the instance. Valid values:</p>
     * <br>
     * <p>Valid values if you set Engine to MySQL: **5.5, 5.6, 5.7, and 8.0**</p>
     */
    @NameInMap("EngineVersion")
    public String engineVersion;

    /**
     * <p>The type of the database node. Valid values:</p>
     * <br>
     * <p>*   **Master**: the primary node</p>
     * <p>*   **Slave**: the secondary node</p>
     */
    @NameInMap("NodeType")
    public String nodeType;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The coupon code.</p>
     */
    @NameInMap("PromotionCode")
    public String promotionCode;

    /**
     * <p>The region ID. You can call the [DescribeRegions](https://help.aliyun.com/document_detail/610399.html) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The resources.</p>
     */
    @NameInMap("Resource")
    public String resource;

    /**
     * <p>The resource group ID.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The zone ID.</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    public static CreateOrderForDeleteDBNodesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateOrderForDeleteDBNodesShrinkRequest self = new CreateOrderForDeleteDBNodesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateOrderForDeleteDBNodesShrinkRequest setAutoPay(Boolean autoPay) {
        this.autoPay = autoPay;
        return this;
    }
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    public CreateOrderForDeleteDBNodesShrinkRequest setBusinessInfo(String businessInfo) {
        this.businessInfo = businessInfo;
        return this;
    }
    public String getBusinessInfo() {
        return this.businessInfo;
    }

    public CreateOrderForDeleteDBNodesShrinkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateOrderForDeleteDBNodesShrinkRequest setCommodityCode(String commodityCode) {
        this.commodityCode = commodityCode;
        return this;
    }
    public String getCommodityCode() {
        return this.commodityCode;
    }

    public CreateOrderForDeleteDBNodesShrinkRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public CreateOrderForDeleteDBNodesShrinkRequest setDBNodeIdShrink(String DBNodeIdShrink) {
        this.DBNodeIdShrink = DBNodeIdShrink;
        return this;
    }
    public String getDBNodeIdShrink() {
        return this.DBNodeIdShrink;
    }

    public CreateOrderForDeleteDBNodesShrinkRequest setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }
    public String getEngineVersion() {
        return this.engineVersion;
    }

    public CreateOrderForDeleteDBNodesShrinkRequest setNodeType(String nodeType) {
        this.nodeType = nodeType;
        return this;
    }
    public String getNodeType() {
        return this.nodeType;
    }

    public CreateOrderForDeleteDBNodesShrinkRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateOrderForDeleteDBNodesShrinkRequest setPromotionCode(String promotionCode) {
        this.promotionCode = promotionCode;
        return this;
    }
    public String getPromotionCode() {
        return this.promotionCode;
    }

    public CreateOrderForDeleteDBNodesShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateOrderForDeleteDBNodesShrinkRequest setResource(String resource) {
        this.resource = resource;
        return this;
    }
    public String getResource() {
        return this.resource;
    }

    public CreateOrderForDeleteDBNodesShrinkRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateOrderForDeleteDBNodesShrinkRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateOrderForDeleteDBNodesShrinkRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateOrderForDeleteDBNodesShrinkRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

}
