// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class DescribeAuditLogsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>CE4681BA-8019-5BE1-9F4B-8973BEA9CF57</p>
     */
    @NameInMap("AsyncRequestId")
    public String asyncRequestId;

    /**
     * <strong>example:</strong>
     * <p>10.<em>.</em>.94</p>
     */
    @NameInMap("ClientIp")
    public String clientIp;

    /**
     * <strong>example:</strong>
     * <p>mysql</p>
     */
    @NameInMap("ClientUa")
    public String clientUa;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <strong>example:</strong>
     * <p>bose_o2o_data</p>
     */
    @NameInMap("DatabaseName")
    public String databaseName;

    /**
     * <strong>example:</strong>
     * <p>in[1 33]</p>
     */
    @NameInMap("EffectRowRange")
    public String effectRowRange;

    /**
     * <strong>example:</strong>
     * <p>1583856000000</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <strong>example:</strong>
     * <p>in[1000 2000]</p>
     */
    @NameInMap("ExecuteTimeRange")
    public String executeTimeRange;

    /**
     * <strong>example:</strong>
     * <p>i-2zeftaaq4gqcqb9kfkzg</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <strong>example:</strong>
     * <p>aliyun</p>
     */
    @NameInMap("IpType")
    public String ipType;

    /**
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("LoadWhiteList")
    public Boolean loadWhiteList;

    /**
     * <strong>example:</strong>
     * <p>[ {   &quot;isContain&quot; : false,   &quot;queryKey&quot; : &quot;effectRowRange&quot; }, {   &quot;isContain&quot; : false,   &quot;queryKey&quot; : &quot;remoteClientIp&quot; } ]</p>
     */
    @NameInMap("LogQueryOpJson")
    public String logQueryOpJson;

    /**
     * <strong>example:</strong>
     * <p>SLOW_SQL</p>
     */
    @NameInMap("LogSource")
    public String logSource;

    /**
     * <strong>example:</strong>
     * <p>**********8103</p>
     */
    @NameInMap("MemberAccount")
    public String memberAccount;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>Insert</p>
     */
    @NameInMap("OperateType")
    public String operateType;

    /**
     * <strong>example:</strong>
     * <p>oss-key</p>
     */
    @NameInMap("OssObjectKey")
    public String ossObjectKey;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>RDS</p>
     */
    @NameInMap("ProductCode")
    public String productCode;

    /**
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("ProductId")
    public Long productId;

    @NameInMap("RuleAggQuery")
    public Boolean ruleAggQuery;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("RuleCategory")
    public String ruleCategory;

    /**
     * <strong>example:</strong>
     * <p>994007</p>
     */
    @NameInMap("RuleID")
    public String ruleID;

    @NameInMap("RuleId")
    public String ruleId;

    @NameInMap("RuleName")
    public String ruleName;

    /**
     * <strong>example:</strong>
     * <p>select * from test03</p>
     */
    @NameInMap("SqlText")
    public String sqlText;

    /**
     * <strong>example:</strong>
     * <p>1616068534877</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    /**
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
