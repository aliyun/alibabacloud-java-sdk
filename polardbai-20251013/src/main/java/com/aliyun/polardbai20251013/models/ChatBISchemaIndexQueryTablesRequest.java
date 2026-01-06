// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbai20251013.models;

import com.aliyun.tea.*;

public class ChatBISchemaIndexQueryTablesRequest extends TeaModel {
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
     * <p>过滤字段，例如 schema_index</p>
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

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public String pageNumber;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    public static ChatBISchemaIndexQueryTablesRequest build(java.util.Map<String, ?> map) throws Exception {
        ChatBISchemaIndexQueryTablesRequest self = new ChatBISchemaIndexQueryTablesRequest();
        return TeaModel.build(map, self);
    }

    public ChatBISchemaIndexQueryTablesRequest setAuthMessage(String authMessage) {
        this.authMessage = authMessage;
        return this;
    }
    public String getAuthMessage() {
        return this.authMessage;
    }

    public ChatBISchemaIndexQueryTablesRequest setAuthType(String authType) {
        this.authType = authType;
        return this;
    }
    public String getAuthType() {
        return this.authType;
    }

    public ChatBISchemaIndexQueryTablesRequest setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }
    public String getDbName() {
        return this.dbName;
    }

    public ChatBISchemaIndexQueryTablesRequest setInputField(String inputField) {
        this.inputField = inputField;
        return this;
    }
    public String getInputField() {
        return this.inputField;
    }

    public ChatBISchemaIndexQueryTablesRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public ChatBISchemaIndexQueryTablesRequest setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
    }

    public ChatBISchemaIndexQueryTablesRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

}
