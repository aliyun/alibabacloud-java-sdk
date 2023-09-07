// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeDBClusterAvailableResourcesRequest extends TeaModel {
    /**
     * <p>The specifications of the node. For more information, see [Specifications of compute nodes](~~102542~~).</p>
     */
    @NameInMap("DBNodeClass")
    public String DBNodeClass;

    /**
     * <p>The type of the database engine. Valid values:</p>
     * <br>
     * <p>*   **MySQL**</p>
     * <p>*   **PostgreSQL**</p>
     * <p>*   **Oracle**</p>
     */
    @NameInMap("DBType")
    public String DBType;

    /**
     * <p>The version of the database engine. Valid values for the MySQL database engine:</p>
     * <br>
     * <p>*   **5.6**</p>
     * <p>*   **5.7**</p>
     * <p>*   **8.0**</p>
     * <br>
     * <p>Valid values for the PostgreSQL database engine:</p>
     * <br>
     * <p>*   **11**</p>
     * <p>*   **14**</p>
     * <br>
     * <p>Valid value for the Oracle database engine: **11**</p>
     * <br>
     * <p>> This parameter is required when you specify the **DBType** parameter.</p>
     */
    @NameInMap("DBVersion")
    public String DBVersion;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The billing method of the cluster. Valid values:</p>
     * <br>
     * <p>*   **Postpaid**: pay-as-you-go</p>
     * <p>*   **Prepaid**: subscription</p>
     */
    @NameInMap("PayType")
    public String payType;

    /**
     * <p>The region ID of the cluster. Default value: **cn-hangzhou**.</p>
     * <br>
     * <p>> You can call the [DescribeRegions](~~98041~~) operation to query the available regions.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The zone ID of the cluster.</p>
     * <br>
     * <p>> You can call the [DescribeRegions](~~98041~~) operation to query the available zones.</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    public static DescribeDBClusterAvailableResourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBClusterAvailableResourcesRequest self = new DescribeDBClusterAvailableResourcesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDBClusterAvailableResourcesRequest setDBNodeClass(String DBNodeClass) {
        this.DBNodeClass = DBNodeClass;
        return this;
    }
    public String getDBNodeClass() {
        return this.DBNodeClass;
    }

    public DescribeDBClusterAvailableResourcesRequest setDBType(String DBType) {
        this.DBType = DBType;
        return this;
    }
    public String getDBType() {
        return this.DBType;
    }

    public DescribeDBClusterAvailableResourcesRequest setDBVersion(String DBVersion) {
        this.DBVersion = DBVersion;
        return this;
    }
    public String getDBVersion() {
        return this.DBVersion;
    }

    public DescribeDBClusterAvailableResourcesRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeDBClusterAvailableResourcesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeDBClusterAvailableResourcesRequest setPayType(String payType) {
        this.payType = payType;
        return this;
    }
    public String getPayType() {
        return this.payType;
    }

    public DescribeDBClusterAvailableResourcesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeDBClusterAvailableResourcesRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeDBClusterAvailableResourcesRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeDBClusterAvailableResourcesRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

}
