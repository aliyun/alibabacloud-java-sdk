// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeTopSQLListShrinkRequest extends TeaModel {
    /**
     * <p>The number of block index cache hits.</p>
     */
    @NameInMap("DbName")
    public String dbName;

    /**
     * <p>The SQL type.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The average number of logical reads of the SQL statement during the specified period of time.   </p>
     * <p>The value covers the numbers of reads of different caches and the number of disk I/Os. It is an important metric for measuring the SQL filtering performance.   </p>
     * <br>
     * <p>> <br> A higher ratio of the number of logical reads to the number of returned rows indicates poorer filtering performance. General causes include non-standard content written by SQL statements, non-standard table indexes created, and non-standard SQL execution plans.</p>
     */
    @NameInMap("FilterCondition")
    public String filterConditionShrink;

    /**
     * <p>The number of failures.</p>
     */
    @NameInMap("NodeIp")
    public String nodeIp;

    /**
     * <p>The queuing time, in ms.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of row cache hits.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The I/O wait time, in ms.</p>
     */
    @NameInMap("SQLId")
    public String SQLId;

    /**
     * <p>The number of retries.</p>
     */
    @NameInMap("SearchKeyWord")
    public String searchKeyWord;

    /**
     * <p>SQLID.</p>
     */
    @NameInMap("SearchParameter")
    public String searchParameter;

    /**
     * <p>The IP address of the client.</p>
     */
    @NameInMap("SearchRule")
    public String searchRule;

    /**
     * <p>The number of Bloom filter cache hits.</p>
     */
    @NameInMap("SearchValue")
    public String searchValue;

    /**
     * <p>The number of rows read from the disk.</p>
     */
    @NameInMap("SortColumn")
    public String sortColumn;

    /**
     * <p>The list of top SQL statements.</p>
     */
    @NameInMap("SortOrder")
    public String sortOrder;

    /**
     * <p>The maximum response time, in ms.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The average CPU time, in ms.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("TenantId")
    public String tenantId;

    public static DescribeTopSQLListShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeTopSQLListShrinkRequest self = new DescribeTopSQLListShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DescribeTopSQLListShrinkRequest setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }
    public String getDbName() {
        return this.dbName;
    }

    public DescribeTopSQLListShrinkRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeTopSQLListShrinkRequest setFilterConditionShrink(String filterConditionShrink) {
        this.filterConditionShrink = filterConditionShrink;
        return this;
    }
    public String getFilterConditionShrink() {
        return this.filterConditionShrink;
    }

    public DescribeTopSQLListShrinkRequest setNodeIp(String nodeIp) {
        this.nodeIp = nodeIp;
        return this;
    }
    public String getNodeIp() {
        return this.nodeIp;
    }

    public DescribeTopSQLListShrinkRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeTopSQLListShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeTopSQLListShrinkRequest setSQLId(String SQLId) {
        this.SQLId = SQLId;
        return this;
    }
    public String getSQLId() {
        return this.SQLId;
    }

    public DescribeTopSQLListShrinkRequest setSearchKeyWord(String searchKeyWord) {
        this.searchKeyWord = searchKeyWord;
        return this;
    }
    public String getSearchKeyWord() {
        return this.searchKeyWord;
    }

    public DescribeTopSQLListShrinkRequest setSearchParameter(String searchParameter) {
        this.searchParameter = searchParameter;
        return this;
    }
    public String getSearchParameter() {
        return this.searchParameter;
    }

    public DescribeTopSQLListShrinkRequest setSearchRule(String searchRule) {
        this.searchRule = searchRule;
        return this;
    }
    public String getSearchRule() {
        return this.searchRule;
    }

    public DescribeTopSQLListShrinkRequest setSearchValue(String searchValue) {
        this.searchValue = searchValue;
        return this;
    }
    public String getSearchValue() {
        return this.searchValue;
    }

    public DescribeTopSQLListShrinkRequest setSortColumn(String sortColumn) {
        this.sortColumn = sortColumn;
        return this;
    }
    public String getSortColumn() {
        return this.sortColumn;
    }

    public DescribeTopSQLListShrinkRequest setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
        return this;
    }
    public String getSortOrder() {
        return this.sortOrder;
    }

    public DescribeTopSQLListShrinkRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeTopSQLListShrinkRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
