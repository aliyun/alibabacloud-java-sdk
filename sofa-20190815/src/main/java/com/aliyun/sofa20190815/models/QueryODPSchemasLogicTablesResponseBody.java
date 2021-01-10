// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryODPSchemasLogicTablesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Data")
    public QueryODPSchemasLogicTablesResponseBodyData data;

    public static QueryODPSchemasLogicTablesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryODPSchemasLogicTablesResponseBody self = new QueryODPSchemasLogicTablesResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryODPSchemasLogicTablesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryODPSchemasLogicTablesResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryODPSchemasLogicTablesResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryODPSchemasLogicTablesResponseBody setData(QueryODPSchemasLogicTablesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryODPSchemasLogicTablesResponseBodyData getData() {
        return this.data;
    }

    public static class QueryODPSchemasLogicTablesResponseBodyDataDbRules extends TeaModel {
        @NameInMap("Customized")
        public Boolean customized;

        @NameInMap("Field")
        public String field;

        @NameInMap("Text")
        public String text;

        @NameInMap("Value")
        public String value;

        public static QueryODPSchemasLogicTablesResponseBodyDataDbRules build(java.util.Map<String, ?> map) throws Exception {
            QueryODPSchemasLogicTablesResponseBodyDataDbRules self = new QueryODPSchemasLogicTablesResponseBodyDataDbRules();
            return TeaModel.build(map, self);
        }

        public QueryODPSchemasLogicTablesResponseBodyDataDbRules setCustomized(Boolean customized) {
            this.customized = customized;
            return this;
        }
        public Boolean getCustomized() {
            return this.customized;
        }

        public QueryODPSchemasLogicTablesResponseBodyDataDbRules setField(String field) {
            this.field = field;
            return this;
        }
        public String getField() {
            return this.field;
        }

        public QueryODPSchemasLogicTablesResponseBodyDataDbRules setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

        public QueryODPSchemasLogicTablesResponseBodyDataDbRules setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class QueryODPSchemasLogicTablesResponseBodyDataRules extends TeaModel {
        @NameInMap("Customized")
        public Boolean customized;

        @NameInMap("Field")
        public String field;

        @NameInMap("Text")
        public String text;

        @NameInMap("Value")
        public String value;

        public static QueryODPSchemasLogicTablesResponseBodyDataRules build(java.util.Map<String, ?> map) throws Exception {
            QueryODPSchemasLogicTablesResponseBodyDataRules self = new QueryODPSchemasLogicTablesResponseBodyDataRules();
            return TeaModel.build(map, self);
        }

        public QueryODPSchemasLogicTablesResponseBodyDataRules setCustomized(Boolean customized) {
            this.customized = customized;
            return this;
        }
        public Boolean getCustomized() {
            return this.customized;
        }

        public QueryODPSchemasLogicTablesResponseBodyDataRules setField(String field) {
            this.field = field;
            return this;
        }
        public String getField() {
            return this.field;
        }

        public QueryODPSchemasLogicTablesResponseBodyDataRules setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

        public QueryODPSchemasLogicTablesResponseBodyDataRules setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class QueryODPSchemasLogicTablesResponseBodyData extends TeaModel {
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
        public java.util.List<QueryODPSchemasLogicTablesResponseBodyDataDbRules> dbRules;

        @NameInMap("Rules")
        public java.util.List<QueryODPSchemasLogicTablesResponseBodyDataRules> rules;

        public static QueryODPSchemasLogicTablesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryODPSchemasLogicTablesResponseBodyData self = new QueryODPSchemasLogicTablesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryODPSchemasLogicTablesResponseBodyData setBroadcastTable(Boolean broadcastTable) {
            this.broadcastTable = broadcastTable;
            return this;
        }
        public Boolean getBroadcastTable() {
            return this.broadcastTable;
        }

        public QueryODPSchemasLogicTablesResponseBodyData setCreateTableNow(Boolean createTableNow) {
            this.createTableNow = createTableNow;
            return this;
        }
        public Boolean getCreateTableNow() {
            return this.createTableNow;
        }

        public QueryODPSchemasLogicTablesResponseBodyData setEnvMode(String envMode) {
            this.envMode = envMode;
            return this;
        }
        public String getEnvMode() {
            return this.envMode;
        }

        public QueryODPSchemasLogicTablesResponseBodyData setEnvTenant(String envTenant) {
            this.envTenant = envTenant;
            return this;
        }
        public String getEnvTenant() {
            return this.envTenant;
        }

        public QueryODPSchemasLogicTablesResponseBodyData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public QueryODPSchemasLogicTablesResponseBodyData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public QueryODPSchemasLogicTablesResponseBodyData setGroupCount(Long groupCount) {
            this.groupCount = groupCount;
            return this;
        }
        public Long getGroupCount() {
            return this.groupCount;
        }

        public QueryODPSchemasLogicTablesResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public QueryODPSchemasLogicTablesResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public QueryODPSchemasLogicTablesResponseBodyData setSchemaGroupType(Long schemaGroupType) {
            this.schemaGroupType = schemaGroupType;
            return this;
        }
        public Long getSchemaGroupType() {
            return this.schemaGroupType;
        }

        public QueryODPSchemasLogicTablesResponseBodyData setSchemaName(String schemaName) {
            this.schemaName = schemaName;
            return this;
        }
        public String getSchemaName() {
            return this.schemaName;
        }

        public QueryODPSchemasLogicTablesResponseBodyData setSingleTable(Boolean singleTable) {
            this.singleTable = singleTable;
            return this;
        }
        public Boolean getSingleTable() {
            return this.singleTable;
        }

        public QueryODPSchemasLogicTablesResponseBodyData setSqlText(String sqlText) {
            this.sqlText = sqlText;
            return this;
        }
        public String getSqlText() {
            return this.sqlText;
        }

        public QueryODPSchemasLogicTablesResponseBodyData setTableCount(Long tableCount) {
            this.tableCount = tableCount;
            return this;
        }
        public Long getTableCount() {
            return this.tableCount;
        }

        public QueryODPSchemasLogicTablesResponseBodyData setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

        public QueryODPSchemasLogicTablesResponseBodyData setTbSuffix(String tbSuffix) {
            this.tbSuffix = tbSuffix;
            return this;
        }
        public String getTbSuffix() {
            return this.tbSuffix;
        }

        public QueryODPSchemasLogicTablesResponseBodyData setTbSuffixPadding(String tbSuffixPadding) {
            this.tbSuffixPadding = tbSuffixPadding;
            return this;
        }
        public String getTbSuffixPadding() {
            return this.tbSuffixPadding;
        }

        public QueryODPSchemasLogicTablesResponseBodyData setDbRules(java.util.List<QueryODPSchemasLogicTablesResponseBodyDataDbRules> dbRules) {
            this.dbRules = dbRules;
            return this;
        }
        public java.util.List<QueryODPSchemasLogicTablesResponseBodyDataDbRules> getDbRules() {
            return this.dbRules;
        }

        public QueryODPSchemasLogicTablesResponseBodyData setRules(java.util.List<QueryODPSchemasLogicTablesResponseBodyDataRules> rules) {
            this.rules = rules;
            return this;
        }
        public java.util.List<QueryODPSchemasLogicTablesResponseBodyDataRules> getRules() {
            return this.rules;
        }

    }

}
