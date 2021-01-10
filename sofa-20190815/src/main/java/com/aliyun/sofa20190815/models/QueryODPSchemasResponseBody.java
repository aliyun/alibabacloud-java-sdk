// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryODPSchemasResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Data")
    public QueryODPSchemasResponseBodyData data;

    public static QueryODPSchemasResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryODPSchemasResponseBody self = new QueryODPSchemasResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryODPSchemasResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryODPSchemasResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryODPSchemasResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryODPSchemasResponseBody setData(QueryODPSchemasResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryODPSchemasResponseBodyData getData() {
        return this.data;
    }

    public static class QueryODPSchemasResponseBodyDataNodeSchemaMappings extends TeaModel {
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

        public static QueryODPSchemasResponseBodyDataNodeSchemaMappings build(java.util.Map<String, ?> map) throws Exception {
            QueryODPSchemasResponseBodyDataNodeSchemaMappings self = new QueryODPSchemasResponseBodyDataNodeSchemaMappings();
            return TeaModel.build(map, self);
        }

        public QueryODPSchemasResponseBodyDataNodeSchemaMappings setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public QueryODPSchemasResponseBodyDataNodeSchemaMappings setPhysicalPassword(String physicalPassword) {
            this.physicalPassword = physicalPassword;
            return this;
        }
        public String getPhysicalPassword() {
            return this.physicalPassword;
        }

        public QueryODPSchemasResponseBodyDataNodeSchemaMappings setPhysicalUsername(String physicalUsername) {
            this.physicalUsername = physicalUsername;
            return this;
        }
        public String getPhysicalUsername() {
            return this.physicalUsername;
        }

        public QueryODPSchemasResponseBodyDataNodeSchemaMappings setPowerfulPassword(String powerfulPassword) {
            this.powerfulPassword = powerfulPassword;
            return this;
        }
        public String getPowerfulPassword() {
            return this.powerfulPassword;
        }

        public QueryODPSchemasResponseBodyDataNodeSchemaMappings setPowerfulUsername(String powerfulUsername) {
            this.powerfulUsername = powerfulUsername;
            return this;
        }
        public String getPowerfulUsername() {
            return this.powerfulUsername;
        }

        public QueryODPSchemasResponseBodyDataNodeSchemaMappings setSchemaCount(Long schemaCount) {
            this.schemaCount = schemaCount;
            return this;
        }
        public Long getSchemaCount() {
            return this.schemaCount;
        }

        public QueryODPSchemasResponseBodyDataNodeSchemaMappings setSchemaPattern(String schemaPattern) {
            this.schemaPattern = schemaPattern;
            return this;
        }
        public String getSchemaPattern() {
            return this.schemaPattern;
        }

    }

    public static class QueryODPSchemasResponseBodyDataServerProps extends TeaModel {
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

        public static QueryODPSchemasResponseBodyDataServerProps build(java.util.Map<String, ?> map) throws Exception {
            QueryODPSchemasResponseBodyDataServerProps self = new QueryODPSchemasResponseBodyDataServerProps();
            return TeaModel.build(map, self);
        }

        public QueryODPSchemasResponseBodyDataServerProps setBackendMaxConn(Long backendMaxConn) {
            this.backendMaxConn = backendMaxConn;
            return this;
        }
        public Long getBackendMaxConn() {
            return this.backendMaxConn;
        }

        public QueryODPSchemasResponseBodyDataServerProps setEnvMode(String envMode) {
            this.envMode = envMode;
            return this;
        }
        public String getEnvMode() {
            return this.envMode;
        }

        public QueryODPSchemasResponseBodyDataServerProps setEnvTenant(String envTenant) {
            this.envTenant = envTenant;
            return this;
        }
        public String getEnvTenant() {
            return this.envTenant;
        }

        public QueryODPSchemasResponseBodyDataServerProps setFrontendIdleTimeout(Long frontendIdleTimeout) {
            this.frontendIdleTimeout = frontendIdleTimeout;
            return this;
        }
        public Long getFrontendIdleTimeout() {
            return this.frontendIdleTimeout;
        }

        public QueryODPSchemasResponseBodyDataServerProps setFrontendSlaLatency(Long frontendSlaLatency) {
            this.frontendSlaLatency = frontendSlaLatency;
            return this;
        }
        public Long getFrontendSlaLatency() {
            return this.frontendSlaLatency;
        }

        public QueryODPSchemasResponseBodyDataServerProps setFrontendSlaTps(Long frontendSlaTps) {
            this.frontendSlaTps = frontendSlaTps;
            return this;
        }
        public Long getFrontendSlaTps() {
            return this.frontendSlaTps;
        }

        public QueryODPSchemasResponseBodyDataServerProps setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public QueryODPSchemasResponseBodyDataServerProps setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public QueryODPSchemasResponseBodyDataServerProps setSchemaName(String schemaName) {
            this.schemaName = schemaName;
            return this;
        }
        public String getSchemaName() {
            return this.schemaName;
        }

    }

    public static class QueryODPSchemasResponseBodyData extends TeaModel {
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
        public java.util.List<QueryODPSchemasResponseBodyDataNodeSchemaMappings> nodeSchemaMappings;

        @NameInMap("ServerProps")
        public QueryODPSchemasResponseBodyDataServerProps serverProps;

        public static QueryODPSchemasResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryODPSchemasResponseBodyData self = new QueryODPSchemasResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryODPSchemasResponseBodyData setAppDsName(String appDsName) {
            this.appDsName = appDsName;
            return this;
        }
        public String getAppDsName() {
            return this.appDsName;
        }

        public QueryODPSchemasResponseBodyData setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public QueryODPSchemasResponseBodyData setAutoCreateSchema(Boolean autoCreateSchema) {
            this.autoCreateSchema = autoCreateSchema;
            return this;
        }
        public Boolean getAutoCreateSchema() {
            return this.autoCreateSchema;
        }

        public QueryODPSchemasResponseBodyData setAutoUpdateVersion(Boolean autoUpdateVersion) {
            this.autoUpdateVersion = autoUpdateVersion;
            return this;
        }
        public Boolean getAutoUpdateVersion() {
            return this.autoUpdateVersion;
        }

        public QueryODPSchemasResponseBodyData setCharset(String charset) {
            this.charset = charset;
            return this;
        }
        public String getCharset() {
            return this.charset;
        }

        public QueryODPSchemasResponseBodyData setCollation(String collation) {
            this.collation = collation;
            return this;
        }
        public String getCollation() {
            return this.collation;
        }

        public QueryODPSchemasResponseBodyData setDbNum(Long dbNum) {
            this.dbNum = dbNum;
            return this;
        }
        public Long getDbNum() {
            return this.dbNum;
        }

        public QueryODPSchemasResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public QueryODPSchemasResponseBodyData setEnableDtx(Boolean enableDtx) {
            this.enableDtx = enableDtx;
            return this;
        }
        public Boolean getEnableDtx() {
            return this.enableDtx;
        }

        public QueryODPSchemasResponseBodyData setEnvMode(String envMode) {
            this.envMode = envMode;
            return this;
        }
        public String getEnvMode() {
            return this.envMode;
        }

        public QueryODPSchemasResponseBodyData setEnvTenant(String envTenant) {
            this.envTenant = envTenant;
            return this;
        }
        public String getEnvTenant() {
            return this.envTenant;
        }

        public QueryODPSchemasResponseBodyData setExpansionJobId(String expansionJobId) {
            this.expansionJobId = expansionJobId;
            return this;
        }
        public String getExpansionJobId() {
            return this.expansionJobId;
        }

        public QueryODPSchemasResponseBodyData setExpansionStatus(String expansionStatus) {
            this.expansionStatus = expansionStatus;
            return this;
        }
        public String getExpansionStatus() {
            return this.expansionStatus;
        }

        public QueryODPSchemasResponseBodyData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public QueryODPSchemasResponseBodyData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public QueryODPSchemasResponseBodyData setGmtValid(String gmtValid) {
            this.gmtValid = gmtValid;
            return this;
        }
        public String getGmtValid() {
            return this.gmtValid;
        }

        public QueryODPSchemasResponseBodyData setGroupCount(Long groupCount) {
            this.groupCount = groupCount;
            return this;
        }
        public Long getGroupCount() {
            return this.groupCount;
        }

        public QueryODPSchemasResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public QueryODPSchemasResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public QueryODPSchemasResponseBodyData setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public QueryODPSchemasResponseBodyData setLatestVersion(String latestVersion) {
            this.latestVersion = latestVersion;
            return this;
        }
        public String getLatestVersion() {
            return this.latestVersion;
        }

        public QueryODPSchemasResponseBodyData setLogicTableCount(String logicTableCount) {
            this.logicTableCount = logicTableCount;
            return this;
        }
        public String getLogicTableCount() {
            return this.logicTableCount;
        }

        public QueryODPSchemasResponseBodyData setOpenReadAndWriteSeparation(Boolean openReadAndWriteSeparation) {
            this.openReadAndWriteSeparation = openReadAndWriteSeparation;
            return this;
        }
        public Boolean getOpenReadAndWriteSeparation() {
            return this.openReadAndWriteSeparation;
        }

        public QueryODPSchemasResponseBodyData setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public QueryODPSchemasResponseBodyData setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public QueryODPSchemasResponseBodyData setParserDbType(String parserDbType) {
            this.parserDbType = parserDbType;
            return this;
        }
        public String getParserDbType() {
            return this.parserDbType;
        }

        public QueryODPSchemasResponseBodyData setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

        public QueryODPSchemasResponseBodyData setPhysicalSchemaCount(Long physicalSchemaCount) {
            this.physicalSchemaCount = physicalSchemaCount;
            return this;
        }
        public Long getPhysicalSchemaCount() {
            return this.physicalSchemaCount;
        }

        public QueryODPSchemasResponseBodyData setSchemaGroupType(Long schemaGroupType) {
            this.schemaGroupType = schemaGroupType;
            return this;
        }
        public Long getSchemaGroupType() {
            return this.schemaGroupType;
        }

        public QueryODPSchemasResponseBodyData setSchemaName(String schemaName) {
            this.schemaName = schemaName;
            return this;
        }
        public String getSchemaName() {
            return this.schemaName;
        }

        public QueryODPSchemasResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QueryODPSchemasResponseBodyData setUpdateStatus(String updateStatus) {
            this.updateStatus = updateStatus;
            return this;
        }
        public String getUpdateStatus() {
            return this.updateStatus;
        }

        public QueryODPSchemasResponseBodyData setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public QueryODPSchemasResponseBodyData setNodeSchemaMappings(java.util.List<QueryODPSchemasResponseBodyDataNodeSchemaMappings> nodeSchemaMappings) {
            this.nodeSchemaMappings = nodeSchemaMappings;
            return this;
        }
        public java.util.List<QueryODPSchemasResponseBodyDataNodeSchemaMappings> getNodeSchemaMappings() {
            return this.nodeSchemaMappings;
        }

        public QueryODPSchemasResponseBodyData setServerProps(QueryODPSchemasResponseBodyDataServerProps serverProps) {
            this.serverProps = serverProps;
            return this;
        }
        public QueryODPSchemasResponseBodyDataServerProps getServerProps() {
            return this.serverProps;
        }

    }

}
