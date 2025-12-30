// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbai20251013.models;

import com.aliyun.tea.*;

public class ChatBIFileUploadCallbackRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>gbk, utf-8</p>
     */
    @NameInMap("CharacterSetName")
    public String characterSetName;

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
     * <p>1778851887351348/record_1746670038342.xlsx</p>
     */
    @NameInMap("FileName")
    public String fileName;

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
     * <p>MANAGED_TABLE</p>
     */
    @NameInMap("TableType")
    public String tableType;

    public static ChatBIFileUploadCallbackRequest build(java.util.Map<String, ?> map) throws Exception {
        ChatBIFileUploadCallbackRequest self = new ChatBIFileUploadCallbackRequest();
        return TeaModel.build(map, self);
    }

    public ChatBIFileUploadCallbackRequest setCharacterSetName(String characterSetName) {
        this.characterSetName = characterSetName;
        return this;
    }
    public String getCharacterSetName() {
        return this.characterSetName;
    }

    public ChatBIFileUploadCallbackRequest setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }
    public String getDbName() {
        return this.dbName;
    }

    public ChatBIFileUploadCallbackRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public ChatBIFileUploadCallbackRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public ChatBIFileUploadCallbackRequest setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    public String getTableName() {
        return this.tableName;
    }

    public ChatBIFileUploadCallbackRequest setTableType(String tableType) {
        this.tableType = tableType;
        return this;
    }
    public String getTableType() {
        return this.tableType;
    }

}
