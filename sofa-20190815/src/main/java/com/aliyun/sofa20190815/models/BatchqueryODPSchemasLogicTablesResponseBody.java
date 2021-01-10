// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class BatchqueryODPSchemasLogicTablesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public java.util.List<BatchqueryODPSchemasLogicTablesResponseBodyData> data;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultCode")
    public String resultCode;

    public static BatchqueryODPSchemasLogicTablesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchqueryODPSchemasLogicTablesResponseBody self = new BatchqueryODPSchemasLogicTablesResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchqueryODPSchemasLogicTablesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BatchqueryODPSchemasLogicTablesResponseBody setData(java.util.List<BatchqueryODPSchemasLogicTablesResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<BatchqueryODPSchemasLogicTablesResponseBodyData> getData() {
        return this.data;
    }

    public BatchqueryODPSchemasLogicTablesResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public BatchqueryODPSchemasLogicTablesResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public static class BatchqueryODPSchemasLogicTablesResponseBodyDataRules extends TeaModel {
        @NameInMap("Value")
        public String value;

        @NameInMap("Customized")
        public Boolean customized;

        @NameInMap("Text")
        public String text;

        @NameInMap("Field")
        public String field;

        public static BatchqueryODPSchemasLogicTablesResponseBodyDataRules build(java.util.Map<String, ?> map) throws Exception {
            BatchqueryODPSchemasLogicTablesResponseBodyDataRules self = new BatchqueryODPSchemasLogicTablesResponseBodyDataRules();
            return TeaModel.build(map, self);
        }

        public BatchqueryODPSchemasLogicTablesResponseBodyDataRules setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public BatchqueryODPSchemasLogicTablesResponseBodyDataRules setCustomized(Boolean customized) {
            this.customized = customized;
            return this;
        }
        public Boolean getCustomized() {
            return this.customized;
        }

        public BatchqueryODPSchemasLogicTablesResponseBodyDataRules setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

        public BatchqueryODPSchemasLogicTablesResponseBodyDataRules setField(String field) {
            this.field = field;
            return this;
        }
        public String getField() {
            return this.field;
        }

    }

    public static class BatchqueryODPSchemasLogicTablesResponseBodyDataDbRules extends TeaModel {
        @NameInMap("Value")
        public String value;

        @NameInMap("Customized")
        public Boolean customized;

        @NameInMap("Text")
        public String text;

        @NameInMap("Field")
        public String field;

        public static BatchqueryODPSchemasLogicTablesResponseBodyDataDbRules build(java.util.Map<String, ?> map) throws Exception {
            BatchqueryODPSchemasLogicTablesResponseBodyDataDbRules self = new BatchqueryODPSchemasLogicTablesResponseBodyDataDbRules();
            return TeaModel.build(map, self);
        }

        public BatchqueryODPSchemasLogicTablesResponseBodyDataDbRules setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public BatchqueryODPSchemasLogicTablesResponseBodyDataDbRules setCustomized(Boolean customized) {
            this.customized = customized;
            return this;
        }
        public Boolean getCustomized() {
            return this.customized;
        }

        public BatchqueryODPSchemasLogicTablesResponseBodyDataDbRules setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

        public BatchqueryODPSchemasLogicTablesResponseBodyDataDbRules setField(String field) {
            this.field = field;
            return this;
        }
        public String getField() {
            return this.field;
        }

    }

    public static class BatchqueryODPSchemasLogicTablesResponseBodyData extends TeaModel {
        @NameInMap("BroadcastTable")
        public Boolean broadcastTable;

        @NameInMap("EnvTenant")
        public String envTenant;

        @NameInMap("TableName")
        public String tableName;

        @NameInMap("GroupCount")
        public Long groupCount;

        @NameInMap("SingleTable")
        public Boolean singleTable;

        @NameInMap("SchemaName")
        public String schemaName;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("Rules")
        public java.util.List<BatchqueryODPSchemasLogicTablesResponseBodyDataRules> rules;

        @NameInMap("TbSuffix")
        public String tbSuffix;

        @NameInMap("TableCount")
        public Long tableCount;

        @NameInMap("SchemaGroupType")
        public Long schemaGroupType;

        @NameInMap("EnvMode")
        public String envMode;

        @NameInMap("DbRules")
        public java.util.List<BatchqueryODPSchemasLogicTablesResponseBodyDataDbRules> dbRules;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("SqlText")
        public String sqlText;

        @NameInMap("CreateTableNow")
        public Boolean createTableNow;

        @NameInMap("Id")
        public Long id;

        @NameInMap("TbSuffixPadding")
        public String tbSuffixPadding;

        public static BatchqueryODPSchemasLogicTablesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            BatchqueryODPSchemasLogicTablesResponseBodyData self = new BatchqueryODPSchemasLogicTablesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public BatchqueryODPSchemasLogicTablesResponseBodyData setBroadcastTable(Boolean broadcastTable) {
            this.broadcastTable = broadcastTable;
            return this;
        }
        public Boolean getBroadcastTable() {
            return this.broadcastTable;
        }

        public BatchqueryODPSchemasLogicTablesResponseBodyData setEnvTenant(String envTenant) {
            this.envTenant = envTenant;
            return this;
        }
        public String getEnvTenant() {
            return this.envTenant;
        }

        public BatchqueryODPSchemasLogicTablesResponseBodyData setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

        public BatchqueryODPSchemasLogicTablesResponseBodyData setGroupCount(Long groupCount) {
            this.groupCount = groupCount;
            return this;
        }
        public Long getGroupCount() {
            return this.groupCount;
        }

        public BatchqueryODPSchemasLogicTablesResponseBodyData setSingleTable(Boolean singleTable) {
            this.singleTable = singleTable;
            return this;
        }
        public Boolean getSingleTable() {
            return this.singleTable;
        }

        public BatchqueryODPSchemasLogicTablesResponseBodyData setSchemaName(String schemaName) {
            this.schemaName = schemaName;
            return this;
        }
        public String getSchemaName() {
            return this.schemaName;
        }

        public BatchqueryODPSchemasLogicTablesResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public BatchqueryODPSchemasLogicTablesResponseBodyData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public BatchqueryODPSchemasLogicTablesResponseBodyData setRules(java.util.List<BatchqueryODPSchemasLogicTablesResponseBodyDataRules> rules) {
            this.rules = rules;
            return this;
        }
        public java.util.List<BatchqueryODPSchemasLogicTablesResponseBodyDataRules> getRules() {
            return this.rules;
        }

        public BatchqueryODPSchemasLogicTablesResponseBodyData setTbSuffix(String tbSuffix) {
            this.tbSuffix = tbSuffix;
            return this;
        }
        public String getTbSuffix() {
            return this.tbSuffix;
        }

        public BatchqueryODPSchemasLogicTablesResponseBodyData setTableCount(Long tableCount) {
            this.tableCount = tableCount;
            return this;
        }
        public Long getTableCount() {
            return this.tableCount;
        }

        public BatchqueryODPSchemasLogicTablesResponseBodyData setSchemaGroupType(Long schemaGroupType) {
            this.schemaGroupType = schemaGroupType;
            return this;
        }
        public Long getSchemaGroupType() {
            return this.schemaGroupType;
        }

        public BatchqueryODPSchemasLogicTablesResponseBodyData setEnvMode(String envMode) {
            this.envMode = envMode;
            return this;
        }
        public String getEnvMode() {
            return this.envMode;
        }

        public BatchqueryODPSchemasLogicTablesResponseBodyData setDbRules(java.util.List<BatchqueryODPSchemasLogicTablesResponseBodyDataDbRules> dbRules) {
            this.dbRules = dbRules;
            return this;
        }
        public java.util.List<BatchqueryODPSchemasLogicTablesResponseBodyDataDbRules> getDbRules() {
            return this.dbRules;
        }

        public BatchqueryODPSchemasLogicTablesResponseBodyData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public BatchqueryODPSchemasLogicTablesResponseBodyData setSqlText(String sqlText) {
            this.sqlText = sqlText;
            return this;
        }
        public String getSqlText() {
            return this.sqlText;
        }

        public BatchqueryODPSchemasLogicTablesResponseBodyData setCreateTableNow(Boolean createTableNow) {
            this.createTableNow = createTableNow;
            return this;
        }
        public Boolean getCreateTableNow() {
            return this.createTableNow;
        }

        public BatchqueryODPSchemasLogicTablesResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public BatchqueryODPSchemasLogicTablesResponseBodyData setTbSuffixPadding(String tbSuffixPadding) {
            this.tbSuffixPadding = tbSuffixPadding;
            return this;
        }
        public String getTbSuffixPadding() {
            return this.tbSuffixPadding;
        }

    }

}
