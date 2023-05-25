// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeSlowSQLHistoryListRequest extends TeaModel {
    /**
     * <p>The number of RPCs.</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The maximum response time.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of plan misses.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The wait time for network.</p>
     */
    @NameInMap("SQLId")
    public String SQLId;

    /**
     * <p>The I/O wait time.</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The ID of the tenant.</p>
     */
    @NameInMap("TenantId")
    public String tenantId;

    public static DescribeSlowSQLHistoryListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSlowSQLHistoryListRequest self = new DescribeSlowSQLHistoryListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSlowSQLHistoryListRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeSlowSQLHistoryListRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeSlowSQLHistoryListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeSlowSQLHistoryListRequest setSQLId(String SQLId) {
        this.SQLId = SQLId;
        return this;
    }
    public String getSQLId() {
        return this.SQLId;
    }

    public DescribeSlowSQLHistoryListRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeSlowSQLHistoryListRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
