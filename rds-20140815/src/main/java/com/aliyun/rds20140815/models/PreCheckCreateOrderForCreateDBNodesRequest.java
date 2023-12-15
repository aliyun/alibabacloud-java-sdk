// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class PreCheckCreateOrderForCreateDBNodesRequest extends TeaModel {
    /**
     * <p>Specifies whether to automatically complete the payment. Valid values:</p>
     * <br>
     * <p>1.  **true**: automatically completes the payment. You must make sure that your account balance is sufficient.</p>
     * <p>2.  **false**: does not automatically complete the payment. An unpaid order is generated.</p>
     * <br>
     * <p>>  The default value is true. If your account balance is insufficient, you can set the AutoPay parameter to false to generate an unpaid order. Then, you can log on to the ApsaraDB RDS console to complete the payment.</p>
     */
    @NameInMap("AutoPay")
    public Boolean autoPay;

    /**
     * <p>The additional business information about the instance.</p>
     */
    @NameInMap("BusinessInfo")
    public String businessInfo;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the generated token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
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
     */
    @NameInMap("CommodityCode")
    public String commodityCode;

    /**
     * <p>The instance ID.</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The information about the node.</p>
     * <br>
     * <p>>  This parameter is used for ApsaraDB RDS for MySQL instances on RDS Cluster Edition.</p>
     */
    @NameInMap("DBNode")
    public java.util.List<PreCheckCreateOrderForCreateDBNodesRequestDBNode> DBNode;

    /**
     * <p>The database engine version of the instance. Valid values:</p>
     * <br>
     * <p>*   Valid values if you set Engine to MySQL: **5.5, 5.6, 5.7, and 8.0**</p>
     * <p>*   Valid values if you set Engine to SQLServer: **2008r2, 08r2\_ent_ha, 2012, 2012\_ent_ha, 2012\_std_ha, 2012\_web, 2014\_std_ha, 2016\_ent_ha, 2016\_std_ha, 2016\_web, 2017\_std_ha, 2017\_ent, 2019\_std_ha, and 2019\_ent**</p>
     * <p>*   Valid values if you set Engine to PostgreSQL: **10.0, 11.0, 12.0, 13.0, and 14.0**</p>
     * <p>*   Valid value if you set Engine to MariaDB: **10.3**</p>
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
     * <p>The region ID. You can call the [DescribeRegions](~~26243~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The resource.</p>
     */
    @NameInMap("Resource")
    public String resource;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The zone ID. You can call the [DescribeRegions](~~26243~~) operation to query the zone ID.</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    public static PreCheckCreateOrderForCreateDBNodesRequest build(java.util.Map<String, ?> map) throws Exception {
        PreCheckCreateOrderForCreateDBNodesRequest self = new PreCheckCreateOrderForCreateDBNodesRequest();
        return TeaModel.build(map, self);
    }

    public PreCheckCreateOrderForCreateDBNodesRequest setAutoPay(Boolean autoPay) {
        this.autoPay = autoPay;
        return this;
    }
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    public PreCheckCreateOrderForCreateDBNodesRequest setBusinessInfo(String businessInfo) {
        this.businessInfo = businessInfo;
        return this;
    }
    public String getBusinessInfo() {
        return this.businessInfo;
    }

    public PreCheckCreateOrderForCreateDBNodesRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public PreCheckCreateOrderForCreateDBNodesRequest setCommodityCode(String commodityCode) {
        this.commodityCode = commodityCode;
        return this;
    }
    public String getCommodityCode() {
        return this.commodityCode;
    }

    public PreCheckCreateOrderForCreateDBNodesRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public PreCheckCreateOrderForCreateDBNodesRequest setDBNode(java.util.List<PreCheckCreateOrderForCreateDBNodesRequestDBNode> DBNode) {
        this.DBNode = DBNode;
        return this;
    }
    public java.util.List<PreCheckCreateOrderForCreateDBNodesRequestDBNode> getDBNode() {
        return this.DBNode;
    }

    public PreCheckCreateOrderForCreateDBNodesRequest setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }
    public String getEngineVersion() {
        return this.engineVersion;
    }

    public PreCheckCreateOrderForCreateDBNodesRequest setNodeType(String nodeType) {
        this.nodeType = nodeType;
        return this;
    }
    public String getNodeType() {
        return this.nodeType;
    }

    public PreCheckCreateOrderForCreateDBNodesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public PreCheckCreateOrderForCreateDBNodesRequest setPromotionCode(String promotionCode) {
        this.promotionCode = promotionCode;
        return this;
    }
    public String getPromotionCode() {
        return this.promotionCode;
    }

    public PreCheckCreateOrderForCreateDBNodesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public PreCheckCreateOrderForCreateDBNodesRequest setResource(String resource) {
        this.resource = resource;
        return this;
    }
    public String getResource() {
        return this.resource;
    }

    public PreCheckCreateOrderForCreateDBNodesRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public PreCheckCreateOrderForCreateDBNodesRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public PreCheckCreateOrderForCreateDBNodesRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public static class PreCheckCreateOrderForCreateDBNodesRequestDBNode extends TeaModel {
        /**
         * <p>The instance type of the node.</p>
         */
        @NameInMap("classCode")
        public String classCode;

        /**
         * <p>The zone ID of the node.</p>
         */
        @NameInMap("zoneId")
        public String zoneId;

        public static PreCheckCreateOrderForCreateDBNodesRequestDBNode build(java.util.Map<String, ?> map) throws Exception {
            PreCheckCreateOrderForCreateDBNodesRequestDBNode self = new PreCheckCreateOrderForCreateDBNodesRequestDBNode();
            return TeaModel.build(map, self);
        }

        public PreCheckCreateOrderForCreateDBNodesRequestDBNode setClassCode(String classCode) {
            this.classCode = classCode;
            return this;
        }
        public String getClassCode() {
            return this.classCode;
        }

        public PreCheckCreateOrderForCreateDBNodesRequestDBNode setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

}
