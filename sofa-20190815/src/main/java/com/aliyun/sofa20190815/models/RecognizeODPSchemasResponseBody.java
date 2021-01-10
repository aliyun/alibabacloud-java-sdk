// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class RecognizeODPSchemasResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Data")
    public RecognizeODPSchemasResponseBodyData data;

    public static RecognizeODPSchemasResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RecognizeODPSchemasResponseBody self = new RecognizeODPSchemasResponseBody();
        return TeaModel.build(map, self);
    }

    public RecognizeODPSchemasResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RecognizeODPSchemasResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public RecognizeODPSchemasResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public RecognizeODPSchemasResponseBody setData(RecognizeODPSchemasResponseBodyData data) {
        this.data = data;
        return this;
    }
    public RecognizeODPSchemasResponseBodyData getData() {
        return this.data;
    }

    public static class RecognizeODPSchemasResponseBodyDataLogicTablesDbRules extends TeaModel {
        @NameInMap("Customized")
        public Boolean customized;

        @NameInMap("Field")
        public String field;

        @NameInMap("Text")
        public String text;

        @NameInMap("Value")
        public String value;

        public static RecognizeODPSchemasResponseBodyDataLogicTablesDbRules build(java.util.Map<String, ?> map) throws Exception {
            RecognizeODPSchemasResponseBodyDataLogicTablesDbRules self = new RecognizeODPSchemasResponseBodyDataLogicTablesDbRules();
            return TeaModel.build(map, self);
        }

        public RecognizeODPSchemasResponseBodyDataLogicTablesDbRules setCustomized(Boolean customized) {
            this.customized = customized;
            return this;
        }
        public Boolean getCustomized() {
            return this.customized;
        }

        public RecognizeODPSchemasResponseBodyDataLogicTablesDbRules setField(String field) {
            this.field = field;
            return this;
        }
        public String getField() {
            return this.field;
        }

        public RecognizeODPSchemasResponseBodyDataLogicTablesDbRules setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

        public RecognizeODPSchemasResponseBodyDataLogicTablesDbRules setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class RecognizeODPSchemasResponseBodyDataLogicTablesRules extends TeaModel {
        @NameInMap("Customized")
        public Boolean customized;

        @NameInMap("Field")
        public String field;

        @NameInMap("Text")
        public String text;

        @NameInMap("Value")
        public String value;

        public static RecognizeODPSchemasResponseBodyDataLogicTablesRules build(java.util.Map<String, ?> map) throws Exception {
            RecognizeODPSchemasResponseBodyDataLogicTablesRules self = new RecognizeODPSchemasResponseBodyDataLogicTablesRules();
            return TeaModel.build(map, self);
        }

        public RecognizeODPSchemasResponseBodyDataLogicTablesRules setCustomized(Boolean customized) {
            this.customized = customized;
            return this;
        }
        public Boolean getCustomized() {
            return this.customized;
        }

        public RecognizeODPSchemasResponseBodyDataLogicTablesRules setField(String field) {
            this.field = field;
            return this;
        }
        public String getField() {
            return this.field;
        }

        public RecognizeODPSchemasResponseBodyDataLogicTablesRules setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

        public RecognizeODPSchemasResponseBodyDataLogicTablesRules setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class RecognizeODPSchemasResponseBodyDataLogicTables extends TeaModel {
        @NameInMap("BroadcastTable")
        public Boolean broadcastTable;

        @NameInMap("CreateTableNow")
        public Boolean createTableNow;

        @NameInMap("EnvMode")
        public String envMode;

        @NameInMap("EnvTenant")
        public String envTenant;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("GroupCount")
        public Long groupCount;

        @NameInMap("Id")
        public Long id;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("SchemaGroupType")
        public Long schemaGroupType;

        @NameInMap("SchemaName")
        public String schemaName;

        @NameInMap("SingleTable")
        public Boolean singleTable;

        @NameInMap("SqlText")
        public String sqlText;

        @NameInMap("TableCount")
        public Long tableCount;

        @NameInMap("TableName")
        public String tableName;

        @NameInMap("TbSuffix")
        public String tbSuffix;

        @NameInMap("TbSuffixPadding")
        public String tbSuffixPadding;

        @NameInMap("DbRules")
        public java.util.List<RecognizeODPSchemasResponseBodyDataLogicTablesDbRules> dbRules;

        @NameInMap("Rules")
        public java.util.List<RecognizeODPSchemasResponseBodyDataLogicTablesRules> rules;

        public static RecognizeODPSchemasResponseBodyDataLogicTables build(java.util.Map<String, ?> map) throws Exception {
            RecognizeODPSchemasResponseBodyDataLogicTables self = new RecognizeODPSchemasResponseBodyDataLogicTables();
            return TeaModel.build(map, self);
        }

        public RecognizeODPSchemasResponseBodyDataLogicTables setBroadcastTable(Boolean broadcastTable) {
            this.broadcastTable = broadcastTable;
            return this;
        }
        public Boolean getBroadcastTable() {
            return this.broadcastTable;
        }

        public RecognizeODPSchemasResponseBodyDataLogicTables setCreateTableNow(Boolean createTableNow) {
            this.createTableNow = createTableNow;
            return this;
        }
        public Boolean getCreateTableNow() {
            return this.createTableNow;
        }

        public RecognizeODPSchemasResponseBodyDataLogicTables setEnvMode(String envMode) {
            this.envMode = envMode;
            return this;
        }
        public String getEnvMode() {
            return this.envMode;
        }

        public RecognizeODPSchemasResponseBodyDataLogicTables setEnvTenant(String envTenant) {
            this.envTenant = envTenant;
            return this;
        }
        public String getEnvTenant() {
            return this.envTenant;
        }

        public RecognizeODPSchemasResponseBodyDataLogicTables setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public RecognizeODPSchemasResponseBodyDataLogicTables setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public RecognizeODPSchemasResponseBodyDataLogicTables setGroupCount(Long groupCount) {
            this.groupCount = groupCount;
            return this;
        }
        public Long getGroupCount() {
            return this.groupCount;
        }

        public RecognizeODPSchemasResponseBodyDataLogicTables setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public RecognizeODPSchemasResponseBodyDataLogicTables setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public RecognizeODPSchemasResponseBodyDataLogicTables setSchemaGroupType(Long schemaGroupType) {
            this.schemaGroupType = schemaGroupType;
            return this;
        }
        public Long getSchemaGroupType() {
            return this.schemaGroupType;
        }

        public RecognizeODPSchemasResponseBodyDataLogicTables setSchemaName(String schemaName) {
            this.schemaName = schemaName;
            return this;
        }
        public String getSchemaName() {
            return this.schemaName;
        }

        public RecognizeODPSchemasResponseBodyDataLogicTables setSingleTable(Boolean singleTable) {
            this.singleTable = singleTable;
            return this;
        }
        public Boolean getSingleTable() {
            return this.singleTable;
        }

        public RecognizeODPSchemasResponseBodyDataLogicTables setSqlText(String sqlText) {
            this.sqlText = sqlText;
            return this;
        }
        public String getSqlText() {
            return this.sqlText;
        }

        public RecognizeODPSchemasResponseBodyDataLogicTables setTableCount(Long tableCount) {
            this.tableCount = tableCount;
            return this;
        }
        public Long getTableCount() {
            return this.tableCount;
        }

        public RecognizeODPSchemasResponseBodyDataLogicTables setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

        public RecognizeODPSchemasResponseBodyDataLogicTables setTbSuffix(String tbSuffix) {
            this.tbSuffix = tbSuffix;
            return this;
        }
        public String getTbSuffix() {
            return this.tbSuffix;
        }

        public RecognizeODPSchemasResponseBodyDataLogicTables setTbSuffixPadding(String tbSuffixPadding) {
            this.tbSuffixPadding = tbSuffixPadding;
            return this;
        }
        public String getTbSuffixPadding() {
            return this.tbSuffixPadding;
        }

        public RecognizeODPSchemasResponseBodyDataLogicTables setDbRules(java.util.List<RecognizeODPSchemasResponseBodyDataLogicTablesDbRules> dbRules) {
            this.dbRules = dbRules;
            return this;
        }
        public java.util.List<RecognizeODPSchemasResponseBodyDataLogicTablesDbRules> getDbRules() {
            return this.dbRules;
        }

        public RecognizeODPSchemasResponseBodyDataLogicTables setRules(java.util.List<RecognizeODPSchemasResponseBodyDataLogicTablesRules> rules) {
            this.rules = rules;
            return this;
        }
        public java.util.List<RecognizeODPSchemasResponseBodyDataLogicTablesRules> getRules() {
            return this.rules;
        }

    }

    public static class RecognizeODPSchemasResponseBodyDataConnProperties extends TeaModel {
        @NameInMap("AllowMinPoolTimeout")
        public Boolean allowMinPoolTimeout;

        @NameInMap("BackgroundValidation")
        public Boolean backgroundValidation;

        @NameInMap("BackgroundValidationMinutes")
        public Long backgroundValidationMinutes;

        @NameInMap("BlockingTimeoutMillis")
        public Long blockingTimeoutMillis;

        @NameInMap("IdleTimeoutMinutes")
        public Long idleTimeoutMinutes;

        @NameInMap("MaxConn")
        public Long maxConn;

        @NameInMap("MinConn")
        public Long minConn;

        @NameInMap("NewConnectionSql")
        public String newConnectionSql;

        @NameInMap("Others")
        public String others;

        @NameInMap("Prefill")
        public Boolean prefill;

        @NameInMap("QueryTimeout")
        public Long queryTimeout;

        @NameInMap("TestOnBorrow")
        public Boolean testOnBorrow;

        @NameInMap("ValidationQuery")
        public String validationQuery;

        @NameInMap("ValidationQueryTimeout")
        public Long validationQueryTimeout;

        public static RecognizeODPSchemasResponseBodyDataConnProperties build(java.util.Map<String, ?> map) throws Exception {
            RecognizeODPSchemasResponseBodyDataConnProperties self = new RecognizeODPSchemasResponseBodyDataConnProperties();
            return TeaModel.build(map, self);
        }

        public RecognizeODPSchemasResponseBodyDataConnProperties setAllowMinPoolTimeout(Boolean allowMinPoolTimeout) {
            this.allowMinPoolTimeout = allowMinPoolTimeout;
            return this;
        }
        public Boolean getAllowMinPoolTimeout() {
            return this.allowMinPoolTimeout;
        }

        public RecognizeODPSchemasResponseBodyDataConnProperties setBackgroundValidation(Boolean backgroundValidation) {
            this.backgroundValidation = backgroundValidation;
            return this;
        }
        public Boolean getBackgroundValidation() {
            return this.backgroundValidation;
        }

        public RecognizeODPSchemasResponseBodyDataConnProperties setBackgroundValidationMinutes(Long backgroundValidationMinutes) {
            this.backgroundValidationMinutes = backgroundValidationMinutes;
            return this;
        }
        public Long getBackgroundValidationMinutes() {
            return this.backgroundValidationMinutes;
        }

        public RecognizeODPSchemasResponseBodyDataConnProperties setBlockingTimeoutMillis(Long blockingTimeoutMillis) {
            this.blockingTimeoutMillis = blockingTimeoutMillis;
            return this;
        }
        public Long getBlockingTimeoutMillis() {
            return this.blockingTimeoutMillis;
        }

        public RecognizeODPSchemasResponseBodyDataConnProperties setIdleTimeoutMinutes(Long idleTimeoutMinutes) {
            this.idleTimeoutMinutes = idleTimeoutMinutes;
            return this;
        }
        public Long getIdleTimeoutMinutes() {
            return this.idleTimeoutMinutes;
        }

        public RecognizeODPSchemasResponseBodyDataConnProperties setMaxConn(Long maxConn) {
            this.maxConn = maxConn;
            return this;
        }
        public Long getMaxConn() {
            return this.maxConn;
        }

        public RecognizeODPSchemasResponseBodyDataConnProperties setMinConn(Long minConn) {
            this.minConn = minConn;
            return this;
        }
        public Long getMinConn() {
            return this.minConn;
        }

        public RecognizeODPSchemasResponseBodyDataConnProperties setNewConnectionSql(String newConnectionSql) {
            this.newConnectionSql = newConnectionSql;
            return this;
        }
        public String getNewConnectionSql() {
            return this.newConnectionSql;
        }

        public RecognizeODPSchemasResponseBodyDataConnProperties setOthers(String others) {
            this.others = others;
            return this;
        }
        public String getOthers() {
            return this.others;
        }

        public RecognizeODPSchemasResponseBodyDataConnProperties setPrefill(Boolean prefill) {
            this.prefill = prefill;
            return this;
        }
        public Boolean getPrefill() {
            return this.prefill;
        }

        public RecognizeODPSchemasResponseBodyDataConnProperties setQueryTimeout(Long queryTimeout) {
            this.queryTimeout = queryTimeout;
            return this;
        }
        public Long getQueryTimeout() {
            return this.queryTimeout;
        }

        public RecognizeODPSchemasResponseBodyDataConnProperties setTestOnBorrow(Boolean testOnBorrow) {
            this.testOnBorrow = testOnBorrow;
            return this;
        }
        public Boolean getTestOnBorrow() {
            return this.testOnBorrow;
        }

        public RecognizeODPSchemasResponseBodyDataConnProperties setValidationQuery(String validationQuery) {
            this.validationQuery = validationQuery;
            return this;
        }
        public String getValidationQuery() {
            return this.validationQuery;
        }

        public RecognizeODPSchemasResponseBodyDataConnProperties setValidationQueryTimeout(Long validationQueryTimeout) {
            this.validationQueryTimeout = validationQueryTimeout;
            return this;
        }
        public Long getValidationQueryTimeout() {
            return this.validationQueryTimeout;
        }

    }

    public static class RecognizeODPSchemasResponseBodyDataSchemaNodeSchemaMappings extends TeaModel {
        @NameInMap("NodeId")
        public String nodeId;

        @NameInMap("PhysicalPassword")
        public String physicalPassword;

        @NameInMap("PhysicalUsername")
        public String physicalUsername;

        @NameInMap("PowerfulPassword")
        public String powerfulPassword;

        @NameInMap("PowerfulUsername")
        public String powerfulUsername;

        @NameInMap("SchemaCount")
        public Long schemaCount;

        @NameInMap("SchemaPattern")
        public String schemaPattern;

        public static RecognizeODPSchemasResponseBodyDataSchemaNodeSchemaMappings build(java.util.Map<String, ?> map) throws Exception {
            RecognizeODPSchemasResponseBodyDataSchemaNodeSchemaMappings self = new RecognizeODPSchemasResponseBodyDataSchemaNodeSchemaMappings();
            return TeaModel.build(map, self);
        }

        public RecognizeODPSchemasResponseBodyDataSchemaNodeSchemaMappings setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public RecognizeODPSchemasResponseBodyDataSchemaNodeSchemaMappings setPhysicalPassword(String physicalPassword) {
            this.physicalPassword = physicalPassword;
            return this;
        }
        public String getPhysicalPassword() {
            return this.physicalPassword;
        }

        public RecognizeODPSchemasResponseBodyDataSchemaNodeSchemaMappings setPhysicalUsername(String physicalUsername) {
            this.physicalUsername = physicalUsername;
            return this;
        }
        public String getPhysicalUsername() {
            return this.physicalUsername;
        }

        public RecognizeODPSchemasResponseBodyDataSchemaNodeSchemaMappings setPowerfulPassword(String powerfulPassword) {
            this.powerfulPassword = powerfulPassword;
            return this;
        }
        public String getPowerfulPassword() {
            return this.powerfulPassword;
        }

        public RecognizeODPSchemasResponseBodyDataSchemaNodeSchemaMappings setPowerfulUsername(String powerfulUsername) {
            this.powerfulUsername = powerfulUsername;
            return this;
        }
        public String getPowerfulUsername() {
            return this.powerfulUsername;
        }

        public RecognizeODPSchemasResponseBodyDataSchemaNodeSchemaMappings setSchemaCount(Long schemaCount) {
            this.schemaCount = schemaCount;
            return this;
        }
        public Long getSchemaCount() {
            return this.schemaCount;
        }

        public RecognizeODPSchemasResponseBodyDataSchemaNodeSchemaMappings setSchemaPattern(String schemaPattern) {
            this.schemaPattern = schemaPattern;
            return this;
        }
        public String getSchemaPattern() {
            return this.schemaPattern;
        }

    }

    public static class RecognizeODPSchemasResponseBodyDataSchemaServerProps extends TeaModel {
        @NameInMap("BackendMaxConn")
        public Long backendMaxConn;

        @NameInMap("EnvMode")
        public String envMode;

        @NameInMap("EnvTenant")
        public String envTenant;

        @NameInMap("FrontendIdleTimeout")
        public Long frontendIdleTimeout;

        @NameInMap("FrontendSlaLatency")
        public Long frontendSlaLatency;

        @NameInMap("FrontendSlaTps")
        public Long frontendSlaTps;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("SchemaName")
        public String schemaName;

        public static RecognizeODPSchemasResponseBodyDataSchemaServerProps build(java.util.Map<String, ?> map) throws Exception {
            RecognizeODPSchemasResponseBodyDataSchemaServerProps self = new RecognizeODPSchemasResponseBodyDataSchemaServerProps();
            return TeaModel.build(map, self);
        }

        public RecognizeODPSchemasResponseBodyDataSchemaServerProps setBackendMaxConn(Long backendMaxConn) {
            this.backendMaxConn = backendMaxConn;
            return this;
        }
        public Long getBackendMaxConn() {
            return this.backendMaxConn;
        }

        public RecognizeODPSchemasResponseBodyDataSchemaServerProps setEnvMode(String envMode) {
            this.envMode = envMode;
            return this;
        }
        public String getEnvMode() {
            return this.envMode;
        }

        public RecognizeODPSchemasResponseBodyDataSchemaServerProps setEnvTenant(String envTenant) {
            this.envTenant = envTenant;
            return this;
        }
        public String getEnvTenant() {
            return this.envTenant;
        }

        public RecognizeODPSchemasResponseBodyDataSchemaServerProps setFrontendIdleTimeout(Long frontendIdleTimeout) {
            this.frontendIdleTimeout = frontendIdleTimeout;
            return this;
        }
        public Long getFrontendIdleTimeout() {
            return this.frontendIdleTimeout;
        }

        public RecognizeODPSchemasResponseBodyDataSchemaServerProps setFrontendSlaLatency(Long frontendSlaLatency) {
            this.frontendSlaLatency = frontendSlaLatency;
            return this;
        }
        public Long getFrontendSlaLatency() {
            return this.frontendSlaLatency;
        }

        public RecognizeODPSchemasResponseBodyDataSchemaServerProps setFrontendSlaTps(Long frontendSlaTps) {
            this.frontendSlaTps = frontendSlaTps;
            return this;
        }
        public Long getFrontendSlaTps() {
            return this.frontendSlaTps;
        }

        public RecognizeODPSchemasResponseBodyDataSchemaServerProps setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public RecognizeODPSchemasResponseBodyDataSchemaServerProps setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public RecognizeODPSchemasResponseBodyDataSchemaServerProps setSchemaName(String schemaName) {
            this.schemaName = schemaName;
            return this;
        }
        public String getSchemaName() {
            return this.schemaName;
        }

    }

    public static class RecognizeODPSchemasResponseBodyDataSchema extends TeaModel {
        @NameInMap("AppDsName")
        public String appDsName;

        @NameInMap("AppName")
        public String appName;

        @NameInMap("AutoCreateSchema")
        public Boolean autoCreateSchema;

        @NameInMap("AutoUpdateVersion")
        public Boolean autoUpdateVersion;

        @NameInMap("Charset")
        public String charset;

        @NameInMap("Collation")
        public String collation;

        @NameInMap("DbNum")
        public Long dbNum;

        @NameInMap("Description")
        public String description;

        @NameInMap("EnableDtx")
        public Boolean enableDtx;

        @NameInMap("EnvMode")
        public String envMode;

        @NameInMap("EnvTenant")
        public String envTenant;

        @NameInMap("ExpansionJobId")
        public String expansionJobId;

        @NameInMap("ExpansionStatus")
        public String expansionStatus;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("GmtValid")
        public String gmtValid;

        @NameInMap("GroupCount")
        public Long groupCount;

        @NameInMap("Id")
        public Long id;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("InstanceName")
        public String instanceName;

        @NameInMap("LatestVersion")
        public String latestVersion;

        @NameInMap("LogicTableCount")
        public String logicTableCount;

        @NameInMap("OpenReadAndWriteSeparation")
        public Boolean openReadAndWriteSeparation;

        @NameInMap("Operator")
        public String operator;

        @NameInMap("Owner")
        public String owner;

        @NameInMap("ParserDbType")
        public String parserDbType;

        @NameInMap("Password")
        public String password;

        @NameInMap("PhysicalSchemaCount")
        public Long physicalSchemaCount;

        @NameInMap("SchemaGroupType")
        public Long schemaGroupType;

        @NameInMap("SchemaName")
        public String schemaName;

        @NameInMap("Status")
        public String status;

        @NameInMap("UpdateStatus")
        public String updateStatus;

        @NameInMap("Version")
        public String version;

        @NameInMap("NodeSchemaMappings")
        public java.util.List<RecognizeODPSchemasResponseBodyDataSchemaNodeSchemaMappings> nodeSchemaMappings;

        @NameInMap("ServerProps")
        public RecognizeODPSchemasResponseBodyDataSchemaServerProps serverProps;

        public static RecognizeODPSchemasResponseBodyDataSchema build(java.util.Map<String, ?> map) throws Exception {
            RecognizeODPSchemasResponseBodyDataSchema self = new RecognizeODPSchemasResponseBodyDataSchema();
            return TeaModel.build(map, self);
        }

        public RecognizeODPSchemasResponseBodyDataSchema setAppDsName(String appDsName) {
            this.appDsName = appDsName;
            return this;
        }
        public String getAppDsName() {
            return this.appDsName;
        }

        public RecognizeODPSchemasResponseBodyDataSchema setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public RecognizeODPSchemasResponseBodyDataSchema setAutoCreateSchema(Boolean autoCreateSchema) {
            this.autoCreateSchema = autoCreateSchema;
            return this;
        }
        public Boolean getAutoCreateSchema() {
            return this.autoCreateSchema;
        }

        public RecognizeODPSchemasResponseBodyDataSchema setAutoUpdateVersion(Boolean autoUpdateVersion) {
            this.autoUpdateVersion = autoUpdateVersion;
            return this;
        }
        public Boolean getAutoUpdateVersion() {
            return this.autoUpdateVersion;
        }

        public RecognizeODPSchemasResponseBodyDataSchema setCharset(String charset) {
            this.charset = charset;
            return this;
        }
        public String getCharset() {
            return this.charset;
        }

        public RecognizeODPSchemasResponseBodyDataSchema setCollation(String collation) {
            this.collation = collation;
            return this;
        }
        public String getCollation() {
            return this.collation;
        }

        public RecognizeODPSchemasResponseBodyDataSchema setDbNum(Long dbNum) {
            this.dbNum = dbNum;
            return this;
        }
        public Long getDbNum() {
            return this.dbNum;
        }

        public RecognizeODPSchemasResponseBodyDataSchema setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public RecognizeODPSchemasResponseBodyDataSchema setEnableDtx(Boolean enableDtx) {
            this.enableDtx = enableDtx;
            return this;
        }
        public Boolean getEnableDtx() {
            return this.enableDtx;
        }

        public RecognizeODPSchemasResponseBodyDataSchema setEnvMode(String envMode) {
            this.envMode = envMode;
            return this;
        }
        public String getEnvMode() {
            return this.envMode;
        }

        public RecognizeODPSchemasResponseBodyDataSchema setEnvTenant(String envTenant) {
            this.envTenant = envTenant;
            return this;
        }
        public String getEnvTenant() {
            return this.envTenant;
        }

        public RecognizeODPSchemasResponseBodyDataSchema setExpansionJobId(String expansionJobId) {
            this.expansionJobId = expansionJobId;
            return this;
        }
        public String getExpansionJobId() {
            return this.expansionJobId;
        }

        public RecognizeODPSchemasResponseBodyDataSchema setExpansionStatus(String expansionStatus) {
            this.expansionStatus = expansionStatus;
            return this;
        }
        public String getExpansionStatus() {
            return this.expansionStatus;
        }

        public RecognizeODPSchemasResponseBodyDataSchema setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public RecognizeODPSchemasResponseBodyDataSchema setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public RecognizeODPSchemasResponseBodyDataSchema setGmtValid(String gmtValid) {
            this.gmtValid = gmtValid;
            return this;
        }
        public String getGmtValid() {
            return this.gmtValid;
        }

        public RecognizeODPSchemasResponseBodyDataSchema setGroupCount(Long groupCount) {
            this.groupCount = groupCount;
            return this;
        }
        public Long getGroupCount() {
            return this.groupCount;
        }

        public RecognizeODPSchemasResponseBodyDataSchema setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public RecognizeODPSchemasResponseBodyDataSchema setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public RecognizeODPSchemasResponseBodyDataSchema setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public RecognizeODPSchemasResponseBodyDataSchema setLatestVersion(String latestVersion) {
            this.latestVersion = latestVersion;
            return this;
        }
        public String getLatestVersion() {
            return this.latestVersion;
        }

        public RecognizeODPSchemasResponseBodyDataSchema setLogicTableCount(String logicTableCount) {
            this.logicTableCount = logicTableCount;
            return this;
        }
        public String getLogicTableCount() {
            return this.logicTableCount;
        }

        public RecognizeODPSchemasResponseBodyDataSchema setOpenReadAndWriteSeparation(Boolean openReadAndWriteSeparation) {
            this.openReadAndWriteSeparation = openReadAndWriteSeparation;
            return this;
        }
        public Boolean getOpenReadAndWriteSeparation() {
            return this.openReadAndWriteSeparation;
        }

        public RecognizeODPSchemasResponseBodyDataSchema setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public RecognizeODPSchemasResponseBodyDataSchema setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public RecognizeODPSchemasResponseBodyDataSchema setParserDbType(String parserDbType) {
            this.parserDbType = parserDbType;
            return this;
        }
        public String getParserDbType() {
            return this.parserDbType;
        }

        public RecognizeODPSchemasResponseBodyDataSchema setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

        public RecognizeODPSchemasResponseBodyDataSchema setPhysicalSchemaCount(Long physicalSchemaCount) {
            this.physicalSchemaCount = physicalSchemaCount;
            return this;
        }
        public Long getPhysicalSchemaCount() {
            return this.physicalSchemaCount;
        }

        public RecognizeODPSchemasResponseBodyDataSchema setSchemaGroupType(Long schemaGroupType) {
            this.schemaGroupType = schemaGroupType;
            return this;
        }
        public Long getSchemaGroupType() {
            return this.schemaGroupType;
        }

        public RecognizeODPSchemasResponseBodyDataSchema setSchemaName(String schemaName) {
            this.schemaName = schemaName;
            return this;
        }
        public String getSchemaName() {
            return this.schemaName;
        }

        public RecognizeODPSchemasResponseBodyDataSchema setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public RecognizeODPSchemasResponseBodyDataSchema setUpdateStatus(String updateStatus) {
            this.updateStatus = updateStatus;
            return this;
        }
        public String getUpdateStatus() {
            return this.updateStatus;
        }

        public RecognizeODPSchemasResponseBodyDataSchema setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public RecognizeODPSchemasResponseBodyDataSchema setNodeSchemaMappings(java.util.List<RecognizeODPSchemasResponseBodyDataSchemaNodeSchemaMappings> nodeSchemaMappings) {
            this.nodeSchemaMappings = nodeSchemaMappings;
            return this;
        }
        public java.util.List<RecognizeODPSchemasResponseBodyDataSchemaNodeSchemaMappings> getNodeSchemaMappings() {
            return this.nodeSchemaMappings;
        }

        public RecognizeODPSchemasResponseBodyDataSchema setServerProps(RecognizeODPSchemasResponseBodyDataSchemaServerProps serverProps) {
            this.serverProps = serverProps;
            return this;
        }
        public RecognizeODPSchemasResponseBodyDataSchemaServerProps getServerProps() {
            return this.serverProps;
        }

    }

    public static class RecognizeODPSchemasResponseBodyData extends TeaModel {
        @NameInMap("LogicTables")
        public java.util.List<RecognizeODPSchemasResponseBodyDataLogicTables> logicTables;

        @NameInMap("ConnProperties")
        public RecognizeODPSchemasResponseBodyDataConnProperties connProperties;

        @NameInMap("Schema")
        public RecognizeODPSchemasResponseBodyDataSchema schema;

        public static RecognizeODPSchemasResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            RecognizeODPSchemasResponseBodyData self = new RecognizeODPSchemasResponseBodyData();
            return TeaModel.build(map, self);
        }

        public RecognizeODPSchemasResponseBodyData setLogicTables(java.util.List<RecognizeODPSchemasResponseBodyDataLogicTables> logicTables) {
            this.logicTables = logicTables;
            return this;
        }
        public java.util.List<RecognizeODPSchemasResponseBodyDataLogicTables> getLogicTables() {
            return this.logicTables;
        }

        public RecognizeODPSchemasResponseBodyData setConnProperties(RecognizeODPSchemasResponseBodyDataConnProperties connProperties) {
            this.connProperties = connProperties;
            return this;
        }
        public RecognizeODPSchemasResponseBodyDataConnProperties getConnProperties() {
            return this.connProperties;
        }

        public RecognizeODPSchemasResponseBodyData setSchema(RecognizeODPSchemasResponseBodyDataSchema schema) {
            this.schema = schema;
            return this;
        }
        public RecognizeODPSchemasResponseBodyDataSchema getSchema() {
            return this.schema;
        }

    }

}
