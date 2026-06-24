// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class DescribeAuditLogsRequest extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>CE4681BA-8019-5BE1-9F4B-8973BEA9CF57</p>
     */
    @NameInMap("AsyncRequestId")
    public String asyncRequestId;

    /**
     * <p>The client IP address.</p>
     * 
     * <strong>example:</strong>
     * <p>10.<em>.</em>.94</p>
     */
    @NameInMap("ClientIp")
    public String clientIp;

    /**
     * <p>The client type.</p>
     * 
     * <strong>example:</strong>
     * <p>mysql</p>
     */
    @NameInMap("ClientUa")
    public String clientUa;

    /**
     * <p>The page number to return. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The database name.</p>
     * 
     * <strong>example:</strong>
     * <p>bose_o2o_data</p>
     */
    @NameInMap("DatabaseName")
    public String databaseName;

    /**
     * <p>The range of affected rows.</p>
     * 
     * <strong>example:</strong>
     * <p>in[1 33]</p>
     */
    @NameInMap("EffectRowRange")
    public String effectRowRange;

    /**
     * <p>The end time for querying alert logs, provided as a UNIX timestamp in milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1583856000000</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The execution time range.</p>
     * 
     * <strong>example:</strong>
     * <p>in[1000 2000]</p>
     */
    @NameInMap("ExecuteTimeRange")
    public String executeTimeRange;

    /**
     * <p>The name of the data asset instance.</p>
     * 
     * <strong>example:</strong>
     * <p>i-2zeftaaq4gqcqb9kfkzg</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <p>The network type. Valid values:</p>
     * <ul>
     * <li><p><strong>default</strong>: The IP address is from outside of Alibaba Cloud. This is the default value.</p>
     * </li>
     * <li><p><strong>aliyun</strong>: The IP address is from within Alibaba Cloud.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>aliyun</p>
     */
    @NameInMap("IpType")
    public String ipType;

    /**
     * <p>Specifies the language of the request and response. Default value: <strong>zh_cn</strong>. Valid values:</p>
     * <ul>
     * <li><p><strong>zh_cn</strong>: Chinese.</p>
     * </li>
     * <li><p><strong>en_us</strong>: English.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>Specifies whether to retrieve the whitelist status.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("LoadWhiteList")
    public Boolean loadWhiteList;

    /**
     * <p>A JSON string that specifies which query conditions to include or exclude.</p>
     * 
     * <strong>example:</strong>
     * <p>[ {   &quot;isContain&quot; : false,   &quot;queryKey&quot; : &quot;effectRowRange&quot; }, {   &quot;isContain&quot; : false,   &quot;queryKey&quot; : &quot;remoteClientIp&quot; } ]</p>
     */
    @NameInMap("LogQueryOpJson")
    public String logQueryOpJson;

    /**
     * <p>The data source.</p>
     * 
     * <strong>example:</strong>
     * <p>SLOW_SQL</p>
     */
    @NameInMap("LogSource")
    public String logSource;

    /**
     * <p>The UID of the member account.</p>
     * 
     * <strong>example:</strong>
     * <p>**********8103</p>
     */
    @NameInMap("MemberAccount")
    public String memberAccount;

    /**
     * <p>The message content.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The operation type.</p>
     * 
     * <strong>example:</strong>
     * <p>Insert</p>
     */
    @NameInMap("OperateType")
    public String operateType;

    /**
     * <p>The key of the OSS object.</p>
     * 
     * <strong>example:</strong>
     * <p>oss-key</p>
     */
    @NameInMap("OssObjectKey")
    public String ossObjectKey;

    /**
     * <p>The number of entries per page. Maximum value: <strong>50</strong>. Default value: <strong>10</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The service to which the data asset belongs. Valid values include <strong>MaxCompute, OSS, AnalyticDB for MySQL, TableStore, and RDS</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>RDS</p>
     */
    @NameInMap("ProductCode")
    public String productCode;

    /**
     * <p>The ID of the service to which the data object belongs. Valid values:</p>
     * <ul>
     * <li><p><strong>1</strong>: MaxCompute</p>
     * </li>
     * <li><p><strong>2</strong>: OSS</p>
     * </li>
     * <li><p><strong>3</strong>: AnalyticDB for MySQL</p>
     * </li>
     * <li><p><strong>4</strong>: TableStore</p>
     * </li>
     * <li><p><strong>5</strong>: RDS</p>
     * </li>
     * <li><p><strong>6</strong>: SELF_DB</p>
     * </li>
     * <li><p><strong>7</strong>: PolarDB-X</p>
     * </li>
     * <li><p><strong>8</strong>: PolarDB</p>
     * </li>
     * <li><p><strong>9</strong>: AnalyticDB for PostgreSQL</p>
     * </li>
     * <li><p><strong>10</strong>: OceanBase</p>
     * </li>
     * <li><p><strong>11</strong>: MongoDB</p>
     * </li>
     * <li><p><strong>25</strong>: Redis</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("ProductId")
    public Long productId;

    /**
     * <p>Specifies whether to perform an aggregate query.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("RuleAggQuery")
    public Boolean ruleAggQuery;

    /**
     * <p>The rule type.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("RuleCategory")
    public String ruleCategory;

    /**
     * <p>The ID of the audit rule.</p>
     * 
     * <strong>example:</strong>
     * <p>994007</p>
     */
    @NameInMap("RuleID")
    public String ruleID;

    /**
     * <p>The ID of the audit rule.</p>
     * 
     * <strong>example:</strong>
     * <p>867028</p>
     */
    @NameInMap("RuleId")
    public String ruleId;

    /**
     * <p>The name of the audit rule.</p>
     * 
     * <strong>example:</strong>
     * <p>test_rule</p>
     */
    @NameInMap("RuleName")
    public String ruleName;

    /**
     * <p>The SQL statement.</p>
     * 
     * <strong>example:</strong>
     * <p>select * from test03</p>
     */
    @NameInMap("SqlText")
    public String sqlText;

    /**
     * <p>The start time for querying alert logs, provided as a UNIX timestamp in milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1616068534877</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    /**
     * <p>The username.</p>
     * 
     * <strong>example:</strong>
     * <p>admin</p>
     */
    @NameInMap("UserName")
    public String userName;

    public static DescribeAuditLogsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAuditLogsRequest self = new DescribeAuditLogsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAuditLogsRequest setAsyncRequestId(String asyncRequestId) {
        this.asyncRequestId = asyncRequestId;
        return this;
    }
    public String getAsyncRequestId() {
        return this.asyncRequestId;
    }

    public DescribeAuditLogsRequest setClientIp(String clientIp) {
        this.clientIp = clientIp;
        return this;
    }
    public String getClientIp() {
        return this.clientIp;
    }

    public DescribeAuditLogsRequest setClientUa(String clientUa) {
        this.clientUa = clientUa;
        return this;
    }
    public String getClientUa() {
        return this.clientUa;
    }

    public DescribeAuditLogsRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeAuditLogsRequest setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }
    public String getDatabaseName() {
        return this.databaseName;
    }

    public DescribeAuditLogsRequest setEffectRowRange(String effectRowRange) {
        this.effectRowRange = effectRowRange;
        return this;
    }
    public String getEffectRowRange() {
        return this.effectRowRange;
    }

    public DescribeAuditLogsRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public DescribeAuditLogsRequest setExecuteTimeRange(String executeTimeRange) {
        this.executeTimeRange = executeTimeRange;
        return this;
    }
    public String getExecuteTimeRange() {
        return this.executeTimeRange;
    }

    public DescribeAuditLogsRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public DescribeAuditLogsRequest setIpType(String ipType) {
        this.ipType = ipType;
        return this;
    }
    public String getIpType() {
        return this.ipType;
    }

    public DescribeAuditLogsRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeAuditLogsRequest setLoadWhiteList(Boolean loadWhiteList) {
        this.loadWhiteList = loadWhiteList;
        return this;
    }
    public Boolean getLoadWhiteList() {
        return this.loadWhiteList;
    }

    public DescribeAuditLogsRequest setLogQueryOpJson(String logQueryOpJson) {
        this.logQueryOpJson = logQueryOpJson;
        return this;
    }
    public String getLogQueryOpJson() {
        return this.logQueryOpJson;
    }

    public DescribeAuditLogsRequest setLogSource(String logSource) {
        this.logSource = logSource;
        return this;
    }
    public String getLogSource() {
        return this.logSource;
    }

    public DescribeAuditLogsRequest setMemberAccount(String memberAccount) {
        this.memberAccount = memberAccount;
        return this;
    }
    public String getMemberAccount() {
        return this.memberAccount;
    }

    public DescribeAuditLogsRequest setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeAuditLogsRequest setOperateType(String operateType) {
        this.operateType = operateType;
        return this;
    }
    public String getOperateType() {
        return this.operateType;
    }

    public DescribeAuditLogsRequest setOssObjectKey(String ossObjectKey) {
        this.ossObjectKey = ossObjectKey;
        return this;
    }
    public String getOssObjectKey() {
        return this.ossObjectKey;
    }

    public DescribeAuditLogsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeAuditLogsRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public DescribeAuditLogsRequest setProductId(Long productId) {
        this.productId = productId;
        return this;
    }
    public Long getProductId() {
        return this.productId;
    }

    public DescribeAuditLogsRequest setRuleAggQuery(Boolean ruleAggQuery) {
        this.ruleAggQuery = ruleAggQuery;
        return this;
    }
    public Boolean getRuleAggQuery() {
        return this.ruleAggQuery;
    }

    public DescribeAuditLogsRequest setRuleCategory(String ruleCategory) {
        this.ruleCategory = ruleCategory;
        return this;
    }
    public String getRuleCategory() {
        return this.ruleCategory;
    }

    public DescribeAuditLogsRequest setRuleID(String ruleID) {
        this.ruleID = ruleID;
        return this;
    }
    public String getRuleID() {
        return this.ruleID;
    }

    public DescribeAuditLogsRequest setRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public String getRuleId() {
        return this.ruleId;
    }

    public DescribeAuditLogsRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public DescribeAuditLogsRequest setSqlText(String sqlText) {
        this.sqlText = sqlText;
        return this;
    }
    public String getSqlText() {
        return this.sqlText;
    }

    public DescribeAuditLogsRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public DescribeAuditLogsRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

}
