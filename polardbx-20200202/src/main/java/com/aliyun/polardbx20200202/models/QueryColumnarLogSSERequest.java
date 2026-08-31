// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class QueryColumnarLogSSERequest extends TeaModel {
    /**
     * <p>The ID of the PolarDB-X instance whose column store audit logs you want to query.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pxc-********</p>
     */
    @NameInMap("DBInstanceName")
    public String DBInstanceName;

    /**
     * <p>The maximum number of result rows to return for this request. Valid values: 1 to 10000. If this parameter is not specified, no additional row limit is imposed on the SQL submitted by the caller. The server-side SSE upper limit of 10000 rows and the top-level LIMIT clause in the SQL statement still apply.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("MaxResultRows")
    public Long maxResultRows;

    /**
     * <p>The region ID of the request. The value must match the region where the SQLQuery service is deployed.</p>
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
     * <p>select * from device where name = \&quot;108001022203365239\&quot;</p>
     */
    @NameInMap("SQL")
    public String SQL;

    public static QueryColumnarLogSSERequest build(java.util.Map<String, ?> map) throws Exception {
        QueryColumnarLogSSERequest self = new QueryColumnarLogSSERequest();
        return TeaModel.build(map, self);
    }

    public QueryColumnarLogSSERequest setDBInstanceName(String DBInstanceName) {
        this.DBInstanceName = DBInstanceName;
        return this;
    }
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    public QueryColumnarLogSSERequest setMaxResultRows(Long maxResultRows) {
        this.maxResultRows = maxResultRows;
        return this;
    }
    public Long getMaxResultRows() {
        return this.maxResultRows;
    }

    public QueryColumnarLogSSERequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public QueryColumnarLogSSERequest setSQL(String SQL) {
        this.SQL = SQL;
        return this;
    }
    public String getSQL() {
        return this.SQL;
    }

}
