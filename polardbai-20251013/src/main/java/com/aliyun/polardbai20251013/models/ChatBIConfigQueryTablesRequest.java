// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbai20251013.models;

import com.aliyun.tea.*;

public class ChatBIConfigQueryTablesRequest extends TeaModel {
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
     * <strong>example:</strong>
     * <p>polar</p>
     */
    @NameInMap("InputField")
    public String inputField;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-2ze454l20me07****</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    public static ChatBIConfigQueryTablesRequest build(java.util.Map<String, ?> map) throws Exception {
        ChatBIConfigQueryTablesRequest self = new ChatBIConfigQueryTablesRequest();
        return TeaModel.build(map, self);
    }

    public ChatBIConfigQueryTablesRequest setAuthMessage(String authMessage) {
        this.authMessage = authMessage;
        return this;
    }
    public String getAuthMessage() {
        return this.authMessage;
    }

    public ChatBIConfigQueryTablesRequest setAuthType(String authType) {
        this.authType = authType;
        return this;
    }
    public String getAuthType() {
        return this.authType;
    }

    public ChatBIConfigQueryTablesRequest setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }
    public String getDbName() {
        return this.dbName;
    }

    public ChatBIConfigQueryTablesRequest setInputField(String inputField) {
        this.inputField = inputField;
        return this;
    }
    public String getInputField() {
        return this.inputField;
    }

    public ChatBIConfigQueryTablesRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

}
