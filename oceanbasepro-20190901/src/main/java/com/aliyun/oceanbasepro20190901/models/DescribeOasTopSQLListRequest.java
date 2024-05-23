// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeOasTopSQLListRequest extends TeaModel {
    /**
     * <p>The language of the response. Valid values:</p>
     * <br>
     * <p>- zh: Chinese</p>
     * <p>- en: English</p>
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
     * <p>The end time of querying the TOPSQL parameter.</p>
     * <p>The value must be UTC time in the format of YYYY-MM-DDThh:mm:ssZ.</p>
     * <br>
     * <p>This parameter is required.</p>
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
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("MergeDynamicSql")
    public Boolean mergeDynamicSql;

    /**
     * <p>The node IP.</p>
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
     * <p>SQL ID.</p>
     * <p>> When the SQL ID is provided, the system collects all the request data for the target SQL ID. When the SQL ID is empty, the system collects all the request data for the entire database instance.</p>
     */
    @NameInMap("SqlId")
    public String sqlId;

    /**
     * <p>Max length of the returned SQL text.</p>
     */
    @NameInMap("SqlTextLength")
    public Long sqlTextLength;

    /**
     * <p>The start time of querying the TOPSQL parameter.   </p>
     * <p>The value must be UTC time in the format of YYYY-MM-DDThh:mm:ssZ.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The ID of the tenant.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("TenantId")
    public String tenantId;

    public static DescribeOasTopSQLListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeOasTopSQLListRequest self = new DescribeOasTopSQLListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeOasTopSQLListRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public DescribeOasTopSQLListRequest setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }
    public String getDbName() {
        return this.dbName;
    }

    public DescribeOasTopSQLListRequest setDynamicSql(Boolean dynamicSql) {
        this.dynamicSql = dynamicSql;
        return this;
    }
    public Boolean getDynamicSql() {
        return this.dynamicSql;
    }

    public DescribeOasTopSQLListRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeOasTopSQLListRequest setFilterCondition(String filterCondition) {
        this.filterCondition = filterCondition;
        return this;
    }
    public String getFilterCondition() {
        return this.filterCondition;
    }

    public DescribeOasTopSQLListRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeOasTopSQLListRequest setMergeDynamicSql(Boolean mergeDynamicSql) {
        this.mergeDynamicSql = mergeDynamicSql;
        return this;
    }
    public Boolean getMergeDynamicSql() {
        return this.mergeDynamicSql;
    }

    public DescribeOasTopSQLListRequest setNodeIp(String nodeIp) {
        this.nodeIp = nodeIp;
        return this;
    }
    public String getNodeIp() {
        return this.nodeIp;
    }

    public DescribeOasTopSQLListRequest setSearchKeyWord(String searchKeyWord) {
        this.searchKeyWord = searchKeyWord;
        return this;
    }
    public String getSearchKeyWord() {
        return this.searchKeyWord;
    }

    public DescribeOasTopSQLListRequest setSearchParam(String searchParam) {
        this.searchParam = searchParam;
        return this;
    }
    public String getSearchParam() {
        return this.searchParam;
    }

    public DescribeOasTopSQLListRequest setSearchRule(String searchRule) {
        this.searchRule = searchRule;
        return this;
    }
    public String getSearchRule() {
        return this.searchRule;
    }

    public DescribeOasTopSQLListRequest setSearchValue(String searchValue) {
        this.searchValue = searchValue;
        return this;
    }
    public String getSearchValue() {
        return this.searchValue;
    }

    public DescribeOasTopSQLListRequest setSqlId(String sqlId) {
        this.sqlId = sqlId;
        return this;
    }
    public String getSqlId() {
        return this.sqlId;
    }

    public DescribeOasTopSQLListRequest setSqlTextLength(Long sqlTextLength) {
        this.sqlTextLength = sqlTextLength;
        return this;
    }
    public Long getSqlTextLength() {
        return this.sqlTextLength;
    }

    public DescribeOasTopSQLListRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeOasTopSQLListRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
