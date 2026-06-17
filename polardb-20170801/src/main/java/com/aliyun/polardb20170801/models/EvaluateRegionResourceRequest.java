// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class EvaluateRegionResourceRequest extends TeaModel {
    /**
     * <p>The link type of the cluster. The backend randomly selects a default value. Valid values:</p>
     * <ul>
     * <li><p><strong>lvs</strong>: Linux Virtual Server.</p>
     * </li>
     * <li><p><strong>proxy</strong>: proxy server.</p>
     * </li>
     * <li><p><strong>dns</strong>: Domain Name System.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>lvs</p>
     */
    @NameInMap("DBInstanceConnType")
    public String DBInstanceConnType;

    /**
     * <p>The node specifications. For more information, see the following documents:</p>
     * <ul>
     * <li><p>PolarDB for MySQL: <a href="https://help.aliyun.com/document_detail/102542.html">Compute node specifications</a>.</p>
     * </li>
     * <li><p>PolarDB for PostgreSQL (Oracle Compatible): <a href="https://help.aliyun.com/document_detail/207921.html">Compute node specifications</a>.</p>
     * </li>
     * <li><p>PolarDB for PostgreSQL: <a href="https://help.aliyun.com/document_detail/209380.html">Compute node specifications</a>.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>polar.mysql.x4.large</p>
     */
    @NameInMap("DBNodeClass")
    public String DBNodeClass;

    /**
     * <p>The database engine type. Valid values:</p>
     * <ul>
     * <li><p><strong>MySQL</strong></p>
     * </li>
     * <li><p><strong>PostgreSQL</strong></p>
     * </li>
     * <li><p><strong>Oracle</strong></p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>MySQL</p>
     */
    @NameInMap("DBType")
    public String DBType;

    /**
     * <p>The version of the database engine.</p>
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
     * <li><p>Valid values for PostgreSQL:</p>
     * <ul>
     * <li><p><strong>11</strong></p>
     * </li>
     * <li><p><strong>14</strong></p>
     * </li>
     * </ul>
     * </li>
     * <li><p>Valid values for Oracle:</p>
     * <ul>
     * <li><p><strong>11</strong></p>
     * </li>
     * <li><p><strong>14</strong></p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>8.0</p>
     */
    @NameInMap("DBVersion")
    public String DBVersion;

    /**
     * <p>Specifies whether to return the list of zones that support single-zone deployment. Valid values:</p>
     * <ul>
     * <li><p><strong>0</strong> (default): The list is not returned.</p>
     * </li>
     * <li><p><strong>1</strong>: The list is returned.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("DispenseMode")
    public String dispenseMode;

    /**
     * <p>Specifies whether to create a MaxScale cluster. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong> (default): A MaxScale cluster is created.</p>
     * </li>
     * <li><p><strong>false</strong>: A MaxScale cluster is not created.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("NeedMaxScaleLink")
    public String needMaxScaleLink;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID.</p>
     * <blockquote>
     * <p>Call the <a href="https://help.aliyun.com/document_detail/98041.html">DescribeRegions</a> operation to query available regions.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-************</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The subdomain. A subdomain is a level below a top-level domain. For example, if the parent domain is \<code>cn-beijing\\</code>, a valid subdomain is \<code>cn-beijing-i-aliyun\\</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing-i-aliyun</p>
     */
    @NameInMap("SubDomain")
    public String subDomain;

    /**
     * <p>The zone ID.</p>
     * <blockquote>
     * <p>Call the <a href="https://help.aliyun.com/document_detail/98041.html">DescribeRegions</a> operation to query the available zones.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-g</p>
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
