// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeSlowSQLListShrinkRequest extends TeaModel {
    /**
     * <p>It is an online CLI tool that allows you to quickly retrieve and debug APIs. It can dynamically generate executable SDK code samples.</p>
     */
    @NameInMap("DbName")
    public String dbName;

    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The filter condition.</p>
     */
    @NameInMap("FilterCondition")
    public String filterConditionShrink;

    /**
     * <p>The number of plan misses.</p>
     */
    @NameInMap("NodeIp")
    public String nodeIp;

    /**
     * <p>The number of the page to return.    </p>
     * <p>- Start value: 1   </p>
     * <p>- Default value: 1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The return result of the request.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The internal wait time.</p>
     */
    @NameInMap("SQLId")
    public String SQLId;

    /**
     * <p>Alibaba Cloud CLI</p>
     */
    @NameInMap("SearchKeyWord")
    public String searchKeyWord;

    /**
     * <p>The IP address of the database node.</p>
     */
    @NameInMap("SearchParameter")
    public String searchParameter;

    /**
     * <p>The queuing time.</p>
     */
    @NameInMap("SearchRule")
    public String searchRule;

    /**
     * <p>The list of slow SQL statements.</p>
     */
    @NameInMap("SearchValue")
    public String searchValue;

    /**
     * <p>The number of rows to return on each page.  </p>
     * <p>- Maximum value: 100  </p>
     * <p>- Default value: 10</p>
     */
    @NameInMap("SortColumn")
    public String sortColumn;

    /**
     * <p>The average CPU time.</p>
     */
    @NameInMap("SortOrder")
    public String sortOrder;

    /**
     * <p>The list of slow SQL statements.</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The number of logical reads.</p>
     */
    @NameInMap("TenantId")
    public String tenantId;

    public static DescribeSlowSQLListShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSlowSQLListShrinkRequest self = new DescribeSlowSQLListShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSlowSQLListShrinkRequest setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }
    public String getDbName() {
        return this.dbName;
    }

    public DescribeSlowSQLListShrinkRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeSlowSQLListShrinkRequest setFilterConditionShrink(String filterConditionShrink) {
        this.filterConditionShrink = filterConditionShrink;
        return this;
    }
    public String getFilterConditionShrink() {
        return this.filterConditionShrink;
    }

    public DescribeSlowSQLListShrinkRequest setNodeIp(String nodeIp) {
        this.nodeIp = nodeIp;
        return this;
    }
    public String getNodeIp() {
        return this.nodeIp;
    }

    public DescribeSlowSQLListShrinkRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeSlowSQLListShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeSlowSQLListShrinkRequest setSQLId(String SQLId) {
        this.SQLId = SQLId;
        return this;
    }
    public String getSQLId() {
        return this.SQLId;
    }

    public DescribeSlowSQLListShrinkRequest setSearchKeyWord(String searchKeyWord) {
        this.searchKeyWord = searchKeyWord;
        return this;
    }
    public String getSearchKeyWord() {
        return this.searchKeyWord;
    }

    public DescribeSlowSQLListShrinkRequest setSearchParameter(String searchParameter) {
        this.searchParameter = searchParameter;
        return this;
    }
    public String getSearchParameter() {
        return this.searchParameter;
    }

    public DescribeSlowSQLListShrinkRequest setSearchRule(String searchRule) {
        this.searchRule = searchRule;
        return this;
    }
    public String getSearchRule() {
        return this.searchRule;
    }

    public DescribeSlowSQLListShrinkRequest setSearchValue(String searchValue) {
        this.searchValue = searchValue;
        return this;
    }
    public String getSearchValue() {
        return this.searchValue;
    }

    public DescribeSlowSQLListShrinkRequest setSortColumn(String sortColumn) {
        this.sortColumn = sortColumn;
        return this;
    }
    public String getSortColumn() {
        return this.sortColumn;
    }

    public DescribeSlowSQLListShrinkRequest setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
        return this;
    }
    public String getSortOrder() {
        return this.sortOrder;
    }

    public DescribeSlowSQLListShrinkRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeSlowSQLListShrinkRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
