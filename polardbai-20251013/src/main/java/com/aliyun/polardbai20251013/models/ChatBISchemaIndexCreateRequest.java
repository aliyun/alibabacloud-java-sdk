// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbai20251013.models;

import com.aliyun.tea.*;

public class ChatBISchemaIndexCreateRequest extends TeaModel {
    @NameInMap("AuthMessage")
    public String authMessage;

    @NameInMap("AuthType")
    public String authType;

    /**
     * <strong>example:</strong>
     * <p>空字符串, &quot;graph_info.time,text_info.ext&quot;</p>
     */
    @NameInMap("ColumnsExcluded")
    public String columnsExcluded;

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
     * <strong>example:</strong>
     * <p>空字符串</p>
     */
    @NameInMap("TableNameSuffix")
    public String tableNameSuffix;

    /**
     * <strong>example:</strong>
     * <p>空字符串, &quot;graph_info,image_info,text_info&quot;</p>
     */
    @NameInMap("TablesIncluded")
    public String tablesIncluded;

    /**
     * <strong>example:</strong>
     * <p>0,1</p>
     */
    @NameInMap("ToSample")
    public Integer toSample;

    public static ChatBISchemaIndexCreateRequest build(java.util.Map<String, ?> map) throws Exception {
        ChatBISchemaIndexCreateRequest self = new ChatBISchemaIndexCreateRequest();
        return TeaModel.build(map, self);
    }

    public ChatBISchemaIndexCreateRequest setAuthMessage(String authMessage) {
        this.authMessage = authMessage;
        return this;
    }
    public String getAuthMessage() {
        return this.authMessage;
    }

    public ChatBISchemaIndexCreateRequest setAuthType(String authType) {
        this.authType = authType;
        return this;
    }
    public String getAuthType() {
        return this.authType;
    }

    public ChatBISchemaIndexCreateRequest setColumnsExcluded(String columnsExcluded) {
        this.columnsExcluded = columnsExcluded;
        return this;
    }
    public String getColumnsExcluded() {
        return this.columnsExcluded;
    }

    public ChatBISchemaIndexCreateRequest setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }
    public String getDbName() {
        return this.dbName;
    }

    public ChatBISchemaIndexCreateRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public ChatBISchemaIndexCreateRequest setTableNameSuffix(String tableNameSuffix) {
        this.tableNameSuffix = tableNameSuffix;
        return this;
    }
    public String getTableNameSuffix() {
        return this.tableNameSuffix;
    }

    public ChatBISchemaIndexCreateRequest setTablesIncluded(String tablesIncluded) {
        this.tablesIncluded = tablesIncluded;
        return this;
    }
    public String getTablesIncluded() {
        return this.tablesIncluded;
    }

    public ChatBISchemaIndexCreateRequest setToSample(Integer toSample) {
        this.toSample = toSample;
        return this;
    }
    public Integer getToSample() {
        return this.toSample;
    }

}
