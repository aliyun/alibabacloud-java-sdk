// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeSlowSQLListShrinkRequest extends TeaModel {
    /**
     * <p>The name of the database.</p>
     * 
     * <strong>example:</strong>
     * <p>testdb</p>
     */
    @NameInMap("DbName")
    public String dbName;

    /**
     * <p>The end time of the time range for querying slow SQL statements.<br>The value must be UTC time in the format of YYYY-MM-DDThh:mm:ssZ.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-09-13T15:40:43Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The filter condition.</p>
     * 
     * <strong>example:</strong>
     * <p>[dbName:sys]</p>
     */
    @NameInMap("FilterCondition")
    public String filterConditionShrink;

    /**
     * <p>The IP address of the database node.</p>
     * 
     * <strong>example:</strong>
     * <p>i-bp18qljorblo8es*****</p>
     */
    @NameInMap("NodeIp")
    public String nodeIp;

    /**
     * <p>The number of rows to return on each page.  </p>
     * <ul>
     * <li>Maximum value: 100  </li>
     * <li>Default value: 10</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of the page to return.    </p>
     * <ul>
     * <li>Start value: 1   </li>
     * <li>Default value: 1</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The SQL ID, which uniquely identifies an SQL statement.</p>
     * 
     * <strong>example:</strong>
     * <p>8D6E84<strong><strong>0B8FB1823D199E2CA1</strong></strong></p>
     */
    @NameInMap("SQLId")
    public String SQLId;

    /**
     * <p>The search keyword.</p>
     * 
     * <strong>example:</strong>
     * <p>update</p>
     */
    @NameInMap("SearchKeyWord")
    public String searchKeyWord;

    /**
     * <p>The search parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>cputime</p>
     */
    @NameInMap("SearchParameter")
    public String searchParameter;

    /**
     * <p>The search rule.</p>
     * 
     * <strong>example:</strong>
     * <blockquote>
     * </blockquote>
     */
    @NameInMap("SearchRule")
    public String searchRule;

    /**
     * <p>The search value.</p>
     * 
     * <strong>example:</strong>
     * <p>0.01</p>
     */
    @NameInMap("SearchValue")
    public String searchValue;

    /**
     * <p>The sorted column.</p>
     * 
     * <strong>example:</strong>
     * <p>cputime</p>
     */
    @NameInMap("SortColumn")
    public String sortColumn;

    /**
     * <p>The sorting rule.</p>
     * 
     * <strong>example:</strong>
     * <p>desc</p>
     */
    @NameInMap("SortOrder")
    public String sortOrder;

    /**
     * <p>The start time of the time range for querying slow SQL statements.<br>The value must be UTC time in the format of YYYY-MM-DDThh:mm:ssZ.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-06-13T15:40:43Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The ID of the tenant.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>t2mr3oae0****</p>
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
