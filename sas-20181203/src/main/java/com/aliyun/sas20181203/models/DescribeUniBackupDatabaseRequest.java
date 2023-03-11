// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeUniBackupDatabaseRequest extends TeaModel {
    /**
     * <p>The number of the page to return. Default value: **1**.</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The type of the database. Valid values:</p>
     * <br>
     * <p>*   **MYSQL**</p>
     * <p>*   **MSSQL**</p>
     * <p>*   **Oracle**</p>
     */
    @NameInMap("DatabaseType")
    public String databaseType;

    /**
     * <p>The name of the Elastic Compute Service (ECS) instance.</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <p>The number of entries to return on each page. Default value: 20. If you leave this parameter empty, 20 entries are returned on each page.</p>
     * <br>
     * <p>>  We recommend that you do not leave this parameter empty.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The condition that is used to query the database. Valid values:</p>
     * <br>
     * <p>*   **create**: newly created</p>
     * <p>*   **restore**: restored</p>
     */
    @NameInMap("QueryType")
    public String queryType;

    /**
     * <p>The region ID of the server that hosts the database.</p>
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
