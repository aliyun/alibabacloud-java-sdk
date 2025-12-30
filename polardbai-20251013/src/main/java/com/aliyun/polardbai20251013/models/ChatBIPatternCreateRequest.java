// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbai20251013.models;

import com.aliyun.tea.*;

public class ChatBIPatternCreateRequest extends TeaModel {
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

    public static ChatBIPatternCreateRequest build(java.util.Map<String, ?> map) throws Exception {
        ChatBIPatternCreateRequest self = new ChatBIPatternCreateRequest();
        return TeaModel.build(map, self);
    }

    public ChatBIPatternCreateRequest setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }
    public String getDbName() {
        return this.dbName;
    }

    public ChatBIPatternCreateRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public ChatBIPatternCreateRequest setTableNameSuffix(String tableNameSuffix) {
        this.tableNameSuffix = tableNameSuffix;
        return this;
    }
    public String getTableNameSuffix() {
        return this.tableNameSuffix;
    }

}
