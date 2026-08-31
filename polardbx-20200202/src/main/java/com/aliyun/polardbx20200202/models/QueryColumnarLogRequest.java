// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class QueryColumnarLogRequest extends TeaModel {
    /**
     * <p>The ID of the PolarDB-X instance for which you want to query column store audit logs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pxc-********</p>
     */
    @NameInMap("DBInstanceName")
    public String DBInstanceName;

    /**
     * <p>The maximum number of result rows to return for this request. Valid values: 1 to 1000. Default value: 100. The actual number of returned rows is also subject to the top-level LIMIT clause in the SQL statement and the current service policy.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("MaxResultRows")
    public Long maxResultRows;

    /**
     * <p>The region ID of the request. The region ID must be the same as the region where the SQLQuery service is deployed.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The read-only query statement to execute. Only a single MySQL SELECT statement is supported, and it must access the fully qualified polardbx_sls table. Multi-statement queries, write operations, locks, user variables, dynamic placeholders, and reserved hints are not supported.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>select * from device where name = \&quot;105506012111488797\&quot;</p>
     */
    @NameInMap("SQL")
    public String SQL;

    public static QueryColumnarLogRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryColumnarLogRequest self = new QueryColumnarLogRequest();
        return TeaModel.build(map, self);
    }

    public QueryColumnarLogRequest setDBInstanceName(String DBInstanceName) {
        this.DBInstanceName = DBInstanceName;
        return this;
    }
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    public QueryColumnarLogRequest setMaxResultRows(Long maxResultRows) {
        this.maxResultRows = maxResultRows;
        return this;
    }
    public Long getMaxResultRows() {
        return this.maxResultRows;
    }

    public QueryColumnarLogRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public QueryColumnarLogRequest setSQL(String SQL) {
        this.SQL = SQL;
        return this;
    }
    public String getSQL() {
        return this.SQL;
    }

}
