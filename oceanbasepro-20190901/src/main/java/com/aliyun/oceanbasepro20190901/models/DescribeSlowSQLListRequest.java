// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeSlowSQLListRequest extends TeaModel {
    // 数据库名称
    @NameInMap("DbName")
    public String dbName;

    // 结束时间
    @NameInMap("EndTime")
    public String endTime;

    // 过滤条件
    @NameInMap("FilterCondition")
    public java.util.Map<String, ?> filterCondition;

    // 节点ip
    @NameInMap("NodeIp")
    public String nodeIp;

    // 页码
    @NameInMap("PageNumber")
    public Integer pageNumber;

    // 页大小
    @NameInMap("PageSize")
    public Integer pageSize;

    // SQL唯一标识
    @NameInMap("SQLId")
    public String SQLId;

    // 查询关键字
    @NameInMap("SearchKeyWord")
    public String searchKeyWord;

    // 查询参数
    @NameInMap("SearchParameter")
    public String searchParameter;

    // 查询规则
    @NameInMap("SearchRule")
    public String searchRule;

    // 查询值
    @NameInMap("SearchValue")
    public String searchValue;

    // 排序列
    @NameInMap("SortColumn")
    public String sortColumn;

    // 排序顺序
    @NameInMap("SortOrder")
    public String sortOrder;

    // 开始时间
    @NameInMap("StartTime")
    public String startTime;

    // 租户ID
    @NameInMap("TenantId")
    public String tenantId;

    public static DescribeSlowSQLListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSlowSQLListRequest self = new DescribeSlowSQLListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSlowSQLListRequest setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }
    public String getDbName() {
        return this.dbName;
    }

    public DescribeSlowSQLListRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeSlowSQLListRequest setFilterCondition(java.util.Map<String, ?> filterCondition) {
        this.filterCondition = filterCondition;
        return this;
    }
    public java.util.Map<String, ?> getFilterCondition() {
        return this.filterCondition;
    }

    public DescribeSlowSQLListRequest setNodeIp(String nodeIp) {
        this.nodeIp = nodeIp;
        return this;
    }
    public String getNodeIp() {
        return this.nodeIp;
    }

    public DescribeSlowSQLListRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeSlowSQLListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeSlowSQLListRequest setSQLId(String SQLId) {
        this.SQLId = SQLId;
        return this;
    }
    public String getSQLId() {
        return this.SQLId;
    }

    public DescribeSlowSQLListRequest setSearchKeyWord(String searchKeyWord) {
        this.searchKeyWord = searchKeyWord;
        return this;
    }
    public String getSearchKeyWord() {
        return this.searchKeyWord;
    }

    public DescribeSlowSQLListRequest setSearchParameter(String searchParameter) {
        this.searchParameter = searchParameter;
        return this;
    }
    public String getSearchParameter() {
        return this.searchParameter;
    }

    public DescribeSlowSQLListRequest setSearchRule(String searchRule) {
        this.searchRule = searchRule;
        return this;
    }
    public String getSearchRule() {
        return this.searchRule;
    }

    public DescribeSlowSQLListRequest setSearchValue(String searchValue) {
        this.searchValue = searchValue;
        return this;
    }
    public String getSearchValue() {
        return this.searchValue;
    }

    public DescribeSlowSQLListRequest setSortColumn(String sortColumn) {
        this.sortColumn = sortColumn;
        return this;
    }
    public String getSortColumn() {
        return this.sortColumn;
    }

    public DescribeSlowSQLListRequest setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
        return this;
    }
    public String getSortOrder() {
        return this.sortOrder;
    }

    public DescribeSlowSQLListRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeSlowSQLListRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
