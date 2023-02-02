// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeTopSQLListRequest extends TeaModel {
    /**
     * <p>The name of the database.</p>
     */
    @NameInMap("DbName")
    public String dbName;

    /**
     * <p>The end time of the time range for querying TOP SQL statements.   </p>
     * <p>The value must be UTC time in the format of YYYY-MM-DDThh:mm:ssZ.</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The filter condition.</p>
     */
    @NameInMap("FilterCondition")
    public java.util.Map<String, ?> filterCondition;

    /**
     * <p>The IP address of the node.</p>
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
     * <p>The number of rows to return on each page.   </p>
     * <p>- Maximum value: 100   </p>
     * <p>- Default value: 10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>SQLID.</p>
     */
    @NameInMap("SQLId")
    public String SQLId;

    /**
     * <p>The search keyword.</p>
     */
    @NameInMap("SearchKeyWord")
    public String searchKeyWord;

    /**
     * <p>The search parameter.</p>
     */
    @NameInMap("SearchParameter")
    public String searchParameter;

    /**
     * <p>The search rule.</p>
     */
    @NameInMap("SearchRule")
    public String searchRule;

    /**
     * <p>The search value.</p>
     */
    @NameInMap("SearchValue")
    public String searchValue;

    /**
     * <p>The sorted column.</p>
     */
    @NameInMap("SortColumn")
    public String sortColumn;

    /**
     * <p>The sorting rule.</p>
     */
    @NameInMap("SortOrder")
    public String sortOrder;

    /**
     * <p>The start time of the time range for querying TOP SQL statements.   </p>
     * <p>The value must be UTC time in the format of YYYY-MM-DDThh:mm:ssZ.</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The ID of the tenant.</p>
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
