// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class DescribeAuditLogsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>CE4681BA-8019-5BE1-9F4B-8973BEA9CF57</p>
     */
    @NameInMap("AsyncRequestId")
    public String asyncRequestId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("Items")
    public java.util.List<DescribeAuditLogsResponseBodyItems> items;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>A7021857-AFD9-5AD6-979D-AA7DFC5AFADF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
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
         * <strong>example:</strong>
         * <p>139.<em>.</em>.57</p>
         */
        @NameInMap("ClientIp")
        public String clientIp;

        /**
         * <strong>example:</strong>
         * <p>35756</p>
         */
        @NameInMap("ClientPort")
        public String clientPort;

        /**
         * <strong>example:</strong>
         * <p>mysql</p>
         */
        @NameInMap("ClientUa")
        public String clientUa;

        /**
         * <strong>example:</strong>
         * <p>hide14</p>
         */
        @NameInMap("ColumnName")
        public String columnName;

        /**
         * <strong>example:</strong>
         * <p>1536751124000</p>
         */
        @NameInMap("CreationTime")
        public Long creationTime;

        /**
         * <strong>example:</strong>
         * <p>plan_id ~ application_id ~ plan_type ~ plan_name ~ plan_value_id</p>
         */
        @NameInMap("DataSet")
        public String dataSet;

        /**
         * <strong>example:</strong>
         * <p>chngc_b2b_migration_sh</p>
         */
        @NameInMap("DatabaseName")
        public String databaseName;

        @NameInMap("DbType")
        public String dbType;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("EffectRow")
        public Long effectRow;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ExecuteStatus")
        public Integer executeStatus;

        /**
         * <strong>example:</strong>
         * <p>1751870592000</p>
         */
        @NameInMap("ExecuteTime")
        public Long executeTime;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("InWhiteList")
        public Boolean inWhiteList;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("InstanceAuditStatus")
        public String instanceAuditStatus;

        /**
         * <strong>example:</strong>
         * <p>instance dscription</p>
         */
        @NameInMap("InstanceDescription")
        public String instanceDescription;

        /**
         * <strong>example:</strong>
         * <p>rm-1234</p>
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
         * <p>SLOW_SQL</p>
         */
        @NameInMap("LogSource")
        public String logSource;

        /**
         * <strong>example:</strong>
         * <p>1751870592000</p>
         */
        @NameInMap("LogTime")
        public Long logTime;

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

        @NameInMap("ModelName")
        public String modelName;

        /**
         * <strong>example:</strong>
         * <p>Drop</p>
         */
        @NameInMap("OperateType")
        public String operateType;

        /**
         * <strong>example:</strong>
         * <p>oss-key1</p>
         */
        @NameInMap("OssObjectKey")
        public String ossObjectKey;

        /**
         * <strong>example:</strong>
         * <p>com.sinosoft.chinalife</p>
         */
        @NameInMap("PackageName")
        public String packageName;

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

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("RuleCategory")
        public String ruleCategory;

        /**
         * <strong>example:</strong>
         * <p>9952275</p>
         */
        @NameInMap("RuleId")
        public String ruleId;

        /**
         * <strong>example:</strong>
         * <p>name</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

        /**
         * <strong>example:</strong>
         * <p>select schema_name, catalog_name, default_character_set_name as encoding from information_schema.schemata  order by 1</p>
         */
        @NameInMap("SqlText")
        public String sqlText;

        /**
         * <strong>example:</strong>
         * <p>it_table</p>
         */
        @NameInMap("TableName")
        public String tableName;

        /**
         * <strong>example:</strong>
         * <p>19********94</p>
         */
        @NameInMap("UserId")
        public String userId;

        /**
         * <strong>example:</strong>
         * <p>admin</p>
         */
        @NameInMap("UserName")
        public String userName;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("WarnLevel")
        public String warnLevel;

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
