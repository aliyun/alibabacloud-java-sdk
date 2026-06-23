// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class CreateDatabaseRequest extends TeaModel {
    /**
     * <p>The address type of the new database. Valid values:</p>
     * <ul>
     * <li><p>Public: a public endpoint</p>
     * </li>
     * <li><p>Private: a private endpoint</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Public</p>
     */
    @NameInMap("ActiveAddressType")
    public String activeAddressType;

    /**
     * <p>The comments on the new database. The comments can be up to 500 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>cpp</p>
     */
    @NameInMap("Comment")
    public String comment;

    /**
     * <p>The name of the new database instance. This parameter is required if you set Source to <strong>Local</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>Test01</p>
     */
    @NameInMap("DatabaseName")
    public String databaseName;

    /**
     * <p>The port used to connect to the database. This parameter is required if you set Source to <strong>Local</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>5433</p>
     */
    @NameInMap("DatabasePort")
    public Integer databasePort;

    /**
     * <p>The private endpoint of the database. You can use an IPv4 address or a domain name.</p>
     * <blockquote>
     * <p>This parameter is required if you set ActiveAddressType to Private.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>192.168.XX.XX</p>
     */
    @NameInMap("DatabasePrivateAddress")
    public String databasePrivateAddress;

    /**
     * <p>The public endpoint of the database. You can use an IPv4 address or a domain name.</p>
     * <blockquote>
     * <p>This parameter is required if you set ActiveAddressType to Public.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p><a href="http://www.example.com">www.example.com</a></p>
     */
    @NameInMap("DatabasePublicAddress")
    public String databasePublicAddress;

    /**
     * <p>The type of the database. Valid values:</p>
     * <ul>
     * <li><p><strong>MySQL</strong></p>
     * </li>
     * <li><p><strong>Oracle</strong></p>
     * </li>
     * <li><p><strong>PostgreSQL</strong></p>
     * </li>
     * <li><p><strong>SQLServer</strong></p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>MySQL</p>
     */
    @NameInMap("DatabaseType")
    public String databaseType;

    /**
     * <p>The ID of the Bastionhost instance.</p>
     * <blockquote>
     * <p>Call the <a href="https://help.aliyun.com/document_detail/153281.html">DescribeInstances</a> operation to obtain this parameter.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>bastionhost-cn-7mz2g5hu20e</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The ID of the Alibaba Cloud account to which the new RDS or PolarDB database instance belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>1605494xxxx</p>
     */
    @NameInMap("InstanceMemberId")
    public Long instanceMemberId;

    /**
     * <p>The ID of the network domain for the new database.</p>
     * <blockquote>
     * <p>Call the <a href="https://help.aliyun.com/document_detail/2758827.html">ListNetworkDomains</a> operation to obtain this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("NetworkDomainId")
    public String networkDomainId;

    /**
     * <p>This parameter is required if you set Source to PolarDB. This parameter specifies the endpoint type of the PolarDB database. Valid values:</p>
     * <ul>
     * <li><p>Cluster: a cluster endpoint</p>
     * </li>
     * <li><p>Primary: a primary endpoint</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Cluster</p>
     */
    @NameInMap("PolarDBEndpointType")
    public String polarDBEndpointType;

    /**
     * <p>The region ID of the Bastionhost instance.</p>
     * <blockquote>
     * <p>For a list of region IDs and their corresponding region names, see <a href="https://help.aliyun.com/document_detail/40654.html">Regions and zones</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The source of the new database. Valid values:</p>
     * <ul>
     * <li><p>Local: a local database instance</p>
     * </li>
     * <li><p>Rds: an RDS database instance</p>
     * </li>
     * <li><p>PolarDB: a PolarDB database instance</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Local</p>
     */
    @NameInMap("Source")
    public String source;

    /**
     * <p>The ID of the database instance.</p>
     * <blockquote>
     * <p>This parameter is required if you set <strong>Source</strong> to <strong>Rds</strong> or <strong>PolarDB</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>i-bp19ienyt0yax748****</p>
     */
    @NameInMap("SourceInstanceId")
    public String sourceInstanceId;

    /**
     * <p>The region ID of the database instance.</p>
     * <blockquote>
     * <p>This parameter is required if <strong>Source</strong> is set to <strong>Rds</strong> or <strong>PolarDB</strong>.</p>
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

    public CreateDatabaseRequest setInstanceMemberId(Long instanceMemberId) {
        this.instanceMemberId = instanceMemberId;
        return this;
    }
    public Long getInstanceMemberId() {
        return this.instanceMemberId;
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
