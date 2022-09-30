// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeTopSQLListShrinkRequest extends TeaModel {
    @NameInMap("DbName")
    public String dbName;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("FilterCondition")
    public String filterConditionShrink;

    @NameInMap("NodeIp")
    public String nodeIp;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("SQLId")
    public String SQLId;

    @NameInMap("SearchKeyWord")
    public String searchKeyWord;

    @NameInMap("SearchParameter")
    public String searchParameter;

    @NameInMap("SearchRule")
    public String searchRule;

    @NameInMap("SearchValue")
    public String searchValue;

    @NameInMap("SortColumn")
    public String sortColumn;

    @NameInMap("SortOrder")
    public String sortOrder;

    @NameInMap("StartTime")
    public String startTime;

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
