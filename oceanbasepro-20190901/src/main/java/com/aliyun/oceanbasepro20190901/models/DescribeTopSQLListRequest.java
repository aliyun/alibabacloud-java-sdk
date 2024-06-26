// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeTopSQLListRequest extends TeaModel {
    /**
     * <p>The number of block index cache hits.</p>
     * 
     * <strong>example:</strong>
     * <p>testdb</p>
     */
    @NameInMap("DbName")
    public String dbName;

    /**
     * <p>The SQL type.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-09-13T15:40:43Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The average number of logical reads of the SQL statement during the specified period of time.<br>The value covers the numbers of reads of different caches and the number of disk I/Os. It is an important metric for measuring the SQL filtering performance.   </p>
     * <blockquote>
     * <p><br> A higher ratio of the number of logical reads to the number of returned rows indicates poorer filtering performance. General causes include non-standard content written by SQL statements, non-standard table indexes created, and non-standard SQL execution plans.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>[dbName:sys]</p>
     */
    @NameInMap("FilterCondition")
    public java.util.Map<String, ?> filterCondition;

    /**
     * <p>The number of failures.</p>
     * 
     * <strong>example:</strong>
     * <p>i-bp19y05uq6xpacyqnlrc</p>
     */
    @NameInMap("NodeIp")
    public String nodeIp;

    /**
     * <p>The queuing time, in ms.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of row cache hits.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The I/O wait time, in ms.</p>
     * 
     * <strong>example:</strong>
     * <p>8D6E84<strong><strong>0B8FB1823D199E2CA1</strong></strong></p>
     */
    @NameInMap("SQLId")
    public String SQLId;

    /**
     * <p>The number of retries.</p>
     * 
     * <strong>example:</strong>
     * <p>update</p>
     */
    @NameInMap("SearchKeyWord")
    public String searchKeyWord;

    /**
     * <p>SQLID.</p>
     * 
     * <strong>example:</strong>
     * <p>cputime</p>
     */
    @NameInMap("SearchParameter")
    public String searchParameter;

    /**
     * <p>The IP address of the client.</p>
     * 
     * <strong>example:</strong>
     * <blockquote>
     * </blockquote>
     */
    @NameInMap("SearchRule")
    public String searchRule;

    /**
     * <p>The number of Bloom filter cache hits.</p>
     * 
     * <strong>example:</strong>
     * <p>0.01</p>
     */
    @NameInMap("SearchValue")
    public String searchValue;

    /**
     * <p>The number of rows read from the disk.</p>
     * 
     * <strong>example:</strong>
     * <p>cputime</p>
     */
    @NameInMap("SortColumn")
    public String sortColumn;

    /**
     * <p>The list of top SQL statements.</p>
     * 
     * <strong>example:</strong>
     * <p>desc</p>
     */
    @NameInMap("SortOrder")
    public String sortOrder;

    /**
     * <p>The maximum response time, in ms.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-06-13T15:40:43Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The average CPU time, in ms.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>t2mr3oae0****</p>
     */
    @NameInMap("TenantId")
    public String tenantId;

    public static DescribeTopSQLListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeTopSQLListRequest self = new DescribeTopSQLListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeTopSQLListRequest setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }
    public String getDbName() {
        return this.dbName;
    }

    public DescribeTopSQLListRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeTopSQLListRequest setFilterCondition(java.util.Map<String, ?> filterCondition) {
        this.filterCondition = filterCondition;
        return this;
    }
    public java.util.Map<String, ?> getFilterCondition() {
        return this.filterCondition;
    }

    public DescribeTopSQLListRequest setNodeIp(String nodeIp) {
        this.nodeIp = nodeIp;
        return this;
    }
    public String getNodeIp() {
        return this.nodeIp;
    }

    public DescribeTopSQLListRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeTopSQLListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeTopSQLListRequest setSQLId(String SQLId) {
        this.SQLId = SQLId;
        return this;
    }
    public String getSQLId() {
        return this.SQLId;
    }

    public DescribeTopSQLListRequest setSearchKeyWord(String searchKeyWord) {
        this.searchKeyWord = searchKeyWord;
        return this;
    }
    public String getSearchKeyWord() {
        return this.searchKeyWord;
    }

    public DescribeTopSQLListRequest setSearchParameter(String searchParameter) {
        this.searchParameter = searchParameter;
        return this;
    }
    public String getSearchParameter() {
        return this.searchParameter;
    }

    public DescribeTopSQLListRequest setSearchRule(String searchRule) {
        this.searchRule = searchRule;
        return this;
    }
    public String getSearchRule() {
        return this.searchRule;
    }

    public DescribeTopSQLListRequest setSearchValue(String searchValue) {
        this.searchValue = searchValue;
        return this;
    }
    public String getSearchValue() {
        return this.searchValue;
    }

    public DescribeTopSQLListRequest setSortColumn(String sortColumn) {
        this.sortColumn = sortColumn;
        return this;
    }
    public String getSortColumn() {
        return this.sortColumn;
    }

    public DescribeTopSQLListRequest setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
        return this;
    }
    public String getSortOrder() {
        return this.sortOrder;
    }

    public DescribeTopSQLListRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeTopSQLListRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
