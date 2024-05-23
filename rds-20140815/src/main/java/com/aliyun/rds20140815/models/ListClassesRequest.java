// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ListClassesRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The commodity code of the instances.</p>
     * <br>
     * <p>*   **bards_intl**: The instances are pay-as-you-go primary instances.</p>
     * <p>*   **rds_intl**: The instances are subscription primary instances.</p>
     * <p>*   **rords_intl**: The instances are pay-as-you-go read-only instances.</p>
     * <p>*   **rds_rordspre_public_intl**: The instances are subscription read-only instances.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("CommodityCode")
    public String commodityCode;

    /**
     * <p>The instance ID. You can call the DescribeDBInstances operation to query the instance ID.</p>
     * <br>
     * <p>>  If you set the **CommodityCode** parameter to the commodity code of read-only instances, you must specify this parameter.</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The type of order that you want to query. Valid values:</p>
     * <br>
     * <p>*   **BUY**: specifies the query orders that are used to purchase instances.</p>
     * <p>*   **UPGRADE**: specifies the query orders that are used to change the specifications of instances.</p>
     * <p>*   **RENEW**: specifies the query orders that are used to renew instances.</p>
     * <p>*   **CONVERT**: specifies the query orders that are used to change the billing methods of instances.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("OrderType")
    public String orderType;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID. You can call the DescribeRegions operation to query the most recent region list.</p>
     * <br>
     * <p>>  If you are using an Alibaba Cloud account on the International site (alibabacloud.com), you must specify this parameter.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static ListClassesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListClassesRequest self = new ListClassesRequest();
        return TeaModel.build(map, self);
    }

    public ListClassesRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ListClassesRequest setCommodityCode(String commodityCode) {
        this.commodityCode = commodityCode;
        return this;
    }
    public String getCommodityCode() {
        return this.commodityCode;
    }

    public ListClassesRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public ListClassesRequest setOrderType(String orderType) {
        this.orderType = orderType;
        return this;
    }
    public String getOrderType() {
        return this.orderType;
    }

    public ListClassesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ListClassesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListClassesRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ListClassesRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
