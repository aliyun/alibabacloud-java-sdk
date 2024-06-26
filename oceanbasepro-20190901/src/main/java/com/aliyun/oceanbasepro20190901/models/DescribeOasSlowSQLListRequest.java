// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeOasSlowSQLListRequest extends TeaModel {
    /**
     * <p>The language of the response.</p>
     * 
     * <strong>example:</strong>
     * <p>zh-CN</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>The name of the database.</p>
     * 
     * <strong>example:</strong>
     * <p>test_db</p>
     */
    @NameInMap("DbName")
    public String dbName;

    @NameInMap("DynamicSql")
    public Boolean dynamicSql;

    /**
     * <p>The end time of querying slow SQL historical parameters.<br>The value must be UTC time in the format of YYYY-MM-DDThh:mm:ssZ.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-04-12T05:38:38Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>All parameters are referenced by the symbol @. For a list of available parameters, refer to the returned parameters in <a href="https://en.oceanbase.com/docs/community-ocp-en-10000000000840290">Query performance indicators of an SQL statement</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>@avgCpuTime &gt; 20 and @executions &gt; 100</p>
     */
    @NameInMap("FilterCondition")
    public String filterCondition;

    /**
     * <p>The ID of the OceanBase cluster.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ob317v4uif****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("MergeDynamicSql")
    public Boolean mergeDynamicSql;

    /**
     * <p>The IP of the database node.</p>
     * 
     * <strong>example:</strong>
     * <p>i-bp18qljorblo8es*****</p>
     */
    @NameInMap("NodeIp")
    public String nodeIp;

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
    @NameInMap("SearchParam")
    public String searchParam;

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
     * <p>SQL ID, the unique identifier of the SQL.</p>
     * 
     * <strong>example:</strong>
     * <p>8D6E84<strong><strong>0B8FB1823D199E2CA1</strong></strong></p>
     */
    @NameInMap("SqlId")
    public String sqlId;

    /**
     * <p>Max length of the returned SQL text.</p>
     * 
     * <strong>example:</strong>
     * <p>65535</p>
     */
    @NameInMap("SqlTextLength")
    public Long sqlTextLength;

    /**
     * <p>The start time of querying slow SQL historical parameters.<br>The value must be UTC time in the format of YYYY-MM-DDThh:mm:ssZ.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-04-12T04:38:38Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The ID of the tenant.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>t4louaeei****</p>
     */
    @NameInMap("TenantId")
    public String tenantId;

    public static DescribeOasSlowSQLListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeOasSlowSQLListRequest self = new DescribeOasSlowSQLListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeOasSlowSQLListRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public DescribeOasSlowSQLListRequest setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }
    public String getDbName() {
        return this.dbName;
    }

    public DescribeOasSlowSQLListRequest setDynamicSql(Boolean dynamicSql) {
        this.dynamicSql = dynamicSql;
        return this;
    }
    public Boolean getDynamicSql() {
        return this.dynamicSql;
    }

    public DescribeOasSlowSQLListRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeOasSlowSQLListRequest setFilterCondition(String filterCondition) {
        this.filterCondition = filterCondition;
        return this;
    }
    public String getFilterCondition() {
        return this.filterCondition;
    }

    public DescribeOasSlowSQLListRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeOasSlowSQLListRequest setMergeDynamicSql(Boolean mergeDynamicSql) {
        this.mergeDynamicSql = mergeDynamicSql;
        return this;
    }
    public Boolean getMergeDynamicSql() {
        return this.mergeDynamicSql;
    }

    public DescribeOasSlowSQLListRequest setNodeIp(String nodeIp) {
        this.nodeIp = nodeIp;
        return this;
    }
    public String getNodeIp() {
        return this.nodeIp;
    }

    public DescribeOasSlowSQLListRequest setSearchKeyWord(String searchKeyWord) {
        this.searchKeyWord = searchKeyWord;
        return this;
    }
    public String getSearchKeyWord() {
        return this.searchKeyWord;
    }

    public DescribeOasSlowSQLListRequest setSearchParam(String searchParam) {
        this.searchParam = searchParam;
        return this;
    }
    public String getSearchParam() {
        return this.searchParam;
    }

    public DescribeOasSlowSQLListRequest setSearchRule(String searchRule) {
        this.searchRule = searchRule;
        return this;
    }
    public String getSearchRule() {
        return this.searchRule;
    }

    public DescribeOasSlowSQLListRequest setSearchValue(String searchValue) {
        this.searchValue = searchValue;
        return this;
    }
    public String getSearchValue() {
        return this.searchValue;
    }

    public DescribeOasSlowSQLListRequest setSqlId(String sqlId) {
        this.sqlId = sqlId;
        return this;
    }
    public String getSqlId() {
        return this.sqlId;
    }

    public DescribeOasSlowSQLListRequest setSqlTextLength(Long sqlTextLength) {
        this.sqlTextLength = sqlTextLength;
        return this;
    }
    public Long getSqlTextLength() {
        return this.sqlTextLength;
    }

    public DescribeOasSlowSQLListRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeOasSlowSQLListRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
