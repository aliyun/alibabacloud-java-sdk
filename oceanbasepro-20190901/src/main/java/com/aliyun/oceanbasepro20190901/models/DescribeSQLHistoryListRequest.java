// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeSQLHistoryListRequest extends TeaModel {
    /**
     * <p>The number of block index cache hits.</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The end time in UTC +0.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The end time.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The number of block index cache hits.</p>
     */
    @NameInMap("SQLId")
    public String SQLId;

    /**
     * <p>The maximum response time.</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The average CPU time.</p>
     */
    @NameInMap("TenantId")
    public String tenantId;

    public static DescribeSQLHistoryListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSQLHistoryListRequest self = new DescribeSQLHistoryListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSQLHistoryListRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeSQLHistoryListRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeSQLHistoryListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeSQLHistoryListRequest setSQLId(String SQLId) {
        this.SQLId = SQLId;
        return this;
    }
    public String getSQLId() {
        return this.SQLId;
    }

    public DescribeSQLHistoryListRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeSQLHistoryListRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
