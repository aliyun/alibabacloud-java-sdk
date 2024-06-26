// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeOasAnomalySQLListRequest extends TeaModel {
    /**
     * <p>The language of the response. Valid values:</p>
     * <ul>
     * <li>zh: Chinese</li>
     * <li>en: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh-CN</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>The current page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Current")
    public Long current;

    /**
     * <p>The name of the database.</p>
     * 
     * <strong>example:</strong>
     * <p>db_****</p>
     */
    @NameInMap("DbName")
    public String dbName;

    @NameInMap("DynamicSql")
    public Boolean dynamicSql;

    /**
     * <p>The end time of the monitoring data.<br>The value must be UTC time in the format of YYYY-MM-DDThh:mm:ssZ.</p>
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
     * <p>The node IP.</p>
     * 
     * <strong>example:</strong>
     * <p>i-bp19y05uq6x*********</p>
     */
    @NameInMap("NodeIp")
    public String nodeIp;

    /**
     * <p>Page size.</p>
     * <ul>
     * <li>Start value: 1</li>
     * <li>Default value: 1</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

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
     * <p>The search rule.<br>Valid values: &quot;=&quot;, &quot;&gt;&quot;, &quot;&gt;=&quot;, &quot;&lt;&quot;, and &quot;&lt;=&quot;</p>
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
     * <p>SQL ID.</p>
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
     * <p>The start time of the monitoring data.<br>The value must be UTC time in the format of YYYY-MM-DDThh:mm:ssZ.</p>
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

    public static DescribeOasAnomalySQLListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeOasAnomalySQLListRequest self = new DescribeOasAnomalySQLListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeOasAnomalySQLListRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public DescribeOasAnomalySQLListRequest setCurrent(Long current) {
        this.current = current;
        return this;
    }
    public Long getCurrent() {
        return this.current;
    }

    public DescribeOasAnomalySQLListRequest setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }
    public String getDbName() {
        return this.dbName;
    }

    public DescribeOasAnomalySQLListRequest setDynamicSql(Boolean dynamicSql) {
        this.dynamicSql = dynamicSql;
        return this;
    }
    public Boolean getDynamicSql() {
        return this.dynamicSql;
    }

    public DescribeOasAnomalySQLListRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeOasAnomalySQLListRequest setFilterCondition(String filterCondition) {
        this.filterCondition = filterCondition;
        return this;
    }
    public String getFilterCondition() {
        return this.filterCondition;
    }

    public DescribeOasAnomalySQLListRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeOasAnomalySQLListRequest setMergeDynamicSql(Boolean mergeDynamicSql) {
        this.mergeDynamicSql = mergeDynamicSql;
        return this;
    }
    public Boolean getMergeDynamicSql() {
        return this.mergeDynamicSql;
    }

    public DescribeOasAnomalySQLListRequest setNodeIp(String nodeIp) {
        this.nodeIp = nodeIp;
        return this;
    }
    public String getNodeIp() {
        return this.nodeIp;
    }

    public DescribeOasAnomalySQLListRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeOasAnomalySQLListRequest setSearchKeyWord(String searchKeyWord) {
        this.searchKeyWord = searchKeyWord;
        return this;
    }
    public String getSearchKeyWord() {
        return this.searchKeyWord;
    }

    public DescribeOasAnomalySQLListRequest setSearchParam(String searchParam) {
        this.searchParam = searchParam;
        return this;
    }
    public String getSearchParam() {
        return this.searchParam;
    }

    public DescribeOasAnomalySQLListRequest setSearchRule(String searchRule) {
        this.searchRule = searchRule;
        return this;
    }
    public String getSearchRule() {
        return this.searchRule;
    }

    public DescribeOasAnomalySQLListRequest setSearchValue(String searchValue) {
        this.searchValue = searchValue;
        return this;
    }
    public String getSearchValue() {
        return this.searchValue;
    }

    public DescribeOasAnomalySQLListRequest setSqlId(String sqlId) {
        this.sqlId = sqlId;
        return this;
    }
    public String getSqlId() {
        return this.sqlId;
    }

    public DescribeOasAnomalySQLListRequest setSqlTextLength(Long sqlTextLength) {
        this.sqlTextLength = sqlTextLength;
        return this;
    }
    public Long getSqlTextLength() {
        return this.sqlTextLength;
    }

    public DescribeOasAnomalySQLListRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeOasAnomalySQLListRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
