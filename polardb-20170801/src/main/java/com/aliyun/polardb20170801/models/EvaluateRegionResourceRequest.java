// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class EvaluateRegionResourceRequest extends TeaModel {
    /**
     * <p>The cluster link type. The backend randomly selects the default value. Valid values:</p>
     * <br>
     * <p>*   **lvs** :Linux virtual server</p>
     * <p>*   **proxy**: proxy server</p>
     * <p>*   **dns**: domain name system</p>
     */
    @NameInMap("DBInstanceConnType")
    public String DBInstanceConnType;

    /**
     * <p>The specifications of the node. For information about node specifications, see the following topics:</p>
     * <br>
     * <p>*   PolarDB for MySQL: [Specifications of compute nodes](https://help.aliyun.com/document_detail/102542.html)</p>
     * <p>*   PolarDB for Oracle: [Specifications of compute nodes](https://help.aliyun.com/document_detail/207921.html)</p>
     * <p>*   PolarDB for PostgreSQL: [Specifications of compute nodes](https://help.aliyun.com/document_detail/209380.html)</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DBNodeClass")
    public String DBNodeClass;

    /**
     * <p>The type of the database engine. Valid values:</p>
     * <br>
     * <p>*   **MySQL**</p>
     * <p>*   **PostgreSQL**</p>
     * <p>*   **Oracle**</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DBType")
    public String DBType;

    /**
     * <p>The version of the database engine</p>
     * <br>
     * <p>*   Valid values for the MySQL database engine:</p>
     * <br>
     * <p>    *   **5.6**</p>
     * <p>    *   **5.7**</p>
     * <p>    *   **8.0**</p>
     * <br>
     * <p>*   Valid values for the PostgreSQL database engine:</p>
     * <br>
     * <p>    *   **11**</p>
     * <p>    *   **14**</p>
     * <br>
     * <p>*   Valid value for the Oracle database engine: **11**</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DBVersion")
    public String DBVersion;

    /**
     * <p>Specifies whether to return the zones in which the single-zone deployment method is supported. Default value: 0. Valid values:</p>
     * <br>
     * <p>*   **0**: no value returned</p>
     * <p>*   **1**: returns the zones.</p>
     */
    @NameInMap("DispenseMode")
    public String dispenseMode;

    /**
     * <p>Specifies whether Maxscale is created. Default value: true. Valid values:</p>
     * <br>
     * <p>*   **true**</p>
     * <p>*   **false**</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("NeedMaxScaleLink")
    public String needMaxScaleLink;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID.</p>
     * <br>
     * <p>> You can call the [DescribeRegions](https://help.aliyun.com/document_detail/98041.html) operation to query available regions.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The subdomain. It is the child domain of the top-level domain name or parent domain. For example, if the parent domain name is cn-beijing, its child domain can be cn-beijing-i-aliyun.</p>
     */
    @NameInMap("SubDomain")
    public String subDomain;

    /**
     * <p>The zone ID.</p>
     * <br>
     * <p>> You can call the [DescribeRegions](https://help.aliyun.com/document_detail/98041.html) operation to query available zones.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    public static EvaluateRegionResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        EvaluateRegionResourceRequest self = new EvaluateRegionResourceRequest();
        return TeaModel.build(map, self);
    }

    public EvaluateRegionResourceRequest setDBInstanceConnType(String DBInstanceConnType) {
        this.DBInstanceConnType = DBInstanceConnType;
        return this;
    }
    public String getDBInstanceConnType() {
        return this.DBInstanceConnType;
    }

    public EvaluateRegionResourceRequest setDBNodeClass(String DBNodeClass) {
        this.DBNodeClass = DBNodeClass;
        return this;
    }
    public String getDBNodeClass() {
        return this.DBNodeClass;
    }

    public EvaluateRegionResourceRequest setDBType(String DBType) {
        this.DBType = DBType;
        return this;
    }
    public String getDBType() {
        return this.DBType;
    }

    public EvaluateRegionResourceRequest setDBVersion(String DBVersion) {
        this.DBVersion = DBVersion;
        return this;
    }
    public String getDBVersion() {
        return this.DBVersion;
    }

    public EvaluateRegionResourceRequest setDispenseMode(String dispenseMode) {
        this.dispenseMode = dispenseMode;
        return this;
    }
    public String getDispenseMode() {
        return this.dispenseMode;
    }

    public EvaluateRegionResourceRequest setNeedMaxScaleLink(String needMaxScaleLink) {
        this.needMaxScaleLink = needMaxScaleLink;
        return this;
    }
    public String getNeedMaxScaleLink() {
        return this.needMaxScaleLink;
    }

    public EvaluateRegionResourceRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public EvaluateRegionResourceRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public EvaluateRegionResourceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public EvaluateRegionResourceRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public EvaluateRegionResourceRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public EvaluateRegionResourceRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public EvaluateRegionResourceRequest setSubDomain(String subDomain) {
        this.subDomain = subDomain;
        return this;
    }
    public String getSubDomain() {
        return this.subDomain;
    }

    public EvaluateRegionResourceRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

}
