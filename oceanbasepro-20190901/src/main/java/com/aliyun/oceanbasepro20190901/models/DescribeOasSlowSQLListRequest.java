// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeOasSlowSQLListRequest extends TeaModel {
    /**
     * <p>The language of the response.</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>The name of the database.</p>
     */
    @NameInMap("DbName")
    public String dbName;

    @NameInMap("DynamicSql")
    public Boolean dynamicSql;

    /**
     * <p>The end time of querying slow SQL historical parameters.   </p>
     * <p>The value must be UTC time in the format of YYYY-MM-DDThh:mm:ssZ.</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>All parameters are referenced by the symbol @. For a list of available parameters, refer to the returned parameters in [Query performance indicators of an SQL statement](https://en.oceanbase.com/docs/community-ocp-en-10000000000840290).</p>
     */
    @NameInMap("FilterCondition")
    public String filterCondition;

    /**
     * <p>The ID of the OceanBase cluster.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("MergeDynamicSql")
    public Boolean mergeDynamicSql;

    /**
     * <p>The IP of the database node.</p>
     */
    @NameInMap("NodeIp")
    public String nodeIp;

    /**
     * <p>The search keyword.</p>
     */
    @NameInMap("SearchKeyWord")
    public String searchKeyWord;

    /**
     * <p>The search parameter.</p>
     */
    @NameInMap("SearchParam")
    public String searchParam;

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
     * <p>SQL ID, the unique identifier of the SQL.</p>
     */
    @NameInMap("SqlId")
    public String sqlId;

    /**
     * <p>Max length of the returned SQL text.</p>
     */
    @NameInMap("SqlTextLength")
    public Long sqlTextLength;

    /**
     * <p>The start time of querying slow SQL historical parameters.   </p>
     * <p>The value must be UTC time in the format of YYYY-MM-DDThh:mm:ssZ.</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The ID of the tenant.</p>
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
