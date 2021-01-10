// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class BatchqueryODPSchemasResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public java.util.List<BatchqueryODPSchemasResponseBodyData> data;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultCode")
    public String resultCode;

    public static BatchqueryODPSchemasResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchqueryODPSchemasResponseBody self = new BatchqueryODPSchemasResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchqueryODPSchemasResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BatchqueryODPSchemasResponseBody setData(java.util.List<BatchqueryODPSchemasResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<BatchqueryODPSchemasResponseBodyData> getData() {
        return this.data;
    }

    public BatchqueryODPSchemasResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public BatchqueryODPSchemasResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public static class BatchqueryODPSchemasResponseBodyDataServerProps extends TeaModel {
        @NameInMap("EnvTenant")
        public String envTenant;

        @NameInMap("FrontendIdleTimeout")
        public Long frontendIdleTimeout;

        @NameInMap("EnvMode")
        public String envMode;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("FrontendSlaTps")
        public Long frontendSlaTps;

        @NameInMap("SchemaName")
        public String schemaName;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("BackendMaxConn")
        public Long backendMaxConn;

        @NameInMap("FrontendSlaLatency")
        public Long frontendSlaLatency;

        public static BatchqueryODPSchemasResponseBodyDataServerProps build(java.util.Map<String, ?> map) throws Exception {
            BatchqueryODPSchemasResponseBodyDataServerProps self = new BatchqueryODPSchemasResponseBodyDataServerProps();
            return TeaModel.build(map, self);
        }

        public BatchqueryODPSchemasResponseBodyDataServerProps setEnvTenant(String envTenant) {
            this.envTenant = envTenant;
            return this;
        }
        public String getEnvTenant() {
            return this.envTenant;
        }

        public BatchqueryODPSchemasResponseBodyDataServerProps setFrontendIdleTimeout(Long frontendIdleTimeout) {
            this.frontendIdleTimeout = frontendIdleTimeout;
            return this;
        }
        public Long getFrontendIdleTimeout() {
            return this.frontendIdleTimeout;
        }

        public BatchqueryODPSchemasResponseBodyDataServerProps setEnvMode(String envMode) {
            this.envMode = envMode;
            return this;
        }
        public String getEnvMode() {
            return this.envMode;
        }

        public BatchqueryODPSchemasResponseBodyDataServerProps setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public BatchqueryODPSchemasResponseBodyDataServerProps setFrontendSlaTps(Long frontendSlaTps) {
            this.frontendSlaTps = frontendSlaTps;
            return this;
        }
        public Long getFrontendSlaTps() {
            return this.frontendSlaTps;
        }

        public BatchqueryODPSchemasResponseBodyDataServerProps setSchemaName(String schemaName) {
            this.schemaName = schemaName;
            return this;
        }
        public String getSchemaName() {
            return this.schemaName;
        }

        public BatchqueryODPSchemasResponseBodyDataServerProps setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public BatchqueryODPSchemasResponseBodyDataServerProps setBackendMaxConn(Long backendMaxConn) {
            this.backendMaxConn = backendMaxConn;
            return this;
        }
        public Long getBackendMaxConn() {
            return this.backendMaxConn;
        }

        public BatchqueryODPSchemasResponseBodyDataServerProps setFrontendSlaLatency(Long frontendSlaLatency) {
            this.frontendSlaLatency = frontendSlaLatency;
            return this;
        }
        public Long getFrontendSlaLatency() {
            return this.frontendSlaLatency;
        }

    }

    public static class BatchqueryODPSchemasResponseBodyDataNodeSchemaMappings extends TeaModel {
        @NameInMap("SchemaPattern")
        public String schemaPattern;

        @NameInMap("PowerfulUsername")
        public String powerfulUsername;

        @NameInMap("PhysicalUsername")
        public String physicalUsername;

        @NameInMap("PhysicalPassword")
        public String physicalPassword;

        @NameInMap("SchemaCount")
        public Long schemaCount;

        @NameInMap("PowerfulPassword")
        public String powerfulPassword;

        @NameInMap("NodeId")
        public String nodeId;

        public static BatchqueryODPSchemasResponseBodyDataNodeSchemaMappings build(java.util.Map<String, ?> map) throws Exception {
            BatchqueryODPSchemasResponseBodyDataNodeSchemaMappings self = new BatchqueryODPSchemasResponseBodyDataNodeSchemaMappings();
            return TeaModel.build(map, self);
        }

        public BatchqueryODPSchemasResponseBodyDataNodeSchemaMappings setSchemaPattern(String schemaPattern) {
            this.schemaPattern = schemaPattern;
            return this;
        }
        public String getSchemaPattern() {
            return this.schemaPattern;
        }

        public BatchqueryODPSchemasResponseBodyDataNodeSchemaMappings setPowerfulUsername(String powerfulUsername) {
            this.powerfulUsername = powerfulUsername;
            return this;
        }
        public String getPowerfulUsername() {
            return this.powerfulUsername;
        }

        public BatchqueryODPSchemasResponseBodyDataNodeSchemaMappings setPhysicalUsername(String physicalUsername) {
            this.physicalUsername = physicalUsername;
            return this;
        }
        public String getPhysicalUsername() {
            return this.physicalUsername;
        }

        public BatchqueryODPSchemasResponseBodyDataNodeSchemaMappings setPhysicalPassword(String physicalPassword) {
            this.physicalPassword = physicalPassword;
            return this;
        }
        public String getPhysicalPassword() {
            return this.physicalPassword;
        }

        public BatchqueryODPSchemasResponseBodyDataNodeSchemaMappings setSchemaCount(Long schemaCount) {
            this.schemaCount = schemaCount;
            return this;
        }
        public Long getSchemaCount() {
            return this.schemaCount;
        }

        public BatchqueryODPSchemasResponseBodyDataNodeSchemaMappings setPowerfulPassword(String powerfulPassword) {
            this.powerfulPassword = powerfulPassword;
            return this;
        }
        public String getPowerfulPassword() {
            return this.powerfulPassword;
        }

        public BatchqueryODPSchemasResponseBodyDataNodeSchemaMappings setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

    }

    public static class BatchqueryODPSchemasResponseBodyData extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("ServerProps")
        public BatchqueryODPSchemasResponseBodyDataServerProps serverProps;

        @NameInMap("Owner")
        public String owner;

        @NameInMap("AppDsName")
        public String appDsName;

        @NameInMap("GroupCount")
        public Long groupCount;

        @NameInMap("SchemaName")
        public String schemaName;

        @NameInMap("ExpansionStatus")
        public String expansionStatus;

        @NameInMap("LogicTableCount")
        public String logicTableCount;

        @NameInMap("EnableDtx")
        public Boolean enableDtx;

        @NameInMap("ParserDbType")
        public String parserDbType;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("DbNum")
        public Long dbNum;

        @NameInMap("AppName")
        public String appName;

        @NameInMap("Collation")
        public String collation;

        @NameInMap("Password")
        public String password;

        @NameInMap("AutoCreateSchema")
        public Boolean autoCreateSchema;

        @NameInMap("UpdateStatus")
        public String updateStatus;

        @NameInMap("Description")
        public String description;

        @NameInMap("Version")
        public String version;

        @NameInMap("Charset")
        public String charset;

        @NameInMap("EnvMode")
        public String envMode;

        @NameInMap("InstanceName")
        public String instanceName;

        @NameInMap("PhysicalSchemaCount")
        public Long physicalSchemaCount;

        @NameInMap("GmtValid")
        public String gmtValid;

        @NameInMap("Operator")
        public String operator;

        @NameInMap("OpenReadAndWriteSeparation")
        public Boolean openReadAndWriteSeparation;

        @NameInMap("EnvTenant")
        public String envTenant;

        @NameInMap("ExpansionJobId")
        public String expansionJobId;

        @NameInMap("LatestVersion")
        public String latestVersion;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("AutoUpdateVersion")
        public Boolean autoUpdateVersion;

        @NameInMap("SchemaGroupType")
        public Long schemaGroupType;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("NodeSchemaMappings")
        public java.util.List<BatchqueryODPSchemasResponseBodyDataNodeSchemaMappings> nodeSchemaMappings;

        @NameInMap("Id")
        public Long id;

        public static BatchqueryODPSchemasResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            BatchqueryODPSchemasResponseBodyData self = new BatchqueryODPSchemasResponseBodyData();
            return TeaModel.build(map, self);
        }

        public BatchqueryODPSchemasResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public BatchqueryODPSchemasResponseBodyData setServerProps(BatchqueryODPSchemasResponseBodyDataServerProps serverProps) {
            this.serverProps = serverProps;
            return this;
        }
        public BatchqueryODPSchemasResponseBodyDataServerProps getServerProps() {
            return this.serverProps;
        }

        public BatchqueryODPSchemasResponseBodyData setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public BatchqueryODPSchemasResponseBodyData setAppDsName(String appDsName) {
            this.appDsName = appDsName;
            return this;
        }
        public String getAppDsName() {
            return this.appDsName;
        }

        public BatchqueryODPSchemasResponseBodyData setGroupCount(Long groupCount) {
            this.groupCount = groupCount;
            return this;
        }
        public Long getGroupCount() {
            return this.groupCount;
        }

        public BatchqueryODPSchemasResponseBodyData setSchemaName(String schemaName) {
            this.schemaName = schemaName;
            return this;
        }
        public String getSchemaName() {
            return this.schemaName;
        }

        public BatchqueryODPSchemasResponseBodyData setExpansionStatus(String expansionStatus) {
            this.expansionStatus = expansionStatus;
            return this;
        }
        public String getExpansionStatus() {
            return this.expansionStatus;
        }

        public BatchqueryODPSchemasResponseBodyData setLogicTableCount(String logicTableCount) {
            this.logicTableCount = logicTableCount;
            return this;
        }
        public String getLogicTableCount() {
            return this.logicTableCount;
        }

        public BatchqueryODPSchemasResponseBodyData setEnableDtx(Boolean enableDtx) {
            this.enableDtx = enableDtx;
            return this;
        }
        public Boolean getEnableDtx() {
            return this.enableDtx;
        }

        public BatchqueryODPSchemasResponseBodyData setParserDbType(String parserDbType) {
            this.parserDbType = parserDbType;
            return this;
        }
        public String getParserDbType() {
            return this.parserDbType;
        }

        public BatchqueryODPSchemasResponseBodyData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public BatchqueryODPSchemasResponseBodyData setDbNum(Long dbNum) {
            this.dbNum = dbNum;
            return this;
        }
        public Long getDbNum() {
            return this.dbNum;
        }

        public BatchqueryODPSchemasResponseBodyData setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public BatchqueryODPSchemasResponseBodyData setCollation(String collation) {
            this.collation = collation;
            return this;
        }
        public String getCollation() {
            return this.collation;
        }

        public BatchqueryODPSchemasResponseBodyData setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

        public BatchqueryODPSchemasResponseBodyData setAutoCreateSchema(Boolean autoCreateSchema) {
            this.autoCreateSchema = autoCreateSchema;
            return this;
        }
        public Boolean getAutoCreateSchema() {
            return this.autoCreateSchema;
        }

        public BatchqueryODPSchemasResponseBodyData setUpdateStatus(String updateStatus) {
            this.updateStatus = updateStatus;
            return this;
        }
        public String getUpdateStatus() {
            return this.updateStatus;
        }

        public BatchqueryODPSchemasResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public BatchqueryODPSchemasResponseBodyData setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public BatchqueryODPSchemasResponseBodyData setCharset(String charset) {
            this.charset = charset;
            return this;
        }
        public String getCharset() {
            return this.charset;
        }

        public BatchqueryODPSchemasResponseBodyData setEnvMode(String envMode) {
            this.envMode = envMode;
            return this;
        }
        public String getEnvMode() {
            return this.envMode;
        }

        public BatchqueryODPSchemasResponseBodyData setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public BatchqueryODPSchemasResponseBodyData setPhysicalSchemaCount(Long physicalSchemaCount) {
            this.physicalSchemaCount = physicalSchemaCount;
            return this;
        }
        public Long getPhysicalSchemaCount() {
            return this.physicalSchemaCount;
        }

        public BatchqueryODPSchemasResponseBodyData setGmtValid(String gmtValid) {
            this.gmtValid = gmtValid;
            return this;
        }
        public String getGmtValid() {
            return this.gmtValid;
        }

        public BatchqueryODPSchemasResponseBodyData setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public BatchqueryODPSchemasResponseBodyData setOpenReadAndWriteSeparation(Boolean openReadAndWriteSeparation) {
            this.openReadAndWriteSeparation = openReadAndWriteSeparation;
            return this;
        }
        public Boolean getOpenReadAndWriteSeparation() {
            return this.openReadAndWriteSeparation;
        }

        public BatchqueryODPSchemasResponseBodyData setEnvTenant(String envTenant) {
            this.envTenant = envTenant;
            return this;
        }
        public String getEnvTenant() {
            return this.envTenant;
        }

        public BatchqueryODPSchemasResponseBodyData setExpansionJobId(String expansionJobId) {
            this.expansionJobId = expansionJobId;
            return this;
        }
        public String getExpansionJobId() {
            return this.expansionJobId;
        }

        public BatchqueryODPSchemasResponseBodyData setLatestVersion(String latestVersion) {
            this.latestVersion = latestVersion;
            return this;
        }
        public String getLatestVersion() {
            return this.latestVersion;
        }

        public BatchqueryODPSchemasResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public BatchqueryODPSchemasResponseBodyData setAutoUpdateVersion(Boolean autoUpdateVersion) {
            this.autoUpdateVersion = autoUpdateVersion;
            return this;
        }
        public Boolean getAutoUpdateVersion() {
            return this.autoUpdateVersion;
        }

        public BatchqueryODPSchemasResponseBodyData setSchemaGroupType(Long schemaGroupType) {
            this.schemaGroupType = schemaGroupType;
            return this;
        }
        public Long getSchemaGroupType() {
            return this.schemaGroupType;
        }

        public BatchqueryODPSchemasResponseBodyData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public BatchqueryODPSchemasResponseBodyData setNodeSchemaMappings(java.util.List<BatchqueryODPSchemasResponseBodyDataNodeSchemaMappings> nodeSchemaMappings) {
            this.nodeSchemaMappings = nodeSchemaMappings;
            return this;
        }
        public java.util.List<BatchqueryODPSchemasResponseBodyDataNodeSchemaMappings> getNodeSchemaMappings() {
            return this.nodeSchemaMappings;
        }

        public BatchqueryODPSchemasResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

}
