// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeAnomalySQLListShrinkRequest extends TeaModel {
    /**
     * <p>The search value.</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>{</p>
     * <p>  "UserName":testUser</p>
     * <p>}</p>
     */
    @NameInMap("DbName")
    public String dbName;

    /**
     * <p>zh-CN</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The number of the page to return.    </p>
     * <p>- Start value: 1   </p>
     * <p>- Default value: 1</p>
     */
    @NameInMap("FilterCondition")
    public String filterConditionShrink;

    /**
     * <p>The number of rows to return on each page.    </p>
     * <p>- Maximum value: 100   </p>
     * <p>- Default value: 10</p>
     */
    @NameInMap("NodeIp")
    public String nodeIp;

    /**
     * <p>desc</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The start time of the time range for querying suspicious SQL statements.   </p>
     * <p>The value must be UTC time in the format of YYYY-MM-DDThh:mm:ssZ.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>1</p>
     */
    @NameInMap("SQLId")
    public String SQLId;

    /**
     * <p>The search keyword.</p>
     */
    @NameInMap("SearchKeyWord")
    public String searchKeyWord;

    /**
     * <p>The ID of the tenant.</p>
     */
    @NameInMap("SearchParameter")
    public String searchParameter;

    /**
     * <p>Utilization above threshold</p>
     */
    @NameInMap("SearchRule")
    public String searchRule;

    /**
     * <p>10</p>
     */
    @NameInMap("SearchValue")
    public String searchValue;

    /**
     * <p>The end time of the time range for querying suspicious SQL statements.   </p>
     * <p>The value must be UTC time in the format of YYYY-MM-DDThh:mm:ssZ.</p>
     */
    @NameInMap("SortColumn")
    public String sortColumn;

    /**
     * <p>The request time, in ms.</p>
     */
    @NameInMap("SortOrder")
    public String sortOrder;

    /**
     * <p>The total count.</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>Alibaba Cloud CLI</p>
     */
    @NameInMap("TenantId")
    public String tenantId;

    public static DescribeAnomalySQLListShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAnomalySQLListShrinkRequest self = new DescribeAnomalySQLListShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAnomalySQLListShrinkRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public DescribeAnomalySQLListShrinkRequest setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }
    public String getDbName() {
        return this.dbName;
    }

    public DescribeAnomalySQLListShrinkRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeAnomalySQLListShrinkRequest setFilterConditionShrink(String filterConditionShrink) {
        this.filterConditionShrink = filterConditionShrink;
        return this;
    }
    public String getFilterConditionShrink() {
        return this.filterConditionShrink;
    }

    public DescribeAnomalySQLListShrinkRequest setNodeIp(String nodeIp) {
        this.nodeIp = nodeIp;
        return this;
    }
    public String getNodeIp() {
        return this.nodeIp;
    }

    public DescribeAnomalySQLListShrinkRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeAnomalySQLListShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeAnomalySQLListShrinkRequest setSQLId(String SQLId) {
        this.SQLId = SQLId;
        return this;
    }
    public String getSQLId() {
        return this.SQLId;
    }

    public DescribeAnomalySQLListShrinkRequest setSearchKeyWord(String searchKeyWord) {
        this.searchKeyWord = searchKeyWord;
        return this;
    }
    public String getSearchKeyWord() {
        return this.searchKeyWord;
    }

    public DescribeAnomalySQLListShrinkRequest setSearchParameter(String searchParameter) {
        this.searchParameter = searchParameter;
        return this;
    }
    public String getSearchParameter() {
        return this.searchParameter;
    }

    public DescribeAnomalySQLListShrinkRequest setSearchRule(String searchRule) {
        this.searchRule = searchRule;
        return this;
    }
    public String getSearchRule() {
        return this.searchRule;
    }

    public DescribeAnomalySQLListShrinkRequest setSearchValue(String searchValue) {
        this.searchValue = searchValue;
        return this;
    }
    public String getSearchValue() {
        return this.searchValue;
    }

    public DescribeAnomalySQLListShrinkRequest setSortColumn(String sortColumn) {
        this.sortColumn = sortColumn;
        return this;
    }
    public String getSortColumn() {
        return this.sortColumn;
    }

    public DescribeAnomalySQLListShrinkRequest setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
        return this;
    }
    public String getSortOrder() {
        return this.sortOrder;
    }

    public DescribeAnomalySQLListShrinkRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeAnomalySQLListShrinkRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
