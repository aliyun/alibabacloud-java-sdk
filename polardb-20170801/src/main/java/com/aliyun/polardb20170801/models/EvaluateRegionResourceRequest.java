// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class EvaluateRegionResourceRequest extends TeaModel {
    @NameInMap("DBInstanceConnType")
    public String DBInstanceConnType;

    @NameInMap("DBNodeClass")
    public String DBNodeClass;

    @NameInMap("DBType")
    public String DBType;

    @NameInMap("DBVersion")
    public String DBVersion;

    @NameInMap("DispenseMode")
    public String dispenseMode;

    @NameInMap("NeedMaxScaleLink")
    public String needMaxScaleLink;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("SubDomain")
    public String subDomain;

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
