// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class EvaluateRegionResourceRequest extends TeaModel {
    /**
     * <p>The cluster link type. The backend randomly selects the default value. Valid values:</p>
     * <ul>
     * <li><strong>lvs</strong> :Linux virtual server</li>
     * <li><strong>proxy</strong>: proxy server</li>
     * <li><strong>dns</strong>: domain name system</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>lvs</p>
     */
    @NameInMap("DBInstanceConnType")
    public String DBInstanceConnType;

    /**
     * <p>The specifications of the node. For information about node specifications, see the following topics:</p>
     * <ul>
     * <li>PolarDB for MySQL: <a href="https://help.aliyun.com/document_detail/102542.html">Specifications of compute nodes</a></li>
     * <li>PolarDB for Oracle: <a href="https://help.aliyun.com/document_detail/207921.html">Specifications of compute nodes</a></li>
     * <li>PolarDB for PostgreSQL: <a href="https://help.aliyun.com/document_detail/209380.html">Specifications of compute nodes</a></li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>polar.mysql.x4.large</p>
     */
    @NameInMap("DBNodeClass")
    public String DBNodeClass;

    /**
     * <p>The type of the database engine. Valid values:</p>
     * <ul>
     * <li><strong>MySQL</strong></li>
     * <li><strong>PostgreSQL</strong></li>
     * <li><strong>Oracle</strong></li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>MySQL</p>
     */
    @NameInMap("DBType")
    public String DBType;

    /**
     * <p>The version of the database engine</p>
     * <ul>
     * <li><p>Valid values for the MySQL database engine:</p>
     * <ul>
     * <li><strong>5.6</strong></li>
     * <li><strong>5.7</strong></li>
     * <li><strong>8.0</strong></li>
     * </ul>
     * </li>
     * <li><p>Valid values for the PostgreSQL database engine:</p>
     * <ul>
     * <li><strong>11</strong></li>
     * <li><strong>14</strong></li>
     * </ul>
     * </li>
     * <li><p>Valid value for the Oracle database engine: <strong>11</strong></p>
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
     * <p>Specifies whether to return the zones in which the single-zone deployment method is supported. Default value: 0. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: no value returned</li>
     * <li><strong>1</strong>: returns the zones.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("DispenseMode")
    public String dispenseMode;

    /**
     * <p>Specifies whether Maxscale is created. Default value: true. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
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
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/98041.html">DescribeRegions</a> operation to query available regions.</p>
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
     * <p>The subdomain. It is the child domain of the top-level domain name or parent domain. For example, if the parent domain name is cn-beijing, its child domain can be cn-beijing-i-aliyun.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing-i-aliyun</p>
     */
    @NameInMap("SubDomain")
    public String subDomain;

    /**
     * <p>The zone ID.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/98041.html">DescribeRegions</a> operation to query available zones.</p>
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
