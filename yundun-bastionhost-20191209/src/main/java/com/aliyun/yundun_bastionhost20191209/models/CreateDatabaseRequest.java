// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class CreateDatabaseRequest extends TeaModel {
    /**
     * <p>The address type of the new database. Valid values:</p>
     * <ul>
     * <li>Public: public address</li>
     * <li>Private: private network address</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Public</p>
     */
    @NameInMap("ActiveAddressType")
    public String activeAddressType;

    /**
     * <p>The remarks of the new database. The value can be up to 500 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>cpp</p>
     */
    @NameInMap("Comment")
    public String comment;

    /**
     * <p>The name of the new database instance. This parameter is required when the database source is <strong>Local</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>Test01</p>
     */
    @NameInMap("DatabaseName")
    public String databaseName;

    /**
     * <p>The port used to access the database. This parameter is required when the database source is <strong>Local</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>5433</p>
     */
    @NameInMap("DatabasePort")
    public Integer databasePort;

    /**
     * <p>The private network address. IPv4 addresses and domain name formats are supported.</p>
     * <blockquote>
     * <p>This parameter is required when ActiveAddressType is set to Private.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>192.168.XX.XX</p>
     */
    @NameInMap("DatabasePrivateAddress")
    public String databasePrivateAddress;

    /**
     * <p>The public address. IPv4 addresses and domain name formats are supported.</p>
     * <blockquote>
     * <p>This parameter is required when ActiveAddressType is set to Public.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p><a href="http://www.example.com">www.example.com</a></p>
     */
    @NameInMap("DatabasePublicAddress")
    public String databasePublicAddress;

    /**
     * <p>The database type. Valid values:</p>
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
     * <p>The ID of the bastion host instance.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/153281.html">DescribeInstances</a> operation to obtain this parameter.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>bastionhost-cn-7mz2g5hu20e</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The ID of the Alibaba Cloud account to which the new ApsaraDB RDS or PolarDB database instance belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>1605494xxxx</p>
     */
    @NameInMap("InstanceMemberId")
    public Long instanceMemberId;

    /**
     * <p>The ID of the network domain to which the new database belongs.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/2758827.html">ListNetworkDomains</a> operation to obtain this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("NetworkDomainId")
    public String networkDomainId;

    /**
     * <p>The endpoint type of the PolarDB cluster. This parameter is required when Source is set to PolarDB. Valid values:</p>
     * <ul>
     * <li>Cluster: cluster endpoint</li>
     * <li>Primary: primary endpoint</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Cluster</p>
     */
    @NameInMap("PolarDBEndpointType")
    public String polarDBEndpointType;

    /**
     * <p>The project ID.</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The region ID of the bastion host.</p>
     * <blockquote>
     * <p>For the mapping between region IDs and region names, see <a href="https://help.aliyun.com/document_detail/40654.html">Regions and zones</a>.</p>
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
     * <li>Local: self-managed database instance</li>
     * <li>Rds: ApsaraDB RDS instance</li>
     * <li>PolarDB: PolarDB cluster</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Local</p>
     */
    @NameInMap("Source")
    public String source;

    /**
     * <p>The instance ID of the new database.  </p>
     * <blockquote>
     * <p>This parameter is required when <strong>Source</strong> is set to <strong>Rds</strong> or <strong>PolarDB</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>i-bp19ienyt0yax748****</p>
     */
    @NameInMap("SourceInstanceId")
    public String sourceInstanceId;

    /**
     * <p>The region ID of the new database instance.</p>
     * <blockquote>
     * <p>This parameter is required when <strong>Source</strong> is set to <strong>Rds</strong> or <strong>PolarDB</strong>.</p>
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

    public CreateDatabaseRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
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
