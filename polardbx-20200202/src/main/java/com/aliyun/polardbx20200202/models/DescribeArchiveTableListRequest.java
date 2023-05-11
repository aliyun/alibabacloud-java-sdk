// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribeArchiveTableListRequest extends TeaModel {
    @NameInMap("DBInstanceName")
    public String DBInstanceName;

    @NameInMap("PageIndex")
    public Long pageIndex;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("SchemaName")
    public String schemaName;

    @NameInMap("Status")
    public String status;

    @NameInMap("TableName")
    public String tableName;

    public static DescribeArchiveTableListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeArchiveTableListRequest self = new DescribeArchiveTableListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeArchiveTableListRequest setDBInstanceName(String DBInstanceName) {
        this.DBInstanceName = DBInstanceName;
        return this;
    }
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    public DescribeArchiveTableListRequest setPageIndex(Long pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Long getPageIndex() {
        return this.pageIndex;
    }

    public DescribeArchiveTableListRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeArchiveTableListRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeArchiveTableListRequest setSchemaName(String schemaName) {
        this.schemaName = schemaName;
        return this;
    }
    public String getSchemaName() {
        return this.schemaName;
    }

    public DescribeArchiveTableListRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeArchiveTableListRequest setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    public String getTableName() {
        return this.tableName;
    }

}
