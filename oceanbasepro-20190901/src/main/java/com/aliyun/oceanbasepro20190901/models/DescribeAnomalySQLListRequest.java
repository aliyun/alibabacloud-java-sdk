// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeAnomalySQLListRequest extends TeaModel {
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

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

    // 分页查询的页码。 起始值：1 默认值：1
    @NameInMap("PageNumber")
    public Integer pageNumber;

    // 分页查询时设置的每页行数。 最大值：100 默认值：10
    @NameInMap("PageSize")
    public Integer pageSize;

    // SQLID
    @NameInMap("SQLId")
    public String SQLId;

    // 关键字查询
    @NameInMap("SearchKeyWord")
    public String searchKeyWord;

    // 参数查询
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

    // 排序规则
    @NameInMap("SortOrder")
    public String sortOrder;

    // 起始时间
    @NameInMap("StartTime")
    public String startTime;

    // 租户ID
    @NameInMap("TenantId")
    public String tenantId;

    public static DescribeAnomalySQLListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAnomalySQLListRequest self = new DescribeAnomalySQLListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAnomalySQLListRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public DescribeAnomalySQLListRequest setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }
    public String getDbName() {
        return this.dbName;
    }

    public DescribeAnomalySQLListRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeAnomalySQLListRequest setFilterCondition(java.util.Map<String, ?> filterCondition) {
        this.filterCondition = filterCondition;
        return this;
    }
    public java.util.Map<String, ?> getFilterCondition() {
        return this.filterCondition;
    }

    public DescribeAnomalySQLListRequest setNodeIp(String nodeIp) {
        this.nodeIp = nodeIp;
        return this;
    }
    public String getNodeIp() {
        return this.nodeIp;
    }

    public DescribeAnomalySQLListRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeAnomalySQLListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeAnomalySQLListRequest setSQLId(String SQLId) {
        this.SQLId = SQLId;
        return this;
    }
    public String getSQLId() {
        return this.SQLId;
    }

    public DescribeAnomalySQLListRequest setSearchKeyWord(String searchKeyWord) {
        this.searchKeyWord = searchKeyWord;
        return this;
    }
    public String getSearchKeyWord() {
        return this.searchKeyWord;
    }

    public DescribeAnomalySQLListRequest setSearchParameter(String searchParameter) {
        this.searchParameter = searchParameter;
        return this;
    }
    public String getSearchParameter() {
        return this.searchParameter;
    }

    public DescribeAnomalySQLListRequest setSearchRule(String searchRule) {
        this.searchRule = searchRule;
        return this;
    }
    public String getSearchRule() {
        return this.searchRule;
    }

    public DescribeAnomalySQLListRequest setSearchValue(String searchValue) {
        this.searchValue = searchValue;
        return this;
    }
    public String getSearchValue() {
        return this.searchValue;
    }

    public DescribeAnomalySQLListRequest setSortColumn(String sortColumn) {
        this.sortColumn = sortColumn;
        return this;
    }
    public String getSortColumn() {
        return this.sortColumn;
    }

    public DescribeAnomalySQLListRequest setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
        return this;
    }
    public String getSortOrder() {
        return this.sortOrder;
    }

    public DescribeAnomalySQLListRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeAnomalySQLListRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
