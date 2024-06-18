// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class PreCheckCreateOrderForDeleteDBNodesRequest extends TeaModel {
    /**
     * <p>Specifies whether to automatically complete the payment. Valid values:</p>
     * <ol>
     * <li><strong>true</strong>: automatically completes the payment. You must make sure that your account balance is sufficient.</li>
     * <li><strong>false</strong>: does not automatically complete the payment. An unpaid order is generated.</li>
     * </ol>
     * <blockquote>
     * <p> The default value is true. If your account balance is insufficient, you can set the AutoPay parameter to false to generate an unpaid order. Then, you can log on to the ApsaraDB RDS console to complete the payment.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("AutoPay")
    public Boolean autoPay;

    /**
     * <p>The additional business information about the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;promotion_input_param\&quot;:\&quot;{\\\&quot;promotionFilter\\\&quot;:{},\\\&quot;promotionOptionCode\\\&quot;:\\\&quot;youhui_quan\\\&quot;}\&quot;}</p>
     */
    @NameInMap("BusinessInfo")
    public String businessInfo;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the generated token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>ETnLKlblzczshOTUbOC****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The commodity code. Valid value:</p>
     * <ul>
     * <li><strong>bards</strong>: The instance is a pay-as-you-go primary instance.</li>
     * <li><strong>rds</strong>: The instance is a subscription primary instance.</li>
     * <li><strong>rords</strong>: The instance is a pay-as-you-go read-only instance.</li>
     * <li><strong>rds_rordspre_public_cn</strong>: The instance is a subscription read-only instance.</li>
     * <li><strong>bards_intl</strong>: The instance is a pay-as-you-go primary instance.</li>
     * <li><strong>rds_intl</strong>: The instance is a subscription primary instance.</li>
     * <li><strong>rords_intl</strong>: The instance is a pay-as-you-go read-only instance.</li>
     * <li><strong>rds_rordspre_public_intl</strong>: The instance is a subscription read-only instance.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rds</p>
     */
    @NameInMap("CommodityCode")
    public String commodityCode;

    /**
     * <p>The instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-wz9rziy3he051if82</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The node IDs.</p>
     */
    @NameInMap("DBNodeId")
    public java.util.List<String> DBNodeId;

    /**
     * <p>The major engine version of the destination instance. The value of this parameter varies based on the value of <strong>Engine</strong>.</p>
     * <ul>
     * <li>Valid values when Engine is set to MySQL: <strong>5.5, 5.6, 5.7, and 8.0</strong></li>
     * <li>Valid values when Engine is set to SQLServer: <strong>2008r2, 08r2_ent_ha, 2012, 2012_ent_ha, 2012_std_ha, 2012_web, 2014_std_ha, 2016_ent_ha, 2016_std_ha, 2016_web, 2017_std_ha, 2017_ent, 2019_std_ha, and 2019_ent</strong></li>
     * <li>Valid values when Engine is set to PostgreSQL: <strong>10.0, 11.0, 12.0, 13.0, 14.0, and 15.0</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>8.0</p>
     */
    @NameInMap("EngineVersion")
    public String engineVersion;

    /**
     * <p>The type of the database node. Valid value:</p>
     * <ul>
     * <li><strong>Master</strong>: the primary node</li>
     * <li><strong>Slave</strong>: the secondary node</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Master</p>
     */
    @NameInMap("NodeType")
    public String nodeType;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The coupon code.</p>
     * 
     * <strong>example:</strong>
     * <p>aliwood-1688-mobile-promotion</p>
     */
    @NameInMap("PromotionCode")
    public String promotionCode;

    /**
     * <p>The region ID. You can call the <a href="https://help.aliyun.com/document_detail/26243.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The resource of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>buy</p>
     */
    @NameInMap("Resource")
    public String resource;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The zone ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-a</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    public static PreCheckCreateOrderForDeleteDBNodesRequest build(java.util.Map<String, ?> map) throws Exception {
        PreCheckCreateOrderForDeleteDBNodesRequest self = new PreCheckCreateOrderForDeleteDBNodesRequest();
        return TeaModel.build(map, self);
    }

    public PreCheckCreateOrderForDeleteDBNodesRequest setAutoPay(Boolean autoPay) {
        this.autoPay = autoPay;
        return this;
    }
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    public PreCheckCreateOrderForDeleteDBNodesRequest setBusinessInfo(String businessInfo) {
        this.businessInfo = businessInfo;
        return this;
    }
    public String getBusinessInfo() {
        return this.businessInfo;
    }

    public PreCheckCreateOrderForDeleteDBNodesRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public PreCheckCreateOrderForDeleteDBNodesRequest setCommodityCode(String commodityCode) {
        this.commodityCode = commodityCode;
        return this;
    }
    public String getCommodityCode() {
        return this.commodityCode;
    }

    public PreCheckCreateOrderForDeleteDBNodesRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public PreCheckCreateOrderForDeleteDBNodesRequest setDBNodeId(java.util.List<String> DBNodeId) {
        this.DBNodeId = DBNodeId;
        return this;
    }
    public java.util.List<String> getDBNodeId() {
        return this.DBNodeId;
    }

    public PreCheckCreateOrderForDeleteDBNodesRequest setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }
    public String getEngineVersion() {
        return this.engineVersion;
    }

    public PreCheckCreateOrderForDeleteDBNodesRequest setNodeType(String nodeType) {
        this.nodeType = nodeType;
        return this;
    }
    public String getNodeType() {
        return this.nodeType;
    }

    public PreCheckCreateOrderForDeleteDBNodesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public PreCheckCreateOrderForDeleteDBNodesRequest setPromotionCode(String promotionCode) {
        this.promotionCode = promotionCode;
        return this;
    }
    public String getPromotionCode() {
        return this.promotionCode;
    }

    public PreCheckCreateOrderForDeleteDBNodesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public PreCheckCreateOrderForDeleteDBNodesRequest setResource(String resource) {
        this.resource = resource;
        return this;
    }
    public String getResource() {
        return this.resource;
    }

    public PreCheckCreateOrderForDeleteDBNodesRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public PreCheckCreateOrderForDeleteDBNodesRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public PreCheckCreateOrderForDeleteDBNodesRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

}
