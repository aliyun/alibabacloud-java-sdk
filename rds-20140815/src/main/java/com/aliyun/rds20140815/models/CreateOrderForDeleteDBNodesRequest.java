// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CreateOrderForDeleteDBNodesRequest extends TeaModel {
    @NameInMap("AutoPay")
    public Boolean autoPay;

    @NameInMap("BusinessInfo")
    public String businessInfo;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("CommodityCode")
    public String commodityCode;

    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    @NameInMap("DBNodeId")
    public java.util.List<String> DBNodeId;

    @NameInMap("EngineVersion")
    public String engineVersion;

    @NameInMap("NodeType")
    public String nodeType;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("PromotionCode")
    public String promotionCode;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("Resource")
    public String resource;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("ZoneId")
    public String zoneId;

    public static CreateOrderForDeleteDBNodesRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateOrderForDeleteDBNodesRequest self = new CreateOrderForDeleteDBNodesRequest();
        return TeaModel.build(map, self);
    }

    public CreateOrderForDeleteDBNodesRequest setAutoPay(Boolean autoPay) {
        this.autoPay = autoPay;
        return this;
    }
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    public CreateOrderForDeleteDBNodesRequest setBusinessInfo(String businessInfo) {
        this.businessInfo = businessInfo;
        return this;
    }
    public String getBusinessInfo() {
        return this.businessInfo;
    }

    public CreateOrderForDeleteDBNodesRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateOrderForDeleteDBNodesRequest setCommodityCode(String commodityCode) {
        this.commodityCode = commodityCode;
        return this;
    }
    public String getCommodityCode() {
        return this.commodityCode;
    }

    public CreateOrderForDeleteDBNodesRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public CreateOrderForDeleteDBNodesRequest setDBNodeId(java.util.List<String> DBNodeId) {
        this.DBNodeId = DBNodeId;
        return this;
    }
    public java.util.List<String> getDBNodeId() {
        return this.DBNodeId;
    }

    public CreateOrderForDeleteDBNodesRequest setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }
    public String getEngineVersion() {
        return this.engineVersion;
    }

    public CreateOrderForDeleteDBNodesRequest setNodeType(String nodeType) {
        this.nodeType = nodeType;
        return this;
    }
    public String getNodeType() {
        return this.nodeType;
    }

    public CreateOrderForDeleteDBNodesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateOrderForDeleteDBNodesRequest setPromotionCode(String promotionCode) {
        this.promotionCode = promotionCode;
        return this;
    }
    public String getPromotionCode() {
        return this.promotionCode;
    }

    public CreateOrderForDeleteDBNodesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateOrderForDeleteDBNodesRequest setResource(String resource) {
        this.resource = resource;
        return this;
    }
    public String getResource() {
        return this.resource;
    }

    public CreateOrderForDeleteDBNodesRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateOrderForDeleteDBNodesRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateOrderForDeleteDBNodesRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateOrderForDeleteDBNodesRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

}
