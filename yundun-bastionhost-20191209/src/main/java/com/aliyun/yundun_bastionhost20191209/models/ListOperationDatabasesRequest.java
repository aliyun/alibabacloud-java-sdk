// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ListOperationDatabasesRequest extends TeaModel {
    /**
     * <p>The address of the database.</p>
     * 
     * <strong>example:</strong>
     * <p>10.167.XX.XX</p>
     */
    @NameInMap("DatabaseAddress")
    public String databaseAddress;

    /**
     * <p>The name of the database. This parameter supports only exact matches.</p>
     * 
     * <strong>example:</strong>
     * <p>aaa</p>
     */
    @NameInMap("DatabaseName")
    public String databaseName;

    /**
     * <p>The database type. Valid values:</p>
     * <ul>
     * <li><p><strong>MySQL</strong></p>
     * </li>
     * <li><p><strong>SQLServer</strong></p>
     * </li>
     * <li><p><strong>Oracle</strong></p>
     * </li>
     * <li><p><strong>PostgreSQL</strong></p>
     * </li>
     * </ul>
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
     * <p>bastionhost-cn-tl32wdd</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The page number. The default value is <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public String pageNumber;

    /**
     * <p>The number of entries to return on each page.<br>The maximum value is 100. The default value is 20. If you do not specify this parameter, 20 entries are returned.<br></p>
     * <blockquote>
     * <p>Specify a value for this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <p>The region ID of the Bastionhost instance.</p>
     * <blockquote>
     * <p>For more information, see <a href="https://help.aliyun.com/document_detail/40654.html">Regions and zones</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The source of the database. Valid values:</p>
     * <ul>
     * <li><p><strong>Local</strong>: a local database</p>
     * </li>
     * <li><p><strong>Rds</strong>: an ApsaraDB RDS database</p>
     * </li>
     * <li><p><strong>PolarDB</strong>: a PolarDB database</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Local</p>
     */
    @NameInMap("Source")
    public String source;

    /**
     * <p>The ID of the source instance. This parameter supports only exact matches.</p>
     * 
     * <strong>example:</strong>
     * <p>i-bp19ienyt0yax748****</p>
     */
    @NameInMap("SourceInstanceId")
    public String sourceInstanceId;

    /**
     * <p>The status of the source instance. You can use this parameter to filter the results.</p>
     * <ul>
     * <li><p><strong>Normal</strong>: The instance is running.</p>
     * </li>
     * <li><p><strong>RemoteRelease</strong>: The instance is released.</p>
     * </li>
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
