// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbai20251013.models;

import com.aliyun.tea.*;

public class ChatBIUpdateTableValidationColumnsRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>db_test</p>
     */
    @NameInMap("DbName")
    public String dbName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-2ze454l20me07****</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>polar4ai_nl2sql_pattern</p>
     */
    @NameInMap("TableName")
    public String tableName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pattern/config</p>
     */
    @NameInMap("TableType")
    public String tableType;

    public static ChatBIUpdateTableValidationColumnsRequest build(java.util.Map<String, ?> map) throws Exception {
        ChatBIUpdateTableValidationColumnsRequest self = new ChatBIUpdateTableValidationColumnsRequest();
        return TeaModel.build(map, self);
    }

    public ChatBIUpdateTableValidationColumnsRequest setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }
    public String getDbName() {
        return this.dbName;
    }

    public ChatBIUpdateTableValidationColumnsRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public ChatBIUpdateTableValidationColumnsRequest setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    public String getTableName() {
        return this.tableName;
    }

    public ChatBIUpdateTableValidationColumnsRequest setTableType(String tableType) {
        this.tableType = tableType;
        return this;
    }
    public String getTableType() {
        return this.tableType;
    }

}
