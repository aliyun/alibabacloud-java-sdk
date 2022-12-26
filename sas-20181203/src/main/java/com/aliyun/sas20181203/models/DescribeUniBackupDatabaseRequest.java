// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeUniBackupDatabaseRequest extends TeaModel {
    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("DatabaseType")
    public String databaseType;

    @NameInMap("InstanceName")
    public String instanceName;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("QueryType")
    public String queryType;

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
