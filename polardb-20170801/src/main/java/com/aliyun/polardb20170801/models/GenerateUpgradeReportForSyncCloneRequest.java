// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class GenerateUpgradeReportForSyncCloneRequest extends TeaModel {
    /**
     * <p>The product series. Valid values:</p>
     * <ul>
     * <li><p><strong>Normal</strong>: Cluster Edition (default)</p>
     * </li>
     * <li><p><strong>SENormal</strong>: Standard Edition</p>
     * </li>
     * </ul>
     * <p>See <a href="https://help.aliyun.com/document_detail/183258.html">Product series</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>Normal</p>
     */
    @NameInMap("CreationCategory")
    public String creationCategory;

    /**
     * <p>The creation method. Valid values:</p>
     * <ul>
     * <li><p><strong>MigrationFromRDS</strong>: Migrate data from an existing RDS instance to a new PolarDB cluster. The created PolarDB cluster is in read-only mode and has binary logging enabled by default. For operations in the console, see <a href="https://help.aliyun.com/document_detail/121582.html">Upgrade an ApsaraDB RDS for MySQL instance to PolarDB for MySQL</a>.</p>
     * </li>
     * <li><p><strong>UpgradeFromPolarDB</strong>: Upgrade and migrate data from a PolarDB cluster. See <a href="https://help.aliyun.com/document_detail/459712.html">Upgrade the major version</a>.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>MigrationFromRDS</p>
     */
    @NameInMap("CreationOption")
    public String creationOption;

    /**
     * <p>The name of the database. You can specify only one database name.</p>
     * <blockquote>
     * <p>This parameter is supported only for PolarDB for PostgreSQL (Oracle Compatible) clusters.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>testDB</p>
     */
    @NameInMap("DBName")
    public String DBName;

    /**
     * <p>The type of the database engine. Valid values:</p>
     * <ul>
     * <li><p><strong>MySQL</strong></p>
     * </li>
     * <li><p><strong>Oracle</strong></p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PostgreSQL</p>
     */
    @NameInMap("DBType")
    public String DBType;

    /**
     * <p>The version of the destination database engine.</p>
     * <ul>
     * <li><p>Valid values for MySQL:</p>
     * <ul>
     * <li><p><strong>5.6</strong></p>
     * </li>
     * <li><p><strong>5.7</strong></p>
     * </li>
     * <li><p><strong>8.0</strong></p>
     * </li>
     * </ul>
     * </li>
     * <li><p>Valid value for Oracle: <strong>14</strong>.</p>
     * </li>
     * </ul>
     * 
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
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>A reserved parameter in the JSON string format.</p>
     * 
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
     * <p>The ID of the source instance.</p>
     * 
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
