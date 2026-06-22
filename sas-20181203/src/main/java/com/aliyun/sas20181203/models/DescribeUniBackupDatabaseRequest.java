// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeUniBackupDatabaseRequest extends TeaModel {
    /**
     * <p>The page number of the page to return. Default value: <strong>1</strong>, which indicates the first page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The type of the database. Valid values:</p>
     * <ul>
     * <li><strong>MYSQL</strong></li>
     * <li><strong>MSSQL</strong></li>
     * <li><strong>Oracle</strong>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>MYSQL</p>
     */
    @NameInMap("DatabaseType")
    public String databaseType;

    /**
     * <p>The name of the ECS instance.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <p>The maximum number of entries per page in a paging query. Default value: 20. If you leave this parameter empty, 20 entries are returned per page by default.</p>
     * <blockquote>
     * <p>Do not leave PageSize empty.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The query type for the database. Valid values:</p>
     * <ul>
     * <li><strong>create</strong>: create</li>
     * <li><strong>restore</strong>: restore.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>create</p>
     */
    @NameInMap("QueryType")
    public String queryType;

    /**
     * <p>The region ID of the database server.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hongkong</p>
     */
    @NameInMap("UniRegionId")
    public String uniRegionId;

    public static DescribeUniBackupDatabaseRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeUniBackupDatabaseRequest self = new DescribeUniBackupDatabaseRequest();
        return TeaModel.build(map, self);
    }

    public DescribeUniBackupDatabaseRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeUniBackupDatabaseRequest setDatabaseType(String databaseType) {
        this.databaseType = databaseType;
        return this;
    }
    public String getDatabaseType() {
        return this.databaseType;
    }

    public DescribeUniBackupDatabaseRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public DescribeUniBackupDatabaseRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeUniBackupDatabaseRequest setQueryType(String queryType) {
        this.queryType = queryType;
        return this;
    }
    public String getQueryType() {
        return this.queryType;
    }

    public DescribeUniBackupDatabaseRequest setUniRegionId(String uniRegionId) {
        this.uniRegionId = uniRegionId;
        return this;
    }
    public String getUniRegionId() {
        return this.uniRegionId;
    }

}
