// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ModifyDatabaseRequest extends TeaModel {
    /**
     * <p>The new address type of the database. Valid values:</p>
     * <ul>
     * <li><strong>Public</strong></li>
     * <li><strong>Private</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Public</p>
     */
    @NameInMap("ActiveAddressType")
    public String activeAddressType;

    /**
     * <p>The new remarks of the database.</p>
     * 
     * <strong>example:</strong>
     * <p>tttttttt</p>
     */
    @NameInMap("Comment")
    public String comment;

    /**
     * <p>The ID of the database to modify.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>11</p>
     */
    @NameInMap("DatabaseId")
    public String databaseId;

    /**
     * <p>The new name of the database.</p>
     * 
     * <strong>example:</strong>
     * <p>pgsql</p>
     */
    @NameInMap("DatabaseName")
    public String databaseName;

    /**
     * <p>The new port of the database.</p>
     * 
     * <strong>example:</strong>
     * <p>5433</p>
     */
    @NameInMap("DatabasePort")
    public String databasePort;

    /**
     * <p>The new internal address of the database. Specify an IPv4 address or a domain name.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-bp169******</p>
     */
    @NameInMap("DatabasePrivateAddress")
    public String databasePrivateAddress;

    /**
     * <p>The new public address of the database. Specify an IPv4 address or a domain name.</p>
     * 
     * <strong>example:</strong>
     * <p>pgm-uf6c******</p>
     */
    @NameInMap("DatabasePublicAddress")
    public String databasePublicAddress;

    /**
     * <p>The ID of the bastion host that manages the database to modify.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/153281.html">DescribeInstances</a> operation to query the bastion host ID.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>bastionhost-cn-72137xe5n01</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The ID of the new network domain for the database.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/2758827.html">ListNetworkDomains</a> operation to query the network domain ID.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("NetworkDomainId")
    public String networkDomainId;

    /**
     * <p>The region ID of the bastion host that manages the database to modify.</p>
     * <blockquote>
     * <p>For more information about the mapping between region IDs and region names, see <a href="https://help.aliyun.com/document_detail/40654.html">Regions and zones</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the ApsaraDB for RDS instance or PolarDB cluster to modify.</p>
     * <blockquote>
     * <p>This parameter is required if <strong>Source</strong> is set to <strong>Rds</strong> or <strong>PolarDB</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>i-wz99nexqd62z3bvuvpz5</p>
     */
    @NameInMap("SourceInstanceId")
    public String sourceInstanceId;

    public static ModifyDatabaseRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDatabaseRequest self = new ModifyDatabaseRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDatabaseRequest setActiveAddressType(String activeAddressType) {
        this.activeAddressType = activeAddressType;
        return this;
    }
    public String getActiveAddressType() {
        return this.activeAddressType;
    }

    public ModifyDatabaseRequest setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public ModifyDatabaseRequest setDatabaseId(String databaseId) {
        this.databaseId = databaseId;
        return this;
    }
    public String getDatabaseId() {
        return this.databaseId;
    }

    public ModifyDatabaseRequest setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }
    public String getDatabaseName() {
        return this.databaseName;
    }

    public ModifyDatabaseRequest setDatabasePort(String databasePort) {
        this.databasePort = databasePort;
        return this;
    }
    public String getDatabasePort() {
        return this.databasePort;
    }

    public ModifyDatabaseRequest setDatabasePrivateAddress(String databasePrivateAddress) {
        this.databasePrivateAddress = databasePrivateAddress;
        return this;
    }
    public String getDatabasePrivateAddress() {
        return this.databasePrivateAddress;
    }

    public ModifyDatabaseRequest setDatabasePublicAddress(String databasePublicAddress) {
        this.databasePublicAddress = databasePublicAddress;
        return this;
    }
    public String getDatabasePublicAddress() {
        return this.databasePublicAddress;
    }

    public ModifyDatabaseRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyDatabaseRequest setNetworkDomainId(String networkDomainId) {
        this.networkDomainId = networkDomainId;
        return this;
    }
    public String getNetworkDomainId() {
        return this.networkDomainId;
    }

    public ModifyDatabaseRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyDatabaseRequest setSourceInstanceId(String sourceInstanceId) {
        this.sourceInstanceId = sourceInstanceId;
        return this;
    }
    public String getSourceInstanceId() {
        return this.sourceInstanceId;
    }

}
