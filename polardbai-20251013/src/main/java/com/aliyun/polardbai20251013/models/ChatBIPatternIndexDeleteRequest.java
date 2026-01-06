// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbai20251013.models;

import com.aliyun.tea.*;

public class ChatBIPatternIndexDeleteRequest extends TeaModel {
    @NameInMap("AuthMessage")
    public String authMessage;

    @NameInMap("AuthType")
    public String authType;

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
     * <p>pattern_index, pattern_index_1</p>
     */
    @NameInMap("TableName")
    public String tableName;

    public static ChatBIPatternIndexDeleteRequest build(java.util.Map<String, ?> map) throws Exception {
        ChatBIPatternIndexDeleteRequest self = new ChatBIPatternIndexDeleteRequest();
        return TeaModel.build(map, self);
    }

    public ChatBIPatternIndexDeleteRequest setAuthMessage(String authMessage) {
        this.authMessage = authMessage;
        return this;
    }
    public String getAuthMessage() {
        return this.authMessage;
    }

    public ChatBIPatternIndexDeleteRequest setAuthType(String authType) {
        this.authType = authType;
        return this;
    }
    public String getAuthType() {
        return this.authType;
    }

    public ChatBIPatternIndexDeleteRequest setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }
    public String getDbName() {
        return this.dbName;
    }

    public ChatBIPatternIndexDeleteRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public ChatBIPatternIndexDeleteRequest setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    public String getTableName() {
        return this.tableName;
    }

}
