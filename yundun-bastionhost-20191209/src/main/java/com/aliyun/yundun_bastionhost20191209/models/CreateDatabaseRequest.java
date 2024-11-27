// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class CreateDatabaseRequest extends TeaModel {
    /**
     * <p>The address type of the database to add. Valid values:</p>
     * <ul>
     * <li>Public</li>
     * <li>Private</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Public</p>
     */
    @NameInMap("ActiveAddressType")
    public String activeAddressType;

    /**
     * <p>The remarks of the database to add. The remarks can be up to 500 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>cpp</p>
     */
    @NameInMap("Comment")
    public String comment;

    /**
     * <p>The name of the database to add. This parameter is required if Source is set to <strong>Local</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>Oracle</p>
     */
    @NameInMap("DatabaseName")
    public String databaseName;

    /**
     * <p>The port of the database. This parameter is required if Source is set to <strong>Local</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>5433</p>
     */
    @NameInMap("DatabasePort")
    public Integer databasePort;

    /**
     * <p>The internal IP address of the database. Specify an IPv4 address or a domain name.</p>
     * <blockquote>
     * <p> This parameter is required if ActiveAddressType is set to Private.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>pgm-uf6o******</p>
     */
    @NameInMap("DatabasePrivateAddress")
    public String databasePrivateAddress;

    /**
     * <p>The public IP address of the database. Specify an IPv4 address or a domain name.</p>
     * <blockquote>
     * <p> This parameter is required if ActiveAddressType is set to Public.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>rm-uf65251k51******</p>
     */
    @NameInMap("DatabasePublicAddress")
    public String databasePublicAddress;

    /**
     * <p>The type of the database engine. Valid values:</p>
     * <ul>
     * <li><strong>MySQL</strong></li>
     * <li><strong>Oracle</strong></li>
     * <li><strong>PostgreSQL</strong></li>
     * <li><strong>SQLServer</strong></li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>MySQL</p>
     */
    @NameInMap("DatabaseType")
    public String databaseType;

    /**
     * <p>The bastion host ID.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/153281.html">DescribeInstances</a> operation to query the bastion host ID.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>bastionhost-cn-7mz2g5hu20e</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The ID of the network domain to which the database to add belongs.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/2758827.html">ListNetworkDomains</a> operation to query the network domain ID.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("NetworkDomainId")
    public String networkDomainId;

    /**
     * <p>The endpoint type of the PolarDB database. This parameter is required if Source is set to PolarDB. Valid values:</p>
     * <ul>
     * <li>Cluster</li>
     * <li>Primary</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Cluster</p>
     */
    @NameInMap("PolarDBEndpointType")
    public String polarDBEndpointType;

    /**
     * <p>The region ID of the bastion host.</p>
     * <blockquote>
     * <p>For more information about the mapping between region IDs and region names, see <a href="https://help.aliyun.com/document_detail/40654.html">Regions and zones</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The type of the database to add. Valid values:</p>
     * <ul>
     * <li>Local: on-premises database.</li>
     * <li>Rds: ApsaraDB RDS instance.</li>
     * <li>PolarDB: PolarDB cluster.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Local</p>
     */
    @NameInMap("Source")
    public String source;

    /**
     * <p>The instance ID of the database to add.</p>
     * <blockquote>
     * <p>This parameter is required if <strong>Source</strong> is set to <strong>Rds</strong> or <strong>PolarDB</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>i-bp19ienyt0yax748****</p>
     */
    @NameInMap("SourceInstanceId")
    public String sourceInstanceId;

    /**
     * <p>The region ID of the database to add.</p>
     * <blockquote>
     * <p> This parameter is required if <strong>Source</strong> is set to <strong>Rds</strong> or <strong>PolarDB</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("SourceInstanceRegionId")
    public String sourceInstanceRegionId;

    public static CreateDatabaseRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDatabaseRequest self = new CreateDatabaseRequest();
        return TeaModel.build(map, self);
    }

    public CreateDatabaseRequest setActiveAddressType(String activeAddressType) {
        this.activeAddressType = activeAddressType;
        return this;
    }
    public String getActiveAddressType() {
        return this.activeAddressType;
    }

    public CreateDatabaseRequest setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public CreateDatabaseRequest setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }
    public String getDatabaseName() {
        return this.databaseName;
    }

    public CreateDatabaseRequest setDatabasePort(Integer databasePort) {
        this.databasePort = databasePort;
        return this;
    }
    public Integer getDatabasePort() {
        return this.databasePort;
    }

    public CreateDatabaseRequest setDatabasePrivateAddress(String databasePrivateAddress) {
        this.databasePrivateAddress = databasePrivateAddress;
        return this;
    }
    public String getDatabasePrivateAddress() {
        return this.databasePrivateAddress;
    }

    public CreateDatabaseRequest setDatabasePublicAddress(String databasePublicAddress) {
        this.databasePublicAddress = databasePublicAddress;
        return this;
    }
    public String getDatabasePublicAddress() {
        return this.databasePublicAddress;
    }

    public CreateDatabaseRequest setDatabaseType(String databaseType) {
        this.databaseType = databaseType;
        return this;
    }
    public String getDatabaseType() {
        return this.databaseType;
    }

    public CreateDatabaseRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateDatabaseRequest setNetworkDomainId(String networkDomainId) {
        this.networkDomainId = networkDomainId;
        return this;
    }
    public String getNetworkDomainId() {
        return this.networkDomainId;
    }

    public CreateDatabaseRequest setPolarDBEndpointType(String polarDBEndpointType) {
        this.polarDBEndpointType = polarDBEndpointType;
        return this;
    }
    public String getPolarDBEndpointType() {
        return this.polarDBEndpointType;
    }

    public CreateDatabaseRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateDatabaseRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public CreateDatabaseRequest setSourceInstanceId(String sourceInstanceId) {
        this.sourceInstanceId = sourceInstanceId;
        return this;
    }
    public String getSourceInstanceId() {
        return this.sourceInstanceId;
    }

    public CreateDatabaseRequest setSourceInstanceRegionId(String sourceInstanceRegionId) {
        this.sourceInstanceRegionId = sourceInstanceRegionId;
        return this;
    }
    public String getSourceInstanceRegionId() {
        return this.sourceInstanceRegionId;
    }

}
