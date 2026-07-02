// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class DescribeAuditLogsResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>CE4681BA-8019-5BE1-9F4B-8973BEA9CF57</p>
     */
    @NameInMap("AsyncRequestId")
    public String asyncRequestId;

    /**
     * <p>The page number in a paged query. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The list of alert logs.</p>
     */
    @NameInMap("Items")
    public java.util.List<DescribeAuditLogsResponseBodyItems> items;

    /**
     * <p>The number of entries per page in a paged query. Maximum value: <strong>50</strong>. Default value: <strong>10</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A7021857-AFD9-5AD6-979D-AA7DFC5AFADF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>12</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeAuditLogsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAuditLogsResponseBody self = new DescribeAuditLogsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAuditLogsResponseBody setAsyncRequestId(String asyncRequestId) {
        this.asyncRequestId = asyncRequestId;
        return this;
    }
    public String getAsyncRequestId() {
        return this.asyncRequestId;
    }

    public DescribeAuditLogsResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeAuditLogsResponseBody setItems(java.util.List<DescribeAuditLogsResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<DescribeAuditLogsResponseBodyItems> getItems() {
        return this.items;
    }

    public DescribeAuditLogsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeAuditLogsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAuditLogsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeAuditLogsResponseBodyItems extends TeaModel {
        /**
         * <p>The client IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>139.<em>.</em>.57</p>
         */
        @NameInMap("ClientIp")
        public String clientIp;

        /**
         * <p>The client port.</p>
         * 
         * <strong>example:</strong>
         * <p>35756</p>
         */
        @NameInMap("ClientPort")
        public String clientPort;

        /**
         * <p>The client type.</p>
         * 
         * <strong>example:</strong>
         * <p>mysql</p>
         */
        @NameInMap("ClientUa")
        public String clientUa;

        /**
         * <p>The column name.</p>
         * 
         * <strong>example:</strong>
         * <p>hide14</p>
         */
        @NameInMap("ColumnName")
        public String columnName;

        /**
         * <p>The alert time, in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1536751124000</p>
         */
        @NameInMap("CreationTime")
        public Long creationTime;

        /**
         * <p>The SQL result set.</p>
         * 
         * <strong>example:</strong>
         * <p>plan_id ~ application_id ~ plan_type ~ plan_name ~ plan_value_id</p>
         */
        @NameInMap("DataSet")
        public String dataSet;

        /**
         * <p>The database name.</p>
         * 
         * <strong>example:</strong>
         * <p>chngc_b2b_migration_sh</p>
         */
        @NameInMap("DatabaseName")
        public String databaseName;

        /**
         * <p>The database type.</p>
         * 
         * <strong>example:</strong>
         * <p>MySQL</p>
         */
        @NameInMap("DbType")
        public String dbType;

        /**
         * <p>The number of affected rows.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("EffectRow")
        public Long effectRow;

        /**
         * <p>The execution status. Valid values:</p>
         * <ul>
         * <li>0: failed.</li>
         * <li>1: succeeded.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ExecuteStatus")
        public Integer executeStatus;

        /**
         * <p>The execution duration, in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1751870592000</p>
         */
        @NameInMap("ExecuteTime")
        public Long executeTime;

        /**
         * <p>Indicates whether the entry is whitelisted.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("InWhiteList")
        public Boolean inWhiteList;

        /**
         * <p>The instance audit status.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("InstanceAuditStatus")
        public String instanceAuditStatus;

        /**
         * <p>The description of the data asset instance.</p>
         * 
         * <strong>example:</strong>
         * <p>instance dscription</p>
         */
        @NameInMap("InstanceDescription")
        public String instanceDescription;

        /**
         * <p>The name of the asset instance.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-1234</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>The network type. Valid values:</p>
         * <p><strong>default</strong> (default): non-Alibaba Cloud service</p>
         * <p><strong>aliyun</strong>: Alibaba Cloud service</p>
         * 
         * <strong>example:</strong>
         * <p>aliyun</p>
         */
        @NameInMap("IpType")
        public String ipType;

        /**
         * <p>The data source.</p>
         * 
         * <strong>example:</strong>
         * <p>SLOW_SQL</p>
         */
        @NameInMap("LogSource")
        public String logSource;

        /**
         * <p>The log execution time.</p>
         * 
         * <strong>example:</strong>
         * <p>1751870592000</p>
         */
        @NameInMap("LogTime")
        public Long logTime;

        /**
         * <p>The UID of the member accounts.</p>
         * 
         * <strong>example:</strong>
         * <p>**********8103</p>
         */
        @NameInMap("MemberAccount")
        public String memberAccount;

        /**
         * <p>The raw log content.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The sensitive data model that was matched.</p>
         * 
         * <strong>example:</strong>
         * <p>Identity Card</p>
         */
        @NameInMap("ModelName")
        public String modelName;

        /**
         * <p>The operation type.</p>
         * 
         * <strong>example:</strong>
         * <p>Drop</p>
         */
        @NameInMap("OperateType")
        public String operateType;

        /**
         * <p>The key of the OSS object.</p>
         * 
         * <strong>example:</strong>
         * <p>oss-key1</p>
         */
        @NameInMap("OssObjectKey")
        public String ossObjectKey;

        /**
         * <p>The MaxCompute package name.</p>
         * 
         * <strong>example:</strong>
         * <p>test01</p>
         */
        @NameInMap("PackageName")
        public String packageName;

        /**
         * <p>The name of the product to which the column data in the data asset table belongs. Valid values: <strong>MaxCompute, OSS, ADS, OTS, RDS</strong>, and more.</p>
         * 
         * <strong>example:</strong>
         * <p>RDS</p>
         */
        @NameInMap("ProductCode")
        public String productCode;

        /**
         * <p>The ID that corresponds to the product name to which the data asset belongs. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: MaxCompute.</li>
         * <li><strong>2</strong>: OSS.</li>
         * <li><strong>3</strong>: ADS.</li>
         * <li><strong>4</strong>: OTS.</li>
         * <li><strong>5</strong>: RDS.</li>
         * <li><strong>6</strong>: SELF_DB.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("ProductId")
        public Long productId;

        @NameInMap("RamConsoleLink")
        public String ramConsoleLink;

        /**
         * <p>The rule type.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("RuleCategory")
        public String ruleCategory;

        /**
         * <p>The audit policy ID.</p>
         * 
         * <strong>example:</strong>
         * <p>9952275</p>
         */
        @NameInMap("RuleId")
        public String ruleId;

        /**
         * <p>The name of the audit policy.</p>
         * 
         * <strong>example:</strong>
         * <p>name</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

        /**
         * <p>The SQL statement in the alert log.</p>
         * 
         * <strong>example:</strong>
         * <p>select * from test03</p>
         */
        @NameInMap("SqlText")
        public String sqlText;

        /**
         * <p>The table name.</p>
         * 
         * <strong>example:</strong>
         * <p>it_table</p>
         */
        @NameInMap("TableName")
        public String tableName;

        /**
         * <p>The user UID.</p>
         * 
         * <strong>example:</strong>
         * <p>19********94</p>
         */
        @NameInMap("UserId")
        public String userId;

        /**
         * <p>The username.</p>
         * 
         * <strong>example:</strong>
         * <p>admin</p>
         */
        @NameInMap("UserName")
        public String userName;

        /**
         * <p>The risk level. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: Low.</li>
         * <li><strong>2</strong>: Medium.</li>
         * <li><strong>3</strong>: High.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("WarnLevel")
        public String warnLevel;

        /**
         * <p>The name of the risk level. Valid values:</p>
         * <ul>
         * <li>Low.</li>
         * <li>Medium.</li>
         * <li>High.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>High risk</p>
         */
        @NameInMap("WarnLevelName")
        public String warnLevelName;

        public static DescribeAuditLogsResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeAuditLogsResponseBodyItems self = new DescribeAuditLogsResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeAuditLogsResponseBodyItems setClientIp(String clientIp) {
            this.clientIp = clientIp;
            return this;
        }
        public String getClientIp() {
            return this.clientIp;
        }

        public DescribeAuditLogsResponseBodyItems setClientPort(String clientPort) {
            this.clientPort = clientPort;
            return this;
        }
        public String getClientPort() {
            return this.clientPort;
        }

        public DescribeAuditLogsResponseBodyItems setClientUa(String clientUa) {
            this.clientUa = clientUa;
            return this;
        }
        public String getClientUa() {
            return this.clientUa;
        }

        public DescribeAuditLogsResponseBodyItems setColumnName(String columnName) {
            this.columnName = columnName;
            return this;
        }
        public String getColumnName() {
            return this.columnName;
        }

        public DescribeAuditLogsResponseBodyItems setCreationTime(Long creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public Long getCreationTime() {
            return this.creationTime;
        }

        public DescribeAuditLogsResponseBodyItems setDataSet(String dataSet) {
            this.dataSet = dataSet;
            return this;
        }
        public String getDataSet() {
            return this.dataSet;
        }

        public DescribeAuditLogsResponseBodyItems setDatabaseName(String databaseName) {
            this.databaseName = databaseName;
            return this;
        }
        public String getDatabaseName() {
            return this.databaseName;
        }

        public DescribeAuditLogsResponseBodyItems setDbType(String dbType) {
            this.dbType = dbType;
            return this;
        }
        public String getDbType() {
            return this.dbType;
        }

        public DescribeAuditLogsResponseBodyItems setEffectRow(Long effectRow) {
            this.effectRow = effectRow;
            return this;
        }
        public Long getEffectRow() {
            return this.effectRow;
        }

        public DescribeAuditLogsResponseBodyItems setExecuteStatus(Integer executeStatus) {
            this.executeStatus = executeStatus;
            return this;
        }
        public Integer getExecuteStatus() {
            return this.executeStatus;
        }

        public DescribeAuditLogsResponseBodyItems setExecuteTime(Long executeTime) {
            this.executeTime = executeTime;
            return this;
        }
        public Long getExecuteTime() {
            return this.executeTime;
        }

        public DescribeAuditLogsResponseBodyItems setInWhiteList(Boolean inWhiteList) {
            this.inWhiteList = inWhiteList;
            return this;
        }
        public Boolean getInWhiteList() {
            return this.inWhiteList;
        }

        public DescribeAuditLogsResponseBodyItems setInstanceAuditStatus(String instanceAuditStatus) {
            this.instanceAuditStatus = instanceAuditStatus;
            return this;
        }
        public String getInstanceAuditStatus() {
            return this.instanceAuditStatus;
        }

        public DescribeAuditLogsResponseBodyItems setInstanceDescription(String instanceDescription) {
            this.instanceDescription = instanceDescription;
            return this;
        }
        public String getInstanceDescription() {
            return this.instanceDescription;
        }

        public DescribeAuditLogsResponseBodyItems setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public DescribeAuditLogsResponseBodyItems setIpType(String ipType) {
            this.ipType = ipType;
            return this;
        }
        public String getIpType() {
            return this.ipType;
        }

        public DescribeAuditLogsResponseBodyItems setLogSource(String logSource) {
            this.logSource = logSource;
            return this;
        }
        public String getLogSource() {
            return this.logSource;
        }

        public DescribeAuditLogsResponseBodyItems setLogTime(Long logTime) {
            this.logTime = logTime;
            return this;
        }
        public Long getLogTime() {
            return this.logTime;
        }

        public DescribeAuditLogsResponseBodyItems setMemberAccount(String memberAccount) {
            this.memberAccount = memberAccount;
            return this;
        }
        public String getMemberAccount() {
            return this.memberAccount;
        }

        public DescribeAuditLogsResponseBodyItems setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public DescribeAuditLogsResponseBodyItems setModelName(String modelName) {
            this.modelName = modelName;
            return this;
        }
        public String getModelName() {
            return this.modelName;
        }

        public DescribeAuditLogsResponseBodyItems setOperateType(String operateType) {
            this.operateType = operateType;
            return this;
        }
        public String getOperateType() {
            return this.operateType;
        }

        public DescribeAuditLogsResponseBodyItems setOssObjectKey(String ossObjectKey) {
            this.ossObjectKey = ossObjectKey;
            return this;
        }
        public String getOssObjectKey() {
            return this.ossObjectKey;
        }

        public DescribeAuditLogsResponseBodyItems setPackageName(String packageName) {
            this.packageName = packageName;
            return this;
        }
        public String getPackageName() {
            return this.packageName;
        }

        public DescribeAuditLogsResponseBodyItems setProductCode(String productCode) {
            this.productCode = productCode;
            return this;
        }
        public String getProductCode() {
            return this.productCode;
        }

        public DescribeAuditLogsResponseBodyItems setProductId(Long productId) {
            this.productId = productId;
            return this;
        }
        public Long getProductId() {
            return this.productId;
        }

        public DescribeAuditLogsResponseBodyItems setRamConsoleLink(String ramConsoleLink) {
            this.ramConsoleLink = ramConsoleLink;
            return this;
        }
        public String getRamConsoleLink() {
            return this.ramConsoleLink;
        }

        public DescribeAuditLogsResponseBodyItems setRuleCategory(String ruleCategory) {
            this.ruleCategory = ruleCategory;
            return this;
        }
        public String getRuleCategory() {
            return this.ruleCategory;
        }

        public DescribeAuditLogsResponseBodyItems setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
        }

        public DescribeAuditLogsResponseBodyItems setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public DescribeAuditLogsResponseBodyItems setSqlText(String sqlText) {
            this.sqlText = sqlText;
            return this;
        }
        public String getSqlText() {
            return this.sqlText;
        }

        public DescribeAuditLogsResponseBodyItems setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

        public DescribeAuditLogsResponseBodyItems setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public DescribeAuditLogsResponseBodyItems setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

        public DescribeAuditLogsResponseBodyItems setWarnLevel(String warnLevel) {
            this.warnLevel = warnLevel;
            return this;
        }
        public String getWarnLevel() {
            return this.warnLevel;
        }

        public DescribeAuditLogsResponseBodyItems setWarnLevelName(String warnLevelName) {
            this.warnLevelName = warnLevelName;
            return this;
        }
        public String getWarnLevelName() {
            return this.warnLevelName;
        }

    }

}
