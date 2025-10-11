// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class GenerateUpgradeReportForSyncCloneRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Normal</p>
     */
    @NameInMap("CreationCategory")
    public String creationCategory;

    /**
     * <strong>example:</strong>
     * <p>MigrationFromRDS</p>
     */
    @NameInMap("CreationOption")
    public String creationOption;

    /**
     * <strong>example:</strong>
     * <p>testDB</p>
     */
    @NameInMap("DBName")
    public String DBName;

    /**
     * <strong>example:</strong>
     * <p>PostgreSQL</p>
     */
    @NameInMap("DBType")
    public String DBType;

    /**
     * <strong>example:</strong>
     * <p>5.6</p>
     */
    @NameInMap("DBVersion")
    public String DBVersion;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <strong>example:</strong>
     * <p>{\&quot;targetTableMode\&quot;:2}</p>
     */
    @NameInMap("Reserve")
    public String reserve;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <strong>example:</strong>
     * <p>pc-k2j96w169uhu868l8</p>
     */
    @NameInMap("SourceDBClusterId")
    public String sourceDBClusterId;

    public static GenerateUpgradeReportForSyncCloneRequest build(java.util.Map<String, ?> map) throws Exception {
        GenerateUpgradeReportForSyncCloneRequest self = new GenerateUpgradeReportForSyncCloneRequest();
        return TeaModel.build(map, self);
    }

    public GenerateUpgradeReportForSyncCloneRequest setCreationCategory(String creationCategory) {
        this.creationCategory = creationCategory;
        return this;
    }
    public String getCreationCategory() {
        return this.creationCategory;
    }

    public GenerateUpgradeReportForSyncCloneRequest setCreationOption(String creationOption) {
        this.creationOption = creationOption;
        return this;
    }
    public String getCreationOption() {
        return this.creationOption;
    }

    public GenerateUpgradeReportForSyncCloneRequest setDBName(String DBName) {
        this.DBName = DBName;
        return this;
    }
    public String getDBName() {
        return this.DBName;
    }

    public GenerateUpgradeReportForSyncCloneRequest setDBType(String DBType) {
        this.DBType = DBType;
        return this;
    }
    public String getDBType() {
        return this.DBType;
    }

    public GenerateUpgradeReportForSyncCloneRequest setDBVersion(String DBVersion) {
        this.DBVersion = DBVersion;
        return this;
    }
    public String getDBVersion() {
        return this.DBVersion;
    }

    public GenerateUpgradeReportForSyncCloneRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public GenerateUpgradeReportForSyncCloneRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public GenerateUpgradeReportForSyncCloneRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GenerateUpgradeReportForSyncCloneRequest setReserve(String reserve) {
        this.reserve = reserve;
        return this;
    }
    public String getReserve() {
        return this.reserve;
    }

    public GenerateUpgradeReportForSyncCloneRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public GenerateUpgradeReportForSyncCloneRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public GenerateUpgradeReportForSyncCloneRequest setSourceDBClusterId(String sourceDBClusterId) {
        this.sourceDBClusterId = sourceDBClusterId;
        return this;
    }
    public String getSourceDBClusterId() {
        return this.sourceDBClusterId;
    }

}
