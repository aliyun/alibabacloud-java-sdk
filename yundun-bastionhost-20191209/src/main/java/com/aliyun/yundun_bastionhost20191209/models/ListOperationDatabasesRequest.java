// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ListOperationDatabasesRequest extends TeaModel {
    /**
     * <p>The address of the database instance.</p>
     * 
     * <strong>example:</strong>
     * <p>10.167.XX.XX</p>
     */
    @NameInMap("DatabaseAddress")
    public String databaseAddress;

    /**
     * <p>The name of the database instance. Exact match is used.</p>
     * 
     * <strong>example:</strong>
     * <p>aaa</p>
     */
    @NameInMap("DatabaseName")
    public String databaseName;

    /**
     * <p>The database type. Valid values:</p>
     * <ul>
     * <li><strong>MySQL</strong></li>
     * <li><strong>SQLServer</strong></li>
     * <li><strong>Oracle</strong></li>
     * <li><strong>PostgreSQL</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>MySQL</p>
     */
    @NameInMap("DatabaseType")
    public String databaseType;

    /**
     * <p>The instance ID of the bastion host.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/153281.html">DescribeInstances</a> operation to query the value of this parameter.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>bastionhost-cn-tl32wdd</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The page number of the current page for a paged query. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public String pageNumber;

    /**
     * <p>The maximum number of entries to return on each page for a paged query.<br>The maximum value of the PageSize parameter is 100. Default value: 20. If the PageSize parameter is left empty, 20 entries are returned by default.</p>
     * <blockquote>
     * <p>Do not leave the PageSize parameter empty.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <p>The project ID.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The region ID of the bastion host.</p>
     * <blockquote>
     * <p>For the mappings between region IDs and region names, see <a href="https://help.aliyun.com/document_detail/40654.html">Regions and zones</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The source of the database instance. Valid values:</p>
     * <ul>
     * <li><strong>Local</strong>: on-premises database</li>
     * <li><strong>Rds</strong>: ApsaraDB RDS database</li>
     * <li><strong>PolarDB</strong>: PolarDB database</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Local</p>
     */
    @NameInMap("Source")
    public String source;

    /**
     * <p>The instance ID of the ApsaraDB RDS instance. Exact match.</p>
     * 
     * <strong>example:</strong>
     * <p>i-bp19ienyt0yax748****</p>
     */
    @NameInMap("SourceInstanceId")
    public String sourceInstanceId;

    /**
     * <p>Filters database instances by instance status. Valid values:</p>
     * <ul>
     * <li><strong>Normal</strong>: normal</li>
     * <li><strong>RemoteRelease</strong>: released</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Normal</p>
     */
    @NameInMap("SourceInstanceState")
    public String sourceInstanceState;

    public static ListOperationDatabasesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListOperationDatabasesRequest self = new ListOperationDatabasesRequest();
        return TeaModel.build(map, self);
    }

    public ListOperationDatabasesRequest setDatabaseAddress(String databaseAddress) {
        this.databaseAddress = databaseAddress;
        return this;
    }
    public String getDatabaseAddress() {
        return this.databaseAddress;
    }

    public ListOperationDatabasesRequest setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }
    public String getDatabaseName() {
        return this.databaseName;
    }

    public ListOperationDatabasesRequest setDatabaseType(String databaseType) {
        this.databaseType = databaseType;
        return this;
    }
    public String getDatabaseType() {
        return this.databaseType;
    }

    public ListOperationDatabasesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListOperationDatabasesRequest setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
    }

    public ListOperationDatabasesRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public ListOperationDatabasesRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public ListOperationDatabasesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListOperationDatabasesRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public ListOperationDatabasesRequest setSourceInstanceId(String sourceInstanceId) {
        this.sourceInstanceId = sourceInstanceId;
        return this;
    }
    public String getSourceInstanceId() {
        return this.sourceInstanceId;
    }

    public ListOperationDatabasesRequest setSourceInstanceState(String sourceInstanceState) {
        this.sourceInstanceState = sourceInstanceState;
        return this;
    }
    public String getSourceInstanceState() {
        return this.sourceInstanceState;
    }

}
